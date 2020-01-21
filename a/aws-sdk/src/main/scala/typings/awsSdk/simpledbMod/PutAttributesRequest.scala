package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAttributesRequest extends js.Object {
  /**
    * The list of attributes.
    */
  var Attributes: ReplaceableAttributeList = js.native
  /**
    * The name of the domain in which to perform the operation.
    */
  var DomainName: String = js.native
  /**
    * The update condition which, if specified, determines whether the specified attributes will be updated or not. The update condition must be satisfied in order for this request to be processed and the attributes to be updated.
    */
  var Expected: js.UndefOr[UpdateCondition] = js.native
  /**
    * The name of the item.
    */
  var ItemName: String = js.native
}

object PutAttributesRequest {
  @scala.inline
  def apply(
    Attributes: ReplaceableAttributeList,
    DomainName: String,
    ItemName: String,
    Expected: UpdateCondition = null
  ): PutAttributesRequest = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], ItemName = ItemName.asInstanceOf[js.Any])
    if (Expected != null) __obj.updateDynamic("Expected")(Expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAttributesRequest]
  }
}

