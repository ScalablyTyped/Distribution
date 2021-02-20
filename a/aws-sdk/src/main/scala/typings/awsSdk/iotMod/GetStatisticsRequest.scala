package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStatisticsRequest extends StObject {
  
  /**
    * The aggregation field name.
    */
  var aggregationField: js.UndefOr[AggregationField] = js.native
  
  /**
    * The name of the index to search. The default value is AWS_Things.
    */
  var indexName: js.UndefOr[IndexName] = js.native
  
  /**
    * The query used to search. You can specify "*" for the query string to get the count of all indexed things in your AWS account.
    */
  var queryString: QueryString = js.native
  
  /**
    * The version of the query used to search.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
}
object GetStatisticsRequest {
  
  @scala.inline
  def apply(queryString: QueryString): GetStatisticsRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStatisticsRequest]
  }
  
  @scala.inline
  implicit class GetStatisticsRequestMutableBuilder[Self <: GetStatisticsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregationField(value: AggregationField): Self = StObject.set(x, "aggregationField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationFieldUndefined: Self = StObject.set(x, "aggregationField", js.undefined)
    
    @scala.inline
    def setIndexName(value: IndexName): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNameUndefined: Self = StObject.set(x, "indexName", js.undefined)
    
    @scala.inline
    def setQueryString(value: QueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryVersion(value: QueryVersion): Self = StObject.set(x, "queryVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryVersionUndefined: Self = StObject.set(x, "queryVersion", js.undefined)
  }
}
