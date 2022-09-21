package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEngineDefaultParametersMessage extends StObject {
  
  /**
    * The name of the DB parameter group family. Valid Values:    aurora5.6     aurora-mysql5.7     aurora-mysql8.0     aurora-postgresql10     aurora-postgresql11     aurora-postgresql12     aurora-postgresql13     mariadb10.2     mariadb10.3     mariadb10.4     mariadb10.5     mariadb10.6     mysql5.7     mysql8.0     postgres10     postgres11     postgres12     postgres13     postgres14     sqlserver-ee-11.0     sqlserver-ee-12.0     sqlserver-ee-13.0     sqlserver-ee-14.0     sqlserver-ee-15.0     sqlserver-ex-11.0     sqlserver-ex-12.0     sqlserver-ex-13.0     sqlserver-ex-14.0     sqlserver-ex-15.0     sqlserver-se-11.0     sqlserver-se-12.0     sqlserver-se-13.0     sqlserver-se-14.0     sqlserver-se-15.0     sqlserver-web-11.0     sqlserver-web-12.0     sqlserver-web-13.0     sqlserver-web-14.0     sqlserver-web-15.0   
    */
  var DBParameterGroupFamily: String
  
  /**
    * This parameter isn't currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous DescribeEngineDefaultParameters request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so you can retrieve the remaining results. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}
object DescribeEngineDefaultParametersMessage {
  
  inline def apply(DBParameterGroupFamily: String): DescribeEngineDefaultParametersMessage = {
    val __obj = js.Dynamic.literal(DBParameterGroupFamily = DBParameterGroupFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEngineDefaultParametersMessage]
  }
  
  extension [Self <: DescribeEngineDefaultParametersMessage](x: Self) {
    
    inline def setDBParameterGroupFamily(value: String): Self = StObject.set(x, "DBParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
