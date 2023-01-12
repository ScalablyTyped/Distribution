package typings.axeCore.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeResult extends StObject {
  
  var all: js.Array[CheckResult]
  
  var ancestry: js.UndefOr[js.Array[String]] = js.undefined
  
  var any: js.Array[CheckResult]
  
  var element: js.UndefOr[HTMLElement] = js.undefined
  
  var failureSummary: js.UndefOr[String] = js.undefined
  
  var html: String
  
  var impact: js.UndefOr[ImpactValue] = js.undefined
  
  var none: js.Array[CheckResult]
  
  var target: js.Array[String]
  
  var xpath: js.UndefOr[js.Array[String]] = js.undefined
}
object NodeResult {
  
  inline def apply(
    all: js.Array[CheckResult],
    any: js.Array[CheckResult],
    html: String,
    none: js.Array[CheckResult],
    target: js.Array[String]
  ): NodeResult = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeResult] (val x: Self) extends AnyVal {
    
    inline def setAll(value: js.Array[CheckResult]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllVarargs(value: CheckResult*): Self = StObject.set(x, "all", js.Array(value*))
    
    inline def setAncestry(value: js.Array[String]): Self = StObject.set(x, "ancestry", value.asInstanceOf[js.Any])
    
    inline def setAncestryUndefined: Self = StObject.set(x, "ancestry", js.undefined)
    
    inline def setAncestryVarargs(value: String*): Self = StObject.set(x, "ancestry", js.Array(value*))
    
    inline def setAny(value: js.Array[CheckResult]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    inline def setAnyVarargs(value: CheckResult*): Self = StObject.set(x, "any", js.Array(value*))
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setFailureSummary(value: String): Self = StObject.set(x, "failureSummary", value.asInstanceOf[js.Any])
    
    inline def setFailureSummaryUndefined: Self = StObject.set(x, "failureSummary", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setImpact(value: ImpactValue): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setImpactNull: Self = StObject.set(x, "impact", null)
    
    inline def setImpactUndefined: Self = StObject.set(x, "impact", js.undefined)
    
    inline def setNone(value: js.Array[CheckResult]): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneVarargs(value: CheckResult*): Self = StObject.set(x, "none", js.Array(value*))
    
    inline def setTarget(value: js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setXpath(value: js.Array[String]): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
    
    inline def setXpathUndefined: Self = StObject.set(x, "xpath", js.undefined)
    
    inline def setXpathVarargs(value: String*): Self = StObject.set(x, "xpath", js.Array(value*))
  }
}
