package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImagePipelineRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image pipeline that you want to retrieve. 
    */
  var imagePipelineArn: ImagePipelineArn = js.native
}
object GetImagePipelineRequest {
  
  @scala.inline
  def apply(imagePipelineArn: ImagePipelineArn): GetImagePipelineRequest = {
    val __obj = js.Dynamic.literal(imagePipelineArn = imagePipelineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImagePipelineRequest]
  }
  
  @scala.inline
  implicit class GetImagePipelineRequestMutableBuilder[Self <: GetImagePipelineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImagePipelineArn(value: ImagePipelineArn): Self = StObject.set(x, "imagePipelineArn", value.asInstanceOf[js.Any])
  }
}
