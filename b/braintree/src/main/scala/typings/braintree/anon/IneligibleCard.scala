package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IneligibleCard extends js.Object {
  
  var IneligibleCard: String = js.native
  
  var InsufficientPoints: String = js.native
  
  var Success: String = js.native
}
object IneligibleCard {
  
  @scala.inline
  def apply(IneligibleCard: String, InsufficientPoints: String, Success: String): IneligibleCard = {
    val __obj = js.Dynamic.literal(IneligibleCard = IneligibleCard.asInstanceOf[js.Any], InsufficientPoints = InsufficientPoints.asInstanceOf[js.Any], Success = Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IneligibleCard]
  }
  
  @scala.inline
  implicit class IneligibleCardOps[Self <: IneligibleCard] (val x: Self) extends AnyVal {
    
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
    def setIneligibleCard(value: String): Self = this.set("IneligibleCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsufficientPoints(value: String): Self = this.set("InsufficientPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: String): Self = this.set("Success", value.asInstanceOf[js.Any])
  }
}
