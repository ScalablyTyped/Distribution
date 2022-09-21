package typings.awsSdk.finspaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEnvironmentRequest extends StObject {
  
  /**
    * The identifier for the FinSpace environment.
    */
  var environmentId: IdType
}
object DeleteEnvironmentRequest {
  
  inline def apply(environmentId: IdType): DeleteEnvironmentRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentRequest]
  }
  
  extension [Self <: DeleteEnvironmentRequest](x: Self) {
    
    inline def setEnvironmentId(value: IdType): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
  }
}
