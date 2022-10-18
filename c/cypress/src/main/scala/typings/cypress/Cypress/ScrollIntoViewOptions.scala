package typings.cypress.Cypress

import typings.cypress.cypressStrings.linear
import typings.cypress.cypressStrings.swing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollIntoViewOptions
  extends StObject
     with ScrollToOptions {
  
  /**
    * Amount to scroll after the element has been scrolled into view
    *
    * @default {top: 0, left: 0}
    */
  var offset: Offset
}
object ScrollIntoViewOptions {
  
  inline def apply(
    duration: Double,
    easing: swing | linear,
    ensureScrollable: Boolean,
    log: Boolean,
    offset: Offset,
    timeout: Double
  ): ScrollIntoViewOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], ensureScrollable = ensureScrollable.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollIntoViewOptions]
  }
  
  extension [Self <: ScrollIntoViewOptions](x: Self) {
    
    inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
