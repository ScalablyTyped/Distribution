package typings.cfenv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Application extends StObject {
    
    var application: js.UndefOr[String] = js.undefined
    
    var services: js.UndefOr[String] = js.undefined
  }
  object Application {
    
    inline def apply(): Application = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Application]
    }
    
    extension [Self <: Application](x: Self) {
      
      inline def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      inline def setServices(value: String): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    }
  }
}
