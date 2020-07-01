package typings.baseui.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overrides extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var overrides: js.UndefOr[LabelInteractable] = js.undefined
}

object Overrides {
  @scala.inline
  def apply(children: ReactNode = null, overrides: LabelInteractable = null): Overrides = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overrides]
  }
}

