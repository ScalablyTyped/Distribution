package typings.canvasRenderer

import typings.canvasRenderer.canvasMod.Canvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("canvas-renderer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createCanvas(width: Double, height: Double): Canvas = js.native
}

