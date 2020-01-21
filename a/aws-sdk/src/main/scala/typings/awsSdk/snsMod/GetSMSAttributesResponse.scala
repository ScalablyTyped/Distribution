package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSMSAttributesResponse extends js.Object {
  /**
    * The SMS attribute names and their values.
    */
  var attributes: js.UndefOr[MapStringToString] = js.native
}

object GetSMSAttributesResponse {
  @scala.inline
  def apply(attributes: MapStringToString = null): GetSMSAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSMSAttributesResponse]
  }
}

