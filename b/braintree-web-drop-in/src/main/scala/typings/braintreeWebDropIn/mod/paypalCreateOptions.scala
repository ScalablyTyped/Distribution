package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.PartialButtonStyle
import typings.braintreeWebDropIn.braintreeWebDropInStrings.checkout
import typings.braintreeWebDropIn.braintreeWebDropInStrings.vault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait paypalCreateOptions extends StObject {
  
  var amount: js.UndefOr[String | Double] = js.undefined
  
  var buttonStyle: js.UndefOr[PartialButtonStyle] = js.undefined
  
  var commit: js.UndefOr[Boolean] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var flow: checkout | vault
}
object paypalCreateOptions {
  
  inline def apply(flow: checkout | vault): paypalCreateOptions = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[paypalCreateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: paypalCreateOptions] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String | Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setButtonStyle(value: PartialButtonStyle): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
    
    inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
    
    inline def setCommit(value: Boolean): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setFlow(value: checkout | vault): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
  }
}
