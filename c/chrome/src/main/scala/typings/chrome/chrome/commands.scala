package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Commands
////////////////////
/**
  * Use the commands API to add keyboard shortcuts that trigger actions in your extension, for example, an action to open the browser action or send a command to the extension.
  * Availability: Since Chrome 25.
  * Manifest:  "commands": {...}
  */
object commands {
  
  @js.native
  trait Command extends StObject {
    
    /** Optional. The Extension Command description  */
    var description: js.UndefOr[String] = js.native
    
    /** Optional. The name of the Extension Command  */
    var name: js.UndefOr[String] = js.native
    
    /** Optional. The shortcut active for this command, or blank if not active.  */
    var shortcut: js.UndefOr[String] = js.native
  }
  object Command {
    
    @scala.inline
    def apply(): Command = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Command]
    }
    
    @scala.inline
    implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
    }
  }
  
  type CommandEvent = Event[js.Function1[/* command */ String, Unit]]
}
