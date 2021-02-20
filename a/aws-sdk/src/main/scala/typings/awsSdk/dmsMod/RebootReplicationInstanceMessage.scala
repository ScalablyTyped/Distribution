package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RebootReplicationInstanceMessage extends StObject {
  
  /**
    * If this parameter is true, the reboot is conducted through a Multi-AZ failover. (If the instance isn't configured for Multi-AZ, then you can't specify true.)
    */
  var ForceFailover: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: String = js.native
}
object RebootReplicationInstanceMessage {
  
  @scala.inline
  def apply(ReplicationInstanceArn: String): RebootReplicationInstanceMessage = {
    val __obj = js.Dynamic.literal(ReplicationInstanceArn = ReplicationInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootReplicationInstanceMessage]
  }
  
  @scala.inline
  implicit class RebootReplicationInstanceMessageMutableBuilder[Self <: RebootReplicationInstanceMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceFailover(value: BooleanOptional): Self = StObject.set(x, "ForceFailover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceFailoverUndefined: Self = StObject.set(x, "ForceFailover", js.undefined)
    
    @scala.inline
    def setReplicationInstanceArn(value: String): Self = StObject.set(x, "ReplicationInstanceArn", value.asInstanceOf[js.Any])
  }
}
