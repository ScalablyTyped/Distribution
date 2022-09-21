package typings.awsSdk.emrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationResponse extends StObject {
  
  /**
    * The output displays information about the specified application.
    */
  var application: Application
}
object GetApplicationResponse {
  
  inline def apply(application: Application): GetApplicationResponse = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationResponse]
  }
  
  extension [Self <: GetApplicationResponse](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
  }
}
