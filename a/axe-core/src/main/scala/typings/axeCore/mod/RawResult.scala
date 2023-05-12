package typings.axeCore.mod

import typings.axeCore.axeCoreStrings.failed
import typings.axeCore.axeCoreStrings.inapplicable
import typings.axeCore.axeCoreStrings.incomplete
import typings.axeCore.axeCoreStrings.passed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<axe-core.axe-core.Result, 'nodes'> */
trait RawResult extends StObject {
  
  var description: String
  
  var help: String
  
  var helpUrl: String
  
  var id: String
  
  var impact: js.UndefOr[ImpactValue] = js.undefined
  
  var inapplicable: js.Array[Any]
  
  var incomplete: js.Array[RawNodeResult[typings.axeCore.axeCoreStrings.incomplete]]
  
  var pageLevel: Boolean
  
  var passes: js.Array[RawNodeResult[passed]]
  
  var result: failed | passed | incomplete | inapplicable
  
  var tags: js.Array[TagValue]
  
  var violations: js.Array[RawNodeResult[failed]]
}
object RawResult {
  
  inline def apply(
    description: String,
    help: String,
    helpUrl: String,
    id: String,
    inapplicable: js.Array[Any],
    incomplete: js.Array[RawNodeResult[incomplete]],
    pageLevel: Boolean,
    passes: js.Array[RawNodeResult[passed]],
    result: failed | passed | incomplete | inapplicable,
    tags: js.Array[TagValue],
    violations: js.Array[RawNodeResult[failed]]
  ): RawResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpUrl = helpUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inapplicable = inapplicable.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], pageLevel = pageLevel.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawResult] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUrl(value: String): Self = StObject.set(x, "helpUrl", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImpact(value: ImpactValue): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setImpactNull: Self = StObject.set(x, "impact", null)
    
    inline def setImpactUndefined: Self = StObject.set(x, "impact", js.undefined)
    
    inline def setInapplicable(value: js.Array[Any]): Self = StObject.set(x, "inapplicable", value.asInstanceOf[js.Any])
    
    inline def setInapplicableVarargs(value: Any*): Self = StObject.set(x, "inapplicable", js.Array(value*))
    
    inline def setIncomplete(value: js.Array[RawNodeResult[incomplete]]): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
    
    inline def setIncompleteVarargs(value: RawNodeResult[incomplete]*): Self = StObject.set(x, "incomplete", js.Array(value*))
    
    inline def setPageLevel(value: Boolean): Self = StObject.set(x, "pageLevel", value.asInstanceOf[js.Any])
    
    inline def setPasses(value: js.Array[RawNodeResult[passed]]): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
    
    inline def setPassesVarargs(value: RawNodeResult[passed]*): Self = StObject.set(x, "passes", js.Array(value*))
    
    inline def setResult(value: failed | passed | incomplete | inapplicable): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[TagValue]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: TagValue*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setViolations(value: js.Array[RawNodeResult[failed]]): Self = StObject.set(x, "violations", value.asInstanceOf[js.Any])
    
    inline def setViolationsVarargs(value: RawNodeResult[failed]*): Self = StObject.set(x, "violations", js.Array(value*))
  }
}
