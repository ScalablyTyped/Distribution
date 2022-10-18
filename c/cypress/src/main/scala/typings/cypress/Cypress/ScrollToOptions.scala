package typings.cypress.Cypress

import typings.cypress.cypressStrings.linear
import typings.cypress.cypressStrings.swing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollToOptions
  extends StObject
     with Loggable
     with Timeoutable {
  
  /**
    * Scrolls over the duration (in ms)
    *
    * @default 0
    */
  var duration: Double
  
  /**
    * Will scroll with the easing animation
    *
    * @default 'swing'
    */
  var easing: swing | linear
  
  /**
    * Ensure element is scrollable. Error if element is not scrollable
    *
    * @default true
    */
  var ensureScrollable: Boolean
}
object ScrollToOptions {
  
  inline def apply(duration: Double, easing: swing | linear, ensureScrollable: Boolean, log: Boolean, timeout: Double): ScrollToOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], ensureScrollable = ensureScrollable.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollToOptions]
  }
  
  extension [Self <: ScrollToOptions](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: swing | linear): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEnsureScrollable(value: Boolean): Self = StObject.set(x, "ensureScrollable", value.asInstanceOf[js.Any])
  }
}
