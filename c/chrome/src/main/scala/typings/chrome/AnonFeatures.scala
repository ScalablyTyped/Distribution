package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFeatures extends js.Object {
  var features: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonFeatures {
  @scala.inline
  def apply(features: js.Array[String] = null): AnonFeatures = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeatures]
  }
}

