package typings
package baconjsLib.BaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class Event
  * @description Has subclasses [Initial]{@link Bacon.Initial}, [Next]{@link Bacon.Next}, [End]{@link Bacon.End} and [Error]{@link Bacon.Error}.
  * */
@JSGlobal("Bacon.Event")
@js.native
class Event[A] () extends js.Object {
  /**
    * @method
    * @description Returns `true` for events of type [Initial]{@link Bacon.Initial} or [Next]{@link Bacon.Next}.
    * @returns {boolean}
    */
  def hasValue(): scala.Boolean = js.native
  /**
    * @method Error#isEnd
    * @description Returns `true` for events of type [End]{@link Bacon.End}.
    * @returns {boolean}
    */
  def isEnd(): scala.Boolean = js.native
  /**
    * @method Error#isError
    * @description Returns `true` for events of type [Error]{@link Bacon.Error}.
    * @returns {boolean}
    */
  def isError(): scala.Boolean = js.native
  /**
    * @method Error#isInitial
    * @description Returns `true` for events of type [Initial]{@link Bacon.Initial}.
    * @returns {boolean}
    */
  def isInitial(): scala.Boolean = js.native
  /**
    * @method Error#isNext
    * @description Returns `true` for events of type [Next]{@link Bacon.Next}.
    * @returns {boolean}
    */
  def isNext(): scala.Boolean = js.native
  /**
    * @method
    * @description Returns the value associated with a [Initial]{@link Bacon.Initial} or [Next]{@link Bacon.Next} event.
    * @returns {A}
    */
  def value(): A = js.native
}

