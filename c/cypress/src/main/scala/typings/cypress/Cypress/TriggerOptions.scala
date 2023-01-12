package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to change the default behavior of .trigger()
  */
trait TriggerOptions
  extends StObject
     with Loggable
     with Timeoutable
     with ActionableOptions {
  
  /**
    * Whether the event bubbles
    *
    * @default true
    */
  var bubbles: Boolean
  
  /**
    * Whether the event is cancelable
    *
    * @default true
    */
  var cancelable: Boolean
  
  /**
    * The type of the event you want to trigger
    *
    * @default 'Event'
    */
  var eventConstructor: String
}
object TriggerOptions {
  
  inline def apply(
    animationDistanceThreshold: Double,
    bubbles: Boolean,
    cancelable: Boolean,
    eventConstructor: String,
    force: Boolean,
    log: Boolean,
    scrollBehavior: scrollBehaviorOptions,
    timeout: Double,
    waitForAnimations: Boolean
  ): TriggerOptions = {
    val __obj = js.Dynamic.literal(animationDistanceThreshold = animationDistanceThreshold.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], eventConstructor = eventConstructor.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], scrollBehavior = scrollBehavior.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], waitForAnimations = waitForAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriggerOptions] (val x: Self) extends AnyVal {
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventConstructor(value: String): Self = StObject.set(x, "eventConstructor", value.asInstanceOf[js.Any])
  }
}
