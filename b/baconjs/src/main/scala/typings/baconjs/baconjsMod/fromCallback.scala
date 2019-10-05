package typings.baconjs.baconjsMod

import typings.baconjs.Bacon.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromCallback")
@js.native
object fromCallback extends js.Object {
  /**
    * @callback Bacon.fromCallback1~f
    * @param {Bacon.fromCallback1~callback} callback
    * @returns {void}
    */
  /**
    * @callback Bacon.fromCallback1~callback
    * @param {...*} args
    * @returns {void}
    */
  /**
    * @function Bacon.fromCallback1
    * @description Creates an [EventStream]{@link Bacon.EventStream} from a function `f` that accepts a `callback`. The function is supposed to call its callback just once.
    * @param {Bacon.fromCallback1~f} f
    * @returns {EventStream<E, A>}
    * @example
    * // This would create a stream that outputs a single value "Bacon!" and ends after that. The use of setTimeout causes the value to be delayed by 1 second.
    * Bacon.fromCallback(callback => {
    *     setTimeout(() => {
    *         callback("Bacon!");
    *     }, 1000);
    * });
    */
  def apply[E, A](f: js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit]): EventStream[E, A] = js.native
  /**
    * @callback Bacon.fromCallback2~f
    * @param {...*} args
    * @returns {void}
    */
  /**
    * @function Bacon.fromCallback2
    * @description Creates an [EventStream]{@link Bacon.EventStream} from a function `f` that accepts a `callback`. The function is supposed to call its callback just once.
    * @param {Bacon.fromCallback2~f} f
    * @param {...*} args
    * @returns {EventStream<E, A>}
    * @example
    * // You can also give any number of arguments to `fromCallback`, which will be passed to the function. These arguments can be simple variables, Bacon EventStreams or Properties. For example the following will output "Bacon rules":
    * Bacon.fromCallback((a, b, callback) => {
    *     callback(a + " " + b);
    * }, Bacon.constant("bacon"), "rules").log();
    */
  def apply[E, A](f: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): EventStream[E, A] = js.native
  /**
    * @function
    * @description Creates an [EventStream]{@link Bacon.EventStream} from a `methodName` method of a given `object`. The function is supposed to call its callback just once.
    * @param {Object} object
    * @param {string} methodName
    * @param {...*} args
    * @returns {EventStream<E, A>}
    */
  def apply[E, A](`object`: js.Object, methodName: String, args: js.Any*): EventStream[E, A] = js.native
}

