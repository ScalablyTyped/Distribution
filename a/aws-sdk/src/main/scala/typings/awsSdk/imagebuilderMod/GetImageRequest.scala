package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImageRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the image that you want to retrieve. 
    */
  var imageBuildVersionArn: ImageVersionArnOrBuildVersionArn = js.native
}
object GetImageRequest {
  
  @scala.inline
  def apply(imageBuildVersionArn: ImageVersionArnOrBuildVersionArn): GetImageRequest = {
    val __obj = js.Dynamic.literal(imageBuildVersionArn = imageBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageRequest]
  }
  
  @scala.inline
  implicit class GetImageRequestOps[Self <: GetImageRequest] (val x: Self) extends AnyVal {
    
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
    def setImageBuildVersionArn(value: ImageVersionArnOrBuildVersionArn): Self = this.set("imageBuildVersionArn", value.asInstanceOf[js.Any])
  }
}
