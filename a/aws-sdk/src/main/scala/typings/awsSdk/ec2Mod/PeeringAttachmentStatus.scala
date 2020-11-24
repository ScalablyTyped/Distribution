package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeeringAttachmentStatus extends js.Object {
  
  /**
    * The status code.
    */
  var Code: js.UndefOr[String] = js.native
  
  /**
    * The status message, if applicable.
    */
  var Message: js.UndefOr[String] = js.native
}
object PeeringAttachmentStatus {
  
  @scala.inline
  def apply(): PeeringAttachmentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeeringAttachmentStatus]
  }
  
  @scala.inline
  implicit class PeeringAttachmentStatusOps[Self <: PeeringAttachmentStatus] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
}
