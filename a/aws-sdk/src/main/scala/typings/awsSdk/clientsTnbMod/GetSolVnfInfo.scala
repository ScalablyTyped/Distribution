package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolVnfInfo extends StObject {
  
  /**
    * State of the network function instance.
    */
  var vnfState: js.UndefOr[VnfOperationalState] = js.undefined
  
  /**
    * Compute info used by the network function instance.
    */
  var vnfcResourceInfo: js.UndefOr[GetSolVnfcResourceInfoList] = js.undefined
}
object GetSolVnfInfo {
  
  inline def apply(): GetSolVnfInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSolVnfInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolVnfInfo] (val x: Self) extends AnyVal {
    
    inline def setVnfState(value: VnfOperationalState): Self = StObject.set(x, "vnfState", value.asInstanceOf[js.Any])
    
    inline def setVnfStateUndefined: Self = StObject.set(x, "vnfState", js.undefined)
    
    inline def setVnfcResourceInfo(value: GetSolVnfcResourceInfoList): Self = StObject.set(x, "vnfcResourceInfo", value.asInstanceOf[js.Any])
    
    inline def setVnfcResourceInfoUndefined: Self = StObject.set(x, "vnfcResourceInfo", js.undefined)
    
    inline def setVnfcResourceInfoVarargs(value: GetSolVnfcResourceInfo*): Self = StObject.set(x, "vnfcResourceInfo", js.Array(value*))
  }
}
