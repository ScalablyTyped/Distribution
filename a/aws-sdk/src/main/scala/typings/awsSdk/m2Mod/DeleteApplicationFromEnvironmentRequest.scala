package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationFromEnvironmentRequest extends StObject {
  
  /**
    * The unique identifier of the application you want to delete.
    */
  var applicationId: Identifier
  
  /**
    * The unique identifier of the runtime environment where the application was previously deployed.
    */
  var environmentId: Identifier
}
object DeleteApplicationFromEnvironmentRequest {
  
  inline def apply(applicationId: Identifier, environmentId: Identifier): DeleteApplicationFromEnvironmentRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationFromEnvironmentRequest]
  }
  
  extension [Self <: DeleteApplicationFromEnvironmentRequest](x: Self) {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentId(value: Identifier): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
  }
}
