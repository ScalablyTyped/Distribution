package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMitigationActionRequest extends StObject {
  
  /**
    * The friendly name that uniquely identifies the mitigation action.
    */
  var actionName: MitigationActionName
}
object DescribeMitigationActionRequest {
  
  inline def apply(actionName: MitigationActionName): DescribeMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMitigationActionRequest]
  }
  
  extension [Self <: DescribeMitigationActionRequest](x: Self) {
    
    inline def setActionName(value: MitigationActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
  }
}
