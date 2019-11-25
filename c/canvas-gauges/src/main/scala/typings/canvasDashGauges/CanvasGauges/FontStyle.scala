package typings.canvasDashGauges.CanvasGauges

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.canvasDashGauges.canvasDashGaugesStrings.normal
  - typings.canvasDashGauges.canvasDashGaugesStrings.italic
  - typings.canvasDashGauges.canvasDashGaugesStrings.oblique
*/
trait FontStyle extends js.Object

object FontStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def italic: typings.canvasDashGauges.canvasDashGaugesStrings.italic = this.cast("italic")
  @scala.inline
  def normal: typings.canvasDashGauges.canvasDashGaugesStrings.normal = this.cast("normal")
  @scala.inline
  def oblique: typings.canvasDashGauges.canvasDashGaugesStrings.oblique = this.cast("oblique")
}

