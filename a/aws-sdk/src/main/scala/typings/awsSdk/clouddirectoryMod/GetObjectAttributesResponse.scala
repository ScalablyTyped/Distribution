package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectAttributesResponse extends js.Object {
  /**
    * The attributes that are associated with the object.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.native
}

object GetObjectAttributesResponse {
  @scala.inline
  def apply(Attributes: AttributeKeyAndValueList = null): GetObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectAttributesResponse]
  }
}

