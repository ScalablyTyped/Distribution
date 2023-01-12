package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmexPayWithPoints extends StObject {
  
  var AmexPayWithPoints: IneligibleCard
  
  var CardTypeIndicators: Debit
  
  var Dispute: Chargeback
}
object AmexPayWithPoints {
  
  inline def apply(AmexPayWithPoints: IneligibleCard, CardTypeIndicators: Debit, Dispute: Chargeback): AmexPayWithPoints = {
    val __obj = js.Dynamic.literal(AmexPayWithPoints = AmexPayWithPoints.asInstanceOf[js.Any], CardTypeIndicators = CardTypeIndicators.asInstanceOf[js.Any], Dispute = Dispute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmexPayWithPoints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmexPayWithPoints] (val x: Self) extends AnyVal {
    
    inline def setAmexPayWithPoints(value: IneligibleCard): Self = StObject.set(x, "AmexPayWithPoints", value.asInstanceOf[js.Any])
    
    inline def setCardTypeIndicators(value: Debit): Self = StObject.set(x, "CardTypeIndicators", value.asInstanceOf[js.Any])
    
    inline def setDispute(value: Chargeback): Self = StObject.set(x, "Dispute", value.asInstanceOf[js.Any])
  }
}
