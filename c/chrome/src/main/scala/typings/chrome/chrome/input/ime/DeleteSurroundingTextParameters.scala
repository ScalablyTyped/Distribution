package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSurroundingTextParameters extends js.Object {
  /** ID of the context where the surrounding text will be deleted. */
  var contextID: Double
  /** ID of the engine receiving the event. */
  var engineID: String
  /** The number of characters to be deleted */
  var length: Double
  /** The offset from the caret position where deletion will start. This value can be negative. */
  var offset: Double
}

object DeleteSurroundingTextParameters {
  @scala.inline
  def apply(contextID: Double, engineID: String, length: Double, offset: Double): DeleteSurroundingTextParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any], engineID = engineID.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSurroundingTextParameters]
  }
}

