package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReservedNodeExchangeConfigurationOptionsOutputMessage extends StObject {
  
  /**
    * A pagination token provided by a previous GetReservedNodeExchangeConfigurationOptions request.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * the configuration options for the reserved-node exchange. These options include information about the source reserved node and target reserved node. Details include the node type, the price, the node count, and the offering type.
    */
  var ReservedNodeConfigurationOptionList: js.UndefOr[typings.awsSdk.redshiftMod.ReservedNodeConfigurationOptionList] = js.undefined
}
object GetReservedNodeExchangeConfigurationOptionsOutputMessage {
  
  inline def apply(): GetReservedNodeExchangeConfigurationOptionsOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReservedNodeExchangeConfigurationOptionsOutputMessage]
  }
  
  extension [Self <: GetReservedNodeExchangeConfigurationOptionsOutputMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setReservedNodeConfigurationOptionList(value: ReservedNodeConfigurationOptionList): Self = StObject.set(x, "ReservedNodeConfigurationOptionList", value.asInstanceOf[js.Any])
    
    inline def setReservedNodeConfigurationOptionListUndefined: Self = StObject.set(x, "ReservedNodeConfigurationOptionList", js.undefined)
    
    inline def setReservedNodeConfigurationOptionListVarargs(value: ReservedNodeConfigurationOption*): Self = StObject.set(x, "ReservedNodeConfigurationOptionList", js.Array(value*))
  }
}
