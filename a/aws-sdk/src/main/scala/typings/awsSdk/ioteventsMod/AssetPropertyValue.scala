package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetPropertyValue extends js.Object {
  /**
    * The quality of the asset property value. The value must be GOOD, BAD, or UNCERTAIN. You can also specify an expression.
    */
  var quality: js.UndefOr[AssetPropertyQuality] = js.native
  /**
    * The timestamp associated with the asset property value. The default is the current event time.
    */
  var timestamp: js.UndefOr[AssetPropertyTimestamp] = js.native
  /**
    * The value to send to an asset property.
    */
  var value: AssetPropertyVariant = js.native
}

object AssetPropertyValue {
  @scala.inline
  def apply(
    value: AssetPropertyVariant,
    quality: AssetPropertyQuality = null,
    timestamp: AssetPropertyTimestamp = null
  ): AssetPropertyValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPropertyValue]
  }
}

