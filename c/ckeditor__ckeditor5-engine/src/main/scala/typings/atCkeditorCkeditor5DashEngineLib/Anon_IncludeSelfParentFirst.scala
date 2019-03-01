package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeSelfParentFirst extends js.Object {
  var includeSelf: js.UndefOr[scala.Boolean] = js.undefined
  var parentFirst: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IncludeSelfParentFirst {
  @scala.inline
  def apply(
    includeSelf: js.UndefOr[scala.Boolean] = js.undefined,
    parentFirst: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_IncludeSelfParentFirst = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeSelf)) __obj.updateDynamic("includeSelf")(includeSelf)
    if (!js.isUndefined(parentFirst)) __obj.updateDynamic("parentFirst")(parentFirst)
    __obj.asInstanceOf[Anon_IncludeSelfParentFirst]
  }
}

