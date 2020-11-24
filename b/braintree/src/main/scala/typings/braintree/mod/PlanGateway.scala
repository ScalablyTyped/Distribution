package typings.braintree.mod

import typings.braintree.anon.Plans
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlanGateway extends js.Object {
  
  def all(): js.Promise[Plans] = js.native
}
object PlanGateway {
  
  @scala.inline
  def apply(all: () => js.Promise[Plans]): PlanGateway = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all))
    __obj.asInstanceOf[PlanGateway]
  }
  
  @scala.inline
  implicit class PlanGatewayOps[Self <: PlanGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAll(value: () => js.Promise[Plans]): Self = this.set("all", js.Any.fromFunction0(value))
  }
}
