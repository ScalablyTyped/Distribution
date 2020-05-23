package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxProperties extends js.Object {
  var selectedRow: js.UndefOr[Double] = js.undefined
  var values: js.UndefOr[js.Array[String]] = js.undefined
}

object ListBoxProperties {
  @scala.inline
  def apply(selectedRow: js.UndefOr[Double] = js.undefined, values: js.Array[String] = null): ListBoxProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(selectedRow)) __obj.updateDynamic("selectedRow")(selectedRow.get.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBoxProperties]
  }
}

