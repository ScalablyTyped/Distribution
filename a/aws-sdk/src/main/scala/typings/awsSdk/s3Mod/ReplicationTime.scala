package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationTime extends js.Object {
  
  /**
    *  Specifies whether the replication time is enabled. 
    */
  var Status: ReplicationTimeStatus = js.native
  
  /**
    *  A container specifying the time by which replication should be complete for all objects and operations on objects. 
    */
  var Time: ReplicationTimeValue = js.native
}
object ReplicationTime {
  
  @scala.inline
  def apply(Status: ReplicationTimeStatus, Time: ReplicationTimeValue): ReplicationTime = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationTime]
  }
  
  @scala.inline
  implicit class ReplicationTimeOps[Self <: ReplicationTime] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: ReplicationTimeStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: ReplicationTimeValue): Self = this.set("Time", value.asInstanceOf[js.Any])
  }
}
