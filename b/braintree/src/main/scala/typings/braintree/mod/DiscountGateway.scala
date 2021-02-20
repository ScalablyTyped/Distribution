package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscountGateway extends StObject {
  
  def all(): js.Promise[js.Array[Discount]] = js.native
}
object DiscountGateway {
  
  @scala.inline
  def apply(all: () => js.Promise[js.Array[Discount]]): DiscountGateway = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all))
    __obj.asInstanceOf[DiscountGateway]
  }
  
  @scala.inline
  implicit class DiscountGatewayMutableBuilder[Self <: DiscountGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: () => js.Promise[js.Array[Discount]]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
  }
}
