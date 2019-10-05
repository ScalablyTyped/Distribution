package typings.blessed.blessedMod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A box which can render content drawn as 8x14 cell characters using the terminus font.
  */
@JSImport("blessed", "Widgets.BigTextElement")
@js.native
class BigTextElement protected () extends BoxElement {
  def this(opts: BigTextOptions) = this()
  /**
    * Original options object.
    */
  @JSName("options")
  var options_BigTextElement: BigTextOptions = js.native
}

