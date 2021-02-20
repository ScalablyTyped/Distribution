package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteImageRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image to delete. 
    */
  var imageBuildVersionArn: ImageBuildVersionArn = js.native
}
object DeleteImageRequest {
  
  @scala.inline
  def apply(imageBuildVersionArn: ImageBuildVersionArn): DeleteImageRequest = {
    val __obj = js.Dynamic.literal(imageBuildVersionArn = imageBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageRequest]
  }
  
  @scala.inline
  implicit class DeleteImageRequestMutableBuilder[Self <: DeleteImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageBuildVersionArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageBuildVersionArn", value.asInstanceOf[js.Any])
  }
}
