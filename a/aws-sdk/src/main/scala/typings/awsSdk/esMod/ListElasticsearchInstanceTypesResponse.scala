package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListElasticsearchInstanceTypesResponse extends StObject {
  
  /**
    *  List of instance types supported by Amazon Elasticsearch service for given  ElasticsearchVersion  
    */
  var ElasticsearchInstanceTypes: js.UndefOr[ElasticsearchInstanceTypeList] = js.undefined
  
  /**
    * In case if there are more results available NextToken would be present, make further request to the same API with received NextToken to paginate remaining results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.undefined
}
object ListElasticsearchInstanceTypesResponse {
  
  inline def apply(): ListElasticsearchInstanceTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListElasticsearchInstanceTypesResponse]
  }
  
  extension [Self <: ListElasticsearchInstanceTypesResponse](x: Self) {
    
    inline def setElasticsearchInstanceTypes(value: ElasticsearchInstanceTypeList): Self = StObject.set(x, "ElasticsearchInstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchInstanceTypesUndefined: Self = StObject.set(x, "ElasticsearchInstanceTypes", js.undefined)
    
    inline def setElasticsearchInstanceTypesVarargs(value: ESPartitionInstanceType*): Self = StObject.set(x, "ElasticsearchInstanceTypes", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
