package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLayerVersionPolicyResponse extends StObject {
  
  /**
    * The policy document.
    */
  var Policy: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier for the current revision of the policy.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
}
object GetLayerVersionPolicyResponse {
  
  inline def apply(): GetLayerVersionPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLayerVersionPolicyResponse]
  }
  
  extension [Self <: GetLayerVersionPolicyResponse](x: Self) {
    
    inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
  }
}
