package typings.bizcharts.mod

import typings.antvG2.mod.Styles.line
import typings.bizcharts.anon.DodgeBy
import typings.bizcharts.anon.Name
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeomProps
  extends Props[js.Any] {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var adjust: js.UndefOr[String | (js.Array[DodgeBy | String])] = js.native
  
  // 图形激活交互开关
  var animate: js.UndefOr[js.Any] = js.native
  
  var color: js.UndefOr[
    String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[_], String]) | String])
  ] = js.native
  
  var line: js.UndefOr[typings.antvG2.mod.Styles.line | Boolean] = js.native
  
  var opacity: js.UndefOr[
    String | Double | (js.Tuple2[String, js.Function1[/* d */ js.UndefOr[_], Double]])
  ] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var select: js.UndefOr[Boolean | (js.Tuple2[Boolean, _])] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var shape: js.UndefOr[
    String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[_], String])])
  ] = js.native
  
  var size: js.UndefOr[
    Double | String | (js.Tuple2[
      String, 
      (js.Function1[/* d */ js.UndefOr[_], Double]) | (js.Tuple2[Double, Double])
    ])
  ] = js.native
  
  var style: js.UndefOr[js.Object | (js.Tuple2[String, js.Object])] = js.native
  
  var tooltip: js.UndefOr[Boolean | String | (js.Tuple2[String, js.Function1[/* repeated */ _, Name]])] = js.native
  
  var `type`: js.UndefOr[GeomType] = js.native
}
object GeomProps {
  
  @scala.inline
  def apply(): GeomProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeomProps]
  }
  
  @scala.inline
  implicit class GeomPropsMutableBuilder[Self <: GeomProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAdjust(value: String | (js.Array[DodgeBy | String])): Self = StObject.set(x, "adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
    
    @scala.inline
    def setAdjustVarargs(value: (DodgeBy | String)*): Self = StObject.set(x, "adjust", js.Array(value :_*))
    
    @scala.inline
    def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setColor(
      value: String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[_], String]) | String])
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLine(value: line | Boolean): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setOpacity(value: String | Double | (js.Tuple2[String, js.Function1[/* d */ js.UndefOr[_], Double]])): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSelect(value: Boolean | (js.Tuple2[Boolean, _])): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setShape(
      value: String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[_], String])])
    ): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSize(
      value: Double | String | (js.Tuple2[
          String, 
          (js.Function1[/* d */ js.UndefOr[_], Double]) | (js.Tuple2[Double, Double])
        ])
    ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object | (js.Tuple2[String, js.Object])): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTooltip(value: Boolean | String | (js.Tuple2[String, js.Function1[/* repeated */ _, Name]])): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setType(value: GeomType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
