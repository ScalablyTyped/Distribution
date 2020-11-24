package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteImageRequest extends js.Object {
  
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
  implicit class DeleteImageRequestOps[Self <: DeleteImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImageBuildVersionArn(value: ImageBuildVersionArn): Self = this.set("imageBuildVersionArn", value.asInstanceOf[js.Any])
  }
}
