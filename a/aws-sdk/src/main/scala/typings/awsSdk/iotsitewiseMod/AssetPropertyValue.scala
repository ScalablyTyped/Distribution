package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetPropertyValue extends js.Object {
  /**
    * The quality of the asset property value.
    */
  var quality: js.UndefOr[Quality] = js.native
  /**
    * The timestamp of the asset property value.
    */
  var timestamp: TimeInNanos = js.native
  /**
    * The value of the asset property (see Variant).
    */
  var value: Variant = js.native
}

object AssetPropertyValue {
  @scala.inline
  def apply(timestamp: TimeInNanos, value: Variant, quality: Quality = null): AssetPropertyValue = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPropertyValue]
  }
}

