package typings.blessed.blessedMod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element similar to Box, but geared towards rendering simple text elements.
  */
@JSImport("blessed", "Widgets.TextElement")
@js.native
class TextElement protected () extends BlessedElement {
  def this(opts: TextOptions) = this()
  /**
    * Original options object.
    */
  @JSName("options")
  var options_TextElement: TextOptions = js.native
}

