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
  
  @scala.inline
  def apply(): EVEN = {
    val __obj = js.Dynamic.literal(EVEN = "even", NO = "no", ODD = "odd")
    __obj.asInstanceOf[EVEN]
  }
  
  @scala.inline
  implicit class EVENMutableBuilder[Self <: EVEN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEVEN(value: even): Self = StObject.set(x, "EVEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNO(value: no): Self = StObject.set(x, "NO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setODD(value: odd): Self = StObject.set(x, "ODD", value.asInstanceOf[js.Any])
  }
}
