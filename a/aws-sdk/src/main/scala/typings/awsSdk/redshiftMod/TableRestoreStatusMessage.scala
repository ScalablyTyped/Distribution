package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRestoreStatusMessage extends StObject {
  
  /**
    * A pagination token that can be used in a subsequent DescribeTableRestoreStatus request.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of status details for one or more table restore requests.
    */
  var TableRestoreStatusDetails: js.UndefOr[TableRestoreStatusList] = js.undefined
}
object TableRestoreStatusMessage {
  
  inline def apply(): TableRestoreStatusMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRestoreStatusMessage]
  }
  
  extension [Self <: TableRestoreStatusMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setTableRestoreStatusDetails(value: TableRestoreStatusList): Self = StObject.set(x, "TableRestoreStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setTableRestoreStatusDetailsUndefined: Self = StObject.set(x, "TableRestoreStatusDetails", js.undefined)
    
    inline def setTableRestoreStatusDetailsVarargs(value: TableRestoreStatus*): Self = StObject.set(x, "TableRestoreStatusDetails", js.Array(value :_*))
  }
}
