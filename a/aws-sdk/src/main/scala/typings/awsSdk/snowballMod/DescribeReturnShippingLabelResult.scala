package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReturnShippingLabelResult extends js.Object {
  
  /**
    * The expiration date of the current return shipping label.
    */
  var ExpirationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The status information of the task on a Snow device that is being returned to AWS.
    */
  var Status: js.UndefOr[ShippingLabelStatus] = js.native
}
object DescribeReturnShippingLabelResult {
  
  @scala.inline
  def apply(): DescribeReturnShippingLabelResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReturnShippingLabelResult]
  }
  
  @scala.inline
  implicit class DescribeReturnShippingLabelResultOps[Self <: DescribeReturnShippingLabelResult] (val x: Self) extends AnyVal {
    
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
    def setExpirationDate(value: Timestamp): Self = this.set("ExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDate: Self = this.set("ExpirationDate", js.undefined)
    
    @scala.inline
    def setStatus(value: ShippingLabelStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
