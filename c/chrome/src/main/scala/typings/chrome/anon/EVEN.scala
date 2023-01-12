package typings.chrome.anon

import typings.chrome.chromeStrings.even
import typings.chrome.chromeStrings.no
import typings.chrome.chromeStrings.odd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EVEN extends StObject {
  
  var EVEN: even
  
  var NO: no
  
  var ODD: odd
}
object EVEN {
  
  inline def apply(): EVEN = {
    val __obj = js.Dynamic.literal(EVEN = "even", NO = "no", ODD = "odd")
    __obj.asInstanceOf[EVEN]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EVEN] (val x: Self) extends AnyVal {
    
    inline def setEVEN(value: even): Self = StObject.set(x, "EVEN", value.asInstanceOf[js.Any])
    
    inline def setNO(value: no): Self = StObject.set(x, "NO", value.asInstanceOf[js.Any])
    
    inline def setODD(value: odd): Self = StObject.set(x, "ODD", value.asInstanceOf[js.Any])
  }
}
