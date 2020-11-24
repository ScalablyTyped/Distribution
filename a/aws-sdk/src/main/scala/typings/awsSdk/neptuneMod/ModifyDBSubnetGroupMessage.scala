package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyDBSubnetGroupMessage extends js.Object {
  
  /**
    * The description for the DB subnet group.
    */
  var DBSubnetGroupDescription: js.UndefOr[String] = js.native
  
  /**
    * The name for the DB subnet group. This value is stored as a lowercase string. You can't modify the default subnet group. Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
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
  implicit class ModifyDBSubnetGroupMessageOps[Self <: ModifyDBSubnetGroupMessage] (val x: Self) extends AnyVal {
    
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
    def setDBSubnetGroupName(value: String): Self = this.set("DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIdentifierList): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSubnetGroupDescription(value: String): Self = this.set("DBSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBSubnetGroupDescription: Self = this.set("DBSubnetGroupDescription", js.undefined)
  }
}
