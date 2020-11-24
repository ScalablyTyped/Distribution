package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLunaClientResponse extends js.Object {
  
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typings.awsSdk.cloudhsmMod.ClientArn] = js.native
}
object CreateLunaClientResponse {
  
  @scala.inline
  def apply(): CreateLunaClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLunaClientResponse]
  }
  
  @scala.inline
  implicit class CreateLunaClientResponseOps[Self <: CreateLunaClientResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteClientArn: Self = this.set("ClientArn", js.undefined)
  }
}
