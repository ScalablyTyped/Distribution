package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenewOfferingResult extends js.Object {
  
  /**
    * Represents the status of the offering transaction for the renewal.
    */
  var offeringTransaction: js.UndefOr[OfferingTransaction] = js.native
}
object RenewOfferingResult {
  
  @scala.inline
  def apply(): RenewOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenewOfferingResult]
  }
  
  @scala.inline
  implicit class RenewOfferingResultOps[Self <: RenewOfferingResult] (val x: Self) extends AnyVal {
    
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
    def setOfferingTransaction(value: OfferingTransaction): Self = this.set("offeringTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingTransaction: Self = this.set("offeringTransaction", js.undefined)
  }
}
