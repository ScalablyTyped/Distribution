package typings.chrome.anon

import typings.chrome.chromeStrings.bottom
import typings.chrome.chromeStrings.left
import typings.chrome.chromeStrings.right
import typings.chrome.chromeStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BOTTOM extends StObject {
  
  var BOTTOM: bottom
  
  var LEFT: left
  
  var RIGHT: right
  
  var TOP: top
}
object BOTTOM {
  
  inline def apply(): BOTTOM = {
    val __obj = js.Dynamic.literal(BOTTOM = "bottom", LEFT = "left", RIGHT = "right", TOP = "top")
    __obj.asInstanceOf[BOTTOM]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BOTTOM] (val x: Self) extends AnyVal {
    
    inline def setBOTTOM(value: bottom): Self = StObject.set(x, "BOTTOM", value.asInstanceOf[js.Any])
    
    inline def setLEFT(value: left): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    inline def setRIGHT(value: right): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
    
    inline def setTOP(value: top): Self = StObject.set(x, "TOP", value.asInstanceOf[js.Any])
  }
}
