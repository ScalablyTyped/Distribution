package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBClusterBacktracksMessage extends StObject {
  
  /**
    * If specified, this value is the backtrack identifier of the backtrack to be described. Constraints:   Must contain a valid universally unique identifier (UUID). For more information about UUIDs, see A Universally Unique Identifier (UUID) URN Namespace.   Example: 123e4567-e89b-12d3-a456-426655440000 
    */
  var BacktrackIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The DB cluster identifier of the DB cluster to be described. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: my-cluster1 
    */
  var DBClusterIdentifier: String
  
  /**
    * A filter that specifies one or more DB clusters to describe. Supported filters include the following:    db-cluster-backtrack-id - Accepts backtrack identifiers. The results list includes information about only the backtracks identified by these identifiers.    db-cluster-backtrack-status - Accepts any of the following backtrack status values:    applying     completed     failed     pending    The results list includes information about only the backtracks identified by these values.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    *  An optional pagination token provided by a previous DescribeDBClusterBacktracks request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so you can retrieve the remaining results.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}
object DescribeDBClusterBacktracksMessage {
  
  @scala.inline
  def apply(DBClusterIdentifier: String): DescribeDBClusterBacktracksMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBClusterBacktracksMessage]
  }
  
  @scala.inline
  implicit class DescribeDBClusterBacktracksMessageMutableBuilder[Self <: DescribeDBClusterBacktracksMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBacktrackIdentifier(value: String): Self = StObject.set(x, "BacktrackIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBacktrackIdentifierUndefined: Self = StObject.set(x, "BacktrackIdentifier", js.undefined)
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
