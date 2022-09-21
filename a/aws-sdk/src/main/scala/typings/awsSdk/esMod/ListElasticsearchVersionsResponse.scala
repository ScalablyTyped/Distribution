package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListElasticsearchVersionsResponse extends StObject {
  
  var ElasticsearchVersions: js.UndefOr[ElasticsearchVersionList] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.undefined
}
object ListElasticsearchVersionsResponse {
  
  inline def apply(): ListElasticsearchVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListElasticsearchVersionsResponse]
  }
  
  extension [Self <: ListElasticsearchVersionsResponse](x: Self) {
    
    inline def setElasticsearchVersions(value: ElasticsearchVersionList): Self = StObject.set(x, "ElasticsearchVersions", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchVersionsUndefined: Self = StObject.set(x, "ElasticsearchVersions", js.undefined)
    
    inline def setElasticsearchVersionsVarargs(value: ElasticsearchVersionString*): Self = StObject.set(x, "ElasticsearchVersions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
