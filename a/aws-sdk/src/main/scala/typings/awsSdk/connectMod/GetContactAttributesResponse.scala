package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContactAttributesResponse extends js.Object {
  /**
    * Information about the attributes.
    */
  var Attributes: js.UndefOr[typings.awsSdk.connectMod.Attributes] = js.native
}

object GetContactAttributesResponse {
  @scala.inline
  def apply(Attributes: Attributes = null): GetContactAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactAttributesResponse]
  }
}

