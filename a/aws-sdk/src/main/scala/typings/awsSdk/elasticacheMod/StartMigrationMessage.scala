package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMigrationMessage extends StObject {
  
  /**
    * List of endpoints from which data should be migrated. For Redis (cluster mode disabled), list should have only one element.
    */
  var CustomerNodeEndpointList: typings.awsSdk.elasticacheMod.CustomerNodeEndpointList
  
  /**
    * The ID of the replication group to which data should be migrated.
    */
  var ReplicationGroupId: String
}
object StartMigrationMessage {
  
  inline def apply(CustomerNodeEndpointList: CustomerNodeEndpointList, ReplicationGroupId: String): StartMigrationMessage = {
    val __obj = js.Dynamic.literal(CustomerNodeEndpointList = CustomerNodeEndpointList.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMigrationMessage]
  }
  
  extension [Self <: StartMigrationMessage](x: Self) {
    
    inline def setCustomerNodeEndpointList(value: CustomerNodeEndpointList): Self = StObject.set(x, "CustomerNodeEndpointList", value.asInstanceOf[js.Any])
    
    inline def setCustomerNodeEndpointListVarargs(value: CustomerNodeEndpoint*): Self = StObject.set(x, "CustomerNodeEndpointList", js.Array(value*))
    
    inline def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
  }
}
