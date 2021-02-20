package typings.chrome.anon

import typings.chrome.chromeStrings.one
import typings.chrome.chromeStrings.two
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ONE extends StObject {
  
  var ONE: one = js.native
  
  var TWO: two = js.native
}
object ONE {
  
  @scala.inline
  def apply(ONE: one, TWO: two): ONE = {
    val __obj = js.Dynamic.literal(ONE = ONE.asInstanceOf[js.Any], TWO = TWO.asInstanceOf[js.Any])
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
