package typings
package chromecastDashCafDashSenderLib.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CastOptions extends js.Object {
  var autoJoinPolicy: chromeLib.chromeNs.castNs.AutoJoinPolicy
  var language: js.UndefOr[java.lang.String] = js.undefined
  var receiverApplicationId: js.UndefOr[java.lang.String] = js.undefined
  var resumeSavedSession: js.UndefOr[scala.Boolean] = js.undefined
}

object CastOptions {
  @scala.inline
  def apply(
    autoJoinPolicy: chromeLib.chromeNs.castNs.AutoJoinPolicy,
    language: java.lang.String = null,
    receiverApplicationId: java.lang.String = null,
    resumeSavedSession: js.UndefOr[scala.Boolean] = js.undefined
  ): CastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoJoinPolicy")(autoJoinPolicy)
    if (language != null) __obj.updateDynamic("language")(language)
    if (receiverApplicationId != null) __obj.updateDynamic("receiverApplicationId")(receiverApplicationId)
    if (!js.isUndefined(resumeSavedSession)) __obj.updateDynamic("resumeSavedSession")(resumeSavedSession)
    __obj.asInstanceOf[CastOptions]
  }
}

