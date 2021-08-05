package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrderableDBInstanceOptionsMessage extends StObject {
  
  /**
    * The Availability Zone group associated with a Local Zone. Specify this parameter to retrieve available offerings for the Local Zones in the group. Omit this parameter to show the available offerings in the specified AWS Region.
    */
  var AvailabilityZoneGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The DB instance class filter value. Specify this parameter to show only the available offerings matching the specified DB instance class.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the engine to retrieve DB instance options for.
    */
  var Engine: String
  
  /**
    * The engine version filter value. Specify this parameter to show only the available offerings matching the specified engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * This parameter isn't currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The license model filter value. Specify this parameter to show only the available offerings matching the specified license model.
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  
  /**
    *  An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that you can retrieve the remaining results.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A value that indicates whether to show only VPC or non-VPC offerings.
    */
  var Vpc: js.UndefOr[BooleanOptional] = js.undefined
}
object DescribeOrderableDBInstanceOptionsMessage {
  
  inline def apply(Engine: String): DescribeOrderableDBInstanceOptionsMessage = {
    val __obj = js.Dynamic.literal(Engine = Engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrderableDBInstanceOptionsMessage]
  }
  
  extension [Self <: DescribeOrderableDBInstanceOptionsMessage](x: Self) {
    
    inline def setAvailabilityZoneGroup(value: String): Self = StObject.set(x, "AvailabilityZoneGroup", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneGroupUndefined: Self = StObject.set(x, "AvailabilityZoneGroup", js.undefined)
    
    inline def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    inline def setLicenseModel(value: String): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    inline def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setVpc(value: BooleanOptional): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
