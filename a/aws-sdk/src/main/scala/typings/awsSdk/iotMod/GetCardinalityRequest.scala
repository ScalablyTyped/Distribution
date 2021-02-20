package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCardinalityRequest extends StObject {
  
  /**
    * The field to aggregate.
    */
  var aggregationField: js.UndefOr[AggregationField] = js.native
  
  /**
    * The name of the index to search.
    */
  var indexName: js.UndefOr[IndexName] = js.native
  
  /**
    * The search query.
    */
  var queryString: QueryString = js.native
  
  /**
    * The query version.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
}
object GetCardinalityRequest {
  
  @scala.inline
  def apply(queryString: QueryString): GetCardinalityRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCardinalityRequest]
  }
  
  @scala.inline
  implicit class GetCardinalityRequestMutableBuilder[Self <: GetCardinalityRequest] (val x: Self) extends AnyVal {
    
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
