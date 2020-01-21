package typings.canvasGauges.CanvasGauges

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.canvasGauges.canvasGaugesStrings.normal
  - typings.canvasGauges.canvasGaugesStrings.italic
  - typings.canvasGauges.canvasGaugesStrings.oblique
*/
trait FontStyle extends js.Object

object FontStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def italic: typings.canvasGauges.canvasGaugesStrings.italic = this.cast("italic")
  @scala.inline
  def normal: typings.canvasGauges.canvasGaugesStrings.normal = this.cast("normal")
  @scala.inline
  def oblique: typings.canvasGauges.canvasGaugesStrings.oblique = this.cast("oblique")
}

