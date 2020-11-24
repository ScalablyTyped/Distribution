package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USD extends js.Object {
  
  /**
    * The fractional portion, in cents, of the amount. 
    */
  var Cents: js.UndefOr[typings.awsSdk.sagemakerMod.Cents] = js.native
  
  /**
    * The whole number of dollars in the amount.
    */
  var Dollars: js.UndefOr[typings.awsSdk.sagemakerMod.Dollars] = js.native
  
  /**
    * Fractions of a cent, in tenths.
    */
  var TenthFractionsOfACent: js.UndefOr[typings.awsSdk.sagemakerMod.TenthFractionsOfACent] = js.native
}
object USD {
  
  @scala.inline
  def apply(): USD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[USD]
  }
  
  @scala.inline
  implicit class USDOps[Self <: USD] (val x: Self) extends AnyVal {
    
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
    def setCents(value: Cents): Self = this.set("Cents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCents: Self = this.set("Cents", js.undefined)
    
    @scala.inline
    def setDollars(value: Dollars): Self = this.set("Dollars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDollars: Self = this.set("Dollars", js.undefined)
    
    @scala.inline
    def setTenthFractionsOfACent(value: TenthFractionsOfACent): Self = this.set("TenthFractionsOfACent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenthFractionsOfACent: Self = this.set("TenthFractionsOfACent", js.undefined)
  }
}
