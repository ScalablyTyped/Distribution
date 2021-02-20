package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDBSubnetGroupMessage extends StObject {
  
  /**
    * The name of the database subnet group to delete.  You can't delete the default subnet group.  Constraints: Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: String = js.native
}
object DeleteDBSubnetGroupMessage {
  
  @scala.inline
  def apply(DBSubnetGroupName: String): DeleteDBSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(DBSubnetGroupName = DBSubnetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBSubnetGroupMessage]
  }
  
  @scala.inline
  implicit class DeleteDBSubnetGroupMessageMutableBuilder[Self <: DeleteDBSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
  }
}
