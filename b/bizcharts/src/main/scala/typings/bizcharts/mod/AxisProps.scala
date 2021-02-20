package typings.bizcharts.mod

import typings.antvG2.mod.AxisGrid
import typings.antvG2.mod.AxisLabel
import typings.antvG2.mod.Styles.line
import typings.antvG2.mod.Styles.tickLine
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
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
  implicit class AxisPropsMutableBuilder[Self <: AxisProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrid(value: AxisGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridNull: Self = StObject.set(x, "grid", null)
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setLabel(value: AxisLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = StObject.set(x, "label", null)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLine(value: line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNull: Self = StObject.set(x, "line", null)
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSubTickCount(value: Double): Self = StObject.set(x, "subTickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTickCountUndefined: Self = StObject.set(x, "subTickCount", js.undefined)
    
    @scala.inline
    def setSubTickLine(value: tickLine): Self = StObject.set(x, "subTickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTickLineUndefined: Self = StObject.set(x, "subTickLine", js.undefined)
    
    @scala.inline
    def setTickLine(value: tickLine): Self = StObject.set(x, "tickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLineNull: Self = StObject.set(x, "tickLine", null)
    
    @scala.inline
    def setTickLineUndefined: Self = StObject.set(x, "tickLine", js.undefined)
    
    @scala.inline
    def setTitle(value: typings.antvG2.mod.AxisTitle | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
