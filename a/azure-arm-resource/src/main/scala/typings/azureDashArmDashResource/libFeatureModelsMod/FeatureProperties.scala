package typings.azureDashArmDashResource.libFeatureModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureProperties extends js.Object {
  /**
    * The registration state of the feature for the subscription.
    */
  var state: js.UndefOr[String] = js.undefined
}

object FeatureProperties {
  @scala.inline
  def apply(state: String = null): FeatureProperties = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureProperties]
  }
}

