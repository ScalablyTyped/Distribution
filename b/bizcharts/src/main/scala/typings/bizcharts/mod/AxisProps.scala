package typings.bizcharts.mod

import typings.antvG2.mod.AxisGrid
import typings.antvG2.mod.AxisLabel
import typings.antvG2.mod.Styles.line
import typings.antvG2.mod.Styles.tickLine
import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisProps
  extends Props[js.Any] {
  
  var grid: js.UndefOr[AxisGrid | Null] = js.native
  
  var label: js.UndefOr[AxisLabel | Null] = js.native
  
  var line: js.UndefOr[typings.antvG2.mod.Styles.line | Null] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[PositionType] = js.native
  
  var subTickCount: js.UndefOr[Double] = js.native
  
  var subTickLine: js.UndefOr[tickLine] = js.native
  
  var tickLine: js.UndefOr[typings.antvG2.mod.Styles.tickLine | Null] = js.native
  
  var title: js.UndefOr[typings.antvG2.mod.AxisTitle | Boolean | Null] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object AxisProps {
  
  @scala.inline
  def apply(): AxisProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisProps]
  }
  
  @scala.inline
  implicit class AxisPropsOps[Self <: AxisProps] (val x: Self) extends AnyVal {
    
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
    def setGrid(value: AxisGrid): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setGridNull: Self = this.set("grid", null)
    
    @scala.inline
    def setLabel(value: AxisLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    
    @scala.inline
    def setLine(value: line): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setLineNull: Self = this.set("line", null)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setSubTickCount(value: Double): Self = this.set("subTickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTickCount: Self = this.set("subTickCount", js.undefined)
    
    @scala.inline
    def setSubTickLine(value: tickLine): Self = this.set("subTickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTickLine: Self = this.set("subTickLine", js.undefined)
    
    @scala.inline
    def setTickLine(value: tickLine): Self = this.set("tickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickLine: Self = this.set("tickLine", js.undefined)
    
    @scala.inline
    def setTickLineNull: Self = this.set("tickLine", null)
    
    @scala.inline
    def setTitle(value: typings.antvG2.mod.AxisTitle | Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
