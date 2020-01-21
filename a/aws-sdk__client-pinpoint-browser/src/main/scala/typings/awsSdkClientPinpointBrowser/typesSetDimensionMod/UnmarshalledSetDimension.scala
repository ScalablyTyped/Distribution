package typings.awsSdkClientPinpointBrowser.typesSetDimensionMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.EXCLUSIVE
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INCLUSIVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSetDimension extends SetDimension {
  /**
    * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
    */
  @JSName("Values")
  var Values_UnmarshalledSetDimension: js.UndefOr[js.Array[String]] = js.undefined
}

object UnmarshalledSetDimension {
  @scala.inline
  def apply(DimensionType: INCLUSIVE | EXCLUSIVE | String = null, Values: js.Array[String] = null): UnmarshalledSetDimension = {
    val __obj = js.Dynamic.literal()
    if (DimensionType != null) __obj.updateDynamic("DimensionType")(DimensionType.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSetDimension]
  }
}

