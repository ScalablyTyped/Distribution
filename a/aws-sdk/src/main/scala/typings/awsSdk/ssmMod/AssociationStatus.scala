package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociationStatus extends js.Object {
  
  /**
    * A user-defined string.
    */
  var AdditionalInfo: js.UndefOr[StatusAdditionalInfo] = js.native
  
  /**
    * The date when the status changed.
    */
  var Date: DateTime = js.native
  
  /**
    * The reason for the status.
    */
  var Message: StatusMessage = js.native
  
  /**
    * The status.
    */
  var Name: AssociationStatusName = js.native
}
object AssociationStatus {
  
  @scala.inline
  def apply(Date: DateTime, Message: StatusMessage, Name: AssociationStatusName): AssociationStatus = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationStatus]
  }
  
  @scala.inline
  implicit class AssociationStatusOps[Self <: AssociationStatus] (val x: Self) extends AnyVal {
    
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
    def setDate(value: DateTime): Self = this.set("Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: StatusMessage): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AssociationStatusName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalInfo(value: StatusAdditionalInfo): Self = this.set("AdditionalInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalInfo: Self = this.set("AdditionalInfo", js.undefined)
  }
}
