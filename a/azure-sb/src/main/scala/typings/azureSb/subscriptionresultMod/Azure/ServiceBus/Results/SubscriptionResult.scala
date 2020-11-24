package typings.azureSb.subscriptionresultMod.Azure.ServiceBus.Results

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionResult extends js.Object {
  
  def parse(xml: js.Object): js.Object | js.Array[js.Object] = js.native
  
  def serialize(resource: SubscriptionProperties): String = js.native
}
object SubscriptionResult {
  
  @scala.inline
  def apply(parse: js.Object => js.Object | js.Array[js.Object], serialize: SubscriptionProperties => String): SubscriptionResult = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[SubscriptionResult]
  }
  
  @scala.inline
  implicit class SubscriptionResultOps[Self <: SubscriptionResult] (val x: Self) extends AnyVal {
    
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
    def setParse(value: js.Object => js.Object | js.Array[js.Object]): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSerialize(value: SubscriptionProperties => String): Self = this.set("serialize", js.Any.fromFunction1(value))
  }
}
