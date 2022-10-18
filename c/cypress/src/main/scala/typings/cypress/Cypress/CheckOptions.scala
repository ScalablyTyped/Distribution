package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckOptions
  extends StObject
     with Loggable
     with Timeoutable
     with ActionableOptions {
  
  var interval: Double
}
object CheckOptions {
  
  inline def apply(
    animationDistanceThreshold: Double,
    force: Boolean,
    interval: Double,
    log: Boolean,
    scrollBehavior: scrollBehaviorOptions,
    timeout: Double,
    waitForAnimations: Boolean
  ): CheckOptions = {
    val __obj = js.Dynamic.literal(animationDistanceThreshold = animationDistanceThreshold.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], scrollBehavior = scrollBehavior.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], waitForAnimations = waitForAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckOptions]
  }
  
  extension [Self <: CheckOptions](x: Self) {
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
  }
}
