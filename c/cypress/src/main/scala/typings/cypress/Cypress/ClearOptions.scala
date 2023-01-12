package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearOptions
  extends StObject
     with Loggable
     with Timeoutable
     with ActionableOptions {
  
  var interval: Double
}
object ClearOptions {
  
  inline def apply(
    animationDistanceThreshold: Double,
    force: Boolean,
    interval: Double,
    log: Boolean,
    scrollBehavior: scrollBehaviorOptions,
    timeout: Double,
    waitForAnimations: Boolean
  ): ClearOptions = {
    val __obj = js.Dynamic.literal(animationDistanceThreshold = animationDistanceThreshold.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], scrollBehavior = scrollBehavior.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], waitForAnimations = waitForAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearOptions] (val x: Self) extends AnyVal {
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
  }
}
