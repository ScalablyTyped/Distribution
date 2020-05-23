package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeSelfParentFirst extends js.Object {
  var includeSelf: Boolean
  var parentFirst: js.UndefOr[Boolean] = js.undefined
}

object IncludeSelfParentFirst {
  @scala.inline
  def apply(includeSelf: Boolean, parentFirst: js.UndefOr[Boolean] = js.undefined): IncludeSelfParentFirst = {
    val __obj = js.Dynamic.literal(includeSelf = includeSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(parentFirst)) __obj.updateDynamic("parentFirst")(parentFirst.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeSelfParentFirst]
  }
}

