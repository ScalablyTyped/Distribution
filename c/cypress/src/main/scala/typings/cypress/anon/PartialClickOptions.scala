package typings.cypress.anon

import typings.cypress.Cypress.scrollBehaviorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.ClickOptions> */
trait PartialClickOptions extends StObject {
  
  var altKey: js.UndefOr[Boolean] = js.undefined
  
  var animationDistanceThreshold: js.UndefOr[Double] = js.undefined
  
  var cmdKey: js.UndefOr[Boolean] = js.undefined
  
  var commandKey: js.UndefOr[Boolean] = js.undefined
  
  var controlKey: js.UndefOr[Boolean] = js.undefined
  
  var ctrlKey: js.UndefOr[Boolean] = js.undefined
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var log: js.UndefOr[Boolean] = js.undefined
  
  var metaKey: js.UndefOr[Boolean] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var optionKey: js.UndefOr[Boolean] = js.undefined
  
  var scrollBehavior: js.UndefOr[scrollBehaviorOptions] = js.undefined
  
  var shiftKey: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var waitForAnimations: js.UndefOr[Boolean] = js.undefined
}
object PartialClickOptions {
  
  inline def apply(): PartialClickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClickOptions]
  }
  
  extension [Self <: PartialClickOptions](x: Self) {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
    
    inline def setAnimationDistanceThreshold(value: Double): Self = StObject.set(x, "animationDistanceThreshold", value.asInstanceOf[js.Any])
    
    inline def setAnimationDistanceThresholdUndefined: Self = StObject.set(x, "animationDistanceThreshold", js.undefined)
    
    inline def setCmdKey(value: Boolean): Self = StObject.set(x, "cmdKey", value.asInstanceOf[js.Any])
    
    inline def setCmdKeyUndefined: Self = StObject.set(x, "cmdKey", js.undefined)
    
    inline def setCommandKey(value: Boolean): Self = StObject.set(x, "commandKey", value.asInstanceOf[js.Any])
    
    inline def setCommandKeyUndefined: Self = StObject.set(x, "commandKey", js.undefined)
    
    inline def setControlKey(value: Boolean): Self = StObject.set(x, "controlKey", value.asInstanceOf[js.Any])
    
    inline def setControlKeyUndefined: Self = StObject.set(x, "controlKey", js.undefined)
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setOptionKey(value: Boolean): Self = StObject.set(x, "optionKey", value.asInstanceOf[js.Any])
    
    inline def setOptionKeyUndefined: Self = StObject.set(x, "optionKey", js.undefined)
    
    inline def setScrollBehavior(value: scrollBehaviorOptions): Self = StObject.set(x, "scrollBehavior", value.asInstanceOf[js.Any])
    
    inline def setScrollBehaviorUndefined: Self = StObject.set(x, "scrollBehavior", js.undefined)
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWaitForAnimations(value: Boolean): Self = StObject.set(x, "waitForAnimations", value.asInstanceOf[js.Any])
    
    inline def setWaitForAnimationsUndefined: Self = StObject.set(x, "waitForAnimations", js.undefined)
  }
}
