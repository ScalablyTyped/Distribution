package typings
package chuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var labels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var selected: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ClassName {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    id: java.lang.String = null,
    labels: js.Array[java.lang.String] = null,
    selected: scala.Int | scala.Double = null
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassName]
  }
}

