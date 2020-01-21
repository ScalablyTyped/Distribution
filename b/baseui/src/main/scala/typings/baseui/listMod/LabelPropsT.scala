package typings.baseui.listMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelPropsT extends js.Object {
  var children: ReactNode
  var description: js.UndefOr[ReactNode] = js.undefined
  var sublist: js.UndefOr[Boolean] = js.undefined
}

object LabelPropsT {
  @scala.inline
  def apply(
    children: ReactNode = null,
    description: ReactNode = null,
    sublist: js.UndefOr[Boolean] = js.undefined
  ): LabelPropsT = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(sublist)) __obj.updateDynamic("sublist")(sublist.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelPropsT]
  }
}

