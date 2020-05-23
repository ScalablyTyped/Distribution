package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features extends js.Object {
  var features: js.UndefOr[js.Array[String]] = js.undefined
}

object Features {
  @scala.inline
  def apply(features: js.Array[String] = null): Features = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
}

