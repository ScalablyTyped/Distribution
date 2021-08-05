package typings.bluebirdLst

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
    
    extension [Self <: Cancellation](x: Self) {
      
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
  
  trait WForgottenReturn extends StObject {
    
    /** Enables all warnings except forgotten return statements. */
    var wForgottenReturn: Boolean
  }
  object WForgottenReturn {
    
    inline def apply(wForgottenReturn: Boolean): WForgottenReturn = {
      val __obj = js.Dynamic.literal(wForgottenReturn = wForgottenReturn.asInstanceOf[js.Any])
      __obj.asInstanceOf[WForgottenReturn]
    }
    
    extension [Self <: WForgottenReturn](x: Self) {
      
      inline def setWForgottenReturn(value: Boolean): Self = StObject.set(x, "wForgottenReturn", value.asInstanceOf[js.Any])
    }
  }
}
