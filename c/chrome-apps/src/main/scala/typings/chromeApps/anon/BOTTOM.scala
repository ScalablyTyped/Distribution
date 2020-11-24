package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.bottom_
import typings.chromeApps.chromeAppsStrings.left_
import typings.chromeApps.chromeAppsStrings.right_
import typings.chromeApps.chromeAppsStrings.top_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BOTTOM extends js.Object {
  
  var BOTTOM: bottom_ = js.native
  
  var LEFT: left_ = js.native
  
  var RIGHT: right_ = js.native
  
  var TOP: top_ = js.native
}
object BOTTOM {
  
  @scala.inline
  def apply(BOTTOM: bottom_, LEFT: left_, RIGHT: right_, TOP: top_): BOTTOM = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any])
    __obj.asInstanceOf[BOTTOM]
  }
  
  @scala.inline
  implicit class BOTTOMOps[Self <: BOTTOM] (val x: Self) extends AnyVal {
    
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
    def setBOTTOM(value: bottom_): Self = this.set("BOTTOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLEFT(value: left_): Self = this.set("LEFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRIGHT(value: right_): Self = this.set("RIGHT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOP(value: top_): Self = this.set("TOP", value.asInstanceOf[js.Any])
  }
}
