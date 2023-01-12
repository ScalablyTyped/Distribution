package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupResponse extends StObject {
  
  /**
    * A structure that contains information about the group.
    */
  var Group: js.UndefOr[typings.awsSdk.clientsSyntheticsMod.Group] = js.undefined
}
object GetGroupResponse {
  
  inline def apply(): GetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
