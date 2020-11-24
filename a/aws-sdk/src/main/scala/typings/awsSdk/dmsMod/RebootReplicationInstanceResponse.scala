package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RebootReplicationInstanceResponse extends js.Object {
  
  /**
    * The replication instance that is being rebooted. 
    */
  var ReplicationInstance: js.UndefOr[typings.awsSdk.dmsMod.ReplicationInstance] = js.native
}
object RebootReplicationInstanceResponse {
  
  @scala.inline
  def apply(): RebootReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootReplicationInstanceResponse]
  }
  
  @scala.inline
  implicit class RebootReplicationInstanceResponseOps[Self <: RebootReplicationInstanceResponse] (val x: Self) extends AnyVal {
    
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
    def setReplicationInstance(value: ReplicationInstance): Self = this.set("ReplicationInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationInstance: Self = this.set("ReplicationInstance", js.undefined)
  }
}
