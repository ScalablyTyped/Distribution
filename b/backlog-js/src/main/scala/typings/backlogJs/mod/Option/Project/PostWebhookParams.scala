package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostWebhookParams extends js.Object {
  var activityTypeIds: js.UndefOr[js.Array[Double]] = js.undefined
  var allEvent: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var hookUrl: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object PostWebhookParams {
  @scala.inline
  def apply(
    activityTypeIds: js.Array[Double] = null,
    allEvent: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    hookUrl: String = null,
    name: String = null
  ): PostWebhookParams = {
    val __obj = js.Dynamic.literal()
    if (activityTypeIds != null) __obj.updateDynamic("activityTypeIds")(activityTypeIds.asInstanceOf[js.Any])
    if (!js.isUndefined(allEvent)) __obj.updateDynamic("allEvent")(allEvent.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (hookUrl != null) __obj.updateDynamic("hookUrl")(hookUrl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostWebhookParams]
  }
}

