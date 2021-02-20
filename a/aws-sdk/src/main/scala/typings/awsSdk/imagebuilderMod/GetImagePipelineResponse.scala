package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImagePipelineResponse extends StObject {
  
  /**
    * The image pipeline object. 
    */
  var imagePipeline: js.UndefOr[ImagePipeline] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object GetImagePipelineResponse {
  
  @scala.inline
  def apply(): GetImagePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImagePipelineResponse]
  }
  
  @scala.inline
  implicit class GetImagePipelineResponseMutableBuilder[Self <: GetImagePipelineResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImagePipeline(value: ImagePipeline): Self = StObject.set(x, "imagePipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePipelineUndefined: Self = StObject.set(x, "imagePipeline", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
