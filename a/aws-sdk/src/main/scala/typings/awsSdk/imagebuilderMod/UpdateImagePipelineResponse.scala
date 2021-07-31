package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateImagePipelineResponse extends StObject {
  
  /**
    * The idempotency token used to make this request idempotent. 
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the image pipeline that was updated by this request. 
    */
  var imagePipelineArn: js.UndefOr[ImagePipelineArn] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object UpdateImagePipelineResponse {
  
  @scala.inline
  def apply(): UpdateImagePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateImagePipelineResponse]
  }
  
  @scala.inline
  implicit class UpdateImagePipelineResponseMutableBuilder[Self <: UpdateImagePipelineResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setImagePipelineArn(value: ImagePipelineArn): Self = StObject.set(x, "imagePipelineArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePipelineArnUndefined: Self = StObject.set(x, "imagePipelineArn", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
