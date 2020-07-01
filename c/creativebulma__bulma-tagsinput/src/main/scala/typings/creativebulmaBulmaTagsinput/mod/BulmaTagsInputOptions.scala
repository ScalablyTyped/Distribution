package typings.creativebulmaBulmaTagsinput.mod

import typings.creativebulmaBulmaTagsinput.creativebulmaBulmaTagsinputStrings.text
import typings.creativebulmaBulmaTagsinput.creativebulmaBulmaTagsinputStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulmaTagsInputOptions extends js.Object {
  /**
    * When true, the same tag can be added multiple times.
    *
    * @default false
    */
  var allowDuplicates: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, duplicate tags value check is case sensitive.
    *
    * @default true
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, tags will be unselected when new tag is entered.
    *
    * @default false
    */
  var clearSelectionOnTyping: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, datalist will close automatically after an item have been selected.
    *
    * @default true
    */
  var closeDropdownOnItemSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * Multiple tags can be added at once. Delimiter is used to separate all tags.
    *
    * @default ",",
    */
  var delimiter: js.UndefOr[String] = js.undefined
  /**
    * When true, tags can be entered manually. This option is useful with select Tags inputs. Set
    * to false automatically when using on select element.
    *
    * @default true
    */
  var freeInput: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, if `allowDuplicates` option if false then the already existing tag will be
    * temporarly and visually identified as duplicate
    *
    * @default true
    */
  var highlightDuplicate: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, identified matches strings when searching is highlighted.
    *
    * @default true
    */
  var highlightMatchesString: js.UndefOr[Boolean] = js.undefined
  /**
    * When adding objects as tags, you can set itemText to the name of the property of item to use
    * for a its tag's text. When this options is not set, the value of _itemValue_ will be used.
    */
  var itemText: js.UndefOr[String] = js.undefined
  /**
    * When adding objects as tags, itemValue must be set to the name of the property containing the
    * item's value.
    */
  var itemValue: js.UndefOr[String] = js.undefined
  /**
    * Defines the maximum length of a single tag.
    */
  var maxChars: js.UndefOr[Double] = js.undefined
  /**
    * When set, no more than the given number of tags are allowed to add.
    */
  var maxTags: js.UndefOr[Double] = js.undefined
  /**
    * Defines the minimum length of a single tag.
    *
    * @default 1
    */
  var minChars: js.UndefOr[Double] = js.undefined
  /**
    * Empty dropdown label.
    *
    * @default "No results found"
    */
  var noResultsLabel: js.UndefOr[String] = js.undefined
  /**
    * TagsInput placeholder text if original input doesn't have one.
    *
    * @default undefined
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * When true, tags are removable either using the associted delete button or _backspace_ and
    * _delete_ keys.
    *
    * @default true
    */
  var removable: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines the minimum length of input value before loading auto-complete.
    *
    * @default 1
    */
  var searchMinChars: js.UndefOr[Double] = js.undefined
  /**
    * Defines on what dropdown item data do we search the entered value.
    *
    * @default "text"
    */
  var searchOn: js.UndefOr[value | text] = js.undefined
  /**
    * When true, tags can be selected either by mouse click or using _left_ or _right_ arrow keys.
    *
    * @default true
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
  /**
    * Source of data proposed in dropdown (used for auto-complete).
    *
    * @default undefined
    */
  var source: js.UndefOr[
    (js.Array[String | BulmaTagsInputItem]) | (js.Function0[js.Array[String | BulmaTagsInputItem]]) | (js.Promise[js.Array[String | BulmaTagsInputItem]])
  ] = js.undefined
  /**
    * Classname applied to each tag.
    *
    * @default "is-rounded"
    */
  var tagClass: js.UndefOr[String] = js.undefined
  /**
    * When true, automatically removes all whitespace around tags.
    *
    * @default true
    */
  var trim: js.UndefOr[Boolean] = js.undefined
}

object BulmaTagsInputOptions {
  @scala.inline
  def apply(
    allowDuplicates: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    clearSelectionOnTyping: js.UndefOr[Boolean] = js.undefined,
    closeDropdownOnItemSelect: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null,
    freeInput: js.UndefOr[Boolean] = js.undefined,
    highlightDuplicate: js.UndefOr[Boolean] = js.undefined,
    highlightMatchesString: js.UndefOr[Boolean] = js.undefined,
    itemText: String = null,
    itemValue: String = null,
    maxChars: js.UndefOr[Double] = js.undefined,
    maxTags: js.UndefOr[Double] = js.undefined,
    minChars: js.UndefOr[Double] = js.undefined,
    noResultsLabel: String = null,
    placeholder: String = null,
    removable: js.UndefOr[Boolean] = js.undefined,
    searchMinChars: js.UndefOr[Double] = js.undefined,
    searchOn: value | text = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    source: (js.Array[String | BulmaTagsInputItem]) | (js.Function0[js.Array[String | BulmaTagsInputItem]]) | (js.Promise[js.Array[String | BulmaTagsInputItem]]) = null,
    tagClass: String = null,
    trim: js.UndefOr[Boolean] = js.undefined
  ): BulmaTagsInputOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDuplicates)) __obj.updateDynamic("allowDuplicates")(allowDuplicates.get.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clearSelectionOnTyping)) __obj.updateDynamic("clearSelectionOnTyping")(clearSelectionOnTyping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeDropdownOnItemSelect)) __obj.updateDynamic("closeDropdownOnItemSelect")(closeDropdownOnItemSelect.get.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(freeInput)) __obj.updateDynamic("freeInput")(freeInput.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightDuplicate)) __obj.updateDynamic("highlightDuplicate")(highlightDuplicate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightMatchesString)) __obj.updateDynamic("highlightMatchesString")(highlightMatchesString.get.asInstanceOf[js.Any])
    if (itemText != null) __obj.updateDynamic("itemText")(itemText.asInstanceOf[js.Any])
    if (itemValue != null) __obj.updateDynamic("itemValue")(itemValue.asInstanceOf[js.Any])
    if (!js.isUndefined(maxChars)) __obj.updateDynamic("maxChars")(maxChars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTags)) __obj.updateDynamic("maxTags")(maxTags.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minChars)) __obj.updateDynamic("minChars")(minChars.get.asInstanceOf[js.Any])
    if (noResultsLabel != null) __obj.updateDynamic("noResultsLabel")(noResultsLabel.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(removable)) __obj.updateDynamic("removable")(removable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(searchMinChars)) __obj.updateDynamic("searchMinChars")(searchMinChars.get.asInstanceOf[js.Any])
    if (searchOn != null) __obj.updateDynamic("searchOn")(searchOn.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (tagClass != null) __obj.updateDynamic("tagClass")(tagClass.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulmaTagsInputOptions]
  }
}

