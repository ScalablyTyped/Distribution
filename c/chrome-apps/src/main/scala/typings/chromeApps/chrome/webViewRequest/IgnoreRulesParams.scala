package typings.chromeApps.chrome.webViewRequest

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreRulesParams extends StObject {
  
  /**
    * If set, rules with the specified tag are ignored. This ignoring is not persisted,
    * it affects only rules and their actions of the same network request stage.
    * Note that rules are executed in descending order of their priorities.
    * This action affects rules of lower priority than the current rule.
    * Rules with the same priority may or may not be ignored.
    */
  var hasTag: js.UndefOr[String] = js.undefined
  
  /**
    * If set, rules with a lower priority than the specified value are ignored.
    * This boundary is not persisted, it affects only rules and their actions
    * of the same network request stage.
    */
  var lowerPriorityThan: js.UndefOr[integer] = js.undefined
}
object IgnoreRulesParams {
  
  @scala.inline
  def apply(): IgnoreRulesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreRulesParams]
  }
  
  @scala.inline
  implicit class IgnoreRulesParamsMutableBuilder[Self <: IgnoreRulesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasTag(value: String): Self = StObject.set(x, "hasTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTagUndefined: Self = StObject.set(x, "hasTag", js.undefined)
    
    @scala.inline
    def setLowerPriorityThan(value: integer): Self = StObject.set(x, "lowerPriorityThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerPriorityThanUndefined: Self = StObject.set(x, "lowerPriorityThan", js.undefined)
  }
}
