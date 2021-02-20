package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.keypress
import typings.blessed.blessedStrings.warning
import typings.blessed.mod.Widgets.Events.IKeyEventArg
import typings.blessed.mod.Widgets.Events.IMouseEventArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blessed", "Widgets.NodeWithEvents")
@js.native
class NodeWithEvents protected () extends Node {
  def this(options: INodeOptions) = this()
  
  /**
    * Bind a keypress listener for a specific key.
    */
  def key(name: String, listener: js.Function2[/* ch */ js.Any, /* key */ IKeyEventArg, Unit]): Unit = js.native
  def key(name: js.Array[String], listener: js.Function2[/* ch */ js.Any, /* key */ IKeyEventArg, Unit]): Unit = js.native
  
  def on(event: String, listener: js.Function2[/* ch */ js.Any, /* key */ IKeyEventArg, Unit]): this.type = js.native
  def on(event: NodeGenericEventType, callback: js.Function0[Unit]): this.type = js.native
  /** Received on mouse events. */
  def on(event: NodeMouseEventType, callback: js.Function1[/* arg */ IMouseEventArg, Unit]): this.type = js.native
  def on(event: NodeScreenEventType, callback: js.Function1[/* arg */ Screen, Unit]): this.type = js.native
  /** Received on key events. */
  @JSName("on")
  def on_keypress(event: keypress, callback: js.Function2[/* ch */ String, /* key */ IKeyEventArg, Unit]): this.type = js.native
  /** Received when blessed notices something untoward (output is not a tty, terminfo not found, etc). */
  @JSName("on")
  def on_warning(event: warning, callback: js.Function1[/* text */ String, Unit]): this.type = js.native
  
  /**
    * Bind a keypress listener for a specific key once.
    */
  def onceKey(name: String, listener: js.Function2[/* ch */ js.Any, /* key */ IKeyEventArg, Unit]): Unit = js.native
  
  def removeKey(name: String, listener: js.Function2[/* ch */ js.Any, /* key */ IKeyEventArg, Unit]): Unit = js.native
  
  /**
    * Remove a keypress listener for a specific key.
    */
  def unkey(name: String, listener: js.Function2[/* ch */ js.Any, /* key */ IKeyEventArg, Unit]): Unit = js.native
}
