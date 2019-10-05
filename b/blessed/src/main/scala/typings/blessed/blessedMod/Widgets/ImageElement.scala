package typings.blessed.blessedMod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Display an image in the terminal (jpeg, png, gif) using w3mimgdisplay. Requires w3m to be installed.
  * X11 required: works in xterm, urxvt, and possibly other terminals.
  */
@JSImport("blessed", "Widgets.ImageElement")
@js.native
class ImageElement () extends BoxElement {
  def this(options: ImageOptions) = this()
  @JSName("options")
  var options_ImageElement: ImageOptions = js.native
}

