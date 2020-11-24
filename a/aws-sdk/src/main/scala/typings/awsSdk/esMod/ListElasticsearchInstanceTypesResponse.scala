package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListElasticsearchInstanceTypesResponse extends js.Object {
  
  /**
    *  List of instance types supported by Amazon Elasticsearch service for given  ElasticsearchVersion  
    */
  var ElasticsearchInstanceTypes: js.UndefOr[ElasticsearchInstanceTypeList] = js.native
  
  /**
    * In case if there are more results available NextToken would be present, make further request to the same API with received NextToken to paginate remaining results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.native
}
object ListElasticsearchInstanceTypesResponse {
  
  @scala.inline
  def apply(): ListElasticsearchInstanceTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListElasticsearchInstanceTypesResponse]
  }
  
  @scala.inline
  implicit class ListElasticsearchInstanceTypesResponseOps[Self <: ListElasticsearchInstanceTypesResponse] (val x: Self) extends AnyVal {
    
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
    def setElasticsearchInstanceTypesVarargs(value: ESPartitionInstanceType*): Self = this.set("ElasticsearchInstanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setElasticsearchInstanceTypes(value: ElasticsearchInstanceTypeList): Self = this.set("ElasticsearchInstanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticsearchInstanceTypes: Self = this.set("ElasticsearchInstanceTypes", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
