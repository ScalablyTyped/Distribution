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
}

