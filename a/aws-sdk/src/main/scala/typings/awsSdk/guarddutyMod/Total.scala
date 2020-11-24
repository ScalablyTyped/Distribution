package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Total extends js.Object {
  
  /**
    * The total usage.
    */
  var Amount: js.UndefOr[String] = js.native
  
  /**
    * The currency unit that the amount is given in.
    */
  var Unit: js.UndefOr[String] = js.native
}
object Total {
  
  @scala.inline
  def apply(): Total = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Total]
  }
  
  @scala.inline
  implicit class TotalOps[Self <: Total] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: String): Self = this.set("Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("Amount", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = this.set("Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("Unit", js.undefined)
  }
}
