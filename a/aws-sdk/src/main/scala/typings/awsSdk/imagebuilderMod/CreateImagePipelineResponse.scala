package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImagePipelineResponse extends StObject {
  
  /**
    *  The idempotency token used to make this request idempotent.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the image pipeline that was created by this request.
    */
  var imagePipelineArn: js.UndefOr[ImagePipelineArn] = js.undefined
  
  /**
    *  The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object CreateImagePipelineResponse {
  
  inline def apply(): CreateImagePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImagePipelineResponse]
  }
  
  extension [Self <: CreateImagePipelineResponse](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setImagePipelineArn(value: ImagePipelineArn): Self = StObject.set(x, "imagePipelineArn", value.asInstanceOf[js.Any])
    
    inline def setImagePipelineArnUndefined: Self = StObject.set(x, "imagePipelineArn", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
