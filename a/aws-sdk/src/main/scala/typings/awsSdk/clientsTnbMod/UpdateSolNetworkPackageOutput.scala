package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSolNetworkPackageOutput extends StObject {
  
  /**
    * Operational state of the network service descriptor in the network package.
    */
  var nsdOperationalState: NsdOperationalState
}
object UpdateSolNetworkPackageOutput {
  
  inline def apply(nsdOperationalState: NsdOperationalState): UpdateSolNetworkPackageOutput = {
    val __obj = js.Dynamic.literal(nsdOperationalState = nsdOperationalState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSolNetworkPackageOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSolNetworkPackageOutput] (val x: Self) extends AnyVal {
    
    inline def setNsdOperationalState(value: NsdOperationalState): Self = StObject.set(x, "nsdOperationalState", value.asInstanceOf[js.Any])
  }
}
