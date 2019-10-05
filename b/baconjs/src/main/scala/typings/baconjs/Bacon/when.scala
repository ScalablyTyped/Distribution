package typings.baconjs.Bacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Bacon.when")
@js.native
object when extends js.Object {
  /**
    * @callback Bacon.when1~f1
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @method Bacon.when1
    * @description Creates an [EventStream]{@link Bacon.EventStream} from join-pattern system.
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.when1~f1} f1
    * @returns {EventStream<E, B>}
    * @example
    * {
    *     // Consider implementing a game with discrete time ticks. We want to handle key-events synchronized on tick-events, with at most one key event handled per tick. If there are no key events, we want to just process a tick:
    *     let tick = Bacon.interval(1e2, 0),
    *         keyEvent = Bacon.fromEvent(document.body, "click", _ => Date.now()),
    *         handleTick = _ => `timestamp: NONE`,
    *         handleKeyEvent = timestamp => `timestamp: ${timestamp}`;
    *     Bacon.when(
    *         [tick, keyEvent], (_, timestamp) => handleKeyEvent(timestamp),
    *         [tick], handleTick
    *     );
    *     // Order is important here. If the [tick] patterns had been written first, this would have been tried first, and preferred at each tick.
    * }
    *
    * {
    *     // Join patterns are indeed a generalization of `zip`, and `zip` is equivalent to a single-rule join pattern. The following `Observable`s have the same output:
    *     let a = Bacon.once("a"),
    *         b = Bacon.once("b"),
    *         c = Bacon.once("c"),
    *         f = (a, b, c) => `a = ${a}; b = ${b}; c = ${c}.`;
    *     Bacon.zipWith(f, a, b, c);
    *     Bacon.when([a, b, c], f);
    * }
    *
    * {
    *     // Join patterns as a "chemical machine".
    *     // A quick way to get some intuition for join patterns is to understand them through an analogy in terms of atoms and molecules. A join pattern can here be regarded as a recipe for a chemical reaction. Lets say we have observables `oxygen`, `carbon` and `hydrogen`, where an event in these spawns an 'atom' of that type into a mixture. We can state reactions:
    *     let oxygen = Bacon.interval(1e3, "O"),
    *         hydrogen = Bacon.interval(2e3, "H"),
    *         carbon = Bacon.interval(1.5e3, "C"),
    *         makeWater = (oxygen:string, hydrogen1:string, hydrogen2:string) => `${hydrogen1}${[hydrogen1, hydrogen2].length}${oxygen}`,
    *         makeCarbonMonoxide = (oxygen:string, carbon:string) => `${carbon}${oxygen}`;
    *     Bacon.when(
    *         [oxygen, hydrogen, hydrogen], makeWater,
    *         [oxygen, carbon], makeCarbonMonoxide
    *     );
    *     // Now, every time a new 'atom' is spawned from one of the observables, this atom is added to the mixture. If at any time there are two hydrogen atoms, and an oxygen atom, the corresponding atoms are *consumed*, and output is produced via `makeWater`. The same semantics apply for the second rule to create carbon monoxide. The rules are tried at each point from top to bottom.
    * }
    *
    * {
    *     // Join patterns and properties.
    *     // Properties are not part of the synchronization pattern, but are instead just sampled. The following example take three input streams `$price`, `$quantity` and `$total`, e.g. coming from input fields, and defines mutally recursive behaviours in properties `price`, `quantity` and `total` such that:
    *     // -- updating `quantity` sets `total` to `price * quantity`;
    *     // -- updating `total` sets `price` to `total / quantity`.
    *     let random = (x:number) => Math.round(x * Math.random()),
    *         id = <A>(x:A):A => x;
    *     let $quantity = Bacon.interval<Error, number>(1e3, 10).map(random),
    *         $price = Bacon.interval<Error, number>(2e3, 100).map(random),
    *         $total = Bacon.interval<Error, number>(1.5e3, 1000).map(random);
    *     let quantity = $quantity.toProperty(1),
    *         price = Bacon.when<Error, number, number, number>(
    *             [$price], id,
    *             [$total, quantity], (x, y) => x / y
    *         ).toProperty(0),
    *         total = Bacon.when<Error, number, number, number, number>(
    *             [$total], id,
    *             [$price, quantity], (x, y) => x * y,
    *             [price, $quantity], (x, y) => x * y
    *         ).toProperty(0);
    * }
    *
    * {
    *     // Join patterns and `Bacon.Bus`.
    *     // The result functions of join patterns are allowed to push values onto a `Bus` that may in turn be in one of its patterns. For instance, an implementation of the dining philosophers problem can be written as follows:
    *     // Availability of chopsticks are implemented using bus.
    *     let chopsticks = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // Hungry could be any type of observable, but we'll use bus here.
    *         hungry = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // A philosopher eats for one second, then makes the chopsticks available again by pushing values onto their bus.
    *         eat = (i:number) => () => {
    *             setTimeout(() => {
    *                 console.log("done!");
    *                 chopsticks[i].push({});
    *                 chopsticks[(i + 1) % 3].push({});
    *             }, 1e3);
    *             return `philosopher ${i} eating`;
    *         },
    *     // We use Bacon.when to make sure a hungry philosopher can eat only when both his chopsticks are available.
    *         dining = Bacon.when(
    *             [hungry[0], chopsticks[0], chopsticks[1]], eat(0),
    *             [hungry[1], chopsticks[1], chopsticks[2]], eat(1),
    *             [hungry[2], chopsticks[2], chopsticks[0]], eat(2)
    *         ).log("dining");
    *     // Make all chopsticks initially available.
    *     chopsticks[0].push({});
    *     chopsticks[1].push({});
    *     chopsticks[2].push({});
    *     // Make philosophers hungry in some way, in this case we just push to their bus.
    *     for (let i = 0; i < 3; i++) {
    *         hungry[0].push({});
    *         hungry[1].push({});
    *         hungry[2].push({});
    *     }
    * }
    */
  def apply[E, A1, B](pattern1: js.Array[Observable[E, A1]], f1: js.Function1[/* repeated */ A1, B]): EventStream[E, B] = js.native
  /**
    * @callback Bacon.when2~f1
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when2~f2
    * @param {...A2} args
    * @returns {B}
    */
  /**
    * @method Bacon.when2
    * @description Creates an [EventStream]{@link Bacon.EventStream} from join-pattern system.
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.when2~f1} f1
    * @param {Observable<E, A2>[]} pattern2
    * @param {Bacon.when2~f2} f2
    * @returns {EventStream<E, B>}
    * @example
    * {
    *     // Consider implementing a game with discrete time ticks. We want to handle key-events synchronized on tick-events, with at most one key event handled per tick. If there are no key events, we want to just process a tick:
    *     let tick = Bacon.interval(1e2, 0),
    *         keyEvent = Bacon.fromEvent(document.body, "click", _ => Date.now()),
    *         handleTick = _ => `timestamp: NONE`,
    *         handleKeyEvent = timestamp => `timestamp: ${timestamp}`;
    *     Bacon.when(
    *         [tick, keyEvent], (_, timestamp) => handleKeyEvent(timestamp),
    *         [tick], handleTick
    *     );
    *     // Order is important here. If the [tick] patterns had been written first, this would have been tried first, and preferred at each tick.
    * }
    *
    * {
    *     // Join patterns are indeed a generalization of `zip`, and `zip` is equivalent to a single-rule join pattern. The following `Observable`s have the same output:
    *     let a = Bacon.once("a"),
    *         b = Bacon.once("b"),
    *         c = Bacon.once("c"),
    *         f = (a, b, c) => `a = ${a}; b = ${b}; c = ${c}.`;
    *     Bacon.zipWith(f, a, b, c);
    *     Bacon.when([a, b, c], f);
    * }
    *
    * {
    *     // Join patterns as a "chemical machine".
    *     // A quick way to get some intuition for join patterns is to understand them through an analogy in terms of atoms and molecules. A join pattern can here be regarded as a recipe for a chemical reaction. Lets say we have observables `oxygen`, `carbon` and `hydrogen`, where an event in these spawns an 'atom' of that type into a mixture. We can state reactions:
    *     let oxygen = Bacon.interval(1e3, "O"),
    *         hydrogen = Bacon.interval(2e3, "H"),
    *         carbon = Bacon.interval(1.5e3, "C"),
    *         makeWater = (oxygen:string, hydrogen1:string, hydrogen2:string) => `${hydrogen1}${[hydrogen1, hydrogen2].length}${oxygen}`,
    *         makeCarbonMonoxide = (oxygen:string, carbon:string) => `${carbon}${oxygen}`;
    *     Bacon.when(
    *         [oxygen, hydrogen, hydrogen], makeWater,
    *         [oxygen, carbon], makeCarbonMonoxide
    *     );
    *     // Now, every time a new 'atom' is spawned from one of the observables, this atom is added to the mixture. If at any time there are two hydrogen atoms, and an oxygen atom, the corresponding atoms are *consumed*, and output is produced via `makeWater`. The same semantics apply for the second rule to create carbon monoxide. The rules are tried at each point from top to bottom.
    * }
    *
    * {
    *     // Join patterns and properties.
    *     // Properties are not part of the synchronization pattern, but are instead just sampled. The following example take three input streams `$price`, `$quantity` and `$total`, e.g. coming from input fields, and defines mutally recursive behaviours in properties `price`, `quantity` and `total` such that:
    *     // -- updating `quantity` sets `total` to `price * quantity`;
    *     // -- updating `total` sets `price` to `total / quantity`.
    *     let random = (x:number) => Math.round(x * Math.random()),
    *         id = <A>(x:A):A => x;
    *     let $quantity = Bacon.interval<Error, number>(1e3, 10).map(random),
    *         $price = Bacon.interval<Error, number>(2e3, 100).map(random),
    *         $total = Bacon.interval<Error, number>(1.5e3, 1000).map(random);
    *     let quantity = $quantity.toProperty(1),
    *         price = Bacon.when<Error, number, number, number>(
    *             [$price], id,
    *             [$total, quantity], (x, y) => x / y
    *         ).toProperty(0),
    *         total = Bacon.when<Error, number, number, number, number>(
    *             [$total], id,
    *             [$price, quantity], (x, y) => x * y,
    *             [price, $quantity], (x, y) => x * y
    *         ).toProperty(0);
    * }
    *
    * {
    *     // Join patterns and `Bacon.Bus`.
    *     // The result functions of join patterns are allowed to push values onto a `Bus` that may in turn be in one of its patterns. For instance, an implementation of the dining philosophers problem can be written as follows:
    *     // Availability of chopsticks are implemented using bus.
    *     let chopsticks = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // Hungry could be any type of observable, but we'll use bus here.
    *         hungry = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // A philosopher eats for one second, then makes the chopsticks available again by pushing values onto their bus.
    *         eat = (i:number) => () => {
    *             setTimeout(() => {
    *                 console.log("done!");
    *                 chopsticks[i].push({});
    *                 chopsticks[(i + 1) % 3].push({});
    *             }, 1e3);
    *             return `philosopher ${i} eating`;
    *         },
    *     // We use Bacon.when to make sure a hungry philosopher can eat only when both his chopsticks are available.
    *         dining = Bacon.when(
    *             [hungry[0], chopsticks[0], chopsticks[1]], eat(0),
    *             [hungry[1], chopsticks[1], chopsticks[2]], eat(1),
    *             [hungry[2], chopsticks[2], chopsticks[0]], eat(2)
    *         ).log("dining");
    *     // Make all chopsticks initially available.
    *     chopsticks[0].push({});
    *     chopsticks[1].push({});
    *     chopsticks[2].push({});
    *     // Make philosophers hungry in some way, in this case we just push to their bus.
    *     for (let i = 0; i < 3; i++) {
    *         hungry[0].push({});
    *         hungry[1].push({});
    *         hungry[2].push({});
    *     }
    * }
    */
  def apply[E, A1, A2, B](
    pattern1: js.Array[Observable[E, A1]],
    f1: js.Function1[/* repeated */ A1, B],
    pattern2: js.Array[Observable[E, A2]],
    f2: js.Function1[/* repeated */ A2, B]
  ): EventStream[E, B] = js.native
  /**
    * @callback Bacon.when3~f1
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when3~f2
    * @param {...A2} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when3~f3
    * @param {...A3} args
    * @returns {B}
    */
  /**
    * @method Bacon.when3
    * @description Creates an [EventStream]{@link Bacon.EventStream} from join-pattern system.
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.when3~f1} f1
    * @param {Observable<E, A2>[]} pattern2
    * @param {Bacon.when3~f2} f2
    * @param {Observable<E, A3>[]} pattern3
    * @param {Bacon.when3~f3} f3
    * @returns {EventStream<E, B>}
    * @example
    * {
    *     // Consider implementing a game with discrete time ticks. We want to handle key-events synchronized on tick-events, with at most one key event handled per tick. If there are no key events, we want to just process a tick:
    *     let tick = Bacon.interval(1e2, 0),
    *         keyEvent = Bacon.fromEvent(document.body, "click", _ => Date.now()),
    *         handleTick = _ => `timestamp: NONE`,
    *         handleKeyEvent = timestamp => `timestamp: ${timestamp}`;
    *     Bacon.when(
    *         [tick, keyEvent], (_, timestamp) => handleKeyEvent(timestamp),
    *         [tick], handleTick
    *     );
    *     // Order is important here. If the [tick] patterns had been written first, this would have been tried first, and preferred at each tick.
    * }
    *
    * {
    *     // Join patterns are indeed a generalization of `zip`, and `zip` is equivalent to a single-rule join pattern. The following `Observable`s have the same output:
    *     let a = Bacon.once("a"),
    *         b = Bacon.once("b"),
    *         c = Bacon.once("c"),
    *         f = (a, b, c) => `a = ${a}; b = ${b}; c = ${c}.`;
    *     Bacon.zipWith(f, a, b, c);
    *     Bacon.when([a, b, c], f);
    * }
    *
    * {
    *     // Join patterns as a "chemical machine".
    *     // A quick way to get some intuition for join patterns is to understand them through an analogy in terms of atoms and molecules. A join pattern can here be regarded as a recipe for a chemical reaction. Lets say we have observables `oxygen`, `carbon` and `hydrogen`, where an event in these spawns an 'atom' of that type into a mixture. We can state reactions:
    *     let oxygen = Bacon.interval(1e3, "O"),
    *         hydrogen = Bacon.interval(2e3, "H"),
    *         carbon = Bacon.interval(1.5e3, "C"),
    *         makeWater = (oxygen:string, hydrogen1:string, hydrogen2:string) => `${hydrogen1}${[hydrogen1, hydrogen2].length}${oxygen}`,
    *         makeCarbonMonoxide = (oxygen:string, carbon:string) => `${carbon}${oxygen}`;
    *     Bacon.when(
    *         [oxygen, hydrogen, hydrogen], makeWater,
    *         [oxygen, carbon], makeCarbonMonoxide
    *     );
    *     // Now, every time a new 'atom' is spawned from one of the observables, this atom is added to the mixture. If at any time there are two hydrogen atoms, and an oxygen atom, the corresponding atoms are *consumed*, and output is produced via `makeWater`. The same semantics apply for the second rule to create carbon monoxide. The rules are tried at each point from top to bottom.
    * }
    *
    * {
    *     // Join patterns and properties.
    *     // Properties are not part of the synchronization pattern, but are instead just sampled. The following example take three input streams `$price`, `$quantity` and `$total`, e.g. coming from input fields, and defines mutally recursive behaviours in properties `price`, `quantity` and `total` such that:
    *     // -- updating `quantity` sets `total` to `price * quantity`;
    *     // -- updating `total` sets `price` to `total / quantity`.
    *     let random = (x:number) => Math.round(x * Math.random()),
    *         id = <A>(x:A):A => x;
    *     let $quantity = Bacon.interval<Error, number>(1e3, 10).map(random),
    *         $price = Bacon.interval<Error, number>(2e3, 100).map(random),
    *         $total = Bacon.interval<Error, number>(1.5e3, 1000).map(random);
    *     let quantity = $quantity.toProperty(1),
    *         price = Bacon.when<Error, number, number, number>(
    *             [$price], id,
    *             [$total, quantity], (x, y) => x / y
    *         ).toProperty(0),
    *         total = Bacon.when<Error, number, number, number, number>(
    *             [$total], id,
    *             [$price, quantity], (x, y) => x * y,
    *             [price, $quantity], (x, y) => x * y
    *         ).toProperty(0);
    * }
    *
    * {
    *     // Join patterns and `Bacon.Bus`.
    *     // The result functions of join patterns are allowed to push values onto a `Bus` that may in turn be in one of its patterns. For instance, an implementation of the dining philosophers problem can be written as follows:
    *     // Availability of chopsticks are implemented using bus.
    *     let chopsticks = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // Hungry could be any type of observable, but we'll use bus here.
    *         hungry = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // A philosopher eats for one second, then makes the chopsticks available again by pushing values onto their bus.
    *         eat = (i:number) => () => {
    *             setTimeout(() => {
    *                 console.log("done!");
    *                 chopsticks[i].push({});
    *                 chopsticks[(i + 1) % 3].push({});
    *             }, 1e3);
    *             return `philosopher ${i} eating`;
    *         },
    *     // We use Bacon.when to make sure a hungry philosopher can eat only when both his chopsticks are available.
    *         dining = Bacon.when(
    *             [hungry[0], chopsticks[0], chopsticks[1]], eat(0),
    *             [hungry[1], chopsticks[1], chopsticks[2]], eat(1),
    *             [hungry[2], chopsticks[2], chopsticks[0]], eat(2)
    *         ).log("dining");
    *     // Make all chopsticks initially available.
    *     chopsticks[0].push({});
    *     chopsticks[1].push({});
    *     chopsticks[2].push({});
    *     // Make philosophers hungry in some way, in this case we just push to their bus.
    *     for (let i = 0; i < 3; i++) {
    *         hungry[0].push({});
    *         hungry[1].push({});
    *         hungry[2].push({});
    *     }
    * }
    */
  def apply[E, A1, A2, A3, B](
    pattern1: js.Array[Observable[E, A1]],
    f1: js.Function1[/* repeated */ A1, B],
    pattern2: js.Array[Observable[E, A2]],
    f2: js.Function1[/* repeated */ A2, B],
    pattern3: js.Array[Observable[E, A3]],
    f3: js.Function1[/* repeated */ A3, B]
  ): EventStream[E, B] = js.native
  /**
    * @callback Bacon.when4~f1
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when4~f2
    * @param {...A2} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when4~f3
    * @param {...A3} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when4~f4
    * @param {...A4} args
    * @returns {B}
    */
  /**
    * @method Bacon.when4
    * @description Creates an [EventStream]{@link Bacon.EventStream} from join-pattern system.
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.when4~f1} f1
    * @param {Observable<E, A2>[]} pattern2
    * @param {Bacon.when4~f2} f2
    * @param {Observable<E, A3>[]} pattern3
    * @param {Bacon.when4~f3} f3
    * @param {Observable<E, A4>[]} pattern4
    * @param {Bacon.when4~f4} f4
    * @returns {EventStream<E, B>}
    * @example
    * {
    *     // Consider implementing a game with discrete time ticks. We want to handle key-events synchronized on tick-events, with at most one key event handled per tick. If there are no key events, we want to just process a tick:
    *     let tick = Bacon.interval(1e2, 0),
    *         keyEvent = Bacon.fromEvent(document.body, "click", _ => Date.now()),
    *         handleTick = _ => `timestamp: NONE`,
    *         handleKeyEvent = timestamp => `timestamp: ${timestamp}`;
    *     Bacon.when(
    *         [tick, keyEvent], (_, timestamp) => handleKeyEvent(timestamp),
    *         [tick], handleTick
    *     );
    *     // Order is important here. If the [tick] patterns had been written first, this would have been tried first, and preferred at each tick.
    * }
    *
    * {
    *     // Join patterns are indeed a generalization of `zip`, and `zip` is equivalent to a single-rule join pattern. The following `Observable`s have the same output:
    *     let a = Bacon.once("a"),
    *         b = Bacon.once("b"),
    *         c = Bacon.once("c"),
    *         f = (a, b, c) => `a = ${a}; b = ${b}; c = ${c}.`;
    *     Bacon.zipWith(f, a, b, c);
    *     Bacon.when([a, b, c], f);
    * }
    *
    * {
    *     // Join patterns as a "chemical machine".
    *     // A quick way to get some intuition for join patterns is to understand them through an analogy in terms of atoms and molecules. A join pattern can here be regarded as a recipe for a chemical reaction. Lets say we have observables `oxygen`, `carbon` and `hydrogen`, where an event in these spawns an 'atom' of that type into a mixture. We can state reactions:
    *     let oxygen = Bacon.interval(1e3, "O"),
    *         hydrogen = Bacon.interval(2e3, "H"),
    *         carbon = Bacon.interval(1.5e3, "C"),
    *         makeWater = (oxygen:string, hydrogen1:string, hydrogen2:string) => `${hydrogen1}${[hydrogen1, hydrogen2].length}${oxygen}`,
    *         makeCarbonMonoxide = (oxygen:string, carbon:string) => `${carbon}${oxygen}`;
    *     Bacon.when(
    *         [oxygen, hydrogen, hydrogen], makeWater,
    *         [oxygen, carbon], makeCarbonMonoxide
    *     );
    *     // Now, every time a new 'atom' is spawned from one of the observables, this atom is added to the mixture. If at any time there are two hydrogen atoms, and an oxygen atom, the corresponding atoms are *consumed*, and output is produced via `makeWater`. The same semantics apply for the second rule to create carbon monoxide. The rules are tried at each point from top to bottom.
    * }
    *
    * {
    *     // Join patterns and properties.
    *     // Properties are not part of the synchronization pattern, but are instead just sampled. The following example take three input streams `$price`, `$quantity` and `$total`, e.g. coming from input fields, and defines mutally recursive behaviours in properties `price`, `quantity` and `total` such that:
    *     // -- updating `quantity` sets `total` to `price * quantity`;
    *     // -- updating `total` sets `price` to `total / quantity`.
    *     let random = (x:number) => Math.round(x * Math.random()),
    *         id = <A>(x:A):A => x;
    *     let $quantity = Bacon.interval<Error, number>(1e3, 10).map(random),
    *         $price = Bacon.interval<Error, number>(2e3, 100).map(random),
    *         $total = Bacon.interval<Error, number>(1.5e3, 1000).map(random);
    *     let quantity = $quantity.toProperty(1),
    *         price = Bacon.when<Error, number, number, number>(
    *             [$price], id,
    *             [$total, quantity], (x, y) => x / y
    *         ).toProperty(0),
    *         total = Bacon.when<Error, number, number, number, number>(
    *             [$total], id,
    *             [$price, quantity], (x, y) => x * y,
    *             [price, $quantity], (x, y) => x * y
    *         ).toProperty(0);
    * }
    *
    * {
    *     // Join patterns and `Bacon.Bus`.
    *     // The result functions of join patterns are allowed to push values onto a `Bus` that may in turn be in one of its patterns. For instance, an implementation of the dining philosophers problem can be written as follows:
    *     // Availability of chopsticks are implemented using bus.
    *     let chopsticks = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // Hungry could be any type of observable, but we'll use bus here.
    *         hungry = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // A philosopher eats for one second, then makes the chopsticks available again by pushing values onto their bus.
    *         eat = (i:number) => () => {
    *             setTimeout(() => {
    *                 console.log("done!");
    *                 chopsticks[i].push({});
    *                 chopsticks[(i + 1) % 3].push({});
    *             }, 1e3);
    *             return `philosopher ${i} eating`;
    *         },
    *     // We use Bacon.when to make sure a hungry philosopher can eat only when both his chopsticks are available.
    *         dining = Bacon.when(
    *             [hungry[0], chopsticks[0], chopsticks[1]], eat(0),
    *             [hungry[1], chopsticks[1], chopsticks[2]], eat(1),
    *             [hungry[2], chopsticks[2], chopsticks[0]], eat(2)
    *         ).log("dining");
    *     // Make all chopsticks initially available.
    *     chopsticks[0].push({});
    *     chopsticks[1].push({});
    *     chopsticks[2].push({});
    *     // Make philosophers hungry in some way, in this case we just push to their bus.
    *     for (let i = 0; i < 3; i++) {
    *         hungry[0].push({});
    *         hungry[1].push({});
    *         hungry[2].push({});
    *     }
    * }
    */
  def apply[E, A1, A2, A3, A4, B](
    pattern1: js.Array[Observable[E, A1]],
    f1: js.Function1[/* repeated */ A1, B],
    pattern2: js.Array[Observable[E, A2]],
    f2: js.Function1[/* repeated */ A2, B],
    pattern3: js.Array[Observable[E, A3]],
    f3: js.Function1[/* repeated */ A3, B],
    pattern4: js.Array[Observable[E, A4]],
    f4: js.Function1[/* repeated */ A4, B]
  ): EventStream[E, B] = js.native
  /**
    * @callback Bacon.when5~f1
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when5~f2
    * @param {...A2} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when5~f3
    * @param {...A3} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when5~f4
    * @param {...A4} args
    * @returns {B}
    */
  /**
    * @callback Bacon.when5~f5
    * @param {...A5} args
    * @returns {B}
    */
  /**
    * @method Bacon.when5
    * @description Creates an [EventStream]{@link Bacon.EventStream} from join-pattern system.
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.when5~f1} f1
    * @param {Observable<E, A2>[]} pattern2
    * @param {Bacon.when5~f2} f2
    * @param {Observable<E, A3>[]} pattern3
    * @param {Bacon.when5~f3} f3
    * @param {Observable<E, A4>[]} pattern4
    * @param {Bacon.when5~f4} f4
    * @param {Observable<E, A5>[]} pattern5
    * @param {Bacon.when5~f5} f5
    * @returns {EventStream<E, B>}
    * @example
    * {
    *     // Consider implementing a game with discrete time ticks. We want to handle key-events synchronized on tick-events, with at most one key event handled per tick. If there are no key events, we want to just process a tick:
    *     let tick = Bacon.interval(1e2, 0),
    *         keyEvent = Bacon.fromEvent(document.body, "click", _ => Date.now()),
    *         handleTick = _ => `timestamp: NONE`,
    *         handleKeyEvent = timestamp => `timestamp: ${timestamp}`;
    *     Bacon.when(
    *         [tick, keyEvent], (_, timestamp) => handleKeyEvent(timestamp),
    *         [tick], handleTick
    *     );
    *     // Order is important here. If the [tick] patterns had been written first, this would have been tried first, and preferred at each tick.
    * }
    *
    * {
    *     // Join patterns are indeed a generalization of `zip`, and `zip` is equivalent to a single-rule join pattern. The following `Observable`s have the same output:
    *     let a = Bacon.once("a"),
    *         b = Bacon.once("b"),
    *         c = Bacon.once("c"),
    *         f = (a, b, c) => `a = ${a}; b = ${b}; c = ${c}.`;
    *     Bacon.zipWith(f, a, b, c);
    *     Bacon.when([a, b, c], f);
    * }
    *
    * {
    *     // Join patterns as a "chemical machine".
    *     // A quick way to get some intuition for join patterns is to understand them through an analogy in terms of atoms and molecules. A join pattern can here be regarded as a recipe for a chemical reaction. Lets say we have observables `oxygen`, `carbon` and `hydrogen`, where an event in these spawns an 'atom' of that type into a mixture. We can state reactions:
    *     let oxygen = Bacon.interval(1e3, "O"),
    *         hydrogen = Bacon.interval(2e3, "H"),
    *         carbon = Bacon.interval(1.5e3, "C"),
    *         makeWater = (oxygen:string, hydrogen1:string, hydrogen2:string) => `${hydrogen1}${[hydrogen1, hydrogen2].length}${oxygen}`,
    *         makeCarbonMonoxide = (oxygen:string, carbon:string) => `${carbon}${oxygen}`;
    *     Bacon.when(
    *         [oxygen, hydrogen, hydrogen], makeWater,
    *         [oxygen, carbon], makeCarbonMonoxide
    *     );
    *     // Now, every time a new 'atom' is spawned from one of the observables, this atom is added to the mixture. If at any time there are two hydrogen atoms, and an oxygen atom, the corresponding atoms are *consumed*, and output is produced via `makeWater`. The same semantics apply for the second rule to create carbon monoxide. The rules are tried at each point from top to bottom.
    * }
    *
    * {
    *     // Join patterns and properties.
    *     // Properties are not part of the synchronization pattern, but are instead just sampled. The following example take three input streams `$price`, `$quantity` and `$total`, e.g. coming from input fields, and defines mutally recursive behaviours in properties `price`, `quantity` and `total` such that:
    *     // -- updating `quantity` sets `total` to `price * quantity`;
    *     // -- updating `total` sets `price` to `total / quantity`.
    *     let random = (x:number) => Math.round(x * Math.random()),
    *         id = <A>(x:A):A => x;
    *     let $quantity = Bacon.interval<Error, number>(1e3, 10).map(random),
    *         $price = Bacon.interval<Error, number>(2e3, 100).map(random),
    *         $total = Bacon.interval<Error, number>(1.5e3, 1000).map(random);
    *     let quantity = $quantity.toProperty(1),
    *         price = Bacon.when<Error, number, number, number>(
    *             [$price], id,
    *             [$total, quantity], (x, y) => x / y
    *         ).toProperty(0),
    *         total = Bacon.when<Error, number, number, number, number>(
    *             [$total], id,
    *             [$price, quantity], (x, y) => x * y,
    *             [price, $quantity], (x, y) => x * y
    *         ).toProperty(0);
    * }
    *
    * {
    *     // Join patterns and `Bacon.Bus`.
    *     // The result functions of join patterns are allowed to push values onto a `Bus` that may in turn be in one of its patterns. For instance, an implementation of the dining philosophers problem can be written as follows:
    *     // Availability of chopsticks are implemented using bus.
    *     let chopsticks = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // Hungry could be any type of observable, but we'll use bus here.
    *         hungry = [new Bacon.Bus(), new Bacon.Bus(), new Bacon.Bus()],
    *     // A philosopher eats for one second, then makes the chopsticks available again by pushing values onto their bus.
    *         eat = (i:number) => () => {
    *             setTimeout(() => {
    *                 console.log("done!");
    *                 chopsticks[i].push({});
    *                 chopsticks[(i + 1) % 3].push({});
    *             }, 1e3);
    *             return `philosopher ${i} eating`;
    *         },
    *     // We use Bacon.when to make sure a hungry philosopher can eat only when both his chopsticks are available.
    *         dining = Bacon.when(
    *             [hungry[0], chopsticks[0], chopsticks[1]], eat(0),
    *             [hungry[1], chopsticks[1], chopsticks[2]], eat(1),
    *             [hungry[2], chopsticks[2], chopsticks[0]], eat(2)
    *         ).log("dining");
    *     // Make all chopsticks initially available.
    *     chopsticks[0].push({});
    *     chopsticks[1].push({});
    *     chopsticks[2].push({});
    *     // Make philosophers hungry in some way, in this case we just push to their bus.
    *     for (let i = 0; i < 3; i++) {
    *         hungry[0].push({});
    *         hungry[1].push({});
    *         hungry[2].push({});
    *     }
    * }
    */
  def apply[E, A1, A2, A3, A4, A5, B](
    pattern1: js.Array[Observable[E, A1]],
    f1: js.Function1[/* repeated */ A1, B],
    pattern2: js.Array[Observable[E, A2]],
    f2: js.Function1[/* repeated */ A2, B],
    pattern3: js.Array[Observable[E, A3]],
    f3: js.Function1[/* repeated */ A3, B],
    pattern4: js.Array[Observable[E, A4]],
    f4: js.Function1[/* repeated */ A4, B],
    pattern5: js.Array[Observable[E, A5]],
    f5: js.Function1[/* repeated */ A5, B]
  ): EventStream[E, B] = js.native
}

