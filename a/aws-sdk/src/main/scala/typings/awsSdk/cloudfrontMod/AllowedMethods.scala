package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowedMethods extends js.Object {
  
  var CachedMethods: js.UndefOr[typings.awsSdk.cloudfrontMod.CachedMethods] = js.native
  
  /**
    * A complex type that contains the HTTP methods that you want CloudFront to process and forward to your origin.
    */
  var Items: MethodsList = js.native
  
  /**
    * The number of HTTP methods that you want CloudFront to forward to your origin. Valid values are 2 (for GET and HEAD requests), 3 (for GET, HEAD, and OPTIONS requests) and 7 (for GET, HEAD, OPTIONS, PUT, PATCH, POST, and DELETE requests).
    */
  var Quantity: integer = js.native
}
object AllowedMethods {
  
  @scala.inline
  def apply(Items: MethodsList, Quantity: integer): AllowedMethods = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedMethods]
  }
  
  @scala.inline
  implicit class AllowedMethodsOps[Self <: AllowedMethods] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setCachedMethods(value: CachedMethods): Self = this.set("CachedMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachedMethods: Self = this.set("CachedMethods", js.undefined)
  }
}
