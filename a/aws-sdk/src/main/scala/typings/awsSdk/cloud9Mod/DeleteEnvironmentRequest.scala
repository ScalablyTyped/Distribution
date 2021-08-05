package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEnvironmentRequest extends StObject {
  
  /**
    * The ID of the environment to delete.
    */
  var environmentId: EnvironmentId
}
object DeleteEnvironmentRequest {
  
  inline def apply(environmentId: EnvironmentId): DeleteEnvironmentRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentRequest]
  }
  
  extension [Self <: DeleteEnvironmentRequest](x: Self) {
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
  }
}
