package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateComponentResponse extends js.Object {
  
  /**
    * The idempotency token used to make this request idempotent.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the component that was created by this request.
    */
  var componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn] = js.native
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object CreateComponentResponse {
  
  @scala.inline
  def apply(): CreateComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateComponentResponse]
  }
  
  @scala.inline
  implicit class CreateComponentResponseOps[Self <: CreateComponentResponse] (val x: Self) extends AnyVal {
    
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
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    
    @scala.inline
    def setComponentBuildVersionArn(value: ComponentBuildVersionArn): Self = this.set("componentBuildVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentBuildVersionArn: Self = this.set("componentBuildVersionArn", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
}
