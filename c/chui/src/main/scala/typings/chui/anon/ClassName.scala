package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  var selected: js.UndefOr[Double] = js.undefined
}

object ClassName {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    labels: js.Array[String] = null,
    selected: js.UndefOr[Double] = js.undefined
  ): ClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
}

