package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartMigrationMessage extends js.Object {
  
  /**
    * List of endpoints from which data should be migrated. For Redis (cluster mode disabled), list should have only one element.
    */
  var CustomerNodeEndpointList: typings.awsSdk.elasticacheMod.CustomerNodeEndpointList = js.native
  
  /**
    * The ID of the replication group to which data should be migrated.
    */
  var ReplicationGroupId: String = js.native
}
object StartMigrationMessage {
  
  @scala.inline
  def apply(CustomerNodeEndpointList: CustomerNodeEndpointList, ReplicationGroupId: String): StartMigrationMessage = {
    val __obj = js.Dynamic.literal(CustomerNodeEndpointList = CustomerNodeEndpointList.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMigrationMessage]
  }
  
  @scala.inline
  implicit class StartMigrationMessageOps[Self <: StartMigrationMessage] (val x: Self) extends AnyVal {
    
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
    def setCustomerNodeEndpointListVarargs(value: CustomerNodeEndpoint*): Self = this.set("CustomerNodeEndpointList", js.Array(value :_*))
    
    @scala.inline
    def setCustomerNodeEndpointList(value: CustomerNodeEndpointList): Self = this.set("CustomerNodeEndpointList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = this.set("ReplicationGroupId", value.asInstanceOf[js.Any])
  }
}
