package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blessed", "Widgets.TextboxElement")
@js.native
class TextboxElement protected () extends TextareaElement {
  def this(opts: TextboxOptions) = this()
  
  /**
    * Replace text with asterisks (*).
    */
  var censor: Boolean = js.native
  
  /**
    * Original options object.
    */
  @JSName("options")
  var options_TextboxElement: TextboxOptions = js.native
  
  /**
    * Completely hide text.
    */
  var secret: Boolean = js.native
}
