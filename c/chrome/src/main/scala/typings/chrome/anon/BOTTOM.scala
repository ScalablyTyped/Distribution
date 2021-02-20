package typings.chrome.anon

import typings.chrome.chromeStrings.bottom
import typings.chrome.chromeStrings.left
import typings.chrome.chromeStrings.right
import typings.chrome.chromeStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BOTTOM extends StObject {
  
  var BOTTOM: bottom = js.native
  
  var LEFT: left = js.native
  
  var RIGHT: right = js.native
  
  var TOP: top = js.native
}
object BOTTOM {
  
  @scala.inline
  def apply(BOTTOM: bottom, LEFT: left, RIGHT: right, TOP: top): BOTTOM = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any])
    __obj.asInstanceOf[BOTTOM]
  }
  
  @scala.inline
  implicit class BOTTOMMutableBuilder[Self <: BOTTOM] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBOTTOM(value: bottom): Self = StObject.set(x, "BOTTOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLEFT(value: left): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRIGHT(value: right): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOP(value: top): Self = StObject.set(x, "TOP", value.asInstanceOf[js.Any])
  }
}
