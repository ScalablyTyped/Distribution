package typings.baconjs.baconjsMod

import typings.baconjs.Bacon.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromNodeCallback")
@js.native
object fromNodeCallback extends js.Object {
  /**
    * @callback Bacon.fromNodeCallback~f
    * @param {Bacon.fromNodeCallback~callback} callback
    * @returns {void}
    */
  /**
    * @callback Bacon.fromNodeCallback~callback
    * @param {E} error
    * @param {A} data
    * @returns {void}
    */
  /**
    * @function Bacon.fromNodeCallback
    * @description Creates an [EventStream]{@link Bacon.EventStream} from a function `f` that accepts a Node.js `callback`: callback(error, data), where error is `null` if everything is fine. The function is supposed to call its callback just once.
    * @param {Bacon.fromNodeCallback~f} f
    * @param {...*} args
    * @returns {EventStream<E, A>}
    * @example
    * {
    *     let fs = require("fs"),
    *         read = Bacon.fromNodeCallback(fs.readFile, "input.txt");
    *     read.onError(error => {
    *        console.log("Reading failed: " + error);
    *     });
    *     read.onValue(value => {
    *         console.log("Read contents: " + value);
    *     });
    * }
    */
  def apply[E, A](
    f: js.Function1[/* callback */ js.Function2[/* error */ E, /* data */ A, Unit], Unit],
    args: js.Any*
  ): EventStream[E, A] = js.native
  /**
    * @function
    * @description Creates an [EventStream]{@link Bacon.EventStream} from a `methodName` method of a given `object`.
    * @param {Object} object
    * @param {string} methodName
    * @param {...*} args
    * @returns {EventStream<E, A>}
    */
  def apply[E, A](`object`: js.Object, methodName: String, args: js.Any*): EventStream[E, A] = js.native
}

