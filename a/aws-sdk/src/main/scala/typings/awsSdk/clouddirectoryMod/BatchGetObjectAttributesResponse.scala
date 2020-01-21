package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetObjectAttributesResponse extends js.Object {
  /**
    * The attribute values that are associated with an object.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.native
}

object BatchGetObjectAttributesResponse {
  @scala.inline
  def apply(Attributes: AttributeKeyAndValueList = null): BatchGetObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetObjectAttributesResponse]
  }
}

