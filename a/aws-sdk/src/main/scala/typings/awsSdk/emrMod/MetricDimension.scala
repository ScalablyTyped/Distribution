package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricDimension extends js.Object {
  /**
    * The dimension name.
    */
  var Key: js.UndefOr[String] = js.native
  /**
    * The dimension value.
    */
  var Value: js.UndefOr[String] = js.native
}

object MetricDimension {
  @scala.inline
  def apply(Key: String = null, Value: String = null): MetricDimension = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDimension]
  }
}

