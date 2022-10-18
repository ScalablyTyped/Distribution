package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupResult extends StObject {
  
  /**
    * The group that was requested. Contains the name of the group, the ARN of the group, the filter expression, and the insight configuration assigned to the group.
    */
  var Group: js.UndefOr[typings.awsSdk.clientsXrayMod.Group] = js.undefined
}
object GetGroupResult {
  
  inline def apply(): GetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupResult]
  }
  
  extension [Self <: GetGroupResult](x: Self) {
    
    inline def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
