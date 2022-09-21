package typings.cfenv

import org.scalablytyped.runtime.StringDictionary
import typings.cfenv.mod.ApplicationConfig
import typings.cfenv.mod.ServicesConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Application extends StObject {
    
    var application: js.UndefOr[ApplicationConfig] = js.undefined
    
    var services: js.UndefOr[ServicesConfig] = js.undefined
  }
  object Application {
    
    inline def apply(): Application = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Application]
    }
    
    extension [Self <: Application](x: Self) {
      
      inline def setApplication(value: ApplicationConfig): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      inline def setServices(value: ServicesConfig): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    }
  }
  
  trait Dictrest
    extends StObject
       with /* rest */ StringDictionary[Any] {
    
    var credentials: js.UndefOr[Record[String, Any]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Dictrest {
    
    inline def apply(): Dictrest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictrest]
    }
    
    extension [Self <: Dictrest](x: Self) {
      
      inline def setCredentials(value: Record[String, Any]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
