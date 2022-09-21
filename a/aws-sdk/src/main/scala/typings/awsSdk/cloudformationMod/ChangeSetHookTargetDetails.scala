package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeSetHookTargetDetails extends StObject {
  
  /**
    * Required if TargetType is RESOURCE.
    */
  var ResourceTargetDetails: js.UndefOr[ChangeSetHookResourceTargetDetails] = js.undefined
  
  /**
    * The name of the type.
    */
  var TargetType: js.UndefOr[HookTargetType] = js.undefined
}
object ChangeSetHookTargetDetails {
  
  inline def apply(): ChangeSetHookTargetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeSetHookTargetDetails]
  }
  
  extension [Self <: ChangeSetHookTargetDetails](x: Self) {
    
    inline def setResourceTargetDetails(value: ChangeSetHookResourceTargetDetails): Self = StObject.set(x, "ResourceTargetDetails", value.asInstanceOf[js.Any])
    
    inline def setResourceTargetDetailsUndefined: Self = StObject.set(x, "ResourceTargetDetails", js.undefined)
    
    inline def setTargetType(value: HookTargetType): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "TargetType", js.undefined)
  }
}
