package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupRequest extends StObject {
  
  /**
    * The ARN of the group that was generated on creation.
    */
  var GroupARN: js.UndefOr[typings.awsSdk.clientsXrayMod.GroupARN] = js.undefined
  
  /**
    * The case-sensitive name of the group.
    */
  var GroupName: js.UndefOr[typings.awsSdk.clientsXrayMod.GroupName] = js.undefined
}
object GetGroupRequest {
  
  inline def apply(): GetGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupRequest]
  }
  
  extension [Self <: GetGroupRequest](x: Self) {
    
    inline def setGroupARN(value: GroupARN): Self = StObject.set(x, "GroupARN", value.asInstanceOf[js.Any])
    
    inline def setGroupARNUndefined: Self = StObject.set(x, "GroupARN", js.undefined)
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
