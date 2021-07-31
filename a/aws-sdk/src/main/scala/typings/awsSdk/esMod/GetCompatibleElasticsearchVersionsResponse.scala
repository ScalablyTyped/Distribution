package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCompatibleElasticsearchVersionsResponse extends StObject {
  
  /**
    *  A map of compatible Elasticsearch versions returned as part of the  GetCompatibleElasticsearchVersions  operation. 
    */
  var CompatibleElasticsearchVersions: js.UndefOr[CompatibleElasticsearchVersionsList] = js.undefined
}
object GetCompatibleElasticsearchVersionsResponse {
  
  @scala.inline
  def apply(): GetCompatibleElasticsearchVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompatibleElasticsearchVersionsResponse]
  }
  
  @scala.inline
  implicit class GetCompatibleElasticsearchVersionsResponseMutableBuilder[Self <: GetCompatibleElasticsearchVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatibleElasticsearchVersions(value: CompatibleElasticsearchVersionsList): Self = StObject.set(x, "CompatibleElasticsearchVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleElasticsearchVersionsUndefined: Self = StObject.set(x, "CompatibleElasticsearchVersions", js.undefined)
    
    @scala.inline
    def setCompatibleElasticsearchVersionsVarargs(value: CompatibleVersionsMap*): Self = StObject.set(x, "CompatibleElasticsearchVersions", js.Array(value :_*))
  }
}
