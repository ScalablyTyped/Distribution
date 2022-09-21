package typings.awsSdk.finspaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentResponse extends StObject {
  
  /**
    * Returns the FinSpace environment object.
    */
  var environment: js.UndefOr[Environment] = js.undefined
}
object UpdateEnvironmentResponse {
  
  inline def apply(): UpdateEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEnvironmentResponse]
  }
  
  extension [Self <: UpdateEnvironmentResponse](x: Self) {
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
