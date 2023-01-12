package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspenseConfig
  extends StObject
     with typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TimeoutConfig {
  
  var busyDelayMs: js.UndefOr[Double] = js.undefined
  
  var busyMinDurationMs: js.UndefOr[Double] = js.undefined
}
object SuspenseConfig {
  
  inline def apply(timeoutMs: Double): SuspenseConfig = {
    val __obj = js.Dynamic.literal(timeoutMs = timeoutMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuspenseConfig] (val x: Self) extends AnyVal {
    
    inline def setBusyDelayMs(value: Double): Self = StObject.set(x, "busyDelayMs", value.asInstanceOf[js.Any])
    
    inline def setBusyDelayMsUndefined: Self = StObject.set(x, "busyDelayMs", js.undefined)
    
    inline def setBusyMinDurationMs(value: Double): Self = StObject.set(x, "busyMinDurationMs", value.asInstanceOf[js.Any])
    
    inline def setBusyMinDurationMsUndefined: Self = StObject.set(x, "busyMinDurationMs", js.undefined)
  }
}
