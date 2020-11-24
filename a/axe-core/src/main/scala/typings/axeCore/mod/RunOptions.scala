package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunOptions extends js.Object {
  
  var absolutePaths: js.UndefOr[Boolean] = js.native
  
  var ancestry: js.UndefOr[Boolean] = js.native
  
  var elementRef: js.UndefOr[Boolean] = js.native
  
  var frameWaitTime: js.UndefOr[Double] = js.native
  
  var iframes: js.UndefOr[Boolean] = js.native
  
  var performanceTimer: js.UndefOr[Boolean] = js.native
  
  var preload: js.UndefOr[Boolean] = js.native
  
  var reporter: js.UndefOr[ReporterVersion] = js.native
  
  var resultTypes: js.UndefOr[js.Array[resultGroups]] = js.native
  
  var rules: js.UndefOr[RuleObject] = js.native
  
  var runOnly: js.UndefOr[RunOnly | (js.Array[String | TagValue])] = js.native
  
  var selectors: js.UndefOr[Boolean] = js.native
  
  var xpath: js.UndefOr[Boolean] = js.native
}
object RunOptions {
  
  @scala.inline
  def apply(): RunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunOptions]
  }
  
  @scala.inline
  implicit class RunOptionsOps[Self <: RunOptions] (val x: Self) extends AnyVal {
    
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
    def setAbsolutePaths(value: Boolean): Self = this.set("absolutePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolutePaths: Self = this.set("absolutePaths", js.undefined)
    
    @scala.inline
    def setAncestry(value: Boolean): Self = this.set("ancestry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAncestry: Self = this.set("ancestry", js.undefined)
    
    @scala.inline
    def setElementRef(value: Boolean): Self = this.set("elementRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementRef: Self = this.set("elementRef", js.undefined)
    
    @scala.inline
    def setFrameWaitTime(value: Double): Self = this.set("frameWaitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameWaitTime: Self = this.set("frameWaitTime", js.undefined)
    
    @scala.inline
    def setIframes(value: Boolean): Self = this.set("iframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIframes: Self = this.set("iframes", js.undefined)
    
    @scala.inline
    def setPerformanceTimer(value: Boolean): Self = this.set("performanceTimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceTimer: Self = this.set("performanceTimer", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setReporter(value: ReporterVersion): Self = this.set("reporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    
    @scala.inline
    def setResultTypesVarargs(value: resultGroups*): Self = this.set("resultTypes", js.Array(value :_*))
    
    @scala.inline
    def setResultTypes(value: js.Array[resultGroups]): Self = this.set("resultTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultTypes: Self = this.set("resultTypes", js.undefined)
    
    @scala.inline
    def setRules(value: RuleObject): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setRunOnlyVarargs(value: (String | TagValue)*): Self = this.set("runOnly", js.Array(value :_*))
    
    @scala.inline
    def setRunOnly(value: RunOnly | (js.Array[String | TagValue])): Self = this.set("runOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunOnly: Self = this.set("runOnly", js.undefined)
    
    @scala.inline
    def setSelectors(value: Boolean): Self = this.set("selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectors: Self = this.set("selectors", js.undefined)
    
    @scala.inline
    def setXpath(value: Boolean): Self = this.set("xpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXpath: Self = this.set("xpath", js.undefined)
  }
}
