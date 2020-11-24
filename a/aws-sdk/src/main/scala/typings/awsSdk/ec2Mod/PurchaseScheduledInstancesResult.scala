package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseScheduledInstancesResult extends js.Object {
  
  /**
    * Information about the Scheduled Instances.
    */
  var ScheduledInstanceSet: js.UndefOr[PurchasedScheduledInstanceSet] = js.native
}
object PurchaseScheduledInstancesResult {
  
  @scala.inline
  def apply(): PurchaseScheduledInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseScheduledInstancesResult]
  }
  
  @scala.inline
  implicit class PurchaseScheduledInstancesResultOps[Self <: PurchaseScheduledInstancesResult] (val x: Self) extends AnyVal {
    
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
    def setScheduledInstanceSetVarargs(value: ScheduledInstance*): Self = this.set("ScheduledInstanceSet", js.Array(value :_*))
    
    @scala.inline
    def setScheduledInstanceSet(value: PurchasedScheduledInstanceSet): Self = this.set("ScheduledInstanceSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledInstanceSet: Self = this.set("ScheduledInstanceSet", js.undefined)
  }
}
