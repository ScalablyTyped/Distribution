package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImageRecipePolicyResponse extends StObject {
  
  /**
    * The image recipe policy object. 
    */
  var policy: js.UndefOr[ResourcePolicyDocument] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object GetImageRecipePolicyResponse {
  
  @scala.inline
  def apply(): GetImageRecipePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImageRecipePolicyResponse]
  }
  
  @scala.inline
  implicit class GetImageRecipePolicyResponseMutableBuilder[Self <: GetImageRecipePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: ResourcePolicyDocument): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
