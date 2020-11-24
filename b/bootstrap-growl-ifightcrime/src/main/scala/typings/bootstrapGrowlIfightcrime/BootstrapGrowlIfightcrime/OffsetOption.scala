package typings.bootstrapGrowlIfightcrime.BootstrapGrowlIfightcrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffsetOption extends js.Object {
  
  /**
    * Offset amount
    */
  var amount: js.UndefOr[Double] = js.native
  
  /**
    * Position: top or bottom
    */
  var from: js.UndefOr[OffsetPositionType] = js.native
}
object OffsetOption {
  
  @scala.inline
  def apply(): OffsetOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetOption]
  }
  
  @scala.inline
  implicit class OffsetOptionOps[Self <: OffsetOption] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setFrom(value: OffsetPositionType): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
  }
}
