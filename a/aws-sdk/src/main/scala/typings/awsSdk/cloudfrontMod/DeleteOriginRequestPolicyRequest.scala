package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteOriginRequestPolicyRequest extends StObject {
  
  /**
    * The unique identifier for the origin request policy that you are deleting. To get the identifier, you can use ListOriginRequestPolicies.
    */
  var Id: String = js.native
  
  /**
    * The version of the origin request policy that you are deleting. The version is the origin request policy’s ETag value, which you can get using ListOriginRequestPolicies, GetOriginRequestPolicy, or GetOriginRequestPolicyConfig.
    */
  var IfMatch: js.UndefOr[String] = js.native
}
object DeleteOriginRequestPolicyRequest {
  
  @scala.inline
  def apply(Id: String): DeleteOriginRequestPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOriginRequestPolicyRequest]
  }
  
  @scala.inline
  implicit class DeleteOriginRequestPolicyRequestMutableBuilder[Self <: DeleteOriginRequestPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
