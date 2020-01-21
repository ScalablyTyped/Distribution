package typings.brace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", "Split")
@js.native
class SplitCls () extends Split {
  /**
    * Blurs the current editor.
    **/
  /* CompleteClass */
  override def blur(): Unit = js.native
  /**
    * Focuses the current editor.
    **/
  /* CompleteClass */
  override def focus(): Unit = js.native
  /**
    * Executes `callback` on all of the available editors.
    * @param callback A callback function to execute
    * @param scope The default scope for the callback
    **/
  /* CompleteClass */
  override def forEach(callback: js.Function, scope: String): Unit = js.native
  /**
    * Returns the current editor.
    **/
  /* CompleteClass */
  override def getCurrentEditor(): Editor = js.native
  /**
    * Returns the editor identified by the index `idx`.
    * @param idx The index of the editor you want
    **/
  /* CompleteClass */
  override def getEditor(idx: Double): Unit = js.native
  /**
    * Returns the orientation.
    **/
  /* CompleteClass */
  override def getOrientation(): Double = js.native
  /**
    * Returns the number of splits.
    **/
  /* CompleteClass */
  override def getSplits(): Double = js.native
  /**
    * Resizes the editor.
    **/
  /* CompleteClass */
  override def resize(): Unit = js.native
  /**
    * Sets the font size, in pixels, for all the available editors.
    * @param size The new font size
    **/
  /* CompleteClass */
  override def setFontSize(size: Double): Unit = js.native
  /**
    * Sets the keyboard handler for the editor.
    * @param keybinding
    **/
  /* CompleteClass */
  override def setKeyboardHandler(keybinding: String): Unit = js.native
  /**
    * Sets the orientation.
    * @param orientation The new orientation value
    **/
  /* CompleteClass */
  override def setOrientation(orientation: Double): Unit = js.native
  /**
    * Sets a new [[EditSession `EditSession`]] for the indicated editor.
    * @param session The new edit session
    * @param idx The editor's index you're interested in
    **/
  /* CompleteClass */
  override def setSession(session: IEditSession, idx: Double): Unit = js.native
  /**
    * Sets a theme for each of the available editors.
    * @param theme The name of the theme to set
    **/
  /* CompleteClass */
  override def setTheme(theme: String): Unit = js.native
}

