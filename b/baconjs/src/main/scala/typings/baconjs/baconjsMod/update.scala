package typings.baconjs.baconjsMod

import typings.baconjs.Bacon.Observable
import typings.baconjs.Bacon.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "update")
@js.native
object update extends js.Object {
  /**
    * @callback Bacon.update1~f1
    * @param {B} initial
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @method Bacon.update1
    * @description Creates an [Property]{@link Bacon.Property} from an `initial` value and a join-pattern system.
    * @param {B} initial
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.update1~f1} f1
    * @returns {Property<E, B>}
    * @example
    * {
    *     // The inputs to `Bacon.update` are defined like this:
    *     let initial = 0,
    *         x = Bacon.interval(1e3, 1),
    *         y = Bacon.interval(2e3, 1),
    *         z = Bacon.interval(1.5e3, 1);
    *     // NOTE: had to explicitly specify the typing for `previous:number`
    *     Bacon.update(initial,
    *         [x, y, z], (previous:number, x, y, z) => previous + x + y + z,
    *         [x, y], (previous:number, x, y) => previous + x + y + z
    *     );
    *     // As input, each function above will get the previous value of the `result` Property, along with values from the listed Observables. The value returned by the function will be used as the next value of `result`. Just like in `Bacon.when`, only EventStreams will trigger an update, while Properties will be just sampled. So, if you list a single EventStream and several Properties, the value will be updated only when an event occurs in the EventStream.
    * }
    *
    * {
    *     // Here's a simple gaming example:
    *     let scoreMultiplier = Bacon.constant(1),
    *         hitUfo = new Bacon.Bus(),
    *         hitMotherShip = new Bacon.Bus(),
    *         score = Bacon.update(0,
    *             [hitUfo, scoreMultiplier], (score, _, multiplier:number) => score + 100 * multiplier,
    *             [hitMotherShip], (score, _) => score + 2000
    *         );
    *     // In the example, the `score` property is updated when either `hitUfo` or `hitMotherShip` occur. The `scoreMultiplier` Property is sampled to take multiplier into account when `hitUfo` occurs.
    * }
    */
  def apply[E, A1, B](
    initial: B,
    pattern1: js.Array[Observable[E, A1]],
    f1: js.Function2[/* initial */ B, /* repeated */ A1, B]
  ): Property[E, B] = js.native
  /**
    * @callback Bacon.update2~f1
    * @param {B} initial
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update2~f2
    * @param {B} initial
    * @param {...A2} args
    * @returns {B}
    */
  /**
    * @method Bacon.update2
    * @description Creates an [Property]{@link Bacon.Property} from an `initial` value and a join-pattern system.
    * @param {B} initial
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.update2~f1} f1
    * @param {Observable<E, A2>[]} pattern2
    * @param {Bacon.update2~f2} f2
    * @returns {Property<E, B>}
    * @example
    * {
    *     // The inputs to `Bacon.update` are defined like this:
    *     let initial = 0,
    *         x = Bacon.interval(1e3, 1),
    *         y = Bacon.interval(2e3, 1),
    *         z = Bacon.interval(1.5e3, 1);
    *     // NOTE: had to explicitly specify the typing for `previous:number`
    *     Bacon.update(initial,
    *         [x, y, z], (previous:number, x, y, z) => previous + x + y + z,
    *         [x, y], (previous:number, x, y) => previous + x + y + z
    *     );
    *     // As input, each function above will get the previous value of the `result` Property, along with values from the listed Observables. The value returned by the function will be used as the next value of `result`. Just like in `Bacon.when`, only EventStreams will trigger an update, while Properties will be just sampled. So, if you list a single EventStream and several Properties, the value will be updated only when an event occurs in the EventStream.
    * }
    *
    * {
    *     // Here's a simple gaming example:
    *     let scoreMultiplier = Bacon.constant(1),
    *         hitUfo = new Bacon.Bus(),
    *         hitMotherShip = new Bacon.Bus(),
    *         score = Bacon.update(0,
    *             [hitUfo, scoreMultiplier], (score, _, multiplier:number) => score + 100 * multiplier,
    *             [hitMotherShip], (score, _) => score + 2000
    *         );
    *     // In the example, the `score` property is updated when either `hitUfo` or `hitMotherShip` occur. The `scoreMultiplier` Property is sampled to take multiplier into account when `hitUfo` occurs.
    * }
    */
  def apply[E, A1, A2, B](
    initial: B,
    pattern1: js.Array[Observable[E, A1]],
    f1: js.Function2[/* initial */ B, /* repeated */ A1, B],
    pattern2: js.Array[Observable[E, A2]],
    f2: js.Function2[/* initial */ B, /* repeated */ A2, B]
  ): Property[E, B] = js.native
  /**
    * @callback Bacon.update3~f1
    * @param {B} initial
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update3~f2
    * @param {B} initial
    * @param {...A2} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update3~f3
    * @param {B} initial
    * @param {...A3} args
    * @returns {B}
    */
  /**
    * @method Bacon.update3
    * @description Creates an [Property]{@link Bacon.Property} from an `initial` value and a join-pattern system.
    * @param {B} initial
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.update3~f1} f1
    * @param {Observable<E, A2>[]} pattern2
    * @param {Bacon.update3~f2} f2
    * @param {Observable<E, A3>[]} pattern3
    * @param {Bacon.update3~f3} f3
    * @returns {Property<E, B>}
    * @example
    * {
    *     // The inputs to `Bacon.update` are defined like this:
    *     let initial = 0,
    *         x = Bacon.interval(1e3, 1),
    *         y = Bacon.interval(2e3, 1),
    *         z = Bacon.interval(1.5e3, 1);
    *     // NOTE: had to explicitly specify the typing for `previous:number`
    *     Bacon.update(initial,
    *         [x, y, z], (previous:number, x, y, z) => previous + x + y + z,
    *         [x, y], (previous:number, x, y) => previous + x + y + z
    *     );
    *     // As input, each function above will get the previous value of the `result` Property, along with values from the listed Observables. The value returned by the function will be used as the next value of `result`. Just like in `Bacon.when`, only EventStreams will trigger an update, while Properties will be just sampled. So, if you list a single EventStream and several Properties, the value will be updated only when an event occurs in the EventStream.
    * }
    *
    * {
    *     // Here's a simple gaming example:
    *     let scoreMultiplier = Bacon.constant(1),
    *         hitUfo = new Bacon.Bus(),
    *         hitMotherShip = new Bacon.Bus(),
    *         score = Bacon.update(0,
    *             [hitUfo, scoreMultiplier], (score, _, multiplier:number) => score + 100 * multiplier,
    *             [hitMotherShip], (score, _) => score + 2000
    *         );
    *     // In the example, the `score` property is updated when either `hitUfo` or `hitMotherShip` occur. The `scoreMultiplier` Property is sampled to take multiplier into account when `hitUfo` occurs.
    * }
    */
  def apply[E, A1, A2, A3, B](
    initial: B,
    pattern1: js.Array[Observable[E, A1]],
    f1: js.Function2[/* initial */ B, /* repeated */ A1, B],
    pattern2: js.Array[Observable[E, A2]],
    f2: js.Function2[/* initial */ B, /* repeated */ A2, B],
    pattern3: js.Array[Observable[E, A3]],
    f3: js.Function2[/* initial */ B, /* repeated */ A3, B]
  ): Property[E, B] = js.native
  /**
    * @callback Bacon.update4~f1
    * @param {B} initial
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update4~f2
    * @param {B} initial
    * @param {...A2} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update4~f3
    * @param {B} initial
    * @param {...A3} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update4~f4
    * @param {B} initial
    * @param {...A4} args
    * @returns {B}
    */
  /**
    * @method Bacon.update4
    * @description Creates an [Property]{@link Bacon.Property} from an `initial` value and a join-pattern system.
    * @param {B} initial
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.update4~f1} f1
    * @param {Observable<E, A2>[]} pattern2
    * @param {Bacon.update4~f2} f2
    * @param {Observable<E, A3>[]} pattern3
    * @param {Bacon.update4~f3} f3
    * @param {Observable<E, A4>[]} pattern4
    * @param {Bacon.update4~f4} f4
    * @returns {Property<E, B>}
    * @example
    * {
    *     // The inputs to `Bacon.update` are defined like this:
    *     let initial = 0,
    *         x = Bacon.interval(1e3, 1),
    *         y = Bacon.interval(2e3, 1),
    *         z = Bacon.interval(1.5e3, 1);
    *     // NOTE: had to explicitly specify the typing for `previous:number`
    *     Bacon.update(initial,
    *         [x, y, z], (previous:number, x, y, z) => previous + x + y + z,
    *         [x, y], (previous:number, x, y) => previous + x + y + z
    *     );
    *     // As input, each function above will get the previous value of the `result` Property, along with values from the listed Observables. The value returned by the function will be used as the next value of `result`. Just like in `Bacon.when`, only EventStreams will trigger an update, while Properties will be just sampled. So, if you list a single EventStream and several Properties, the value will be updated only when an event occurs in the EventStream.
    * }
    *
    * {
    *     // Here's a simple gaming example:
    *     let scoreMultiplier = Bacon.constant(1),
    *         hitUfo = new Bacon.Bus(),
    *         hitMotherShip = new Bacon.Bus(),
    *         score = Bacon.update(0,
    *             [hitUfo, scoreMultiplier], (score, _, multiplier:number) => score + 100 * multiplier,
    *             [hitMotherShip], (score, _) => score + 2000
    *         );
    *     // In the example, the `score` property is updated when either `hitUfo` or `hitMotherShip` occur. The `scoreMultiplier` Property is sampled to take multiplier into account when `hitUfo` occurs.
    * }
    */
  def apply[E, A1, A2, A3, A4, B](
    initial: B,
    pattern1: js.Array[Observable[E, A1]],
    f1: js.Function2[/* initial */ B, /* repeated */ A1, B],
    pattern2: js.Array[Observable[E, A2]],
    f2: js.Function2[/* initial */ B, /* repeated */ A2, B],
    pattern3: js.Array[Observable[E, A3]],
    f3: js.Function2[/* initial */ B, /* repeated */ A3, B],
    pattern4: js.Array[Observable[E, A4]],
    f4: js.Function2[/* initial */ B, /* repeated */ A4, B]
  ): Property[E, B] = js.native
  /**
    * @callback Bacon.update5~f1
    * @param {B} initial
    * @param {...A1} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update5~f2
    * @param {B} initial
    * @param {...A2} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update5~f3
    * @param {B} initial
    * @param {...A3} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update5~f4
    * @param {B} initial
    * @param {...A4} args
    * @returns {B}
    */
  /**
    * @callback Bacon.update5~f5
    * @param {B} initial
    * @param {...A5} args
    * @returns {B}
    */
  /**
    * @method Bacon.update5
    * @description Creates an [Property]{@link Bacon.Property} from an `initial` value and a join-pattern system.
    * @param {B} initial
    * @param {Observable<E, A1>[]} pattern1
    * @param {Bacon.update5~f1} f1
    * @param {Observable<E, A2>[]} pattern2
    * @param {Bacon.update5~f2} f2
    * @param {Observable<E, A3>[]} pattern3
    * @param {Bacon.update5~f3} f3
    * @param {Observable<E, A4>[]} pattern4
    * @param {Bacon.update5~f4} f4
    * @param {Observable<E, A5>[]} pattern5
    * @param {Bacon.update5~f5} f5
    * @returns {Property<E, B>}
    * @example
    * {
    *     // The inputs to `Bacon.update` are defined like this:
    *     let initial = 0,
    *         x = Bacon.interval(1e3, 1),
    *         y = Bacon.interval(2e3, 1),
    *         z = Bacon.interval(1.5e3, 1);
    *     // NOTE: had to explicitly specify the typing for `previous:number`
    *     Bacon.update(initial,
    *         [x, y, z], (previous:number, x, y, z) => previous + x + y + z,
    *         [x, y], (previous:number, x, y) => previous + x + y + z
    *     );
    *     // As input, each function above will get the previous value of the `result` Property, along with values from the listed Observables. The value returned by the function will be used as the next value of `result`. Just like in `Bacon.when`, only EventStreams will trigger an update, while Properties will be just sampled. So, if you list a single EventStream and several Properties, the value will be updated only when an event occurs in the EventStream.
    * }
    *
    * {
    *     // Here's a simple gaming example:
    *     let scoreMultiplier = Bacon.constant(1),
    *         hitUfo = new Bacon.Bus(),
    *         hitMotherShip = new Bacon.Bus(),
    *         score = Bacon.update(0,
    *             [hitUfo, scoreMultiplier], (score, _, multiplier:number) => score + 100 * multiplier,
    *             [hitMotherShip], (score, _) => score + 2000
    *         );
    *     // In the example, the `score` property is updated when either `hitUfo` or `hitMotherShip` occur. The `scoreMultiplier` Property is sampled to take multiplier into account when `hitUfo` occurs.
    * }
    */
  def apply[E, A1, A2, A3, A4, A5, B](
    initial: B,
    pattern1: js.Array[Observable[E, A1]],
    f1: js.Function2[/* initial */ B, /* repeated */ A1, B],
    pattern2: js.Array[Observable[E, A2]],
    f2: js.Function2[/* initial */ B, /* repeated */ A2, B],
    pattern3: js.Array[Observable[E, A3]],
    f3: js.Function2[/* initial */ B, /* repeated */ A3, B],
    pattern4: js.Array[Observable[E, A4]],
    f4: js.Function2[/* initial */ B, /* repeated */ A4, B],
    pattern5: js.Array[Observable[E, A5]],
    f5: js.Function2[/* initial */ B, /* repeated */ A5, B]
  ): Property[E, B] = js.native
}

