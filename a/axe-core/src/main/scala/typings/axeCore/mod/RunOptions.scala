package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunOptions extends StObject {
  
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
  implicit class RunOptionsMutableBuilder[Self <: RunOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsolutePaths(value: Boolean): Self = StObject.set(x, "absolutePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsolutePathsUndefined: Self = StObject.set(x, "absolutePaths", js.undefined)
    
    @scala.inline
    def setAncestry(value: Boolean): Self = StObject.set(x, "ancestry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncestryUndefined: Self = StObject.set(x, "ancestry", js.undefined)
    
    @scala.inline
    def setElementRef(value: Boolean): Self = StObject.set(x, "elementRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
    
    @scala.inline
    def setFrameWaitTime(value: Double): Self = StObject.set(x, "frameWaitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameWaitTimeUndefined: Self = StObject.set(x, "frameWaitTime", js.undefined)
    
    @scala.inline
    def setIframes(value: Boolean): Self = StObject.set(x, "iframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframesUndefined: Self = StObject.set(x, "iframes", js.undefined)
    
    @scala.inline
    def setPerformanceTimer(value: Boolean): Self = StObject.set(x, "performanceTimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceTimerUndefined: Self = StObject.set(x, "performanceTimer", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    @scala.inline
    def setReporter(value: ReporterVersion): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    @scala.inline
    def setResultTypes(value: js.Array[resultGroups]): Self = StObject.set(x, "resultTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultTypesUndefined: Self = StObject.set(x, "resultTypes", js.undefined)
    
    @scala.inline
    def setResultTypesVarargs(value: resultGroups*): Self = StObject.set(x, "resultTypes", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: RuleObject): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRunOnly(value: RunOnly | (js.Array[String | TagValue])): Self = StObject.set(x, "runOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunOnlyUndefined: Self = StObject.set(x, "runOnly", js.undefined)
    
    @scala.inline
    def setRunOnlyVarargs(value: (String | TagValue)*): Self = StObject.set(x, "runOnly", js.Array(value :_*))
    
    @scala.inline
    def setSelectors(value: Boolean): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    @scala.inline
    def setXpath(value: Boolean): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpathUndefined: Self = StObject.set(x, "xpath", js.undefined)
  }
}
