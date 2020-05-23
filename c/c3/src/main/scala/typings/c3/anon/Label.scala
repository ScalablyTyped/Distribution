package typings.c3.anon

import typings.c3.mod.ExpandOptions
import typings.c3.mod.LabelOptionsWithThreshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  /**
    * Enable or disable expanding pie pieces.
    */
  var expand: js.UndefOr[ExpandOptions] = js.undefined
  var label: js.UndefOr[LabelOptionsWithThreshold] = js.undefined
  /**
    * Set title of donut chart.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Set width of donut chart.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Label {
  @scala.inline
  def apply(
    expand: ExpandOptions = null,
    label: LabelOptionsWithThreshold = null,
    title: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): Label = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

