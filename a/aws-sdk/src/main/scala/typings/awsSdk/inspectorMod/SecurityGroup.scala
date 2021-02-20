package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityGroup extends StObject {
  
  /**
    * The ID of the security group.
    */
  var groupId: js.UndefOr[Text] = js.native
  
  /**
    * The name of the security group.
    */
  var groupName: js.UndefOr[Text] = js.native
}
object SecurityGroup {
  
  @scala.inline
  def apply(): SecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroup]
  }
  
  @scala.inline
  implicit class SecurityGroupMutableBuilder[Self <: SecurityGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: Text): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: Text): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
  }
}
