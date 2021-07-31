package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gateways
  */
trait AddOnGateway extends StObject {
  
  def all(): js.Promise[js.Array[AddOn]]
}
object AddOnGateway {
  
  @scala.inline
  def apply(all: () => js.Promise[js.Array[AddOn]]): AddOnGateway = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all))
    __obj.asInstanceOf[AddOnGateway]
  }
  
  @scala.inline
  implicit class AddOnGatewayMutableBuilder[Self <: AddOnGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: () => js.Promise[js.Array[AddOn]]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
  }
}
