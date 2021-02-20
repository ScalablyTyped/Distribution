package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyDBSubnetGroupMessage extends StObject {
  
  /**
    * The description for the DB subnet group.
    */
  var DBSubnetGroupDescription: js.UndefOr[String] = js.native
  
  /**
    * The name for the DB subnet group. This value is stored as a lowercase string. You can't modify the default subnet group.  Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: String = js.native
  
  /**
    * The EC2 subnet IDs for the DB subnet group.
    */
  var SubnetIds: SubnetIdentifierList = js.native
}
object ModifyDBSubnetGroupMessage {
  
  @scala.inline
  def apply(DBSubnetGroupName: String, SubnetIds: SubnetIdentifierList): ModifyDBSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(DBSubnetGroupName = DBSubnetGroupName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBSubnetGroupMessage]
  }
  
  @scala.inline
  implicit class ModifyDBSubnetGroupMessageMutableBuilder[Self <: ModifyDBSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSubnetGroupDescription(value: String): Self = StObject.set(x, "DBSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSubnetGroupDescriptionUndefined: Self = StObject.set(x, "DBSubnetGroupDescription", js.undefined)
    
    @scala.inline
    def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIds(value: SubnetIdentifierList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
  }
}
