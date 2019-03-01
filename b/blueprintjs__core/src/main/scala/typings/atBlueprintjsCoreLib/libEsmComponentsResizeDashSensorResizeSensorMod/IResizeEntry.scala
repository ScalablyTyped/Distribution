package typings
package atBlueprintjsCoreLib.libEsmComponentsResizeDashSensorResizeSensorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizeEntry extends js.Object {
  /** Measured dimensions of the target. */
  var contentRect: stdLib.DOMRectReadOnly
  /** The resized element. */
  var target: reactLib.Element
}

object IResizeEntry {
  @scala.inline
  def apply(contentRect: stdLib.DOMRectReadOnly, target: reactLib.Element): IResizeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentRect")(contentRect)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[IResizeEntry]
  }
}

