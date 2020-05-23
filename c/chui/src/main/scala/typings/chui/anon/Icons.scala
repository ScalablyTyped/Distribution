package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icons extends js.Object {
  var icons: js.UndefOr[js.Array[String]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var labels: js.Array[String]
  var selected: js.UndefOr[Double] = js.undefined
  var tabs: Double
}

object Icons {
  @scala.inline
  def apply(
    labels: js.Array[String],
    tabs: Double,
    icons: js.Array[String] = null,
    id: String = null,
    selected: js.UndefOr[Double] = js.undefined
  ): Icons = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icons]
  }
}

