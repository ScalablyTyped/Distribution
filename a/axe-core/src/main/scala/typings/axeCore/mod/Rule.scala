package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  var all: js.UndefOr[js.Array[String]] = js.undefined
  
  var any: js.UndefOr[js.Array[String]] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var excludeHidden: js.UndefOr[Boolean] = js.undefined
  
  var id: String
  
  var impact: js.UndefOr[ImpactValue] = js.undefined
  
  var matches: js.UndefOr[String] = js.undefined
  
  var none: js.UndefOr[js.Array[String]] = js.undefined
  
  var pageLevel: js.UndefOr[Boolean] = js.undefined
  
  var reviewOnFail: js.UndefOr[Boolean] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object Rule {
  
  inline def apply(id: String): Rule = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    inline def setAll(value: js.Array[String]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setAllVarargs(value: String*): Self = StObject.set(x, "all", js.Array(value*))
    
    inline def setAny(value: js.Array[String]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    inline def setAnyUndefined: Self = StObject.set(x, "any", js.undefined)
    
    inline def setAnyVarargs(value: String*): Self = StObject.set(x, "any", js.Array(value*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExcludeHidden(value: Boolean): Self = StObject.set(x, "excludeHidden", value.asInstanceOf[js.Any])
    
    inline def setExcludeHiddenUndefined: Self = StObject.set(x, "excludeHidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImpact(value: ImpactValue): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setImpactNull: Self = StObject.set(x, "impact", null)
    
    inline def setImpactUndefined: Self = StObject.set(x, "impact", js.undefined)
    
    inline def setMatches(value: String): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setNone(value: js.Array[String]): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
    
    inline def setNoneVarargs(value: String*): Self = StObject.set(x, "none", js.Array(value*))
    
    inline def setPageLevel(value: Boolean): Self = StObject.set(x, "pageLevel", value.asInstanceOf[js.Any])
    
    inline def setPageLevelUndefined: Self = StObject.set(x, "pageLevel", js.undefined)
    
    inline def setReviewOnFail(value: Boolean): Self = StObject.set(x, "reviewOnFail", value.asInstanceOf[js.Any])
    
    inline def setReviewOnFailUndefined: Self = StObject.set(x, "reviewOnFail", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
