package typings.atCkeditorCkeditor5DashEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeSelfParentFirstBoolean extends js.Object {
  var includeSelf: Boolean
  var parentFirst: js.UndefOr[Boolean] = js.undefined
}

object Anon_IncludeSelfParentFirstBoolean {
  @scala.inline
  def apply(includeSelf: Boolean, parentFirst: js.UndefOr[Boolean] = js.undefined): Anon_IncludeSelfParentFirstBoolean = {
    val __obj = js.Dynamic.literal(includeSelf = includeSelf)
    if (!js.isUndefined(parentFirst)) __obj.updateDynamic("parentFirst")(parentFirst)
    __obj.asInstanceOf[Anon_IncludeSelfParentFirstBoolean]
  }
}

