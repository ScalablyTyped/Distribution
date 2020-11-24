package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRealtimeLogConfigResult extends js.Object {
  
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
  implicit class CreateRealtimeLogConfigResultOps[Self <: CreateRealtimeLogConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRealtimeLogConfig(value: RealtimeLogConfig): Self = this.set("RealtimeLogConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealtimeLogConfig: Self = this.set("RealtimeLogConfig", js.undefined)
  }
}
