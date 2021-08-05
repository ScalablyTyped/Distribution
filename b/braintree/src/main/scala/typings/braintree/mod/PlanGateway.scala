package typings.braintree.mod

import typings.braintree.anon.Plans
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanGateway extends StObject {
  
  def all(): js.Promise[Plans]
}
object PlanGateway {
  
  inline def apply(all: () => js.Promise[Plans]): PlanGateway = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all))
    __obj.asInstanceOf[PlanGateway]
  }
  
  extension [Self <: PlanGateway](x: Self) {
    
    inline def setAll(value: () => js.Promise[Plans]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
  }
}
