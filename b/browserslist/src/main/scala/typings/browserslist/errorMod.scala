package typings.browserslist

import typings.browserslist.browserslistBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("browserslist/error", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with BrowserslistError {
    def this(message: js.Any) = this()
    
    /* CompleteClass */
    var browserslist: `true` = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait BrowserslistError
    extends StObject
       with Error {
    
    var browserslist: `true`
  }
  object BrowserslistError {
    
    inline def apply(message: String, name: String): BrowserslistError = {
      val __obj = js.Dynamic.literal(browserslist = true, message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserslistError]
    }
    
    extension [Self <: BrowserslistError](x: Self) {
      
      inline def setBrowserslist(value: `true`): Self = StObject.set(x, "browserslist", value.asInstanceOf[js.Any])
    }
  }
}
