package typings.codemirror.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "overlayMode")
@js.native
object overlayMode extends js.Object {
  /**
    * Utility function from the overlay.js addon that allows modes to be combined. The mode given as the base argument takes care of
    * most of the normal mode functionality, but a second (typically simple) mode is used, which can override the style of text.
    * Both modes get to parse all of the text, but when both assign a non-null style to a piece of code, the overlay wins, unless
    * the combine argument was true and not overridden, or state.overlay.combineTokens was true, in which case the styles are combined.
    */
  def apply[T, S](base: Mode[T], overlay: Mode[S]): Mode[_] = js.native
  def apply[T, S](base: Mode[T], overlay: Mode[S], combine: Boolean): Mode[_] = js.native
}

