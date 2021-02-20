package typings.cfenv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Application extends StObject {
    
    var application: js.UndefOr[String] = js.native
    
    var services: js.UndefOr[String] = js.native
  }
  object Application {
    
    @scala.inline
    def apply(): Application = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Application]
    }
    
    @scala.inline
    implicit class ApplicationMutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      @scala.inline
      def setServices(value: String): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    }
  }
}
