package typings.d3kit.mod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3kit", "CanvasPlate")
@js.native
class CanvasPlate () extends AbstractPlate {
  def this(options: ChartOptions) = this()
  
  def clear(): this.type = js.native
  
  def getContext2d(): CanvasRenderingContext2D = js.native
}
/* static members */
@JSImport("d3kit", "CanvasPlate")
@js.native
object CanvasPlate extends js.Object {
  
  def getDefaultOptions(): ChartOptions = js.native
  def getDefaultOptions(options: ChartOptions): ChartOptions = js.native
}
