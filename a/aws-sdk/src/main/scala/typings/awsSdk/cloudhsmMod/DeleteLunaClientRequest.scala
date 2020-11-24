package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLunaClientRequest extends js.Object {
  
  /**
    * The ARN of the client to delete.
    */
  var ClientArn: typings.awsSdk.cloudhsmMod.ClientArn = js.native
}
object DeleteLunaClientRequest {
  
  @scala.inline
  def apply(ClientArn: ClientArn): DeleteLunaClientRequest = {
    val __obj = js.Dynamic.literal(ClientArn = ClientArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLunaClientRequest]
  }
  
  @scala.inline
  implicit class DeleteLunaClientRequestOps[Self <: DeleteLunaClientRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientArn(value: ClientArn): Self = this.set("ClientArn", value.asInstanceOf[js.Any])
  }
}
