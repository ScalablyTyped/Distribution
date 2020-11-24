package typings.bingmaps.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDrawingToolOptions extends js.Object {
  
  /** Set of buttons to show in the drawing bar */
  var drawingBarActions: js.UndefOr[DrawingBarAction] = js.native
}
object IDrawingToolOptions {
  
  @scala.inline
  def apply(): IDrawingToolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDrawingToolOptions]
  }
  
  @scala.inline
  implicit class IDrawingToolOptionsOps[Self <: IDrawingToolOptions] (val x: Self) extends AnyVal {
    
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
    def setDrawingBarActions(value: DrawingBarAction): Self = this.set("drawingBarActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawingBarActions: Self = this.set("drawingBarActions", js.undefined)
  }
}
