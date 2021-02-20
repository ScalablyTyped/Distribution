package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyGroup extends StObject {
  
  /**
    * The stable and unique string identifying the group. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var GroupId: js.UndefOr[idType] = js.native
  
  /**
    * The name (friendly name, not ARN) identifying the group.
    */
  var GroupName: js.UndefOr[groupNameType] = js.native
}
object PolicyGroup {
  
  @scala.inline
  def apply(): PolicyGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyGroup]
  }
  
  @scala.inline
  implicit class PolicyGroupMutableBuilder[Self <: PolicyGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: idType): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: groupNameType): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
