package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAvailableResourceDimensionsRequest extends StObject {
  
  /**
    * An immutable identifier for a data source that is unique within an Amazon Web Services Region. Performance Insights gathers metrics from this data source. To use an Amazon RDS DB instance as a data source, specify its DbiResourceId value. For example, specify db-ABCDEFGHIJKLMNOPQRSTU1VWZ. 
    */
  var Identifier: RequestString
  
  /**
    * The maximum number of items to return in the response. If more items exist than the specified MaxRecords value, a pagination token is included in the response so that the remaining results can be retrieved.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.piMod.MaxResults] = js.undefined
  
  /**
    * The types of metrics for which to retrieve dimensions. Valid values include db.load.
    */
  var Metrics: DimensionsMetricList
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.piMod.NextToken] = js.undefined
  
  /**
    * The Amazon Web Services service for which Performance Insights returns metrics.
    */
  var ServiceType: typings.awsSdk.piMod.ServiceType
}
object ListAvailableResourceDimensionsRequest {
  
  inline def apply(Identifier: RequestString, Metrics: DimensionsMetricList, ServiceType: ServiceType): ListAvailableResourceDimensionsRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], Metrics = Metrics.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAvailableResourceDimensionsRequest]
  }
  
  extension [Self <: ListAvailableResourceDimensionsRequest](x: Self) {
    
    inline def setIdentifier(value: RequestString): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMetrics(value: DimensionsMetricList): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsVarargs(value: RequestString*): Self = StObject.set(x, "Metrics", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceType(value: ServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
  }
}
