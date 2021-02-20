package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.cd
import typings.blessed.blessedStrings.error
import typings.blessed.blessedStrings.file
import typings.blessed.blessedStrings.refresh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blessed", "Widgets.FileManagerElement")
@js.native
class FileManagerElement protected () extends ListElement {
  def this(opts: FileManagerOptions) = this()
  
  /**
    * Current working directory.
    */
  var cwd: String = js.native
  
  /** Received when an item is selected. */
  @JSName("on")
  def on_cd(event: cd, callback: js.Function2[/* file */ String, /* cwd */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, callback: js.Function2[/* err */ js.Any, /* file */ String, Unit]): this.type = js.native
  /** Received when an item is selected. */
  @JSName("on")
  def on_file(event: file, callback: js.Function1[/* file */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_refresh(event: refresh, callback: js.Function0[Unit]): this.type = js.native
  
  /**
    * Original options object.
    */
  @JSName("options")
  var options_FileManagerElement: FileManagerOptions = js.native
  
  /**
    * Pick a single file and return the path in the callback.
    */
  def pick(cwd: String, callback: js.Function0[Unit]): Unit = js.native
  
  def refresh(): Unit = js.native
  def refresh(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Refresh the file list (perform a readdir on cwd and update the list items).
    */
  def refresh(cwd: String, callback: js.Function0[Unit]): Unit = js.native
  
  def reset(): Unit = js.native
  def reset(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Reset back to original cwd.
    */
  def reset(cwd: String, callback: js.Function0[Unit]): Unit = js.native
}
