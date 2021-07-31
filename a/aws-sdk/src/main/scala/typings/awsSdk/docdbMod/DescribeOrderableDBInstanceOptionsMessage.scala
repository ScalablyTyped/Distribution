package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrderableDBInstanceOptionsMessage extends StObject {
  
  /**
    * The instance class filter value. Specify this parameter to show only the available offerings that match the specified instance class.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the engine to retrieve instance options for.
    */
  var Engine: String
  
  /**
    * The engine version filter value. Specify this parameter to show only the available offerings that match the specified engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The license model filter value. Specify this parameter to show only the available offerings that match the specified license model.
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token (marker) is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The virtual private cloud (VPC) filter value. Specify this parameter to show only the available VPC or non-VPC offerings.
    */
  var Vpc: js.UndefOr[BooleanOptional] = js.undefined
}
object DescribeOrderableDBInstanceOptionsMessage {
  
  @scala.inline
  def apply(Engine: String): DescribeOrderableDBInstanceOptionsMessage = {
    val __obj = js.Dynamic.literal(Engine = Engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrderableDBInstanceOptionsMessage]
  }
  
  @scala.inline
  implicit class DescribeOrderableDBInstanceOptionsMessageMutableBuilder[Self <: DescribeOrderableDBInstanceOptionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setLicenseModel(value: String): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setVpc(value: BooleanOptional): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
