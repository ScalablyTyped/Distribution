package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSurroundingTextParameters extends js.Object {
  /** ID of the context where the surrounding text will be deleted. */
  var contextID: scala.Double
  /** ID of the engine receiving the event. */
  var engineID: java.lang.String
  /** The number of characters to be deleted */
  var length: scala.Double
  /** The offset from the caret position where deletion will start. This value can be negative. */
  var offset: scala.Double
}

object DeleteSurroundingTextParameters {
  @scala.inline
  def apply(contextID: scala.Double, engineID: java.lang.String, length: scala.Double, offset: scala.Double): DeleteSurroundingTextParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contextID")(contextID)
    __obj.updateDynamic("engineID")(engineID)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[DeleteSurroundingTextParameters]
  }
}

