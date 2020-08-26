package typings.creativebulmaBulmaTagsinput.mod

import typings.creativebulmaBulmaTagsinput.creativebulmaBulmaTagsinputStrings.text
import typings.creativebulmaBulmaTagsinput.creativebulmaBulmaTagsinputStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulmaTagsInputOptions extends js.Object {
  /**
    * When true, the same tag can be added multiple times.
    *
    * @default false
    */
  var allowDuplicates: js.UndefOr[Boolean] = js.native
  /**
    * When true, duplicate tags value check is case sensitive.
    *
    * @default true
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * When true, tags will be unselected when new tag is entered.
    *
    * @default false
    */
  var clearSelectionOnTyping: js.UndefOr[Boolean] = js.native
  /**
    * When true, datalist will close automatically after an item have been selected.
    *
    * @default true
    */
  var closeDropdownOnItemSelect: js.UndefOr[Boolean] = js.native
  /**
    * Multiple tags can be added at once. Delimiter is used to separate all tags.
    *
    * @default ",",
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * When true, tags can be entered manually. This option is useful with select Tags inputs. Set
    * to false automatically when using on select element.
    *
    * @default true
    */
  var freeInput: js.UndefOr[Boolean] = js.native
  /**
    * When true, if `allowDuplicates` option if false then the already existing tag will be
    * temporarly and visually identified as duplicate
    *
    * @default true
    */
  var highlightDuplicate: js.UndefOr[Boolean] = js.native
  /**
    * When true, identified matches strings when searching is highlighted.
    *
    * @default true
    */
  var highlightMatchesString: js.UndefOr[Boolean] = js.native
  /**
    * When adding objects as tags, you can set itemText to the name of the property of item to use
    * for a its tag's text. When this options is not set, the value of _itemValue_ will be used.
    */
  var itemText: js.UndefOr[String] = js.native
  /**
    * When adding objects as tags, itemValue must be set to the name of the property containing the
    * item's value.
    */
  var itemValue: js.UndefOr[String] = js.native
  /**
    * Defines the maximum length of a single tag.
    */
  var maxChars: js.UndefOr[Double] = js.native
  /**
    * When set, no more than the given number of tags are allowed to add.
    */
  var maxTags: js.UndefOr[Double] = js.native
  /**
    * Defines the minimum length of a single tag.
    *
    * @default 1
    */
  var minChars: js.UndefOr[Double] = js.native
  /**
    * Empty dropdown label.
    *
    * @default "No results found"
    */
  var noResultsLabel: js.UndefOr[String] = js.native
  /**
    * TagsInput placeholder text if original input doesn't have one.
    *
    * @default undefined
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * When true, tags are removable either using the associted delete button or _backspace_ and
    * _delete_ keys.
    *
    * @default true
    */
  var removable: js.UndefOr[Boolean] = js.native
  /**
    * Defines the minimum length of input value before loading auto-complete.
    *
    * @default 1
    */
  var searchMinChars: js.UndefOr[Double] = js.native
  /**
    * Defines on what dropdown item data do we search the entered value.
    *
    * @default "text"
    */
  var searchOn: js.UndefOr[value | text] = js.native
  /**
    * When true, tags can be selected either by mouse click or using _left_ or _right_ arrow keys.
    *
    * @default true
    */
  var selectable: js.UndefOr[Boolean] = js.native
  /**
    * Source of data proposed in dropdown (used for auto-complete).
    *
    * @default undefined
    */
  var source: js.UndefOr[
    (js.Array[String | BulmaTagsInputItem]) | (js.Function0[js.Array[String | BulmaTagsInputItem]]) | (js.Promise[js.Array[String | BulmaTagsInputItem]])
  ] = js.native
  /**
    * Classname applied to each tag.
    *
    * @default "is-rounded"
    */
  var tagClass: js.UndefOr[String] = js.native
  /**
    * When true, automatically removes all whitespace around tags.
    *
    * @default true
    */
  var trim: js.UndefOr[Boolean] = js.native
}

object BulmaTagsInputOptions {
  @scala.inline
  def apply(): BulmaTagsInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulmaTagsInputOptions]
  }
  @scala.inline
  implicit class BulmaTagsInputOptionsOps[Self <: BulmaTagsInputOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowDuplicates(value: Boolean): Self = this.set("allowDuplicates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDuplicates: Self = this.set("allowDuplicates", js.undefined)
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setClearSelectionOnTyping(value: Boolean): Self = this.set("clearSelectionOnTyping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearSelectionOnTyping: Self = this.set("clearSelectionOnTyping", js.undefined)
    @scala.inline
    def setCloseDropdownOnItemSelect(value: Boolean): Self = this.set("closeDropdownOnItemSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseDropdownOnItemSelect: Self = this.set("closeDropdownOnItemSelect", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setFreeInput(value: Boolean): Self = this.set("freeInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeInput: Self = this.set("freeInput", js.undefined)
    @scala.inline
    def setHighlightDuplicate(value: Boolean): Self = this.set("highlightDuplicate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightDuplicate: Self = this.set("highlightDuplicate", js.undefined)
    @scala.inline
    def setHighlightMatchesString(value: Boolean): Self = this.set("highlightMatchesString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightMatchesString: Self = this.set("highlightMatchesString", js.undefined)
    @scala.inline
    def setItemText(value: String): Self = this.set("itemText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemText: Self = this.set("itemText", js.undefined)
    @scala.inline
    def setItemValue(value: String): Self = this.set("itemValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemValue: Self = this.set("itemValue", js.undefined)
    @scala.inline
    def setMaxChars(value: Double): Self = this.set("maxChars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxChars: Self = this.set("maxChars", js.undefined)
    @scala.inline
    def setMaxTags(value: Double): Self = this.set("maxTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTags: Self = this.set("maxTags", js.undefined)
    @scala.inline
    def setMinChars(value: Double): Self = this.set("minChars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinChars: Self = this.set("minChars", js.undefined)
    @scala.inline
    def setNoResultsLabel(value: String): Self = this.set("noResultsLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoResultsLabel: Self = this.set("noResultsLabel", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setRemovable(value: Boolean): Self = this.set("removable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemovable: Self = this.set("removable", js.undefined)
    @scala.inline
    def setSearchMinChars(value: Double): Self = this.set("searchMinChars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchMinChars: Self = this.set("searchMinChars", js.undefined)
    @scala.inline
    def setSearchOn(value: value | text): Self = this.set("searchOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchOn: Self = this.set("searchOn", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSourceVarargs(value: (String | BulmaTagsInputItem)*): Self = this.set("source", js.Array(value :_*))
    @scala.inline
    def setSourceFunction0(value: () => js.Array[String | BulmaTagsInputItem]): Self = this.set("source", js.Any.fromFunction0(value))
    @scala.inline
    def setSource(
      value: (js.Array[String | BulmaTagsInputItem]) | (js.Function0[js.Array[String | BulmaTagsInputItem]]) | (js.Promise[js.Array[String | BulmaTagsInputItem]])
    ): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTagClass(value: String): Self = this.set("tagClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagClass: Self = this.set("tagClass", js.undefined)
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
  
}

