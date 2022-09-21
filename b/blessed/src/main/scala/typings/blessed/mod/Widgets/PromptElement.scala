package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A prompt box containing a text input, okay, and cancel buttons (automatically hidden).
  */
@JSImport("blessed", "Widgets.PromptElement")
@js.native
open class PromptElement protected () extends BoxElement {
  def this(opts: PromptOptions) = this()
  
  /**
    * Show the prompt and wait for the result of the textbox. Set text and initial value.
    */
  def input(text: String, value: String, callback: js.Function2[/* err */ Any, /* value */ String, Unit]): Unit = js.native
  
  @JSName("options")
  var options_PromptElement: PromptOptions = js.native
  
  def readInput(text: String, value: String, callback: js.Function2[/* err */ Any, /* value */ String, Unit]): Unit = js.native
  
  def setInput(text: String, value: String, callback: js.Function2[/* err */ Any, /* value */ String, Unit]): Unit = js.native
}
