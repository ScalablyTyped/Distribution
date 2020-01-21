package typings.awsSdkClientPinpointBrowser.typesAttributeDimensionMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.EXCLUSIVE
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INCLUSIVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledAttributeDimension extends AttributeDimension {
  /**
    * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
    */
  @JSName("Values")
  var Values_UnmarshalledAttributeDimension: js.UndefOr[js.Array[String]] = js.undefined
}

object UnmarshalledAttributeDimension {
  @scala.inline
  def apply(AttributeType: INCLUSIVE | EXCLUSIVE | String = null, Values: js.Array[String] = null): UnmarshalledAttributeDimension = {
    val __obj = js.Dynamic.literal()
    if (AttributeType != null) __obj.updateDynamic("AttributeType")(AttributeType.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAttributeDimension]
  }
}

