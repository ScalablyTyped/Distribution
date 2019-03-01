package typings
package chuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Icons extends js.Object {
  var icons: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var labels: js.Array[java.lang.String]
  var selected: js.UndefOr[scala.Double] = js.undefined
  var tabs: scala.Double
}

object Anon_Icons {
  @scala.inline
  def apply(
    labels: js.Array[java.lang.String],
    tabs: scala.Double,
    icons: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    selected: scala.Int | scala.Double = null
  ): Anon_Icons = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("tabs")(tabs)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (id != null) __obj.updateDynamic("id")(id)
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Icons]
  }
}

