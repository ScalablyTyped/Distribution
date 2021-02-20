package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends StObject {
  
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
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: js.Array[String]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    @scala.inline
    def setAllVarargs(value: String*): Self = StObject.set(x, "all", js.Array(value :_*))
    
    @scala.inline
    def setAny(value: js.Array[String]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyUndefined: Self = StObject.set(x, "any", js.undefined)
    
    @scala.inline
    def setAnyVarargs(value: String*): Self = StObject.set(x, "any", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setExcludeHidden(value: Boolean): Self = StObject.set(x, "excludeHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeHiddenUndefined: Self = StObject.set(x, "excludeHidden", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpact(value: ImpactValue): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpactNull: Self = StObject.set(x, "impact", null)
    
    @scala.inline
    def setImpactUndefined: Self = StObject.set(x, "impact", js.undefined)
    
    @scala.inline
    def setMatches(value: String): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    @scala.inline
    def setNone(value: js.Array[String]): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
    
    @scala.inline
    def setNoneVarargs(value: String*): Self = StObject.set(x, "none", js.Array(value :_*))
    
    @scala.inline
    def setPageLevel(value: Boolean): Self = StObject.set(x, "pageLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLevelUndefined: Self = StObject.set(x, "pageLevel", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
