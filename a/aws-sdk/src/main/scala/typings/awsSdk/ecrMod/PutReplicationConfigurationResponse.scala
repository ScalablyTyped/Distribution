package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutReplicationConfigurationResponse extends StObject {
  
  /**
    * The contents of the replication configuration for the registry.
    */
  var replicationConfiguration: js.UndefOr[ReplicationConfiguration] = js.undefined
}
object PutReplicationConfigurationResponse {
  
  inline def apply(): PutReplicationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutReplicationConfigurationResponse]
  }
  
  extension [Self <: PutReplicationConfigurationResponse](x: Self) {
    
    inline def setReplicationConfiguration(value: ReplicationConfiguration): Self = StObject.set(x, "replicationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setReplicationConfigurationUndefined: Self = StObject.set(x, "replicationConfiguration", js.undefined)
  }
}
