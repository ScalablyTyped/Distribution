package typings.blessed.blessedMod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A box element which draws a simple box containing content or other elements.
  */
@JSImport("blessed", "Widgets.BoxElement")
@js.native
class BoxElement protected () extends ScrollableTextElement {
  def this(opts: BoxOptions) = this()
  /**
    * Original options object.
    */
  @JSName("options")
  var options_BoxElement: BoxOptions = js.native
}

