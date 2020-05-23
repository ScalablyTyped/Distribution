package typings.bootstrapMultiselect

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelectOptionElement extends js.Object {
  var attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var children: js.UndefOr[js.Array[MultiSelectOptionElement]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: String
  var selected: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object MultiSelectOptionElement {
  @scala.inline
  def apply(
    label: String,
    attributes: StringDictionary[js.Any] = null,
    children: js.Array[MultiSelectOptionElement] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    value: String | Double = null
  ): MultiSelectOptionElement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelectOptionElement]
  }
}

