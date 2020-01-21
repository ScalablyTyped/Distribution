package typings.baseui.layerMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersManagerProps extends js.Object {
  var children: ReactNode
  var zIndex: js.UndefOr[Double] = js.undefined
}

object LayersManagerProps {
  @scala.inline
  def apply(children: ReactNode = null, zIndex: Int | Double = null): LayersManagerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersManagerProps]
  }
}

