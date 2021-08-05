package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootReplicationInstanceMessage extends StObject {
  
  /**
    * If this parameter is true, the reboot is conducted through a Multi-AZ failover. (If the instance isn't configured for Multi-AZ, then you can't specify true.)
    */
  var ForceFailover: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: String
}
object RebootReplicationInstanceMessage {
  
  inline def apply(ReplicationInstanceArn: String): RebootReplicationInstanceMessage = {
    val __obj = js.Dynamic.literal(ReplicationInstanceArn = ReplicationInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootReplicationInstanceMessage]
  }
  
  extension [Self <: RebootReplicationInstanceMessage](x: Self) {
    
    inline def setForceFailover(value: BooleanOptional): Self = StObject.set(x, "ForceFailover", value.asInstanceOf[js.Any])
    
    inline def setForceFailoverUndefined: Self = StObject.set(x, "ForceFailover", js.undefined)
    
    inline def setReplicationInstanceArn(value: String): Self = StObject.set(x, "ReplicationInstanceArn", value.asInstanceOf[js.Any])
  }
}
