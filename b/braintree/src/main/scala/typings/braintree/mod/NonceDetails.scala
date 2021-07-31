package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonceDetails extends StObject {
  
  var bin: js.UndefOr[String] = js.undefined
  
  var cardType: js.UndefOr[String] = js.undefined
  
  var lastTwo: js.UndefOr[String] = js.undefined
}
object NonceDetails {
  
  @scala.inline
  def apply(): NonceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonceDetails]
  }
  
  @scala.inline
  implicit class NonceDetailsMutableBuilder[Self <: NonceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
    
    @scala.inline
    def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardTypeUndefined: Self = StObject.set(x, "cardType", js.undefined)
    
    @scala.inline
    def setLastTwo(value: String): Self = StObject.set(x, "lastTwo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTwoUndefined: Self = StObject.set(x, "lastTwo", js.undefined)
  }
}
