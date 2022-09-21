package typings.browserslist

import typings.browserslist.browserslistBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("browserslist/error", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with BrowserslistError {
    def this(message: Any) = this()
    
    /* CompleteClass */
    var browserslist: `true` = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_BrowserslistError: typings.browserslist.browserslistStrings.BrowserslistError = js.native
  }
  
  trait BrowserslistError
    extends StObject
       with Error {
    
    var browserslist: `true`
    
    @JSName("name")
    var name_BrowserslistError: typings.browserslist.browserslistStrings.BrowserslistError
  }
  object BrowserslistError {
    
    inline def apply(message: String): BrowserslistError = {
      val __obj = js.Dynamic.literal(browserslist = true, message = message.asInstanceOf[js.Any], name = "BrowserslistError")
      __obj.asInstanceOf[BrowserslistError]
    }
    
    extension [Self <: BrowserslistError](x: Self) {
      
      inline def setBrowserslist(value: `true`): Self = StObject.set(x, "browserslist", value.asInstanceOf[js.Any])
      
      inline def setName(value: typings.browserslist.browserslistStrings.BrowserslistError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
