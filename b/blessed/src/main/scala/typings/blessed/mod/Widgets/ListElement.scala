package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.`select item`
import typings.blessed.blessedStrings.select
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blessed", "Widgets.ListElement")
@js.native
class ListElement protected () extends BoxElement {
  def this(opts: ListOptions[ListElementStyle]) = this()
  
  /**
    * Add an item based on a string.
    */
  def add(text: String): Unit = js.native
  
  /**
    * Add an item based on a string.
    */
  def addItem(text: String): Unit = js.native
  
  /**
    * Clears all items from the list.
    */
  def clearItems(): Unit = js.native
  
  /**
    * Select item below selected.
    */
  def down(amount: Double): Unit = js.native
  
  /**
    * Find an item based on its text content.
    */
  def fuzzyFind(arg: String): Unit = js.native
  def fuzzyFind(arg: js.Function0[Unit]): Unit = js.native
  def fuzzyFind(arg: RegExp): Unit = js.native
  
  def getItem(child: String): BlessedElement = js.native
  def getItem(child: Double): BlessedElement = js.native
  /**
    * Returns the item element. Child can be an element, index, or string.
    */
  def getItem(child: BlessedElement): BlessedElement = js.native
  
  def getItemIndex(child: String): Double = js.native
  def getItemIndex(child: Double): Double = js.native
  /**
    * Returns the item index from the list. Child can be an element, index, or string.
    */
  def getItemIndex(child: BlessedElement): Double = js.native
  
  def insertItem(i: Double, child: String): Unit = js.native
  def insertItem(i: Double, child: Double): Unit = js.native
  /**
    * Inserts an item to the list. Child can be an element, index, or string.
    */
  def insertItem(i: Double, child: BlessedElement): Unit = js.native
  
  /**
    * Select item based on current offset.
    */
  def move(offset: Double): Unit = js.native
  
  def on(event: ListElementEventType, callback: js.Function0[Unit]): this.type = js.native
  /** Received when an item is selected. */
  @JSName("on")
  def on_select(event: select, callback: js.Function2[/* item */ BoxElement, /* index */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_selectitem(event: `select item`, callback: js.Function2[/* item */ BlessedElement, /* index */ Double, Unit]): this.type = js.native
  
  /**
    * Original options object.
    */
  @JSName("options")
  var options_ListElement: ListOptions[ListElementStyle] = js.native
  
  /**
    * Show/focus list and pick an item. The callback is executed with the result.
    */
  def pick(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Pop an item off the list.
    */
  def popItem(): BlessedElement = js.native
  
  /**
    * Push an item onto the list.
    */
  def pushItem(child: BlessedElement): Double = js.native
  
  def removeItem(child: String): BlessedElement = js.native
  def removeItem(child: Double): BlessedElement = js.native
  /**
    * Removes an item from the list. Child can be an element, index, or string.
    */
  def removeItem(child: BlessedElement): BlessedElement = js.native
  
  /**
    * Select an index of an item.
    */
  def select(index: Double): Unit = js.native
  
  def setItem(child: BlessedElement, content: String): Unit = js.native
  /**
    * Set item to content.
    */
  def setItem(child: BlessedElement, content: BlessedElement): Unit = js.native
  
  /**
    * Sets the list items to multiple strings.
    */
  def setItems(items: js.Array[BlessedElement]): Unit = js.native
  
  /**
    * Shift an item off the list.
    */
  def shiftItem(): BlessedElement = js.native
  
  /**
    * Remove and insert items to the list.
    */
  def spliceItem(i: Double, n: Double, items: BlessedElement*): Unit = js.native
  
  /**
    * Unshift an item onto the list.
    */
  def unshiftItem(child: BlessedElement): Double = js.native
  
  /**
    * Select item above selected.
    */
  def up(amount: Double): Unit = js.native
}
