package typings.c3.anon

import typings.c3.mod.ExpandOptions
import typings.c3.mod.LabelOptionsWithThreshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expand extends js.Object {
  /**
    * Enable or disable expanding pie pieces.
    */
  var expand: js.UndefOr[ExpandOptions] = js.undefined
  var label: js.UndefOr[LabelOptionsWithThreshold] = js.undefined
}

object Expand {
  @scala.inline
  def apply(expand: ExpandOptions = null, label: LabelOptionsWithThreshold = null): Expand = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expand]
  }
}

