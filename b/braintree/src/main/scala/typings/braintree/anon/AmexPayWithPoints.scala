package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmexPayWithPoints extends StObject {
  
  var AmexPayWithPoints: IneligibleCard = js.native
  
  var CardTypeIndicators: Debit = js.native
  
  var Dispute: Chargeback = js.native
}
object AmexPayWithPoints {
  
  @scala.inline
  def apply(AmexPayWithPoints: IneligibleCard, CardTypeIndicators: Debit, Dispute: Chargeback): AmexPayWithPoints = {
    val __obj = js.Dynamic.literal(AmexPayWithPoints = AmexPayWithPoints.asInstanceOf[js.Any], CardTypeIndicators = CardTypeIndicators.asInstanceOf[js.Any], Dispute = Dispute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmexPayWithPoints]
  }
  
  @scala.inline
  implicit class AmexPayWithPointsMutableBuilder[Self <: AmexPayWithPoints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmexPayWithPoints(value: IneligibleCard): Self = StObject.set(x, "AmexPayWithPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardTypeIndicators(value: Debit): Self = StObject.set(x, "CardTypeIndicators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispute(value: Chargeback): Self = StObject.set(x, "Dispute", value.asInstanceOf[js.Any])
  }
}
