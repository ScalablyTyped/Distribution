package typings.cypress.anon

import typings.cypress.Cypress.scrollBehaviorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.TypeOptions> */
trait PartialTypeOptions extends StObject {
  
  var animationDistanceThreshold: js.UndefOr[Double] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var log: js.UndefOr[Boolean] = js.undefined
  
  var parseSpecialCharSequences: js.UndefOr[Boolean] = js.undefined
  
  var release: js.UndefOr[Boolean] = js.undefined
  
  var scrollBehavior: js.UndefOr[scrollBehaviorOptions] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var waitForAnimations: js.UndefOr[Boolean] = js.undefined
}
object PartialTypeOptions {
  
  inline def apply(): PartialTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypeOptions]
  }
  
  extension [Self <: PartialTypeOptions](x: Self) {
    
    inline def setAnimationDistanceThreshold(value: Double): Self = StObject.set(x, "animationDistanceThreshold", value.asInstanceOf[js.Any])
    
    inline def setAnimationDistanceThresholdUndefined: Self = StObject.set(x, "animationDistanceThreshold", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setParseSpecialCharSequences(value: Boolean): Self = StObject.set(x, "parseSpecialCharSequences", value.asInstanceOf[js.Any])
    
    inline def setParseSpecialCharSequencesUndefined: Self = StObject.set(x, "parseSpecialCharSequences", js.undefined)
    
    inline def setRelease(value: Boolean): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setScrollBehavior(value: scrollBehaviorOptions): Self = StObject.set(x, "scrollBehavior", value.asInstanceOf[js.Any])
    
    inline def setScrollBehaviorUndefined: Self = StObject.set(x, "scrollBehavior", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWaitForAnimations(value: Boolean): Self = StObject.set(x, "waitForAnimations", value.asInstanceOf[js.Any])
    
    inline def setWaitForAnimationsUndefined: Self = StObject.set(x, "waitForAnimations", js.undefined)
  }
}
