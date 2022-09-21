package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedNodeExchangeStatusOutputMessage extends StObject {
  
  /**
    * A pagination token provided by a previous DescribeReservedNodeExchangeStatus request.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The details of the reserved-node exchange request, including the status, request time, source reserved-node identifier, and additional details.
    */
  var ReservedNodeExchangeStatusDetails: js.UndefOr[ReservedNodeExchangeStatusList] = js.undefined
}
object DescribeReservedNodeExchangeStatusOutputMessage {
  
  inline def apply(): DescribeReservedNodeExchangeStatusOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedNodeExchangeStatusOutputMessage]
  }
  
  extension [Self <: DescribeReservedNodeExchangeStatusOutputMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setReservedNodeExchangeStatusDetails(value: ReservedNodeExchangeStatusList): Self = StObject.set(x, "ReservedNodeExchangeStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setReservedNodeExchangeStatusDetailsUndefined: Self = StObject.set(x, "ReservedNodeExchangeStatusDetails", js.undefined)
    
    inline def setReservedNodeExchangeStatusDetailsVarargs(value: ReservedNodeExchangeStatus*): Self = StObject.set(x, "ReservedNodeExchangeStatusDetails", js.Array(value*))
  }
}
