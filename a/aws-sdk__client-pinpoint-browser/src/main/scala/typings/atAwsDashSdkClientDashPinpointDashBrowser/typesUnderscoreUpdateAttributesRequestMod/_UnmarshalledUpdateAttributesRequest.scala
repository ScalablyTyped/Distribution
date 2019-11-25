package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreUpdateAttributesRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledUpdateAttributesRequest extends _UpdateAttributesRequest {
  /**
    * The GLOB wildcard for removing the attributes in the application
    */
  @JSName("Blacklist")
  var Blacklist__UnmarshalledUpdateAttributesRequest: js.UndefOr[js.Array[String]] = js.undefined
}

object _UnmarshalledUpdateAttributesRequest {
  @scala.inline
  def apply(Blacklist: js.Array[String] = null): _UnmarshalledUpdateAttributesRequest = {
    val __obj = js.Dynamic.literal()
    if (Blacklist != null) __obj.updateDynamic("Blacklist")(Blacklist.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledUpdateAttributesRequest]
  }
}

