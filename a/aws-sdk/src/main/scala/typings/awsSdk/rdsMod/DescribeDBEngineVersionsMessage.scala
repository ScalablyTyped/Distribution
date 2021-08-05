package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBEngineVersionsMessage extends StObject {
  
  /**
    * The name of a specific DB parameter group family to return details for. Constraints:   If supplied, must match an existing DBParameterGroupFamily.  
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether only the default version of the specified engine or engine and major version combination is returned.
    */
  var DefaultOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The database engine to return.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The database engine version to return. Example: 5.1.49 
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * This parameter isn't currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * A value that indicates whether to include engine versions that aren't available in the list. The default is to list only available engine versions.
    */
  var IncludeAll: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that indicates whether to list the supported character sets for each engine version. If this parameter is enabled and the requested engine supports the CharacterSetName parameter for CreateDBInstance, the response includes a list of supported character sets for each engine version. 
    */
  var ListSupportedCharacterSets: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that indicates whether to list the supported time zones for each engine version. If this parameter is enabled and the requested engine supports the TimeZone parameter for CreateDBInstance, the response includes a list of supported time zones for each engine version. 
    */
  var ListSupportedTimezones: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    *  The maximum number of records to include in the response. If more than the MaxRecords value is available, a pagination token called a marker is included in the response so you can retrieve the remaining results.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}
object DescribeDBEngineVersionsMessage {
  
  inline def apply(): DescribeDBEngineVersionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBEngineVersionsMessage]
  }
  
  extension [Self <: DescribeDBEngineVersionsMessage](x: Self) {
    
    inline def setDBParameterGroupFamily(value: String): Self = StObject.set(x, "DBParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupFamilyUndefined: Self = StObject.set(x, "DBParameterGroupFamily", js.undefined)
    
    inline def setDefaultOnly(value: Boolean): Self = StObject.set(x, "DefaultOnly", value.asInstanceOf[js.Any])
    
    inline def setDefaultOnlyUndefined: Self = StObject.set(x, "DefaultOnly", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    inline def setIncludeAll(value: BooleanOptional): Self = StObject.set(x, "IncludeAll", value.asInstanceOf[js.Any])
    
    inline def setIncludeAllUndefined: Self = StObject.set(x, "IncludeAll", js.undefined)
    
    inline def setListSupportedCharacterSets(value: BooleanOptional): Self = StObject.set(x, "ListSupportedCharacterSets", value.asInstanceOf[js.Any])
    
    inline def setListSupportedCharacterSetsUndefined: Self = StObject.set(x, "ListSupportedCharacterSets", js.undefined)
    
    inline def setListSupportedTimezones(value: BooleanOptional): Self = StObject.set(x, "ListSupportedTimezones", value.asInstanceOf[js.Any])
    
    inline def setListSupportedTimezonesUndefined: Self = StObject.set(x, "ListSupportedTimezones", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
