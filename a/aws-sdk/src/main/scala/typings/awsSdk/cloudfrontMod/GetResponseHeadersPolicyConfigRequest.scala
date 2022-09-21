package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponseHeadersPolicyConfigRequest extends StObject {
  
  /**
    * The identifier for the response headers policy. If the response headers policy is attached to a distribution’s cache behavior, you can get the policy’s identifier using ListDistributions or GetDistribution. If the response headers policy is not attached to a cache behavior, you can get the identifier using ListResponseHeadersPolicies.
    */
  var Id: String
}
object GetResponseHeadersPolicyConfigRequest {
  
  inline def apply(Id: String): GetResponseHeadersPolicyConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseHeadersPolicyConfigRequest]
  }
  
  extension [Self <: GetResponseHeadersPolicyConfigRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
