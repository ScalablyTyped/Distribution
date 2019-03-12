package typings
package atBlueprintjsCoreLib.libEsmComponentsResizeDashSensorResizeSensorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizeEntry extends js.Object {
  /** Measured dimensions of the target. */
  var contentRect: stdLib.DOMRectReadOnly
  /** The resized element. */
  var target: stdLib.Element
}

object IResizeEntry {
  @scala.inline
  def apply(contentRect: stdLib.DOMRectReadOnly, target: stdLib.Element): IResizeEntry = {
    val __obj = js.Dynamic.literal(contentRect = contentRect, target = target)
  
    __obj.asInstanceOf[IResizeEntry]
  }
}

