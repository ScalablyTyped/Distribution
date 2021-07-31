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
  
  @scala.inline
  def apply(
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
  implicit class NodeResultMutableBuilder[Self <: NodeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: js.Array[CheckResult]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllVarargs(value: CheckResult*): Self = StObject.set(x, "all", js.Array(value :_*))
    
    @scala.inline
    def setAncestry(value: js.Array[String]): Self = StObject.set(x, "ancestry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncestryUndefined: Self = StObject.set(x, "ancestry", js.undefined)
    
    @scala.inline
    def setAncestryVarargs(value: String*): Self = StObject.set(x, "ancestry", js.Array(value :_*))
    
    @scala.inline
    def setAny(value: js.Array[CheckResult]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyVarargs(value: CheckResult*): Self = StObject.set(x, "any", js.Array(value :_*))
    
    @scala.inline
    def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setFailureSummary(value: String): Self = StObject.set(x, "failureSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureSummaryUndefined: Self = StObject.set(x, "failureSummary", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpact(value: ImpactValue): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpactNull: Self = StObject.set(x, "impact", null)
    
    @scala.inline
    def setImpactUndefined: Self = StObject.set(x, "impact", js.undefined)
    
    @scala.inline
    def setNone(value: js.Array[CheckResult]): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoneVarargs(value: CheckResult*): Self = StObject.set(x, "none", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value :_*))
    
    @scala.inline
    def setXpath(value: js.Array[String]): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpathUndefined: Self = StObject.set(x, "xpath", js.undefined)
    
    @scala.inline
    def setXpathVarargs(value: String*): Self = StObject.set(x, "xpath", js.Array(value :_*))
  }
}
