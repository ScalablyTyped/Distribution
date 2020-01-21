package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteAttributesRequest extends js.Object {
  /**
    * The name of the domain in which the attributes are being deleted.
    */
  var DomainName: String = js.native
  /**
    * A list of items on which to perform the operation.
    */
  var Items: DeletableItemList = js.native
}

object BatchDeleteAttributesRequest {
  @scala.inline
  def apply(DomainName: String, Items: DeletableItemList): BatchDeleteAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchDeleteAttributesRequest]
  }
}

