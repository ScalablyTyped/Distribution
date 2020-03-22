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
  def apply(selectedRow: Int | Double = null, values: js.Array[String] = null): ListBoxProperties = {
    val __obj = js.Dynamic.literal()
    if (selectedRow != null) __obj.updateDynamic("selectedRow")(selectedRow.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBoxProperties]
  }
}

