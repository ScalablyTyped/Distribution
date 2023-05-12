package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolFunctionInstanceInput extends StObject {
  
  /**
    * ID of the network function.
    */
  var vnfInstanceId: VnfInstanceId
}
object GetSolFunctionInstanceInput {
  
  inline def apply(vnfInstanceId: VnfInstanceId): GetSolFunctionInstanceInput = {
    val __obj = js.Dynamic.literal(vnfInstanceId = vnfInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolFunctionInstanceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolFunctionInstanceInput] (val x: Self) extends AnyVal {
    
    inline def setVnfInstanceId(value: VnfInstanceId): Self = StObject.set(x, "vnfInstanceId", value.asInstanceOf[js.Any])
  }
}
