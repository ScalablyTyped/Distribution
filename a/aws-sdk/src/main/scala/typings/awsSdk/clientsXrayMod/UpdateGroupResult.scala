package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGroupResult extends StObject {
  
  /**
    * The group that was updated. Contains the name of the group that was updated, the ARN of the group that was updated, the updated filter expression, and the updated insight configuration assigned to the group.
    */
  var Group: js.UndefOr[typings.awsSdk.clientsXrayMod.Group] = js.undefined
}
object UpdateGroupResult {
  
  inline def apply(): UpdateGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupResult]
  }
  
  extension [Self <: UpdateGroupResult](x: Self) {
    
    inline def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
