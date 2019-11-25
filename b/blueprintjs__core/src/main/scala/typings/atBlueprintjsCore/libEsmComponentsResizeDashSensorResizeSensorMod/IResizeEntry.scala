package typings.atBlueprintjsCore.libEsmComponentsResizeDashSensorResizeSensorMod

import typings.std.DOMRectReadOnly
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizeEntry extends js.Object {
  /** Measured dimensions of the target. */
  var contentRect: DOMRectReadOnly
  /** The resized element. */
  var target: Element
}

object IResizeEntry {
  @scala.inline
  def apply(contentRect: DOMRectReadOnly, target: Element): IResizeEntry = {
    val __obj = js.Dynamic.literal(contentRect = contentRect.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IResizeEntry]
  }
}

