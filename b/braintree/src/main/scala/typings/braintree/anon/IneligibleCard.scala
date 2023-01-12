package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IneligibleCard extends StObject {
  
  var IneligibleCard: String
  
  var InsufficientPoints: String
  
  var Success: String
}
object IneligibleCard {
  
  inline def apply(IneligibleCard: String, InsufficientPoints: String, Success: String): IneligibleCard = {
    val __obj = js.Dynamic.literal(IneligibleCard = IneligibleCard.asInstanceOf[js.Any], InsufficientPoints = InsufficientPoints.asInstanceOf[js.Any], Success = Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IneligibleCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IneligibleCard] (val x: Self) extends AnyVal {
    
    inline def setIneligibleCard(value: String): Self = StObject.set(x, "IneligibleCard", value.asInstanceOf[js.Any])
    
    inline def setInsufficientPoints(value: String): Self = StObject.set(x, "InsufficientPoints", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: String): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
  }
}
