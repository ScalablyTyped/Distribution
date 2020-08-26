package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.blueimpLoadImageBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.blueimpLoadImage.mod.CanvasTrueOptions
  - typings.blueimpLoadImage.mod.CanvasFalseOptions
*/
trait CanvasOptions extends js.Object

object CanvasOptions {
  @scala.inline
  def CanvasTrueOptions(canvas: `true`): CanvasOptions = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasOptions]
  }
  @scala.inline
  def CanvasFalseOptions(): CanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasOptions]
  }
}

