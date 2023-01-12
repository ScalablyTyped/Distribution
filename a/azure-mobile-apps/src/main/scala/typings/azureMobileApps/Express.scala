package typings.azureMobileApps

import typings.azureMobileApps.Azure.MobileApps.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// additions to the Express modules
object Express {
  
  trait Request extends StObject {
    
    var azureMobile: Context
  }
  object Request {
    
    inline def apply(azureMobile: Context): Request = {
      val __obj = js.Dynamic.literal(azureMobile = azureMobile.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setAzureMobile(value: Context): Self = StObject.set(x, "azureMobile", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response extends StObject {
    
    var results: js.UndefOr[Any] = js.undefined
  }
  object Response {
    
    inline def apply(): Response = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      inline def setResults(value: Any): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    }
  }
}
