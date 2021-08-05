package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServiceUpdatesMessage extends StObject {
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the service update
    */
  var ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatusList] = js.undefined
}
object DescribeServiceUpdatesMessage {
  
  inline def apply(): DescribeServiceUpdatesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServiceUpdatesMessage]
  }
  
  extension [Self <: DescribeServiceUpdatesMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setServiceUpdateName(value: String): Self = StObject.set(x, "ServiceUpdateName", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateNameUndefined: Self = StObject.set(x, "ServiceUpdateName", js.undefined)
    
    inline def setServiceUpdateStatus(value: ServiceUpdateStatusList): Self = StObject.set(x, "ServiceUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateStatusUndefined: Self = StObject.set(x, "ServiceUpdateStatus", js.undefined)
    
    inline def setServiceUpdateStatusVarargs(value: ServiceUpdateStatus*): Self = StObject.set(x, "ServiceUpdateStatus", js.Array(value :_*))
  }
}
