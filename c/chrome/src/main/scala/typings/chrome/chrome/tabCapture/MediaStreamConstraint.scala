package typings.chrome.chrome.tabCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamConstraint extends js.Object {
  var mandatory: js.Object
  var optional: js.UndefOr[js.Object] = js.undefined
}

object MediaStreamConstraint {
  @scala.inline
  def apply(mandatory: js.Object, optional: js.Object = null): MediaStreamConstraint = {
    val __obj = js.Dynamic.literal(mandatory = mandatory.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamConstraint]
  }
}

