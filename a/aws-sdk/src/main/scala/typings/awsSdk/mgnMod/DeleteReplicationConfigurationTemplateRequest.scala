package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationConfigurationTemplateRequest extends StObject {
  
  /**
    * Request to delete Replication Configuration Template from service by Replication Configuration Template ID.
    */
  var replicationConfigurationTemplateID: ReplicationConfigurationTemplateID
}
object DeleteReplicationConfigurationTemplateRequest {
  
  inline def apply(replicationConfigurationTemplateID: ReplicationConfigurationTemplateID): DeleteReplicationConfigurationTemplateRequest = {
    val __obj = js.Dynamic.literal(replicationConfigurationTemplateID = replicationConfigurationTemplateID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationConfigurationTemplateRequest]
  }
  
  extension [Self <: DeleteReplicationConfigurationTemplateRequest](x: Self) {
    
    inline def setReplicationConfigurationTemplateID(value: ReplicationConfigurationTemplateID): Self = StObject.set(x, "replicationConfigurationTemplateID", value.asInstanceOf[js.Any])
  }
}
