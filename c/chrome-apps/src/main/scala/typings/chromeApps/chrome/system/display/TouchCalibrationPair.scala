package typings.chromeApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @since Chrome 57
  */
@js.native
trait TouchCalibrationPair extends js.Object {
  
  /** The coordinates of the display point. */
  var displayPoint: Point = js.native
  
  /** The coordinates of the touch point corresponding to the display point. */
  var touchPoint: Point = js.native
}
object TouchCalibrationPair {
  
  @scala.inline
  def apply(displayPoint: Point, touchPoint: Point): TouchCalibrationPair = {
    val __obj = js.Dynamic.literal(displayPoint = displayPoint.asInstanceOf[js.Any], touchPoint = touchPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchCalibrationPair]
  }
  
  @scala.inline
  implicit class TouchCalibrationPairOps[Self <: TouchCalibrationPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisplayPoint(value: Point): Self = this.set("displayPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchPoint(value: Point): Self = this.set("touchPoint", value.asInstanceOf[js.Any])
  }
}
