package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDBSubnetGroupMessage extends js.Object {
  
  /**
    * The description for the DB subnet group.
    */
  var DBSubnetGroupDescription: String = js.native
  
  /**
    * The name for the DB subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 letters, numbers, periods, underscores, spaces, or hyphens. Must not be default. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: String = js.native
  
  /**
    * The EC2 Subnet IDs for the DB subnet group.
    */
  var SubnetIds: SubnetIdentifierList = js.native
  
  /**
    * The tags to be assigned to the new DB subnet group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateDBSubnetGroupMessage {
  
  @scala.inline
  def apply(DBSubnetGroupDescription: String, DBSubnetGroupName: String, SubnetIds: SubnetIdentifierList): CreateDBSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(DBSubnetGroupDescription = DBSubnetGroupDescription.asInstanceOf[js.Any], DBSubnetGroupName = DBSubnetGroupName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBSubnetGroupMessage]
  }
  
  @scala.inline
  implicit class CreateDBSubnetGroupMessageOps[Self <: CreateDBSubnetGroupMessage] (val x: Self) extends AnyVal {
    
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
    def setDBSubnetGroupDescription(value: String): Self = this.set("DBSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSubnetGroupName(value: String): Self = this.set("DBSubnetGroupName", value.asInstanceOf[js.Any])
    
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
