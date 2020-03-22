package typings.cathoQuantum.dropdownMod

import typings.cathoQuantum.AnonBaseFontSize
import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownProps extends js.Object {
  var autocomplete: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var helperText: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var ignoreSpecialChars: js.UndefOr[Boolean] = js.undefined
  var items: js.UndefOr[js.Array[ItemPropType]] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  /** More about stateAndHelpers parameter here https://github.com/downshift-js/downshift#children-function */
  var onChange: js.UndefOr[
    js.Function2[
      /* selectedItem */ js.UndefOr[ElementType[_] | Null], 
      /* stateAndHelpers */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var selectedItem: js.UndefOr[ItemPropType] = js.undefined
  var theme: js.UndefOr[AnonBaseFontSize] = js.undefined
}

object DropdownProps {
  @scala.inline
  def apply(
    autocomplete: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    helperText: String = null,
    id: String = null,
    ignoreSpecialChars: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[ItemPropType] = null,
    label: String = null,
    onChange: (/* selectedItem */ js.UndefOr[ElementType[_] | Null], /* stateAndHelpers */ js.UndefOr[js.Any]) => Unit = null,
    placeholder: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    selectedItem: ItemPropType = null,
    theme: AnonBaseFontSize = null
  ): DropdownProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autocomplete)) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSpecialChars)) __obj.updateDynamic("ignoreSpecialChars")(ignoreSpecialChars.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownProps]
  }
}

