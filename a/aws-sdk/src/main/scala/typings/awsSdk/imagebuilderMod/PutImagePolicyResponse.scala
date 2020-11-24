package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutImagePolicyResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the image that this policy was applied to. 
    */
  var imageArn: js.UndefOr[ImageBuildVersionArn] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object PutImagePolicyResponse {
  
  @scala.inline
  def apply(): PutImagePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutImagePolicyResponse]
  }
  
  @scala.inline
  implicit class PutImagePolicyResponseOps[Self <: PutImagePolicyResponse] (val x: Self) extends AnyVal {
    
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
    def setImageArn(value: ImageBuildVersionArn): Self = this.set("imageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageArn: Self = this.set("imageArn", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
}
