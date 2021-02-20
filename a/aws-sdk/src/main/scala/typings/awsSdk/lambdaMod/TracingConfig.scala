package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TracingConfig extends StObject {
  
  /**
    * The tracing mode.
    */
  var Mode: js.UndefOr[TracingMode] = js.native
}
object TracingConfig {
  
  @scala.inline
  def apply(): TracingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingConfig]
  }
  
  @scala.inline
  implicit class TracingConfigMutableBuilder[Self <: TracingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: TracingMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
  }
}
