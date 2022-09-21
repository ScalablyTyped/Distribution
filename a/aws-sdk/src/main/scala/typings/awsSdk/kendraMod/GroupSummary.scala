package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupSummary extends StObject {
  
  /**
    * The identifier of the group you want group summary information on.
    */
  var GroupId: js.UndefOr[typings.awsSdk.kendraMod.GroupId] = js.undefined
  
  /**
    * The timestamp identifier used for the latest PUT or DELETE action.
    */
  var OrderingId: js.UndefOr[PrincipalOrderingId] = js.undefined
}
object GroupSummary {
  
  inline def apply(): GroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupSummary]
  }
  
  extension [Self <: GroupSummary](x: Self) {
    
    inline def setGroupId(value: GroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setOrderingId(value: PrincipalOrderingId): Self = StObject.set(x, "OrderingId", value.asInstanceOf[js.Any])
    
    inline def setOrderingIdUndefined: Self = StObject.set(x, "OrderingId", js.undefined)
  }
}
