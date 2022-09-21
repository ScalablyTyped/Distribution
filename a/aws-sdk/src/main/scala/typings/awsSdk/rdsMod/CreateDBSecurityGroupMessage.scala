package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBSecurityGroupMessage extends StObject {
  
  /**
    * The description for the DB security group.
    */
  var DBSecurityGroupDescription: String
  
  /**
    * The name for the DB security group. This value is stored as a lowercase string. Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Must not be "Default"   Example: mysecuritygroup 
    */
  var DBSecurityGroupName: String
  
  /**
    * Tags to assign to the DB security group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDBSecurityGroupMessage {
  
  inline def apply(DBSecurityGroupDescription: String, DBSecurityGroupName: String): CreateDBSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(DBSecurityGroupDescription = DBSecurityGroupDescription.asInstanceOf[js.Any], DBSecurityGroupName = DBSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBSecurityGroupMessage]
  }
  
  extension [Self <: CreateDBSecurityGroupMessage](x: Self) {
    
    inline def setDBSecurityGroupDescription(value: String): Self = StObject.set(x, "DBSecurityGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setDBSecurityGroupName(value: String): Self = StObject.set(x, "DBSecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
