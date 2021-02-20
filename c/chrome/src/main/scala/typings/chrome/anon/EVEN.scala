package typings.chrome.anon

import typings.chrome.chromeStrings.even
import typings.chrome.chromeStrings.no
import typings.chrome.chromeStrings.odd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EVEN extends StObject {
  
  var EVEN: even = js.native
  
  var NO: no = js.native
  
  var ODD: odd = js.native
}
object EVEN {
  
  @scala.inline
  def apply(EVEN: even, NO: no, ODD: odd): EVEN = {
    val __obj = js.Dynamic.literal(EVEN = EVEN.asInstanceOf[js.Any], NO = NO.asInstanceOf[js.Any], ODD = ODD.asInstanceOf[js.Any])
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
