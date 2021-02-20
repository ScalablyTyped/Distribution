package typings.bluebirdLst

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cancellation extends StObject {
    
    /** Enable cancellation */
    var cancellation: js.UndefOr[Boolean] = js.native
    
    /** Enable long stack traces */
    var longStackTraces: js.UndefOr[Boolean] = js.native
    
    /** Enable monitoring */
    var monitoring: js.UndefOr[Boolean] = js.native
    
    /** Enable warnings */
    var warnings: js.UndefOr[Boolean | WForgottenReturn] = js.native
  }
  object Cancellation {
    
    @scala.inline
    def apply(): Cancellation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cancellation]
    }
    
    @scala.inline
    implicit class CancellationMutableBuilder[Self <: Cancellation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancellation(value: Boolean): Self = StObject.set(x, "cancellation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancellationUndefined: Self = StObject.set(x, "cancellation", js.undefined)
      
      @scala.inline
      def setLongStackTraces(value: Boolean): Self = StObject.set(x, "longStackTraces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongStackTracesUndefined: Self = StObject.set(x, "longStackTraces", js.undefined)
      
      @scala.inline
      def setMonitoring(value: Boolean): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
      
      @scala.inline
      def setWarnings(value: Boolean | WForgottenReturn): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    }
  }
  
  @js.native
  trait WForgottenReturn extends StObject {
    
    /** Enables all warnings except forgotten return statements. */
    var wForgottenReturn: Boolean = js.native
  }
  object WForgottenReturn {
    
    @scala.inline
    def apply(wForgottenReturn: Boolean): WForgottenReturn = {
      val __obj = js.Dynamic.literal(wForgottenReturn = wForgottenReturn.asInstanceOf[js.Any])
      __obj.asInstanceOf[WForgottenReturn]
    }
    
    @scala.inline
    implicit class WForgottenReturnMutableBuilder[Self <: WForgottenReturn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWForgottenReturn(value: Boolean): Self = StObject.set(x, "wForgottenReturn", value.asInstanceOf[js.Any])
    }
  }
}
