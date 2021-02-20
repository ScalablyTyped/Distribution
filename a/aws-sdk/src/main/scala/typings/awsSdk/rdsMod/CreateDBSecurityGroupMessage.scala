package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDBSecurityGroupMessage extends StObject {
  
  /**
    * The description for the DB security group.
    */
  var DBSecurityGroupDescription: String = js.native
  
  /**
    * The name for the DB security group. This value is stored as a lowercase string. Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Must not be "Default"   Example: mysecuritygroup 
    */
  var DBSecurityGroupName: String = js.native
  
  /**
    * Tags to assign to the DB security group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateDBSecurityGroupMessage {
  
  @scala.inline
  def apply(DBSecurityGroupDescription: String, DBSecurityGroupName: String): CreateDBSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(DBSecurityGroupDescription = DBSecurityGroupDescription.asInstanceOf[js.Any], DBSecurityGroupName = DBSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBSecurityGroupMessage]
  }
  
  @scala.inline
  implicit class CreateDBSecurityGroupMessageMutableBuilder[Self <: CreateDBSecurityGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSecurityGroupDescription(value: String): Self = StObject.set(x, "DBSecurityGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSecurityGroupName(value: String): Self = StObject.set(x, "DBSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
