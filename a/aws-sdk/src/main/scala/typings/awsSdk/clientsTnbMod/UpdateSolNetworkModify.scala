package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSolNetworkModify extends StObject {
  
  /**
    * Provides values for the configurable properties declared in the function package descriptor.
    */
  var vnfConfigurableProperties: Document
  
  /**
    * ID of the network function instance. A network function instance is a function in a function package .
    */
  var vnfInstanceId: VnfInstanceId
}
object UpdateSolNetworkModify {
  
  inline def apply(vnfConfigurableProperties: Document, vnfInstanceId: VnfInstanceId): UpdateSolNetworkModify = {
    val __obj = js.Dynamic.literal(vnfConfigurableProperties = vnfConfigurableProperties.asInstanceOf[js.Any], vnfInstanceId = vnfInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSolNetworkModify]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSolNetworkModify] (val x: Self) extends AnyVal {
    
    inline def setVnfConfigurableProperties(value: Document): Self = StObject.set(x, "vnfConfigurableProperties", value.asInstanceOf[js.Any])
    
    inline def setVnfInstanceId(value: VnfInstanceId): Self = StObject.set(x, "vnfInstanceId", value.asInstanceOf[js.Any])
  }
}
