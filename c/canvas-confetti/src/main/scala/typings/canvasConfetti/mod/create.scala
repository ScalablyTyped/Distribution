package typings.canvasConfetti.mod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvas-confetti", "create")
@js.native
object create extends js.Object {
  
  /**
    * This method creates an instance of the confetti function that uses a custom canvas.
    */
  def apply(canvas: HTMLCanvasElement): CreateTypes = js.native
  def apply(canvas: HTMLCanvasElement, options: GlobalOptions): CreateTypes = js.native
}
