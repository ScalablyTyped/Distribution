package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to affect Actionability checks
  * @see https://docs.cypress.io/guides/core-concepts/interacting-with-elements.html#Actionability
  */
trait ActionableOptions
  extends StObject
     with Forceable {
  
  /**
    * The distance in pixels an element must exceed over time to be considered animating
    *
    * @default 5
    */
  var animationDistanceThreshold: Double
  
  /**
    * Viewport position to which an element should be scrolled prior to action commands. Setting `false` disables scrolling.
    *
    * @default 'top'
    */
  var scrollBehavior: scrollBehaviorOptions
  
  /**
    * Whether to wait for elements to finish animating before executing commands
    *
    * @default true
    */
  var waitForAnimations: Boolean
}
object ActionableOptions {
  
  inline def apply(
    animationDistanceThreshold: Double,
    force: Boolean,
    scrollBehavior: scrollBehaviorOptions,
    waitForAnimations: Boolean
  ): ActionableOptions = {
    val __obj = js.Dynamic.literal(animationDistanceThreshold = animationDistanceThreshold.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], scrollBehavior = scrollBehavior.asInstanceOf[js.Any], waitForAnimations = waitForAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionableOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionableOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimationDistanceThreshold(value: Double): Self = StObject.set(x, "animationDistanceThreshold", value.asInstanceOf[js.Any])
    
    inline def setScrollBehavior(value: scrollBehaviorOptions): Self = StObject.set(x, "scrollBehavior", value.asInstanceOf[js.Any])
    
    inline def setWaitForAnimations(value: Boolean): Self = StObject.set(x, "waitForAnimations", value.asInstanceOf[js.Any])
  }
}
