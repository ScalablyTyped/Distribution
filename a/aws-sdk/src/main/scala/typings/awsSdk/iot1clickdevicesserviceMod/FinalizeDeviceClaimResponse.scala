package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinalizeDeviceClaimResponse extends js.Object {
  
  /**
    * The device's final claim state.
    */
  var State: js.UndefOr[string] = js.native
}
object FinalizeDeviceClaimResponse {
  
  @scala.inline
  def apply(): FinalizeDeviceClaimResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinalizeDeviceClaimResponse]
  }
  
  @scala.inline
  implicit class FinalizeDeviceClaimResponseOps[Self <: FinalizeDeviceClaimResponse] (val x: Self) extends AnyVal {
    
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
    def setState(value: string): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
