package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyReplicationSubnetGroupMessage extends StObject {
  
  /**
    * A description for the replication instance subnet group.
    */
  var ReplicationSubnetGroupDescription: js.UndefOr[String] = js.native
  
  /**
    * The name of the replication instance subnet group.
    */
  var ReplicationSubnetGroupIdentifier: String = js.native
  
  /**
    * A list of subnet IDs.
    */
  var SubnetIds: SubnetIdentifierList = js.native
}
object ModifyReplicationSubnetGroupMessage {
  
  @scala.inline
  def apply(ReplicationSubnetGroupIdentifier: String, SubnetIds: SubnetIdentifierList): ModifyReplicationSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationSubnetGroupIdentifier = ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationSubnetGroupMessage]
  }
  
  @scala.inline
  implicit class ModifyReplicationSubnetGroupMessageMutableBuilder[Self <: ModifyReplicationSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationSubnetGroupDescription(value: String): Self = StObject.set(x, "ReplicationSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationSubnetGroupDescriptionUndefined: Self = StObject.set(x, "ReplicationSubnetGroupDescription", js.undefined)
    
    @scala.inline
    def setReplicationSubnetGroupIdentifier(value: String): Self = StObject.set(x, "ReplicationSubnetGroupIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIds(value: SubnetIdentifierList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
  }
}
