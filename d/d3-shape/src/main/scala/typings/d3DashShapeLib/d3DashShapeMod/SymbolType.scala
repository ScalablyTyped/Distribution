package typings
package d3DashShapeLib.d3DashShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolType extends js.Object {
  /**
    * Renders this symbol type to the specified context with the specified size in square pixels. The context implements the CanvasPath interface.
    * (Note that this is a subset of the CanvasRenderingContext2D interface!)
    *
    * @param context A rendering context implementing CanvasPath.
    * @param size Size of the symbol to draw.
    */
  def draw(context: CanvasPath_D3Shape, size: scala.Double): scala.Unit
}

object SymbolType {
  @scala.inline
  def apply(draw: js.Function2[CanvasPath_D3Shape, scala.Double, scala.Unit]): SymbolType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("draw")(draw)
    __obj.asInstanceOf[SymbolType]
  }
}

