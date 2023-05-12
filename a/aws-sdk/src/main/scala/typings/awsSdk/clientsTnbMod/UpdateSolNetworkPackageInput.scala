package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSolNetworkPackageInput extends StObject {
  
  /**
    * ID of the network service descriptor in the network package.
    */
  var nsdInfoId: NsdInfoId
  
  /**
    * Operational state of the network service descriptor in the network package.
    */
  var nsdOperationalState: NsdOperationalState
}
object UpdateSolNetworkPackageInput {
  
  inline def apply(nsdInfoId: NsdInfoId, nsdOperationalState: NsdOperationalState): UpdateSolNetworkPackageInput = {
    val __obj = js.Dynamic.literal(nsdInfoId = nsdInfoId.asInstanceOf[js.Any], nsdOperationalState = nsdOperationalState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSolNetworkPackageInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSolNetworkPackageInput] (val x: Self) extends AnyVal {
    
    inline def setNsdInfoId(value: NsdInfoId): Self = StObject.set(x, "nsdInfoId", value.asInstanceOf[js.Any])
    
    inline def setNsdOperationalState(value: NsdOperationalState): Self = StObject.set(x, "nsdOperationalState", value.asInstanceOf[js.Any])
  }
}
