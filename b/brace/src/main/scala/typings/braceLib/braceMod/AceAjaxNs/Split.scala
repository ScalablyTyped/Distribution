package typings
package braceLib.braceMod.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Split extends js.Object {
  /**
    * Blurs the current editor.
    **/
  def blur(): scala.Unit
  /**
    * Focuses the current editor.
    **/
  def focus(): scala.Unit
  /**
    * Executes `callback` on all of the available editors.
    * @param callback A callback function to execute
    * @param scope The default scope for the callback
    **/
  def forEach(callback: js.Function, scope: java.lang.String): scala.Unit
  /**
    * Returns the current editor.
    **/
  def getCurrentEditor(): Editor
  /**
    * Returns the editor identified by the index `idx`.
    * @param idx The index of the editor you want
    **/
  def getEditor(idx: scala.Double): scala.Unit
  /**
    * Returns the orientation.
    **/
  def getOrientation(): scala.Double
  /**
    * Returns the number of splits.
    **/
  def getSplits(): scala.Double
  /**
    * Resizes the editor.
    **/
  def resize(): scala.Unit
  /**
    * Sets the font size, in pixels, for all the available editors.
    * @param size The new font size
    **/
  def setFontSize(size: scala.Double): scala.Unit
  /**
    * Sets the keyboard handler for the editor.
    * @param keybinding
    **/
  def setKeyboardHandler(keybinding: java.lang.String): scala.Unit
  /**
    * Sets the orientation.
    * @param orientation The new orientation value
    **/
  def setOrientation(orientation: scala.Double): scala.Unit
  /**
    * Sets a new [[EditSession `EditSession`]] for the indicated editor.
    * @param session The new edit session
    * @param idx The editor's index you're interested in
    **/
  def setSession(session: IEditSession, idx: scala.Double): scala.Unit
  /**
    * Sets a theme for each of the available editors.
    * @param theme The name of the theme to set
    **/
  def setTheme(theme: java.lang.String): scala.Unit
}

object Split {
  @scala.inline
  def apply(
    blur: js.Function0[scala.Unit],
    focus: js.Function0[scala.Unit],
    forEach: js.Function2[js.Function, java.lang.String, scala.Unit],
    getCurrentEditor: js.Function0[Editor],
    getEditor: js.Function1[scala.Double, scala.Unit],
    getOrientation: js.Function0[scala.Double],
    getSplits: js.Function0[scala.Double],
    resize: js.Function0[scala.Unit],
    setFontSize: js.Function1[scala.Double, scala.Unit],
    setKeyboardHandler: js.Function1[java.lang.String, scala.Unit],
    setOrientation: js.Function1[scala.Double, scala.Unit],
    setSession: js.Function2[IEditSession, scala.Double, scala.Unit],
    setTheme: js.Function1[java.lang.String, scala.Unit]
  ): Split = {
    val __obj = js.Dynamic.literal(blur = blur, focus = focus, forEach = forEach, getCurrentEditor = getCurrentEditor, getEditor = getEditor, getOrientation = getOrientation, getSplits = getSplits, resize = resize, setFontSize = setFontSize, setKeyboardHandler = setKeyboardHandler, setOrientation = setOrientation, setSession = setSession, setTheme = setTheme)
  
    __obj.asInstanceOf[Split]
  }
}

