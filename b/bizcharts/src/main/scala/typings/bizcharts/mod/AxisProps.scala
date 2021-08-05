package typings.bizcharts.mod

import typings.antvG2.mod.AxisGrid
import typings.antvG2.mod.AxisLabel
import typings.antvG2.mod.Styles.line
import typings.antvG2.mod.Styles.tickLine
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisProps
  extends StObject
     with Props[js.Any] {
  
  var grid: js.UndefOr[AxisGrid | Null] = js.undefined
  
  var label: js.UndefOr[AxisLabel | Null] = js.undefined
  
  var line: js.UndefOr[typings.antvG2.mod.Styles.line | Null] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[PositionType] = js.undefined
  
  var subTickCount: js.UndefOr[Double] = js.undefined
  
  var subTickLine: js.UndefOr[tickLine] = js.undefined
  
  var tickLine: js.UndefOr[typings.antvG2.mod.Styles.tickLine | Null] = js.undefined
  
  var title: js.UndefOr[typings.antvG2.mod.AxisTitle | Boolean | Null] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object AxisProps {
  
  inline def apply(): AxisProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisProps]
  }
  
  extension [Self <: AxisProps](x: Self) {
    
    inline def setGrid(value: AxisGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridNull: Self = StObject.set(x, "grid", null)
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setLabel(value: AxisLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLine(value: line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNull: Self = StObject.set(x, "line", null)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSubTickCount(value: Double): Self = StObject.set(x, "subTickCount", value.asInstanceOf[js.Any])
    
    inline def setSubTickCountUndefined: Self = StObject.set(x, "subTickCount", js.undefined)
    
    inline def setSubTickLine(value: tickLine): Self = StObject.set(x, "subTickLine", value.asInstanceOf[js.Any])
    
    inline def setSubTickLineUndefined: Self = StObject.set(x, "subTickLine", js.undefined)
    
    inline def setTickLine(value: tickLine): Self = StObject.set(x, "tickLine", value.asInstanceOf[js.Any])
    
    inline def setTickLineNull: Self = StObject.set(x, "tickLine", null)
    
    inline def setTickLineUndefined: Self = StObject.set(x, "tickLine", js.undefined)
    
    inline def setTitle(value: typings.antvG2.mod.AxisTitle | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
