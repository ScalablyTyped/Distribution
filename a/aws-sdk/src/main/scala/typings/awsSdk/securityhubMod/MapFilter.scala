package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapFilter extends js.Object {
  /**
    * The condition to apply to a key value when querying for findings with a map filter.
    */
  var Comparison: js.UndefOr[MapFilterComparison] = js.native
  /**
    * The key of the map filter.
    */
  var Key: js.UndefOr[NonEmptyString] = js.native
  /**
    * The value for the key in the map filter.
    */
  var Value: js.UndefOr[NonEmptyString] = js.native
}

object MapFilter {
  @scala.inline
  def apply(Comparison: MapFilterComparison = null, Key: NonEmptyString = null, Value: NonEmptyString = null): MapFilter = {
    val __obj = js.Dynamic.literal()
    if (Comparison != null) __obj.updateDynamic("Comparison")(Comparison.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapFilter]
  }
}

