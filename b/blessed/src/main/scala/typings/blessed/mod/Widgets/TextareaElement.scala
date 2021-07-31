package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blessed", "Widgets.TextareaElement")
@js.native
class TextareaElement protected () extends InputElement {
  def this(opts: TextareaOptions) = this()
  
  /**
    * Cancel the textarea (emits cancel).
    */
  def cancel(): Unit = js.native
  
  /**
    * Clear input.
    */
  def clearValue(): Unit = js.native
  
  /**
    * Open text editor in $EDITOR, read the output from the resulting file. Takes a callback which
    * receives the final value.
    */
  def editor(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): Unit = js.native
  
  /**
    * The same as this.value, for now.
    */
  def getValue(): String = js.native
  
  /**
    * Grab key events and start reading text from the keyboard. Takes a callback which receives
    * the final value.
    */
  def input(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): Unit = js.native
  
  def on(event: TextareaElementEventType, callback: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  
  /**
    * Original options object.
    */
  @JSName("options")
  var options_TextareaElement: TextareaOptions = js.native
  
  /**
    * Open text editor in $EDITOR, read the output from the resulting file. Takes a callback which
    * receives the final value.
    */
  def readEditor(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): Unit = js.native
  
  /**
    * Grab key events and start reading text from the keyboard. Takes a callback which receives
    * the final value.
    */
  def readInput(): Unit = js.native
  def readInput(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): Unit = js.native
  
  /**
    * Open text editor in $EDITOR, read the output from the resulting file. Takes a callback which
    * receives the final value.
    */
  def setEditor(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): Unit = js.native
  
  /**
    * Grab key events and start reading text from the keyboard. Takes a callback which receives
    * the final value.
    */
  def setInput(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): Unit = js.native
  
  /**
    * Set value.
    */
  def setValue(text: String): Unit = js.native
  
  /**
    * Submit the textarea (emits submit).
    */
  def submit(): Unit = js.native
  
  /**
    * The input text. read-only.
    */
  var value: String = js.native
}
