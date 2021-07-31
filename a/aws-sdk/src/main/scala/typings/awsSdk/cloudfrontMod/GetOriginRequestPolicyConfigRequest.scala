package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOriginRequestPolicyConfigRequest extends StObject {
  
  /**
    * The unique identifier for the origin request policy. If the origin request policy is attached to a distribution’s cache behavior, you can get the policy’s identifier using ListDistributions or GetDistribution. If the origin request policy is not attached to a cache behavior, you can get the identifier using ListOriginRequestPolicies.
    */
  var Id: String
}
object GetOriginRequestPolicyConfigRequest {
  
  @scala.inline
  def apply(Id: String): GetOriginRequestPolicyConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOriginRequestPolicyConfigRequest]
  }
  
  @scala.inline
  implicit class GetOriginRequestPolicyConfigRequestMutableBuilder[Self <: GetOriginRequestPolicyConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
