package typings.chrome.anon

import typings.chrome.chromeStrings.one
import typings.chrome.chromeStrings.two
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ONE extends StObject {
  
  var ONE: one
  
  var TWO: two
}
object ONE {
  
  @scala.inline
  def apply(): ONE = {
    val __obj = js.Dynamic.literal(ONE = "one", TWO = "two")
    __obj.asInstanceOf[ONE]
  }
  
  @scala.inline
  implicit class ONEMutableBuilder[Self <: ONE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setONE(value: one): Self = StObject.set(x, "ONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWO(value: two): Self = StObject.set(x, "TWO", value.asInstanceOf[js.Any])
  }
}
