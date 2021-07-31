package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeoutConfig extends StObject {
  
  /**
    * This timeout (in milliseconds) tells React how long to wait before showing the next state.
    *
    * React will always try to use a shorter lag when network and device allows it.
    *
    * **NOTE: We recommend that you share Suspense Config between different modules.**
    */
  var timeoutMs: Double
}
object TimeoutConfig {
  
  @scala.inline
  def apply(timeoutMs: Double): TimeoutConfig = {
    val __obj = js.Dynamic.literal(timeoutMs = timeoutMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutConfig]
  }
  
  @scala.inline
  implicit class TimeoutConfigMutableBuilder[Self <: TimeoutConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
  }
}
