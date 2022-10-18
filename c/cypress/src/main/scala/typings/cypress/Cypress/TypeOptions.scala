package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that control `cy.type` command
  *
  * @see https://on.cypress.io/type
  */
trait TypeOptions
  extends StObject
     with Loggable
     with Timeoutable
     with ActionableOptions {
  
  /**
    * Delay after each keypress (ms)
    *
    * @default 10
    */
  var delay: Double
  
  /**
    * Parse special characters for strings surrounded by `{}`,
    * such as `{esc}`. Set to `false` to type the literal characters instead
    *
    * @default true
    */
  var parseSpecialCharSequences: Boolean
  
  /**
    * Keep a modifier activated between commands
    *
    * @default true
    */
  var release: Boolean
}
object TypeOptions {
  
  inline def apply(
    animationDistanceThreshold: Double,
    delay: Double,
    force: Boolean,
    log: Boolean,
    parseSpecialCharSequences: Boolean,
    release: Boolean,
    scrollBehavior: scrollBehaviorOptions,
    timeout: Double,
    waitForAnimations: Boolean
  ): TypeOptions = {
    val __obj = js.Dynamic.literal(animationDistanceThreshold = animationDistanceThreshold.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], parseSpecialCharSequences = parseSpecialCharSequences.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], scrollBehavior = scrollBehavior.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], waitForAnimations = waitForAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOptions]
  }
  
  extension [Self <: TypeOptions](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setParseSpecialCharSequences(value: Boolean): Self = StObject.set(x, "parseSpecialCharSequences", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: Boolean): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
