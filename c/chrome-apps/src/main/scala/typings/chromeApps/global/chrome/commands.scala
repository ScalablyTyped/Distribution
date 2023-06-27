package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.commands.Command
import typings.chromeApps.chrome.commands.CommandEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.commands
//////////////
// Commands //
//////////////
/**
  * @since Chrome 35.
  * @requires Manifest:  'commands': {...}
  * @description
  * Use the commands API to add keyboard shortcuts that
  * trigger actions in your app, for example, an
  * action to open the browser action or send a command
  * to the app.
  * @see https://developer.chrome.com/apps/commands
  */
object commands {
  
  @JSGlobal("chrome.commands")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns all the registered commands for this app and their shortcut (if active).
    * @param callback Called to return the registered commands.
    */
  inline def getAll(callback: js.Function1[/* commands */ js.Array[Command], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Fired when a registered command is activated using a keyboard shortcut. */
  @JSGlobal("chrome.commands.onCommand")
  @js.native
  val onCommand: CommandEvent = js.native
}
