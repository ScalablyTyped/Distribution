package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListElasticsearchInstanceTypesResponse extends StObject {
  
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
  implicit class ListElasticsearchInstanceTypesResponseMutableBuilder[Self <: ListElasticsearchInstanceTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElasticsearchInstanceTypes(value: ElasticsearchInstanceTypeList): Self = StObject.set(x, "ElasticsearchInstanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticsearchInstanceTypesUndefined: Self = StObject.set(x, "ElasticsearchInstanceTypes", js.undefined)
    
    @scala.inline
    def setElasticsearchInstanceTypesVarargs(value: ESPartitionInstanceType*): Self = StObject.set(x, "ElasticsearchInstanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
