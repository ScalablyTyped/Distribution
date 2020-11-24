package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompatibleVersionsMap extends js.Object {
  
  /**
    * The current version of Elasticsearch on which a domain is.
    */
  var SourceVersion: js.UndefOr[ElasticsearchVersionString] = js.native
  
  var TargetVersions: js.UndefOr[ElasticsearchVersionList] = js.native
}
object CompatibleVersionsMap {
  
  @scala.inline
  def apply(): CompatibleVersionsMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibleVersionsMap]
  }
  
  @scala.inline
  implicit class CompatibleVersionsMapOps[Self <: CompatibleVersionsMap] (val x: Self) extends AnyVal {
    
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
    def setSourceVersion(value: ElasticsearchVersionString): Self = this.set("SourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceVersion: Self = this.set("SourceVersion", js.undefined)
    
    @scala.inline
    def setTargetVersionsVarargs(value: ElasticsearchVersionString*): Self = this.set("TargetVersions", js.Array(value :_*))
    
    @scala.inline
    def setTargetVersions(value: ElasticsearchVersionList): Self = this.set("TargetVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetVersions: Self = this.set("TargetVersions", js.undefined)
  }
}
