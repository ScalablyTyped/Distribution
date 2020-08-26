package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachedMethods extends js.Object {
  /**
    * A complex type that contains the HTTP methods that you want CloudFront to cache responses to.
    */
  var Items: MethodsList = js.native
  /**
    * The number of HTTP methods for which you want CloudFront to cache responses. Valid values are 2 (for caching responses to GET and HEAD requests) and 3 (for caching responses to GET, HEAD, and OPTIONS requests).
    */
  var Quantity: integer = js.native
}

object CachedMethods {
  @scala.inline
  def apply(Items: MethodsList, Quantity: integer): CachedMethods = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedMethods]
  }
  @scala.inline
  implicit class CachedMethodsOps[Self <: CachedMethods] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Method*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: MethodsList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
  }
  
}

