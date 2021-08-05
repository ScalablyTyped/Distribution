package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBSubnetGroupMessage extends StObject {
  
  /**
    * The name of the database subnet group to delete.  You can't delete the default subnet group.  Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: String
}
object DeleteDBSubnetGroupMessage {
  
  inline def apply(DBSubnetGroupName: String): DeleteDBSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(DBSubnetGroupName = DBSubnetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBSubnetGroupMessage]
  }
  
  extension [Self <: DeleteDBSubnetGroupMessage](x: Self) {
    
    inline def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
  }
}
