package typings.blessed.mod.Widgets

import typings.blessed.mod.Widgets.Types.ListbarCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListbarOptions extends BoxOptions {
  /**
    * Automatically bind list buttons to keys 0-9.
    */
  var autoCommandKeys: Boolean = js.native
  /**
    * Set buttons using an object with keys as titles of buttons, containing of objects
    * containing keys of keys and callback.
    */
  var commands: js.Array[ListbarCommand] = js.native
  var items: js.Array[ListbarCommand] = js.native
  @JSName("style")
  var style_ListbarOptions: js.UndefOr[ListElementStyle] = js.native
}

object ListbarOptions {
  @scala.inline
  def apply(autoCommandKeys: Boolean, commands: js.Array[ListbarCommand], items: js.Array[ListbarCommand]): ListbarOptions = {
    val __obj = js.Dynamic.literal(autoCommandKeys = autoCommandKeys.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListbarOptions]
  }
  @scala.inline
  implicit class ListbarOptionsOps[Self <: ListbarOptions] (val x: Self) extends AnyVal {
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
    def setAutoCommandKeys(value: Boolean): Self = this.set("autoCommandKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandsVarargs(value: ListbarCommand*): Self = this.set("commands", js.Array(value :_*))
    @scala.inline
    def setCommands(value: js.Array[ListbarCommand]): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: ListbarCommand*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ListbarCommand]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: ListElementStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

