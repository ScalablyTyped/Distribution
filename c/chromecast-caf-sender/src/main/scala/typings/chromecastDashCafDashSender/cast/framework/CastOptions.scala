package typings.chromecastDashCafDashSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CastOptions extends js.Object {
  var autoJoinPolicy: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify chrome.cast.AutoJoinPolicy */ js.Any
  var language: js.UndefOr[String] = js.undefined
  var receiverApplicationId: js.UndefOr[String] = js.undefined
  var resumeSavedSession: js.UndefOr[Boolean] = js.undefined
}

object CastOptions {
  @scala.inline
  def apply(
    autoJoinPolicy: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify chrome.cast.AutoJoinPolicy */ js.Any,
    language: String = null,
    receiverApplicationId: String = null,
    resumeSavedSession: js.UndefOr[Boolean] = js.undefined
  ): CastOptions = {
    val __obj = js.Dynamic.literal(autoJoinPolicy = autoJoinPolicy.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (receiverApplicationId != null) __obj.updateDynamic("receiverApplicationId")(receiverApplicationId.asInstanceOf[js.Any])
    if (!js.isUndefined(resumeSavedSession)) __obj.updateDynamic("resumeSavedSession")(resumeSavedSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastOptions]
  }
}

