package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRealtimeLogConfigsResult extends js.Object {
  
  /**
    * A list of real-time log configurations.
    */
  var RealtimeLogConfigs: js.UndefOr[typings.awsSdk.cloudfrontMod.RealtimeLogConfigs] = js.native
}
object ListRealtimeLogConfigsResult {
  
  @scala.inline
  def apply(): ListRealtimeLogConfigsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRealtimeLogConfigsResult]
  }
  
  @scala.inline
  implicit class ListRealtimeLogConfigsResultOps[Self <: ListRealtimeLogConfigsResult] (val x: Self) extends AnyVal {
    
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
    def setRealtimeLogConfigs(value: RealtimeLogConfigs): Self = this.set("RealtimeLogConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealtimeLogConfigs: Self = this.set("RealtimeLogConfigs", js.undefined)
  }
}
