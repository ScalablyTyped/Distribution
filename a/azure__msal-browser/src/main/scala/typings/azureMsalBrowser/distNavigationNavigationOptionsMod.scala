package typings.azureMsalBrowser

import typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNavigationNavigationOptionsMod {
  
  trait NavigationOptions extends StObject {
    
    /** The Id of the API that initiated navigation */
    var apiId: ApiId
    
    /** When set to true the url should not be added to the browser history */
    var noHistory: Boolean
    
    /** Suggested timeout (ms) based on the configuration provided to PublicClientApplication */
    var timeout: Double
  }
  object NavigationOptions {
    
    inline def apply(apiId: ApiId, noHistory: Boolean, timeout: Double): NavigationOptions = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], noHistory = noHistory.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationOptions] (val x: Self) extends AnyVal {
      
      inline def setApiId(value: ApiId): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setNoHistory(value: Boolean): Self = StObject.set(x, "noHistory", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
