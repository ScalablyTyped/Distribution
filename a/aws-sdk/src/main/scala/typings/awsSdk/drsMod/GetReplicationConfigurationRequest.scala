package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReplicationConfigurationRequest extends StObject {
  
  /**
    * The ID of the Source Serve for this Replication Configuration.r
    */
  var sourceServerID: SourceServerID
}
object GetReplicationConfigurationRequest {
  
  inline def apply(sourceServerID: SourceServerID): GetReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReplicationConfigurationRequest]
  }
  
  extension [Self <: GetReplicationConfigurationRequest](x: Self) {
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
