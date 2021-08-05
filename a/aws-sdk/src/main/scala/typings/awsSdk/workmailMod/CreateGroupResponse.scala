package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGroupResponse extends StObject {
  
  /**
    * The identifier of the group.
    */
  var GroupId: js.UndefOr[WorkMailIdentifier] = js.undefined
}
object CreateGroupResponse {
  
  inline def apply(): CreateGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGroupResponse]
  }
  
  extension [Self <: CreateGroupResponse](x: Self) {
    
    inline def setGroupId(value: WorkMailIdentifier): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
  }
}
