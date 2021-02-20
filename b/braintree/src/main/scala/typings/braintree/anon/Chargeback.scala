package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chargeback extends StObject {
  
  var Chargeback: String = js.native
}
object Chargeback {
  
  @scala.inline
  def apply(Chargeback: String): Chargeback = {
    val __obj = js.Dynamic.literal(Chargeback = Chargeback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chargeback]
  }
  
  @scala.inline
  implicit class ChargebackMutableBuilder[Self <: Chargeback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChargeback(value: String): Self = StObject.set(x, "Chargeback", value.asInstanceOf[js.Any])
  }
}
