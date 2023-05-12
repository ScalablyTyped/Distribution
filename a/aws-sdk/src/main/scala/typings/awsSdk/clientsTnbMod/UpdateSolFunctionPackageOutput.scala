package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSolFunctionPackageOutput extends StObject {
  
  /**
    * Operational state of the function package.
    */
  var operationalState: OperationalState
}
object UpdateSolFunctionPackageOutput {
  
  inline def apply(operationalState: OperationalState): UpdateSolFunctionPackageOutput = {
    val __obj = js.Dynamic.literal(operationalState = operationalState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSolFunctionPackageOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSolFunctionPackageOutput] (val x: Self) extends AnyVal {
    
    inline def setOperationalState(value: OperationalState): Self = StObject.set(x, "operationalState", value.asInstanceOf[js.Any])
  }
}
