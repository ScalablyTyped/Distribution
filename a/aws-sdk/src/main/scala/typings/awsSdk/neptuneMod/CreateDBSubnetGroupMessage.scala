package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBSubnetGroupMessage extends StObject {
  
  /**
    * The description for the DB subnet group.
    */
  var DBSubnetGroupDescription: String
  
  /**
    * The name for the DB subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 letters, numbers, periods, underscores, spaces, or hyphens. Must not be default. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: String
  
  /**
    * The EC2 Subnet IDs for the DB subnet group.
    */
  var SubnetIds: SubnetIdentifierList
  
  /**
    * The tags to be assigned to the new DB subnet group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDBSubnetGroupMessage {
  
  @scala.inline
  def apply(DBSubnetGroupDescription: String, DBSubnetGroupName: String, SubnetIds: SubnetIdentifierList): CreateDBSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(DBSubnetGroupDescription = DBSubnetGroupDescription.asInstanceOf[js.Any], DBSubnetGroupName = DBSubnetGroupName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBSubnetGroupMessage]
  }
  
  @scala.inline
  implicit class CreateDBSubnetGroupMessageMutableBuilder[Self <: CreateDBSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSubnetGroupDescription(value: String): Self = StObject.set(x, "DBSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
    
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
