package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteImagePipelineResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image pipeline that was deleted. 
    */
  var imagePipelineArn: js.UndefOr[ImagePipelineArn] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object DeleteImagePipelineResponse {
  
  @scala.inline
  def apply(): DeleteImagePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteImagePipelineResponse]
  }
  
  @scala.inline
  implicit class DeleteImagePipelineResponseMutableBuilder[Self <: DeleteImagePipelineResponse] (val x: Self) extends AnyVal {
    
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
