package typings.browserslist

import typings.browserslist.browserslistBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("browserslist/error", JSImport.Namespace)
  @js.native
  class ^ protected () extends BrowserslistError {
    def this(message: js.Any) = this()
  }
  
  @js.native
  trait BrowserslistError extends Error {
    
    var browserslist: `true` = js.native
  }
  object BrowserslistError {
    
    @scala.inline
    def apply(browserslist: `true`, message: String, name: String): BrowserslistError = {
      val __obj = js.Dynamic.literal(browserslist = browserslist.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserslistError]
    }
    
    @scala.inline
    implicit class BrowserslistErrorMutableBuilder[Self <: BrowserslistError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowserslist(value: `true`): Self = StObject.set(x, "browserslist", value.asInstanceOf[js.Any])
    }
  }
}
