package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.bottom_
import typings.chromeApps.chromeAppsStrings.left_
import typings.chromeApps.chromeAppsStrings.right_
import typings.chromeApps.chromeAppsStrings.top_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BOTTOM extends StObject {
  
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
  implicit class BOTTOMMutableBuilder[Self <: BOTTOM] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBOTTOM(value: bottom_): Self = StObject.set(x, "BOTTOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLEFT(value: left_): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRIGHT(value: right_): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOP(value: top_): Self = StObject.set(x, "TOP", value.asInstanceOf[js.Any])
  }
}
