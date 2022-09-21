package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReplicationSetOutput extends StObject {
  
  /**
    * Details of the replication set.
    */
  var replicationSet: ReplicationSet
}
object GetReplicationSetOutput {
  
  inline def apply(replicationSet: ReplicationSet): GetReplicationSetOutput = {
    val __obj = js.Dynamic.literal(replicationSet = replicationSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReplicationSetOutput]
  }
  
  extension [Self <: GetReplicationSetOutput](x: Self) {
    
    inline def setReplicationSet(value: ReplicationSet): Self = StObject.set(x, "replicationSet", value.asInstanceOf[js.Any])
  }
}
