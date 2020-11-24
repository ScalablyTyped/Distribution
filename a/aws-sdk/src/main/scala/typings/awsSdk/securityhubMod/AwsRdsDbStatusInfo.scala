package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbStatusInfo extends js.Object {
  
  /**
    * If the read replica is currently in an error state, provides the error details.
    */
  var Message: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether the read replica instance is operating normally.
    */
  var Normal: js.UndefOr[Boolean] = js.native
  
  /**
    * The status of the read replica instance.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of status. For a read replica, the status type is read replication.
    */
  var StatusType: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbStatusInfo {
  
  @scala.inline
  def apply(): AwsRdsDbStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbStatusInfo]
  }
  
  @scala.inline
  implicit class AwsRdsDbStatusInfoOps[Self <: AwsRdsDbStatusInfo] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: NonEmptyString): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setNormal(value: Boolean): Self = this.set("Normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormal: Self = this.set("Normal", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusType(value: NonEmptyString): Self = this.set("StatusType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusType: Self = this.set("StatusType", js.undefined)
  }
}
