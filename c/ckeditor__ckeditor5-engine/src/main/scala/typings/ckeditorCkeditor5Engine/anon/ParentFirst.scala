package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentFirst extends js.Object {
  var includeSelf: js.UndefOr[Boolean] = js.undefined
  var parentFirst: js.UndefOr[Boolean] = js.undefined
}

object ParentFirst {
  @scala.inline
  def apply(includeSelf: js.UndefOr[Boolean] = js.undefined, parentFirst: js.UndefOr[Boolean] = js.undefined): ParentFirst = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeSelf)) __obj.updateDynamic("includeSelf")(includeSelf.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parentFirst)) __obj.updateDynamic("parentFirst")(parentFirst.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentFirst]
  }
}

