package typings.creativebulmaBulmaTagsinput.mod

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
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulmaTagsInput extends js.Object {
  /**
    * Get the internal input element
    */
  var input: HTMLInputElement = js.native
  /**
    * Get all added items
    */
  var items: js.Array[String | BulmaTagsInputItem] = js.native
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
}

