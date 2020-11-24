package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends js.Object {
  
  var all: js.UndefOr[js.Array[String]] = js.native
  
  var any: js.UndefOr[js.Array[String]] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var excludeHidden: js.UndefOr[Boolean] = js.native
  
  var id: String = js.native
  
  var impact: js.UndefOr[ImpactValue] = js.native
  
  var matches: js.UndefOr[String] = js.native
  
  var none: js.UndefOr[js.Array[String]] = js.native
  
  var pageLevel: js.UndefOr[Boolean] = js.native
  
  var selector: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object Rule {
  
  @scala.inline
  def apply(id: String): Rule = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllVarargs(value: String*): Self = this.set("all", js.Array(value :_*))
    
    @scala.inline
    def setAll(value: js.Array[String]): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    
    @scala.inline
    def setAnyVarargs(value: String*): Self = this.set("any", js.Array(value :_*))
    
    @scala.inline
    def setAny(value: js.Array[String]): Self = this.set("any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAny: Self = this.set("any", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setExcludeHidden(value: Boolean): Self = this.set("excludeHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeHidden: Self = this.set("excludeHidden", js.undefined)
    
    @scala.inline
    def setImpact(value: ImpactValue): Self = this.set("impact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpact: Self = this.set("impact", js.undefined)
    
    @scala.inline
    def setImpactNull: Self = this.set("impact", null)
    
    @scala.inline
    def setMatches(value: String): Self = this.set("matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatches: Self = this.set("matches", js.undefined)
    
    @scala.inline
    def setNoneVarargs(value: String*): Self = this.set("none", js.Array(value :_*))
    
    @scala.inline
    def setNone(value: js.Array[String]): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNone: Self = this.set("none", js.undefined)
    
    @scala.inline
    def setPageLevel(value: Boolean): Self = this.set("pageLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageLevel: Self = this.set("pageLevel", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
