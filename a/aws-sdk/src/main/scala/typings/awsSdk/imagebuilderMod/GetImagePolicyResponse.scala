package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImagePolicyResponse extends StObject {
  
  /**
    * The image policy object. 
    */
  var policy: js.UndefOr[ResourcePolicyDocument] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object GetImagePolicyResponse {
  
  @scala.inline
  def apply(): GetImagePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImagePolicyResponse]
  }
  
  @scala.inline
  implicit class GetImagePolicyResponseMutableBuilder[Self <: GetImagePolicyResponse] (val x: Self) extends AnyVal {
    
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
