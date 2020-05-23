package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionValues extends js.Object {
  /**
    * The names of the metadata types that you can use to filter and group your results. For example, AZ returns a list of Availability Zones.
    */
  var Key: js.UndefOr[Dimension] = js.native
  /**
    * The match options that you can use to filter your results. MatchOptions is only applicable for actions related to Cost Category. The default values for MatchOptions is EQUALS and CASE_SENSITIVE.
    */
  var MatchOptions: js.UndefOr[typings.awsSdk.costexplorerMod.MatchOptions] = js.native
  /**
    * The metadata values that you can use to filter and group your results. You can use GetDimensionValues to find specific values.
    */
  var Values: js.UndefOr[typings.awsSdk.costexplorerMod.Values] = js.native
}

object DimensionValues {
  @scala.inline
  def apply(Key: Dimension = null, MatchOptions: MatchOptions = null, Values: Values = null): DimensionValues = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (MatchOptions != null) __obj.updateDynamic("MatchOptions")(MatchOptions.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionValues]
  }
}

