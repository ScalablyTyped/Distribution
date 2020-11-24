package typings.bingmaps.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDrawingModeChangedData extends js.Object {
  
  /** The new drawing mode. **/
  var mode: DrawingMode = js.native
  
  /** The shape being modified by the drawing tools. **/
  var shape: IPrimitive = js.native
}
object IDrawingModeChangedData {
  
  @scala.inline
  def apply(mode: DrawingMode, shape: IPrimitive): IDrawingModeChangedData = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDrawingModeChangedData]
  }
  
  @scala.inline
  implicit class IDrawingModeChangedDataOps[Self <: IDrawingModeChangedData] (val x: Self) extends AnyVal {
    
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
    def setMode(value: DrawingMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: IPrimitive): Self = this.set("shape", value.asInstanceOf[js.Any])
  }
}
