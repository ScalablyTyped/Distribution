package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRealtimeLogConfigResult extends StObject {
  
  /**
    * A real-time log configuration.
    */
  var RealtimeLogConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.RealtimeLogConfig] = js.native
}
object GetRealtimeLogConfigResult {
  
  @scala.inline
  def apply(): GetRealtimeLogConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRealtimeLogConfigResult]
  }
  
  @scala.inline
  implicit class GetRealtimeLogConfigResultMutableBuilder[Self <: GetRealtimeLogConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRealtimeLogConfig(value: RealtimeLogConfig): Self = StObject.set(x, "RealtimeLogConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtimeLogConfigUndefined: Self = StObject.set(x, "RealtimeLogConfig", js.undefined)
  }
}
