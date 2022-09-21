package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEnvironmentRequest extends StObject {
  
  /**
    * The unique identifier of the runtime environment you want to delete.
    */
  var environmentId: Identifier
}
object DeleteEnvironmentRequest {
  
  inline def apply(environmentId: Identifier): DeleteEnvironmentRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentRequest]
  }
  
  extension [Self <: DeleteEnvironmentRequest](x: Self) {
    
    inline def setEnvironmentId(value: Identifier): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
  }
}
