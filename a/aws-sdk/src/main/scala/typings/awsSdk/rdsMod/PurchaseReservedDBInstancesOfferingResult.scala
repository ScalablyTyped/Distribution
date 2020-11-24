package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseReservedDBInstancesOfferingResult extends js.Object {
  
  var ReservedDBInstance: js.UndefOr[typings.awsSdk.rdsMod.ReservedDBInstance] = js.native
}
object PurchaseReservedDBInstancesOfferingResult {
  
  @scala.inline
  def apply(): PurchaseReservedDBInstancesOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedDBInstancesOfferingResult]
  }
  
  @scala.inline
  implicit class PurchaseReservedDBInstancesOfferingResultOps[Self <: PurchaseReservedDBInstancesOfferingResult] (val x: Self) extends AnyVal {
    
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
    def setReservedDBInstance(value: ReservedDBInstance): Self = this.set("ReservedDBInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedDBInstance: Self = this.set("ReservedDBInstance", js.undefined)
  }
}
