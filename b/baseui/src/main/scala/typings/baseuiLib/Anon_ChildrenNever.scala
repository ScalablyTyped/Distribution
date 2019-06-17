package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenNever extends js.Object {
  var children: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_ChildrenNever {
  @scala.inline
  def apply(children: js.UndefOr[scala.Nothing] = js.undefined): Anon_ChildrenNever = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[Anon_ChildrenNever]
  }
}

