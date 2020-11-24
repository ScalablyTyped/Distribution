package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAcceleratorResponse extends js.Object {
  
  /**
    * Information about the updated accelerator.
    */
  var Accelerator: js.UndefOr[typings.awsSdk.globalacceleratorMod.Accelerator] = js.native
}
object UpdateAcceleratorResponse {
  
  @scala.inline
  def apply(): UpdateAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAcceleratorResponse]
  }
  
  @scala.inline
  implicit class UpdateAcceleratorResponseOps[Self <: UpdateAcceleratorResponse] (val x: Self) extends AnyVal {
    
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
    def setAccelerator(value: Accelerator): Self = this.set("Accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccelerator: Self = this.set("Accelerator", js.undefined)
  }
}
