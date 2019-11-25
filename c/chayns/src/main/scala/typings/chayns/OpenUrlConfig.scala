package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.openUrl()
trait OpenUrlConfig extends js.Object {
  var darkenBackground: js.UndefOr[Boolean] = js.undefined
  var exclusiveView: js.UndefOr[Boolean] = js.undefined
  var fullSize: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: String
  var width: js.UndefOr[Double] = js.undefined
}

object OpenUrlConfig {
  @scala.inline
  def apply(
    url: String,
    darkenBackground: js.UndefOr[Boolean] = js.undefined,
    exclusiveView: js.UndefOr[Boolean] = js.undefined,
    fullSize: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    width: Int | Double = null
  ): OpenUrlConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(darkenBackground)) __obj.updateDynamic("darkenBackground")(darkenBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveView)) __obj.updateDynamic("exclusiveView")(exclusiveView.asInstanceOf[js.Any])
    if (!js.isUndefined(fullSize)) __obj.updateDynamic("fullSize")(fullSize.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenUrlConfig]
  }
}

