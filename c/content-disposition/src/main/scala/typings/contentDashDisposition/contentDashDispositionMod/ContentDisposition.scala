package typings.contentDashDisposition.contentDashDispositionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentDisposition extends js.Object {
  var parameters: js.Any
  var `type`: String
}

object ContentDisposition {
  @scala.inline
  def apply(parameters: js.Any, `type`: String): ContentDisposition = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDisposition]
  }
}

