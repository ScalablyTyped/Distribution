package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBInstanceStatusInfo extends js.Object {
  
  /**
    * Details of the error if there is an error for the instance. If the instance isn't in an error state, this value is blank.
    */
  var Message: js.UndefOr[String] = js.native
  
  /**
    * Boolean value that is true if the instance is operating normally, or false if the instance is in an error state.
    */
  var Normal: js.UndefOr[Boolean] = js.native
  
  /**
    * Status of the DB instance. For a StatusType of read replica, the values can be replicating, replication stop point set, replication stop point reached, error, stopped, or terminated.
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * This value is currently "read replication."
    */
  var StatusType: js.UndefOr[String] = js.native
}
object DBInstanceStatusInfo {
  
  @scala.inline
  def apply(): DBInstanceStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstanceStatusInfo]
  }
  
  @scala.inline
  implicit class DBInstanceStatusInfoOps[Self <: DBInstanceStatusInfo] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setNormal(value: Boolean): Self = this.set("Normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormal: Self = this.set("Normal", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusType(value: String): Self = this.set("StatusType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusType: Self = this.set("StatusType", js.undefined)
  }
}
