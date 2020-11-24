package typings.axeCore.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeResult extends js.Object {
  
  var all: js.Array[CheckResult] = js.native
  
  var ancestry: js.UndefOr[js.Array[String]] = js.native
  
  var any: js.Array[CheckResult] = js.native
  
  var element: js.UndefOr[HTMLElement] = js.native
  
  var failureSummary: js.UndefOr[String] = js.native
  
  var html: String = js.native
  
  var impact: js.UndefOr[ImpactValue] = js.native
  
  var none: js.Array[CheckResult] = js.native
  
  var target: js.Array[String] = js.native
  
  var xpath: js.UndefOr[js.Array[String]] = js.native
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
  implicit class NodeResultOps[Self <: NodeResult] (val x: Self) extends AnyVal {
    
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
    def setAllVarargs(value: CheckResult*): Self = this.set("all", js.Array(value :_*))
    
    @scala.inline
    def setAll(value: js.Array[CheckResult]): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyVarargs(value: CheckResult*): Self = this.set("any", js.Array(value :_*))
    
    @scala.inline
    def setAny(value: js.Array[CheckResult]): Self = this.set("any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoneVarargs(value: CheckResult*): Self = this.set("none", js.Array(value :_*))
    
    @scala.inline
    def setNone(value: js.Array[CheckResult]): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: String*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Array[String]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncestryVarargs(value: String*): Self = this.set("ancestry", js.Array(value :_*))
    
    @scala.inline
    def setAncestry(value: js.Array[String]): Self = this.set("ancestry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAncestry: Self = this.set("ancestry", js.undefined)
    
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setFailureSummary(value: String): Self = this.set("failureSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureSummary: Self = this.set("failureSummary", js.undefined)
    
    @scala.inline
    def setImpact(value: ImpactValue): Self = this.set("impact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpact: Self = this.set("impact", js.undefined)
    
    @scala.inline
    def setImpactNull: Self = this.set("impact", null)
    
    @scala.inline
    def setXpathVarargs(value: String*): Self = this.set("xpath", js.Array(value :_*))
    
    @scala.inline
    def setXpath(value: js.Array[String]): Self = this.set("xpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXpath: Self = this.set("xpath", js.undefined)
  }
}
