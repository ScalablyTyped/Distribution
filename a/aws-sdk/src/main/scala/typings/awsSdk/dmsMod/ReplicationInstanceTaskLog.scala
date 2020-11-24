package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationInstanceTaskLog extends js.Object {
  
  /**
    * The size, in bytes, of the replication task log.
    */
  var ReplicationInstanceTaskLogSize: js.UndefOr[Long] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.native
  
  /**
    * The name of the replication task.
    */
  var ReplicationTaskName: js.UndefOr[String] = js.native
}
object ReplicationInstanceTaskLog {
  
  @scala.inline
  def apply(): ReplicationInstanceTaskLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationInstanceTaskLog]
  }
  
  @scala.inline
  implicit class ReplicationInstanceTaskLogOps[Self <: ReplicationInstanceTaskLog] (val x: Self) extends AnyVal {
    
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
    def setReplicationInstanceTaskLogSize(value: Long): Self = this.set("ReplicationInstanceTaskLogSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationInstanceTaskLogSize: Self = this.set("ReplicationInstanceTaskLogSize", js.undefined)
    
    @scala.inline
    def setReplicationTaskArn(value: String): Self = this.set("ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskArn: Self = this.set("ReplicationTaskArn", js.undefined)
    
    @scala.inline
    def setReplicationTaskName(value: String): Self = this.set("ReplicationTaskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskName: Self = this.set("ReplicationTaskName", js.undefined)
  }
}
