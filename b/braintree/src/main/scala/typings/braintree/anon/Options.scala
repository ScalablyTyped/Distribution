package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var amount: String = js.native
  
  var options: SubmitForSettlement = js.native
}
object Options {
  
  @scala.inline
  def apply(amount: String, options: SubmitForSettlement): Options = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: SubmitForSettlement): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
