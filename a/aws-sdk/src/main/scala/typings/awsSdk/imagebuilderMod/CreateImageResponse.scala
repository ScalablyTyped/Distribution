package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImageResponse extends StObject {
  
  /**
    *  The idempotency token used to make this request idempotent. 
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the image that was created by this request. 
    */
  var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn] = js.undefined
  
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object CreateImageResponse {
  
  inline def apply(): CreateImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageResponse]
  }
  
  extension [Self <: CreateImageResponse](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setImageBuildVersionArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageBuildVersionArn", value.asInstanceOf[js.Any])
    
    inline def setImageBuildVersionArnUndefined: Self = StObject.set(x, "imageBuildVersionArn", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
