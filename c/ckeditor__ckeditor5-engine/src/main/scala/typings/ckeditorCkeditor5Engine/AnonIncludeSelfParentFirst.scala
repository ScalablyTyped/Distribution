package typings.ckeditorCkeditor5Engine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeSelfParentFirst extends js.Object {
  var includeSelf: js.UndefOr[Boolean] = js.undefined
  var parentFirst: js.UndefOr[Boolean] = js.undefined
}

object AnonIncludeSelfParentFirst {
  @scala.inline
  def apply(includeSelf: js.UndefOr[Boolean] = js.undefined, parentFirst: js.UndefOr[Boolean] = js.undefined): AnonIncludeSelfParentFirst = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeSelf)) __obj.updateDynamic("includeSelf")(includeSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(parentFirst)) __obj.updateDynamic("parentFirst")(parentFirst.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeSelfParentFirst]
  }
}

