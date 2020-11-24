package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelImageCreationRequest extends js.Object {
  
  /**
    * The idempotency token used to make this request idempotent.
    */
  var clientToken: ClientToken = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the image whose creation you want to cancel.
    */
  var imageBuildVersionArn: ImageBuildVersionArn = js.native
}
object CancelImageCreationRequest {
  
  @scala.inline
  def apply(clientToken: ClientToken, imageBuildVersionArn: ImageBuildVersionArn): CancelImageCreationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], imageBuildVersionArn = imageBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelImageCreationRequest]
  }
  
  @scala.inline
  implicit class CancelImageCreationRequestOps[Self <: CancelImageCreationRequest] (val x: Self) extends AnyVal {
    
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
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBuildVersionArn(value: ImageBuildVersionArn): Self = this.set("imageBuildVersionArn", value.asInstanceOf[js.Any])
  }
}
