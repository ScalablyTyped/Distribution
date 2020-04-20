package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReceiptFilterRequest extends js.Object {
  /**
    * The name of the IP address filter to delete.
    */
  var FilterName: ReceiptFilterName = js.native
}

object DeleteReceiptFilterRequest {
  @scala.inline
  def apply(FilterName: ReceiptFilterName): DeleteReceiptFilterRequest = {
    val __obj = js.Dynamic.literal(FilterName = FilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReceiptFilterRequest]
  }
}

