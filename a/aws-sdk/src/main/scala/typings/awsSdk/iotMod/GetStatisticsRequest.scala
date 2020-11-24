package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStatisticsRequest extends js.Object {
  
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
  implicit class GetStatisticsRequestOps[Self <: GetStatisticsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQueryString(value: QueryString): Self = this.set("queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationField(value: AggregationField): Self = this.set("aggregationField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationField: Self = this.set("aggregationField", js.undefined)
    
    @scala.inline
    def setIndexName(value: IndexName): Self = this.set("indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexName: Self = this.set("indexName", js.undefined)
    
    @scala.inline
    def setQueryVersion(value: QueryVersion): Self = this.set("queryVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryVersion: Self = this.set("queryVersion", js.undefined)
  }
}
