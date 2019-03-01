package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.openUrl()
trait OpenUrlConfig extends js.Object {
  var darkenBackground: js.UndefOr[scala.Boolean] = js.undefined
  var exclusiveView: js.UndefOr[scala.Boolean] = js.undefined
  var fullSize: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
  var width: js.UndefOr[scala.Double] = js.undefined
}

object OpenUrlConfig {
  @scala.inline
  def apply(
    url: java.lang.String,
    darkenBackground: js.UndefOr[scala.Boolean] = js.undefined,
    exclusiveView: js.UndefOr[scala.Boolean] = js.undefined,
    fullSize: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): OpenUrlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (!js.isUndefined(darkenBackground)) __obj.updateDynamic("darkenBackground")(darkenBackground)
    if (!js.isUndefined(exclusiveView)) __obj.updateDynamic("exclusiveView")(exclusiveView)
    if (!js.isUndefined(fullSize)) __obj.updateDynamic("fullSize")(fullSize)
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenUrlConfig]
  }
}

