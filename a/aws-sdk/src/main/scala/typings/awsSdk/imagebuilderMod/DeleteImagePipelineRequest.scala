package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImagePipelineRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image pipeline to delete. 
    */
  var imagePipelineArn: ImagePipelineArn
}
object DeleteImagePipelineRequest {
  
  @scala.inline
  def apply(imagePipelineArn: ImagePipelineArn): DeleteImagePipelineRequest = {
    val __obj = js.Dynamic.literal(imagePipelineArn = imagePipelineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImagePipelineRequest]
  }
  
  @scala.inline
  implicit class DeleteImagePipelineRequestMutableBuilder[Self <: DeleteImagePipelineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImagePipelineArn(value: ImagePipelineArn): Self = StObject.set(x, "imagePipelineArn", value.asInstanceOf[js.Any])
  }
}
