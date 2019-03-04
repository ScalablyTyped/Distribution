package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeSelfParentFirstBoolean extends js.Object {
  var includeSelf: scala.Boolean
  var parentFirst: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IncludeSelfParentFirstBoolean {
  @scala.inline
  def apply(includeSelf: scala.Boolean, parentFirst: js.UndefOr[scala.Boolean] = js.undefined): Anon_IncludeSelfParentFirstBoolean = {
    val __obj = js.Dynamic.literal(includeSelf = includeSelf)
    if (!js.isUndefined(parentFirst)) __obj.updateDynamic("parentFirst")(parentFirst)
    __obj.asInstanceOf[Anon_IncludeSelfParentFirstBoolean]
  }
}

