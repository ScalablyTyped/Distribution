package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReplicationSubnetGroupMessage extends StObject {
  
  /**
    * The description for the subnet group.
    */
  var ReplicationSubnetGroupDescription: String = js.native
  
  /**
    * The name for the replication subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters, periods, spaces, underscores, or hyphens. Must not be "default". Example: mySubnetgroup 
    */
  var ReplicationSubnetGroupIdentifier: String = js.native
  
  /**
    * One or more subnet IDs to be assigned to the subnet group.
    */
  var SubnetIds: SubnetIdentifierList = js.native
  
  /**
    * One or more tags to be assigned to the subnet group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateReplicationSubnetGroupMessage {
  
  @scala.inline
  def apply(
    ReplicationSubnetGroupDescription: String,
    ReplicationSubnetGroupIdentifier: String,
    SubnetIds: SubnetIdentifierList
  ): CreateReplicationSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationSubnetGroupDescription = ReplicationSubnetGroupDescription.asInstanceOf[js.Any], ReplicationSubnetGroupIdentifier = ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationSubnetGroupMessage]
  }
  
  @scala.inline
  implicit class CreateReplicationSubnetGroupMessageMutableBuilder[Self <: CreateReplicationSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationSubnetGroupDescription(value: String): Self = StObject.set(x, "ReplicationSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationSubnetGroupIdentifier(value: String): Self = StObject.set(x, "ReplicationSubnetGroupIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIds(value: SubnetIdentifierList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
