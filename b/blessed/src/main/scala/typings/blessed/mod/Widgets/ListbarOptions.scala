package typings.blessed.mod.Widgets

import typings.blessed.mod.Widgets.Types.ListbarCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ListbarOptionsMutableBuilder[Self <: ListbarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCommandKeys(value: Boolean): Self = StObject.set(x, "autoCommandKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommands(value: js.Array[ListbarCommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandsVarargs(value: ListbarCommand*): Self = StObject.set(x, "commands", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ListbarCommand]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ListbarCommand*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: ListElementStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
