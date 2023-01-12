package typings.cypress.anon

import typings.cypress.cypressStrings.linear
import typings.cypress.cypressStrings.swing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.ScrollToOptions> */
trait PartialScrollToOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[swing | linear] = js.undefined
  
  var ensureScrollable: js.UndefOr[Boolean] = js.undefined
  
  var log: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object PartialScrollToOptions {
  
  inline def apply(): PartialScrollToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollToOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialScrollToOptions] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: swing | linear): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEnsureScrollable(value: Boolean): Self = StObject.set(x, "ensureScrollable", value.asInstanceOf[js.Any])
    
    inline def setEnsureScrollableUndefined: Self = StObject.set(x, "ensureScrollable", js.undefined)
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
