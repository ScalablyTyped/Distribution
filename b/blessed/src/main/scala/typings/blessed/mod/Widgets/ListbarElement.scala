package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.`remove item`
import typings.blessed.blessedStrings.`select tab`
import typings.blessed.blessedStrings.`set items`
import typings.blessed.mod.Widgets.Types.ListbarCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "Widgets.ListbarElement")
@js.native
class ListbarElement protected () extends BoxElement {
  def this(opts: ListbarOptions) = this()
  /**
    * Original options object.
    */
  @JSName("options")
  var options_ListbarElement: ListbarOptions = js.native
  /**
    * Append an item to the bar.
    */
  def add(item: ListbarCommand, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Append an item to the bar.
    */
  def addItem(item: ListbarCommand, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Append an item to the bar.
    */
  def appendItem(item: ListbarCommand, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Move relatively across the bar.
    */
  def move(offset: Double): Unit = js.native
  /**
    * Move left relatively across the bar.
    */
  def moveLeft(offset: Double): Unit = js.native
  /**
    * Move right relatively across the bar.
    */
  def moveRight(offset: Double): Unit = js.native
  @JSName("on")
  def on_removeitem(event: `remove item`, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_selecttab(event: `select tab`, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_setitems(event: `set items`, callback: js.Function0[Unit]): this.type = js.native
  /**
    * Remove item from the bar.
    */
  def removeItem(child: BlessedElement): Unit = js.native
  /**
    * Select an item on the bar.
    */
  def select(offset: Double): Unit = js.native
  /**
    * Select button and execute its callback.
    */
  def selectTab(index: Double): Unit = js.native
  /**
    * Set commands (see commands option above).
    */
  def setItems(commands: js.Array[ListbarCommand]): Unit = js.native
}

