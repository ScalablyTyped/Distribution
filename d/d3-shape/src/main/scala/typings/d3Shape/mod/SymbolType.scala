package typings.d3Shape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolType extends js.Object {
  /**
    * Renders this symbol type to the specified context with the specified size in square pixels. The context implements the CanvasPath interface.
    * (Note that this is a subset of the CanvasRenderingContext2D interface!)
    *
    * @param context A rendering context implementing CanvasPath.
    * @param size Size of the symbol to draw.
    */
  def draw(context: CanvasPathD3Shape, size: Double): Unit = js.native
}

object SymbolType {
  @scala.inline
  def apply(draw: (CanvasPathD3Shape, Double) => Unit): SymbolType = {
    val __obj = js.Dynamic.literal(draw = js.Any.fromFunction2(draw))
    __obj.asInstanceOf[SymbolType]
  }
  @scala.inline
  implicit class SymbolTypeOps[Self <: SymbolType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDraw(value: (CanvasPathD3Shape, Double) => Unit): Self = this.set("draw", js.Any.fromFunction2(value))
  }
  
}

