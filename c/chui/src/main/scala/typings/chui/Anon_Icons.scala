package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Icons extends js.Object {
  var icons: js.UndefOr[js.Array[String]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var labels: js.Array[String]
  var selected: js.UndefOr[Double] = js.undefined
  var tabs: Double
}

object Anon_Icons {
  @scala.inline
  def apply(
    labels: js.Array[String],
    tabs: Double,
    icons: js.Array[String] = null,
    id: String = null,
    selected: Int | Double = null
  ): Anon_Icons = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Icons]
  }
}

