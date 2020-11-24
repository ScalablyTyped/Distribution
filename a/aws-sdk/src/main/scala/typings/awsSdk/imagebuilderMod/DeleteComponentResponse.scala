package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteComponentResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the component build version that was deleted. 
    */
  var componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object DeleteComponentResponse {
  
  @scala.inline
  def apply(): DeleteComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteComponentResponse]
  }
  
  @scala.inline
  implicit class DeleteComponentResponseOps[Self <: DeleteComponentResponse] (val x: Self) extends AnyVal {
    
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
    def setComponentBuildVersionArn(value: ComponentBuildVersionArn): Self = this.set("componentBuildVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentBuildVersionArn: Self = this.set("componentBuildVersionArn", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
}
