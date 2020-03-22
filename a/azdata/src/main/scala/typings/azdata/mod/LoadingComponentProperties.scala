package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingComponentProperties extends js.Object {
  var loading: js.UndefOr[Boolean] = js.undefined
  var loadingCompletedText: js.UndefOr[String] = js.undefined
  var loadingText: js.UndefOr[String] = js.undefined
  var showText: js.UndefOr[Boolean] = js.undefined
}

object LoadingComponentProperties {
  @scala.inline
  def apply(
    loading: js.UndefOr[Boolean] = js.undefined,
    loadingCompletedText: String = null,
    loadingText: String = null,
    showText: js.UndefOr[Boolean] = js.undefined
  ): LoadingComponentProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (loadingCompletedText != null) __obj.updateDynamic("loadingCompletedText")(loadingCompletedText.asInstanceOf[js.Any])
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    if (!js.isUndefined(showText)) __obj.updateDynamic("showText")(showText.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingComponentProperties]
  }
}

