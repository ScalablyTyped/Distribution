package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteGlobalReplicationGroupMessage extends js.Object {
  
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
  
  /**
    * The primary replication group is retained as a standalone replication group. 
    */
  var RetainPrimaryReplicationGroup: Boolean = js.native
}
object DeleteGlobalReplicationGroupMessage {
  
  @scala.inline
  def apply(GlobalReplicationGroupId: String, RetainPrimaryReplicationGroup: Boolean): DeleteGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], RetainPrimaryReplicationGroup = RetainPrimaryReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGlobalReplicationGroupMessage]
  }
  
  @scala.inline
  implicit class DeleteGlobalReplicationGroupMessageOps[Self <: DeleteGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
    
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
    def setGlobalReplicationGroupId(value: String): Self = this.set("GlobalReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainPrimaryReplicationGroup(value: Boolean): Self = this.set("RetainPrimaryReplicationGroup", value.asInstanceOf[js.Any])
  }
}
