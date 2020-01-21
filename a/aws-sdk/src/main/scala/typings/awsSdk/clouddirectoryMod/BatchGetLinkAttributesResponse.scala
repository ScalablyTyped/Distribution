package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetLinkAttributesResponse extends js.Object {
  /**
    * The attributes that are associated with the typed link.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.native
}

object BatchGetLinkAttributesResponse {
  @scala.inline
  def apply(Attributes: AttributeKeyAndValueList = null): BatchGetLinkAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetLinkAttributesResponse]
  }
}

