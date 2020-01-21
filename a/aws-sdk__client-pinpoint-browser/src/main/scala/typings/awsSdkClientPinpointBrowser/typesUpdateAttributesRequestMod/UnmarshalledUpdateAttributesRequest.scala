package typings.awsSdkClientPinpointBrowser.typesUpdateAttributesRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledUpdateAttributesRequest extends UpdateAttributesRequest {
  /**
    * The GLOB wildcard for removing the attributes in the application
    */
  @JSName("Blacklist")
  var Blacklist_UnmarshalledUpdateAttributesRequest: js.UndefOr[js.Array[String]] = js.undefined
}

object UnmarshalledUpdateAttributesRequest {
  @scala.inline
  def apply(Blacklist: js.Array[String] = null): UnmarshalledUpdateAttributesRequest = {
    val __obj = js.Dynamic.literal()
    if (Blacklist != null) __obj.updateDynamic("Blacklist")(Blacklist.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledUpdateAttributesRequest]
  }
}

