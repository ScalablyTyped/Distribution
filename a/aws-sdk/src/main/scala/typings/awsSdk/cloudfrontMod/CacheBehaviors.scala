package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheBehaviors extends js.Object {
  /**
    * Optional: A complex type that contains cache behaviors for this distribution. If Quantity is 0, you can omit Items.
    */
  var Items: js.UndefOr[CacheBehaviorList] = js.native
  /**
    * The number of cache behaviors for this distribution. 
    */
  var Quantity: integer = js.native
}

object CacheBehaviors {
  @scala.inline
  def apply(Quantity: integer): CacheBehaviors = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheBehaviors]
  }
  @scala.inline
  implicit class CacheBehaviorsOps[Self <: CacheBehaviors] (val x: Self) extends AnyVal {
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
    def setQuantity(value: integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: CacheBehavior*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: CacheBehaviorList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
  }
  
}

