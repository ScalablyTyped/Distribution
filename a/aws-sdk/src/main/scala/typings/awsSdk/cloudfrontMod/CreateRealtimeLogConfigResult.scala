package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRealtimeLogConfigResult extends StObject {
  
  /**
    * A real-time log configuration.
    */
  var RealtimeLogConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.RealtimeLogConfig] = js.native
}
object CreateRealtimeLogConfigResult {
  
  @scala.inline
  def apply(): CreateRealtimeLogConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRealtimeLogConfigResult]
  }
  
  @scala.inline
  implicit class CreateRealtimeLogConfigResultMutableBuilder[Self <: CreateRealtimeLogConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRealtimeLogConfig(value: RealtimeLogConfig): Self = StObject.set(x, "RealtimeLogConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtimeLogConfigUndefined: Self = StObject.set(x, "RealtimeLogConfig", js.undefined)
  }
}
