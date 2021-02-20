package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IneligibleCard extends StObject {
  
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
  implicit class IneligibleCardMutableBuilder[Self <: IneligibleCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIneligibleCard(value: String): Self = StObject.set(x, "IneligibleCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsufficientPoints(value: String): Self = StObject.set(x, "InsufficientPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: String): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
  }
}
