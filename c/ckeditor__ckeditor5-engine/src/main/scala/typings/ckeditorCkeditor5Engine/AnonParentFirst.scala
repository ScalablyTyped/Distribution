package typings.ckeditorCkeditor5Engine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParentFirst extends js.Object {
  var includeSelf: js.UndefOr[Boolean] = js.undefined
  var parentFirst: js.UndefOr[Boolean] = js.undefined
}

object AnonParentFirst {
  @scala.inline
  def apply(includeSelf: js.UndefOr[Boolean] = js.undefined, parentFirst: js.UndefOr[Boolean] = js.undefined): AnonParentFirst = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeSelf)) __obj.updateDynamic("includeSelf")(includeSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(parentFirst)) __obj.updateDynamic("parentFirst")(parentFirst.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParentFirst]
  }
}

