package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOptionGroupsMessage extends StObject {
  
  /**
    * Filters the list of option groups to only include groups associated with a specific database engine.
    */
  var EngineName: js.UndefOr[String] = js.undefined
  
  /**
    * This parameter isn't currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * Filters the list of option groups to only include groups associated with a specific database engine version. If specified, then EngineName must also be specified.
    */
  var MajorEngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    *  An optional pagination token provided by a previous DescribeOptionGroups request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that you can retrieve the remaining results.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The name of the option group to describe. Can't be supplied together with EngineName or MajorEngineVersion.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
}
object DescribeOptionGroupsMessage {
  
  @scala.inline
  def apply(): DescribeOptionGroupsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOptionGroupsMessage]
  }
  
  @scala.inline
  implicit class DescribeOptionGroupsMessageMutableBuilder[Self <: DescribeOptionGroupsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngineName(value: String): Self = StObject.set(x, "EngineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineNameUndefined: Self = StObject.set(x, "EngineName", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMajorEngineVersion(value: String): Self = StObject.set(x, "MajorEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorEngineVersionUndefined: Self = StObject.set(x, "MajorEngineVersion", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
  }
}
