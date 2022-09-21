package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentResponse extends StObject {
  
  /**
    * The unique identifier of the runtime environment that was updated.
    */
  var environmentId: Identifier
}
object UpdateEnvironmentResponse {
  
  inline def apply(environmentId: Identifier): UpdateEnvironmentResponse = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentResponse]
  }
  
  extension [Self <: UpdateEnvironmentResponse](x: Self) {
    
    inline def setEnvironmentId(value: Identifier): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
  }
}
