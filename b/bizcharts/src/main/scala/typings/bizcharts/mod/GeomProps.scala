package typings.bizcharts.mod

import typings.antvG2.mod.Styles.line
import typings.bizcharts.anon.DodgeBy
import typings.bizcharts.anon.Name
import typings.react.mod.Props
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
  implicit class GeomPropsOps[Self <: GeomProps] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAdjustVarargs(value: (DodgeBy | String)*): Self = this.set("adjust", js.Array(value :_*))
    
    @scala.inline
    def setAdjust(value: String | (js.Array[DodgeBy | String])): Self = this.set("adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjust: Self = this.set("adjust", js.undefined)
    
    @scala.inline
    def setAnimate(value: js.Any): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setColor(
      value: String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[_], String]) | String])
    ): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setLine(value: line | Boolean): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setOpacity(value: String | Double | (js.Tuple2[String, js.Function1[/* d */ js.UndefOr[_], Double]])): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setSelect(value: Boolean | (js.Tuple2[Boolean, _])): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setShape(
      value: String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[_], String])])
    ): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setSize(
      value: Double | String | (js.Tuple2[
          String, 
          (js.Function1[/* d */ js.UndefOr[_], Double]) | (js.Tuple2[Double, Double])
        ])
    ): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object | (js.Tuple2[String, js.Object])): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTooltip(value: Boolean | String | (js.Tuple2[String, js.Function1[/* repeated */ _, Name]])): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setType(value: GeomType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
