package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCompatibleElasticsearchVersionsResponse extends js.Object {
  
  /**
    *  A map of compatible Elasticsearch versions returned as part of the  GetCompatibleElasticsearchVersions  operation. 
    */
  var CompatibleElasticsearchVersions: js.UndefOr[CompatibleElasticsearchVersionsList] = js.native
}
object GetCompatibleElasticsearchVersionsResponse {
  
  @scala.inline
  def apply(): GetCompatibleElasticsearchVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompatibleElasticsearchVersionsResponse]
  }
  
  @scala.inline
  implicit class GetCompatibleElasticsearchVersionsResponseOps[Self <: GetCompatibleElasticsearchVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setCompatibleElasticsearchVersionsVarargs(value: CompatibleVersionsMap*): Self = this.set("CompatibleElasticsearchVersions", js.Array(value :_*))
    
    @scala.inline
    def setCompatibleElasticsearchVersions(value: CompatibleElasticsearchVersionsList): Self = this.set("CompatibleElasticsearchVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibleElasticsearchVersions: Self = this.set("CompatibleElasticsearchVersions", js.undefined)
  }
}
