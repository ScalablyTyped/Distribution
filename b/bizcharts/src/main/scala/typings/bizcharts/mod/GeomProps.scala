package typings.bizcharts.mod

import typings.antvG2.mod.Styles.line
import typings.bizcharts.anon.DodgeBy
import typings.bizcharts.anon.Name
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeomProps
  extends StObject
     with Props[js.Any] {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var adjust: js.UndefOr[String | (js.Array[DodgeBy | String])] = js.undefined
  
  // 图形激活交互开关
  var animate: js.UndefOr[js.Any] = js.undefined
  
  var color: js.UndefOr[
    String | (js.Tuple2[
      String, 
      js.Array[String] | (js.Function1[/* d */ js.UndefOr[js.Any], String]) | String
    ])
  ] = js.undefined
  
  var line: js.UndefOr[typings.antvG2.mod.Styles.line | Boolean] = js.undefined
  
  var opacity: js.UndefOr[
    String | Double | (js.Tuple2[String, js.Function1[/* d */ js.UndefOr[js.Any], Double]])
  ] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[Boolean | (js.Tuple2[Boolean, js.Any])] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var shape: js.UndefOr[
    String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[js.Any], String])])
  ] = js.undefined
  
  var size: js.UndefOr[
    Double | String | (js.Tuple2[
      String, 
      (js.Function1[/* d */ js.UndefOr[js.Any], Double]) | (js.Tuple2[Double, Double])
    ])
  ] = js.undefined
  
  var style: js.UndefOr[js.Object | (js.Tuple2[String, js.Object])] = js.undefined
  
  var tooltip: js.UndefOr[
    Boolean | String | (js.Tuple2[String, js.Function1[/* repeated */ js.Any, Name]])
  ] = js.undefined
  
  var `type`: js.UndefOr[GeomType] = js.undefined
}
object GeomProps {
  
  inline def apply(): GeomProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeomProps]
  }
  
  extension [Self <: GeomProps](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAdjust(value: String | (js.Array[DodgeBy | String])): Self = StObject.set(x, "adjust", value.asInstanceOf[js.Any])
    
    inline def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
    
    inline def setAdjustVarargs(value: (DodgeBy | String)*): Self = StObject.set(x, "adjust", js.Array(value :_*))
    
    inline def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setColor(
      value: String | (js.Tuple2[
          String, 
          js.Array[String] | (js.Function1[/* d */ js.UndefOr[js.Any], String]) | String
        ])
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLine(value: line | Boolean): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setOpacity(value: String | Double | (js.Tuple2[String, js.Function1[/* d */ js.UndefOr[js.Any], Double]])): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSelect(value: Boolean | (js.Tuple2[Boolean, js.Any])): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setShape(
      value: String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[js.Any], String])])
    ): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(
      value: Double | String | (js.Tuple2[
          String, 
          (js.Function1[/* d */ js.UndefOr[js.Any], Double]) | (js.Tuple2[Double, Double])
        ])
    ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: js.Object | (js.Tuple2[String, js.Object])): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTooltip(value: Boolean | String | (js.Tuple2[String, js.Function1[/* repeated */ js.Any, Name]])): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setType(value: GeomType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
