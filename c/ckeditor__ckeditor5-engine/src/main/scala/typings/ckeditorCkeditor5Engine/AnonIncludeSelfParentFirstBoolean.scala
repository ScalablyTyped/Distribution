package typings.ckeditorCkeditor5Engine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeSelfParentFirstBoolean extends js.Object {
  var includeSelf: Boolean
  var parentFirst: js.UndefOr[Boolean] = js.undefined
}

object AnonIncludeSelfParentFirstBoolean {
  @scala.inline
  def apply(includeSelf: Boolean, parentFirst: js.UndefOr[Boolean] = js.undefined): AnonIncludeSelfParentFirstBoolean = {
    val __obj = js.Dynamic.literal(includeSelf = includeSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(parentFirst)) __obj.updateDynamic("parentFirst")(parentFirst.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeSelfParentFirstBoolean]
  }
}

