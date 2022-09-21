package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationConfigurationTemplateRequest extends StObject {
  
  /**
    * The ID of the Replication Configuration Template to be deleted.
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
