package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolInstantiatedVnfInfo extends StObject {
  
  /**
    * State of the network function.
    */
  var vnfState: js.UndefOr[VnfOperationalState] = js.undefined
}
object GetSolInstantiatedVnfInfo {
  
  inline def apply(): GetSolInstantiatedVnfInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSolInstantiatedVnfInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolInstantiatedVnfInfo] (val x: Self) extends AnyVal {
    
    inline def setVnfState(value: VnfOperationalState): Self = StObject.set(x, "vnfState", value.asInstanceOf[js.Any])
    
    inline def setVnfStateUndefined: Self = StObject.set(x, "vnfState", js.undefined)
  }
}
