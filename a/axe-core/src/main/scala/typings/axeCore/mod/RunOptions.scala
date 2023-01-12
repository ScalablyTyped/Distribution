package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunOptions extends StObject {
  
  var absolutePaths: js.UndefOr[Boolean] = js.undefined
  
  var ancestry: js.UndefOr[Boolean] = js.undefined
  
  var elementRef: js.UndefOr[Boolean] = js.undefined
  
  var frameWaitTime: js.UndefOr[Double] = js.undefined
  
  var iframes: js.UndefOr[Boolean] = js.undefined
  
  var performanceTimer: js.UndefOr[Boolean] = js.undefined
  
  var pingWaitTime: js.UndefOr[Double] = js.undefined
  
  var preload: js.UndefOr[Boolean] = js.undefined
  
  var reporter: js.UndefOr[ReporterVersion] = js.undefined
  
  var resultTypes: js.UndefOr[js.Array[resultGroups]] = js.undefined
  
  var rules: js.UndefOr[RuleObject] = js.undefined
  
  var runOnly: js.UndefOr[RunOnly | (js.Array[String | TagValue]) | String] = js.undefined
  
  var selectors: js.UndefOr[Boolean] = js.undefined
  
  var xpath: js.UndefOr[Boolean] = js.undefined
}
object RunOptions {
  
  inline def apply(): RunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunOptions] (val x: Self) extends AnyVal {
    
    inline def setAbsolutePaths(value: Boolean): Self = StObject.set(x, "absolutePaths", value.asInstanceOf[js.Any])
    
    inline def setAbsolutePathsUndefined: Self = StObject.set(x, "absolutePaths", js.undefined)
    
    inline def setAncestry(value: Boolean): Self = StObject.set(x, "ancestry", value.asInstanceOf[js.Any])
    
    inline def setAncestryUndefined: Self = StObject.set(x, "ancestry", js.undefined)
    
    inline def setElementRef(value: Boolean): Self = StObject.set(x, "elementRef", value.asInstanceOf[js.Any])
    
    inline def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
    
    inline def setFrameWaitTime(value: Double): Self = StObject.set(x, "frameWaitTime", value.asInstanceOf[js.Any])
    
    inline def setFrameWaitTimeUndefined: Self = StObject.set(x, "frameWaitTime", js.undefined)
    
    inline def setIframes(value: Boolean): Self = StObject.set(x, "iframes", value.asInstanceOf[js.Any])
    
    inline def setIframesUndefined: Self = StObject.set(x, "iframes", js.undefined)
    
    inline def setPerformanceTimer(value: Boolean): Self = StObject.set(x, "performanceTimer", value.asInstanceOf[js.Any])
    
    inline def setPerformanceTimerUndefined: Self = StObject.set(x, "performanceTimer", js.undefined)
    
    inline def setPingWaitTime(value: Double): Self = StObject.set(x, "pingWaitTime", value.asInstanceOf[js.Any])
    
    inline def setPingWaitTimeUndefined: Self = StObject.set(x, "pingWaitTime", js.undefined)
    
    inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setReporter(value: ReporterVersion): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    inline def setResultTypes(value: js.Array[resultGroups]): Self = StObject.set(x, "resultTypes", value.asInstanceOf[js.Any])
    
    inline def setResultTypesUndefined: Self = StObject.set(x, "resultTypes", js.undefined)
    
    inline def setResultTypesVarargs(value: resultGroups*): Self = StObject.set(x, "resultTypes", js.Array(value*))
    
    inline def setRules(value: RuleObject): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRunOnly(value: RunOnly | (js.Array[String | TagValue]) | String): Self = StObject.set(x, "runOnly", value.asInstanceOf[js.Any])
    
    inline def setRunOnlyUndefined: Self = StObject.set(x, "runOnly", js.undefined)
    
    inline def setRunOnlyVarargs(value: (String | TagValue)*): Self = StObject.set(x, "runOnly", js.Array(value*))
    
    inline def setSelectors(value: Boolean): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    inline def setXpath(value: Boolean): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
    
    inline def setXpathUndefined: Self = StObject.set(x, "xpath", js.undefined)
  }
}
