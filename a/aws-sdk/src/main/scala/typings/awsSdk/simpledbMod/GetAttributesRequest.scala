package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAttributesRequest extends js.Object {
  /**
    * The names of the attributes.
    */
  var AttributeNames: js.UndefOr[AttributeNameList] = js.native
  /**
    * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If true, any data previously written to SimpleDB will be returned. Otherwise, results will be consistent eventually, and the client may not see data that was written immediately before your read.
    */
  var ConsistentRead: js.UndefOr[Boolean] = js.native
  /**
    * The name of the domain in which to perform the operation.
    */
  var DomainName: String = js.native
  /**
    * The name of the item.
    */
  var ItemName: String = js.native
}

object GetAttributesRequest {
  @scala.inline
  def apply(
    DomainName: String,
    ItemName: String,
    AttributeNames: AttributeNameList = null,
    ConsistentRead: js.UndefOr[Boolean] = js.undefined
  ): GetAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ItemName = ItemName.asInstanceOf[js.Any])
    if (AttributeNames != null) __obj.updateDynamic("AttributeNames")(AttributeNames.asInstanceOf[js.Any])
    if (!js.isUndefined(ConsistentRead)) __obj.updateDynamic("ConsistentRead")(ConsistentRead.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttributesRequest]
  }
}

