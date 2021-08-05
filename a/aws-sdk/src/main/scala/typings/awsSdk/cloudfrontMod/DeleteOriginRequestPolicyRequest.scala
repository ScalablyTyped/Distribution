package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOriginRequestPolicyRequest extends StObject {
  
  /**
    * The unique identifier for the origin request policy that you are deleting. To get the identifier, you can use ListOriginRequestPolicies.
    */
  var Id: String
  
  /**
    * The version of the origin request policy that you are deleting. The version is the origin request policy’s ETag value, which you can get using ListOriginRequestPolicies, GetOriginRequestPolicy, or GetOriginRequestPolicyConfig.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}
object DeleteOriginRequestPolicyRequest {
  
  inline def apply(Id: String): DeleteOriginRequestPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOriginRequestPolicyRequest]
  }
  
  extension [Self <: DeleteOriginRequestPolicyRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
