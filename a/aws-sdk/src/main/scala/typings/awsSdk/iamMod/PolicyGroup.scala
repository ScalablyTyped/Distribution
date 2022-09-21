package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyGroup extends StObject {
  
  /**
    * The stable and unique string identifying the group. For more information about IDs, see IAM identifiers in the IAM User Guide.
    */
  var GroupId: js.UndefOr[idType] = js.undefined
  
  /**
    * The name (friendly name, not ARN) identifying the group.
    */
  var GroupName: js.UndefOr[groupNameType] = js.undefined
}
object PolicyGroup {
  
  inline def apply(): PolicyGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyGroup]
  }
  
  extension [Self <: PolicyGroup](x: Self) {
    
    inline def setGroupId(value: idType): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setGroupName(value: groupNameType): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
