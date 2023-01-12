package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancellation extends StObject {
  
  /** Enable cancellation */
  var cancellation: js.UndefOr[Boolean] = js.undefined
  
  /** Enable long stack traces */
  var longStackTraces: js.UndefOr[Boolean] = js.undefined
  
  /** Enable monitoring */
  var monitoring: js.UndefOr[Boolean] = js.undefined
  
  /** Enable warnings */
  var warnings: js.UndefOr[Boolean | WForgottenReturn] = js.undefined
}
object Cancellation {
  
  inline def apply(): Cancellation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancellation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cancellation] (val x: Self) extends AnyVal {
    
    inline def setCancellation(value: Boolean): Self = StObject.set(x, "cancellation", value.asInstanceOf[js.Any])
    
    inline def setCancellationUndefined: Self = StObject.set(x, "cancellation", js.undefined)
    
    inline def setLongStackTraces(value: Boolean): Self = StObject.set(x, "longStackTraces", value.asInstanceOf[js.Any])
    
    inline def setLongStackTracesUndefined: Self = StObject.set(x, "longStackTraces", js.undefined)
    
    inline def setMonitoring(value: Boolean): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
    
    inline def setWarnings(value: Boolean | WForgottenReturn): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
  }
}
