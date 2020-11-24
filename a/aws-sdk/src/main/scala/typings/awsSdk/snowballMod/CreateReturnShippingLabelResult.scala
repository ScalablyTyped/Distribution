package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReturnShippingLabelResult extends js.Object {
  
  /**
    * The status information of the task on a Snow device that is being returned to AWS.
    */
  var Status: js.UndefOr[ShippingLabelStatus] = js.native
}
object CreateReturnShippingLabelResult {
  
  @scala.inline
  def apply(): CreateReturnShippingLabelResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReturnShippingLabelResult]
  }
  
  @scala.inline
  implicit class CreateReturnShippingLabelResultOps[Self <: CreateReturnShippingLabelResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStatus(value: ShippingLabelStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
