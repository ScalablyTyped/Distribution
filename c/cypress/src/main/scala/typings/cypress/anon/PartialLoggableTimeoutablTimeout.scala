package typings.cypress.anon

import typings.cypress.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.Loggable & cypress.Cypress.Timeoutable & cypress.Cypress.Withinable & cypress.Cypress.Shadow> */
trait PartialLoggableTimeoutablTimeout extends StObject {
  
  var includeShadowDom: js.UndefOr[Boolean] = js.undefined
  
  var log: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var withinSubject: js.UndefOr[JQuery[HTMLElement] | HTMLElement | Null] = js.undefined
}
object PartialLoggableTimeoutablTimeout {
  
  inline def apply(): PartialLoggableTimeoutablTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLoggableTimeoutablTimeout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialLoggableTimeoutablTimeout] (val x: Self) extends AnyVal {
    
    inline def setIncludeShadowDom(value: Boolean): Self = StObject.set(x, "includeShadowDom", value.asInstanceOf[js.Any])
    
    inline def setIncludeShadowDomUndefined: Self = StObject.set(x, "includeShadowDom", js.undefined)
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWithinSubject(value: JQuery[HTMLElement] | HTMLElement): Self = StObject.set(x, "withinSubject", value.asInstanceOf[js.Any])
    
    inline def setWithinSubjectNull: Self = StObject.set(x, "withinSubject", null)
    
    inline def setWithinSubjectUndefined: Self = StObject.set(x, "withinSubject", js.undefined)
  }
}
