package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImagePipelineResponse extends StObject {
  
  /**
    * The image pipeline object.
    */
  var imagePipeline: js.UndefOr[ImagePipeline] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object GetImagePipelineResponse {
  
  inline def apply(): GetImagePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImagePipelineResponse]
  }
  
  extension [Self <: GetImagePipelineResponse](x: Self) {
    
    inline def setImagePipeline(value: ImagePipeline): Self = StObject.set(x, "imagePipeline", value.asInstanceOf[js.Any])
    
    inline def setImagePipelineUndefined: Self = StObject.set(x, "imagePipeline", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
