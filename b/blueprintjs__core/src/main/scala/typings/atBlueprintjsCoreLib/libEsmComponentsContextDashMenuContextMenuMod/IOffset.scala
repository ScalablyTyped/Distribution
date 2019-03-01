package typings
package atBlueprintjsCoreLib.libEsmComponentsContextDashMenuContextMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOffset extends js.Object {
  var left: scala.Double
  var top: scala.Double
}

object IOffset {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): IOffset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[IOffset]
  }
}

