package typings.creativebulmaBulmaTagsinput

import typings.creativebulmaBulmaTagsinput.anon.Item
import typings.creativebulmaBulmaTagsinput.creativebulmaBulmaTagsinputStrings.afterDotadd
import typings.creativebulmaBulmaTagsinput.creativebulmaBulmaTagsinputStrings.afterDotflush
import typings.creativebulmaBulmaTagsinput.creativebulmaBulmaTagsinputStrings.afterDotremove
import typings.creativebulmaBulmaTagsinput.creativebulmaBulmaTagsinputStrings.afterDotselect
import typings.creativebulmaBulmaTagsinput.creativebulmaBulmaTagsinputStrings.afterDotunselect
import typings.creativebulmaBulmaTagsinput.creativebulmaBulmaTagsinputStrings.beforeDotadd
import typings.creativebulmaBulmaTagsinput.creativebulmaBulmaTagsinputStrings.beforeDotflush
import typings.creativebulmaBulmaTagsinput.creativebulmaBulmaTagsinputStrings.beforeDotremove
import typings.creativebulmaBulmaTagsinput.creativebulmaBulmaTagsinputStrings.beforeDotselect
import typings.creativebulmaBulmaTagsinput.creativebulmaBulmaTagsinputStrings.beforeDotunselect
import typings.creativebulmaBulmaTagsinput.creativebulmaBulmaTagsinputStrings.text
import typings.creativebulmaBulmaTagsinput.creativebulmaBulmaTagsinputStrings.value
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@creativebulma/bulma-tagsinput", JSImport.Default)
  @js.native
  class default protected () extends BulmaTagsInput {
    /**
      * @param selector query string returning a single Node or directly a Node
      */
    def this(selector: String) = this()
    def this(selector: HTMLInputElement) = this()
    def this(selector: String, options: BulmaTagsInputOptions) = this()
    def this(selector: HTMLInputElement, options: BulmaTagsInputOptions) = this()
  }
  /* static members */
  object default {
    
    /**
      * DOM modifications will be observed to detect any new element responding to the given selector
      * to automatically instantiate BulmaTagsInput on them with the given option.
      *
      * @param selector selector can be a query string returning a single Node or a NodeList, directly
      * a Node or a NodeList
      */
    @JSImport("@creativebulma/bulma-tagsinput", "default.attach")
    @js.native
    def attach(selector: String): BulmaTagsInput = js.native
    @JSImport("@creativebulma/bulma-tagsinput", "default.attach")
    @js.native
    def attach(selector: String, options: BulmaTagsInputOptions): BulmaTagsInput = js.native
    @JSImport("@creativebulma/bulma-tagsinput", "default.attach")
    @js.native
    def attach(selector: HTMLInputElement): BulmaTagsInput = js.native
    @JSImport("@creativebulma/bulma-tagsinput", "default.attach")
    @js.native
    def attach(selector: HTMLInputElement, options: BulmaTagsInputOptions): BulmaTagsInput = js.native
  }
  
  @js.native
  trait BulmaTagsInput extends StObject {
    
    /**
      * Add given item to the component.
      *
      * @param item Item to add.
      *
      * You can provide multiple items at once by passing and Array of item or a string with multiple
      * value delimited by delimiter option (default: comma).
      */
    def add(item: String): this.type = js.native
    def add(item: js.Array[String | BulmaTagsInputItem]): this.type = js.native
    def add(item: BulmaTagsInputItem): this.type = js.native
    
    /**
      * Unselect the current selected tag.
      */
    def clearSelection(): this.type = js.native
    
    // EventEmitter functions
    /**
      * Destroys EventEmitter
      */
    def destroy(): Unit = js.native
    
    /**
      * Shortcut to removeAll method
      */
    def flush(): this.type = js.native
    
    /**
      * Sets focus on the input
      */
    def focus(): this.type = js.native
    
    /**
      * Check if given item is present
      *
      * @param item Item to find.
      */
    def has(item: String): Boolean = js.native
    def has(item: BulmaTagsInputItem): Boolean = js.native
    
    /**
      * Check if given text is present
      *
      * @param text single Text to find in items.
      */
    def hasText(value: String): Boolean = js.native
    
    /**
      * Check if given value is present
      *
      * @param value Single value to find.
      */
    def hasValue(value: String): Boolean = js.native
    
    /**
      * CGet index of given item
      *
      * @param item Item to find.
      */
    def indexOf(item: String): Double = js.native
    def indexOf(item: BulmaTagsInputItem): Double = js.native
    
    /**
      * Get the internal input element
      */
    var input: HTMLInputElement = js.native
    
    /**
      * Get all added items
      */
    var items: js.Array[String | BulmaTagsInputItem] = js.native
    
    /**
      * Count listeners registered for the provided eventName
      */
    def listenerCount(eventName: String): Double = js.native
    
    /**
      * Removes event with specified eventName.
      */
    def off(eventName: String): Unit = js.native
    
    @JSName("on")
    def on_afteradd(eventName: afterDotadd, listener: js.Function1[/* item */ Item, _]): Unit = js.native
    @JSName("on")
    def on_afterflush(
      eventName: afterDotflush,
      listener: js.Function1[/* item */ js.Array[String | BulmaTagsInputItem], _]
    ): Unit = js.native
    @JSName("on")
    def on_afterremove(eventName: afterDotremove, listener: js.Function1[/* item */ String | BulmaTagsInputItem, _]): Unit = js.native
    @JSName("on")
    def on_afterselect(eventName: afterDotselect, listener: js.Function1[/* item */ Item, _]): Unit = js.native
    @JSName("on")
    def on_afterunselect(eventName: afterDotunselect, listener: js.Function1[/* item */ Item, _]): Unit = js.native
    /**
      * Subscribes on event eventName specified function
      *
      * @param eventName
      * @param listener
      */
    @JSName("on")
    def on_beforeadd(eventName: beforeDotadd, listener: js.Function1[/* item */ String | BulmaTagsInputItem, _]): Unit = js.native
    @JSName("on")
    def on_beforeflush(
      eventName: beforeDotflush,
      listener: js.Function1[/* item */ js.Array[String | BulmaTagsInputItem], _]
    ): Unit = js.native
    @JSName("on")
    def on_beforeremove(eventName: beforeDotremove, listener: js.Function1[/* item */ String | BulmaTagsInputItem, _]): Unit = js.native
    @JSName("on")
    def on_beforeselect(eventName: beforeDotselect, listener: js.Function1[/* item */ Item, _]): Unit = js.native
    @JSName("on")
    def on_beforeunselect(eventName: beforeDotunselect, listener: js.Function1[/* item */ Item, _]): Unit = js.native
    
    @JSName("once")
    def once_afteradd(eventName: afterDotadd, listener: js.Function1[/* item */ Item, _]): Unit = js.native
    @JSName("once")
    def once_afterflush(
      eventName: afterDotflush,
      listener: js.Function1[/* item */ js.Array[String | BulmaTagsInputItem], _]
    ): Unit = js.native
    @JSName("once")
    def once_afterremove(eventName: afterDotremove, listener: js.Function1[/* item */ String | BulmaTagsInputItem, _]): Unit = js.native
    @JSName("once")
    def once_afterselect(eventName: afterDotselect, listener: js.Function1[/* item */ Item, _]): Unit = js.native
    @JSName("once")
    def once_afterunselect(eventName: afterDotunselect, listener: js.Function1[/* item */ Item, _]): Unit = js.native
    /**
      * Subscribes on event name specified function to fire only once
      */
    @JSName("once")
    def once_beforeadd(eventName: beforeDotadd, listener: js.Function1[/* item */ String | BulmaTagsInputItem, _]): Unit = js.native
    @JSName("once")
    def once_beforeflush(
      eventName: beforeDotflush,
      listener: js.Function1[/* item */ js.Array[String | BulmaTagsInputItem], _]
    ): Unit = js.native
    @JSName("once")
    def once_beforeremove(eventName: beforeDotremove, listener: js.Function1[/* item */ String | BulmaTagsInputItem, _]): Unit = js.native
    @JSName("once")
    def once_beforeselect(eventName: beforeDotselect, listener: js.Function1[/* item */ Item, _]): Unit = js.native
    @JSName("once")
    def once_beforeunselect(eventName: beforeDotunselect, listener: js.Function1[/* item */ Item, _]): Unit = js.native
    
    /**
      * Remove given items
      *
      * @param item Item to add
      *
      * You can provide multiple items at once by passing and Array of item or a string with multiple
      * value delimited by delimiter option (default: comma).
      */
    def remove(item: String): this.type = js.native
    def remove(item: js.Array[String | BulmaTagsInputItem]): this.type = js.native
    def remove(item: BulmaTagsInputItem): this.type = js.native
    
    /**
      * Remove all tags at once
      */
    def removeAll(): this.type = js.native
    
    /**
      * Remove item at given index.
      *
      * @param index Index of the item to remove.
      * @param clearSelection Should current selection be cleared
      */
    def removeAtIndex(index: Double, clearSelection: Boolean): this.type = js.native
    
    /**
      * Select given item
      *
      * @param item Item to add.
      *
      * You can provide multiple items at once by passing and Array of item or a string with multiple
      * value delimited by delimiter option (default: comma). If a list of items is passed then each
      * item will be selected one by one and at the end only the last existing item from the list will
      * be selected at the end.
      */
    def select(item: String): this.type = js.native
    def select(item: BulmaTagsInputItem): this.type = js.native
    
    /**
      * Select tag at given index
      *
      * @param index Index of the item to select.
      */
    def selectAtIndex(index: Double): this.type = js.native
    
    /**
      * Get the current selected item
      */
    var selected: String | BulmaTagsInputItem = js.native
    
    /**
      * Get the current selected item index
      */
    var selectedIndex: Double = js.native
    
    /**
      * Get component value
      */
    var value: String | js.Array[String] = js.native
  }
  
  @js.native
  trait BulmaTagsInputEventMap extends StObject {
    
    /**
      * Triggered once a tag has been added. The added item and the related tag are passed in an object as
      * parameter.
      */
    @JSName("after.add")
    var afterDotadd: Item = js.native
    
    /**
      * Triggered after flushing items.
      */
    @JSName("after.flush")
    var afterDotflush: js.Array[String | BulmaTagsInputItem] = js.native
    
    /**
      * Triggered once a tag has been removed. The removed item is passed as parameter.
      */
    @JSName("after.remove")
    var afterDotremove: String | BulmaTagsInputItem = js.native
    
    /**
      * Triggered once an item has been selected. The concerned item and related tag are passed in
      * an Object as parameter.
      */
    @JSName("after.select")
    var afterDotselect: Item = js.native
    
    /**
      * Triggered once an item has been unselected. The concerned item and related tag are passed in
      * an Object as parameter.
      */
    @JSName("after.unselect")
    var afterDotunselect: Item = js.native
    
    /**
      * Trigerred before adding new tag. The concerned item is passed as parameter. You can modify the item
      * before its treatment by returning the new item data or prevent tag to be added by returning false.
      */
    @JSName("before.add")
    var beforeDotadd: String | BulmaTagsInputItem = js.native
    
    /**
      * Triggered before flushing items. Items array is passed as parameter.
      */
    @JSName("before.flush")
    var beforeDotflush: js.Array[String | BulmaTagsInputItem] = js.native
    
    /**
      * Triggered before removing a tag. The concerned item is passed as parameter. You can prevent
      * deletion by returning `false`.
      */
    @JSName("before.remove")
    var beforeDotremove: String | BulmaTagsInputItem = js.native
    
    /**
      * Triggered before selecting an item. The concerned item and related tag are passed in an
      * Object as parameter.
      */
    @JSName("before.select")
    var beforeDotselect: Item = js.native
    
    /**
      * Triggered before unselect an item. The concerned item and related tag are passed in an Object
      * as parameter.
      */
    @JSName("before.unselect")
    var beforeDotunselect: Item = js.native
  }
  object BulmaTagsInputEventMap {
    
    @scala.inline
    def apply(
      afterDotadd: Item,
      afterDotflush: js.Array[String | BulmaTagsInputItem],
      afterDotremove: String | BulmaTagsInputItem,
      afterDotselect: Item,
      afterDotunselect: Item,
      beforeDotadd: String | BulmaTagsInputItem,
      beforeDotflush: js.Array[String | BulmaTagsInputItem],
      beforeDotremove: String | BulmaTagsInputItem,
      beforeDotselect: Item,
      beforeDotunselect: Item
    ): BulmaTagsInputEventMap = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("after.add")(afterDotadd.asInstanceOf[js.Any])
      __obj.updateDynamic("after.flush")(afterDotflush.asInstanceOf[js.Any])
      __obj.updateDynamic("after.remove")(afterDotremove.asInstanceOf[js.Any])
      __obj.updateDynamic("after.select")(afterDotselect.asInstanceOf[js.Any])
      __obj.updateDynamic("after.unselect")(afterDotunselect.asInstanceOf[js.Any])
      __obj.updateDynamic("before.add")(beforeDotadd.asInstanceOf[js.Any])
      __obj.updateDynamic("before.flush")(beforeDotflush.asInstanceOf[js.Any])
      __obj.updateDynamic("before.remove")(beforeDotremove.asInstanceOf[js.Any])
      __obj.updateDynamic("before.select")(beforeDotselect.asInstanceOf[js.Any])
      __obj.updateDynamic("before.unselect")(beforeDotunselect.asInstanceOf[js.Any])
      __obj.asInstanceOf[BulmaTagsInputEventMap]
    }
    
    @scala.inline
    implicit class BulmaTagsInputEventMapMutableBuilder[Self <: BulmaTagsInputEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterDotadd(value: Item): Self = StObject.set(x, "after.add", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterDotflush(value: js.Array[String | BulmaTagsInputItem]): Self = StObject.set(x, "after.flush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterDotflushVarargs(value: (String | BulmaTagsInputItem)*): Self = StObject.set(x, "after.flush", js.Array(value :_*))
      
      @scala.inline
      def setAfterDotremove(value: String | BulmaTagsInputItem): Self = StObject.set(x, "after.remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterDotselect(value: Item): Self = StObject.set(x, "after.select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterDotunselect(value: Item): Self = StObject.set(x, "after.unselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeDotadd(value: String | BulmaTagsInputItem): Self = StObject.set(x, "before.add", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeDotflush(value: js.Array[String | BulmaTagsInputItem]): Self = StObject.set(x, "before.flush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeDotflushVarargs(value: (String | BulmaTagsInputItem)*): Self = StObject.set(x, "before.flush", js.Array(value :_*))
      
      @scala.inline
      def setBeforeDotremove(value: String | BulmaTagsInputItem): Self = StObject.set(x, "before.remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeDotselect(value: Item): Self = StObject.set(x, "before.select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeDotunselect(value: Item): Self = StObject.set(x, "before.unselect", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BulmaTagsInputItem extends StObject {
    
    var text: String = js.native
    
    var value: String = js.native
  }
  object BulmaTagsInputItem {
    
    @scala.inline
    def apply(text: String, value: String): BulmaTagsInputItem = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BulmaTagsInputItem]
    }
    
    @scala.inline
    implicit class BulmaTagsInputItemMutableBuilder[Self <: BulmaTagsInputItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BulmaTagsInputOptions extends StObject {
    
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
    implicit class BulmaTagsInputOptionsMutableBuilder[Self <: BulmaTagsInputOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDuplicates(value: Boolean): Self = StObject.set(x, "allowDuplicates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDuplicatesUndefined: Self = StObject.set(x, "allowDuplicates", js.undefined)
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setClearSelectionOnTyping(value: Boolean): Self = StObject.set(x, "clearSelectionOnTyping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearSelectionOnTypingUndefined: Self = StObject.set(x, "clearSelectionOnTyping", js.undefined)
      
      @scala.inline
      def setCloseDropdownOnItemSelect(value: Boolean): Self = StObject.set(x, "closeDropdownOnItemSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseDropdownOnItemSelectUndefined: Self = StObject.set(x, "closeDropdownOnItemSelect", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setFreeInput(value: Boolean): Self = StObject.set(x, "freeInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeInputUndefined: Self = StObject.set(x, "freeInput", js.undefined)
      
      @scala.inline
      def setHighlightDuplicate(value: Boolean): Self = StObject.set(x, "highlightDuplicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightDuplicateUndefined: Self = StObject.set(x, "highlightDuplicate", js.undefined)
      
      @scala.inline
      def setHighlightMatchesString(value: Boolean): Self = StObject.set(x, "highlightMatchesString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightMatchesStringUndefined: Self = StObject.set(x, "highlightMatchesString", js.undefined)
      
      @scala.inline
      def setItemText(value: String): Self = StObject.set(x, "itemText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTextUndefined: Self = StObject.set(x, "itemText", js.undefined)
      
      @scala.inline
      def setItemValue(value: String): Self = StObject.set(x, "itemValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemValueUndefined: Self = StObject.set(x, "itemValue", js.undefined)
      
      @scala.inline
      def setMaxChars(value: Double): Self = StObject.set(x, "maxChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCharsUndefined: Self = StObject.set(x, "maxChars", js.undefined)
      
      @scala.inline
      def setMaxTags(value: Double): Self = StObject.set(x, "maxTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagsUndefined: Self = StObject.set(x, "maxTags", js.undefined)
      
      @scala.inline
      def setMinChars(value: Double): Self = StObject.set(x, "minChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCharsUndefined: Self = StObject.set(x, "minChars", js.undefined)
      
      @scala.inline
      def setNoResultsLabel(value: String): Self = StObject.set(x, "noResultsLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResultsLabelUndefined: Self = StObject.set(x, "noResultsLabel", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
      
      @scala.inline
      def setSearchMinChars(value: Double): Self = StObject.set(x, "searchMinChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchMinCharsUndefined: Self = StObject.set(x, "searchMinChars", js.undefined)
      
      @scala.inline
      def setSearchOn(value: value | text): Self = StObject.set(x, "searchOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchOnUndefined: Self = StObject.set(x, "searchOn", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setSource(
        value: (js.Array[String | BulmaTagsInputItem]) | (js.Function0[js.Array[String | BulmaTagsInputItem]]) | (js.Promise[js.Array[String | BulmaTagsInputItem]])
      ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceFunction0(value: () => js.Array[String | BulmaTagsInputItem]): Self = StObject.set(x, "source", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setSourceVarargs(value: (String | BulmaTagsInputItem)*): Self = StObject.set(x, "source", js.Array(value :_*))
      
      @scala.inline
      def setTagClass(value: String): Self = StObject.set(x, "tagClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagClassUndefined: Self = StObject.set(x, "tagClass", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
}
