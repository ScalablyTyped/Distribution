package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReplicationSubnetGroupMessage extends js.Object {
  
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
  implicit class CreateReplicationSubnetGroupMessageOps[Self <: CreateReplicationSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReplicationSubnetGroupDescription(value: String): Self = this.set("ReplicationSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationSubnetGroupIdentifier(value: String): Self = this.set("ReplicationSubnetGroupIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIdentifierList): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
