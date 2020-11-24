package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyReplicationTaskResponse extends js.Object {
  
  /**
    * The replication task that was modified.
    */
  var ReplicationTask: js.UndefOr[typings.awsSdk.dmsMod.ReplicationTask] = js.native
}
object ModifyReplicationTaskResponse {
  
  @scala.inline
  def apply(): ModifyReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyReplicationTaskResponse]
  }
  
  @scala.inline
  implicit class ModifyReplicationTaskResponseOps[Self <: ModifyReplicationTaskResponse] (val x: Self) extends AnyVal {
    
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
    def setReplicationTask(value: ReplicationTask): Self = this.set("ReplicationTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTask: Self = this.set("ReplicationTask", js.undefined)
  }
}
