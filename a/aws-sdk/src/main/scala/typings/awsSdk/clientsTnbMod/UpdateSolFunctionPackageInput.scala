package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSolFunctionPackageInput extends StObject {
  
  /**
    * Operational state of the function package.
    */
  var operationalState: OperationalState
  
  /**
    * ID of the function package.
    */
  var vnfPkgId: VnfPkgId
}
object UpdateSolFunctionPackageInput {
  
  inline def apply(operationalState: OperationalState, vnfPkgId: VnfPkgId): UpdateSolFunctionPackageInput = {
    val __obj = js.Dynamic.literal(operationalState = operationalState.asInstanceOf[js.Any], vnfPkgId = vnfPkgId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSolFunctionPackageInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSolFunctionPackageInput] (val x: Self) extends AnyVal {
    
    inline def setOperationalState(value: OperationalState): Self = StObject.set(x, "operationalState", value.asInstanceOf[js.Any])
    
    inline def setVnfPkgId(value: VnfPkgId): Self = StObject.set(x, "vnfPkgId", value.asInstanceOf[js.Any])
  }
}
