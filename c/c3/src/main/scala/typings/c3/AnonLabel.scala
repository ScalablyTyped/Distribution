package typings.c3

import typings.c3.mod.ExpandOptions
import typings.c3.mod.LabelOptionsWithThreshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
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

object AnonLabel {
  @scala.inline
  def apply(
    expand: ExpandOptions = null,
    label: LabelOptionsWithThreshold = null,
    title: String = null,
    width: Int | Double = null
  ): AnonLabel = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

