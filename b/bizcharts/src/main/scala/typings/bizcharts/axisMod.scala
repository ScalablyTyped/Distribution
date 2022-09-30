package typings.bizcharts

import typings.antvComponent.typesMod.AxisLabelCfg
import typings.antvComponent.typesMod.AxisLineCfg
import typings.antvComponent.typesMod.AxisSubTickLineCfg
import typings.antvComponent.typesMod.AxisTickLineCfg
import typings.antvComponent.typesMod.AxisTitleCfg
import typings.antvG2.libInterfaceMod.AxisGridCfg
import typings.antvG2.libInterfaceMod.ComponentAnimateOption
import typings.bizcharts.bizchartsStrings.bottom
import typings.bizcharts.bizchartsStrings.left
import typings.bizcharts.bizchartsStrings.right
import typings.bizcharts.bizchartsStrings.top
import typings.bizcharts.chartMod.Chart
import typings.bizcharts.viewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axisMod {
  
  @JSImport("bizcharts/lib/components/Axis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: IAxis): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait IAxis extends StObject {
    
    /** 动画开关，默认开启。 */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /** 动画参数配置。 */
    var animateOption: js.UndefOr[ComponentAnimateOption] = js.undefined
    
    /** 坐标轴网格线的配置项，false 表示不展示。 */
    var grid: js.UndefOr[AxisGridCfg | Null | Boolean] = js.undefined
    
    /**
      * 文本标签的配置项，false | null 表示不展示。
      * 属性结构如下：
      *
      * ```ts
      * {
      *   // 坐标轴文本的样式
      *   style?: ShapeAttrs;
      *   // label 的偏移量
      *   offset?: number;
      *   // 文本旋转角度
      *   rotate?: number;
      *   // 格式化函数
      *   formatter?: (text: string, item: ListItem, index: number) => any;
      *   // 是否自动旋转，默认 true
      *   autoRotate?: boolean | (isVertical: boolean, labelGroup: IGroup, limitLength?: number) => boolean; | string;
      *   // 是否自动隐藏，默认 false
      *   autoHide?: boolean | (isVertical: boolean, labelGroup: IGroup, limitLength?: number) => boolean; | string;
      *   // 是否自动省略，默认 false
      *   autoEllipsis?: boolean | (isVertical: boolean, labelGroup: IGroup, limitLength?: number) => boolean; | string;
      * }
      * ```
      */
    var label: js.UndefOr[AxisLabelCfg | Null | Boolean] = js.undefined
    
    /**
      * 坐标轴线的配置项，null | false 表示不展示。
      * 属性结构如下：
      *
      * ```ts
      * {
      *   style?: ShapeAttrs; // 坐标轴线的样式配置项
      * }
      * ```
      */
    var line: js.UndefOr[AxisLineCfg | Null | Boolean] = js.undefined
    
    /** Axis 对应的数据字段名，如果不配置则对所有轴生效，但只支持配置visible */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * 适用于直角坐标系，设置坐标轴的位置。
      */
    var position: js.UndefOr[top | bottom | right | left] = js.undefined
    
    /**
      * 坐标轴子刻度线的配置项，false | null 表示不展示。
      * 属性结构如下：
      *
      * ```ts
      * {
      *   style?: ShapeAttrs; // 坐标轴刻度线的样式配置项
      *   count?: number; // 子刻度个数
      *   length?: number; // 子刻度线长度
      * }
      * ```
      */
    var subTickLine: js.UndefOr[AxisSubTickLineCfg | Null | Boolean] = js.undefined
    
    /**
      * 坐标轴刻度线线的配置项，null | false 表示不展示。
      * 属性结构如下：
      *
      * ```ts
      * {
      *   style?: ShapeAttrs; // 坐标轴刻度线的样式配置项
      *   alignTick?: boolean; // 是否同 tick 对齐
      *   length?: number;  // 长度
      * }
      * ```
      */
    var tickLine: js.UndefOr[AxisTickLineCfg | Null | Boolean] = js.undefined
    
    /**
      * 标题的配置项，null | false 表示不展示。
      * 属性结构如下：
      *
      * ```ts
      * {
      *   offset?: number; // 标题距离坐标轴的距离
      *   style?: ShapeAttrs; // 标题文本配置项
      *   autoRotate?: boolean; // 是否自动旋转
      * }
      * ```
      *
      */
    var title: js.UndefOr[Boolean | AxisTitleCfg | Null] = js.undefined
    
    /** 标记坐标轴 label 的方向，左侧为 1，右侧为 -1。 */
    var verticalFactor: js.UndefOr[Double] = js.undefined
    
    /** 来自父级的 chart 或者 view实例 */
    var view: js.UndefOr[Chart | View] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object IAxis {
    
    inline def apply(): IAxis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAxis]
    }
    
    extension [Self <: IAxis](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateOption(value: ComponentAnimateOption): Self = StObject.set(x, "animateOption", value.asInstanceOf[js.Any])
      
      inline def setAnimateOptionUndefined: Self = StObject.set(x, "animateOption", js.undefined)
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setGrid(value: AxisGridCfg | Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridNull: Self = StObject.set(x, "grid", null)
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setLabel(value: AxisLabelCfg | Boolean): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLine(value: AxisLineCfg | Boolean): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineNull: Self = StObject.set(x, "line", null)
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPosition(value: top | bottom | right | left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSubTickLine(value: AxisSubTickLineCfg | Boolean): Self = StObject.set(x, "subTickLine", value.asInstanceOf[js.Any])
      
      inline def setSubTickLineNull: Self = StObject.set(x, "subTickLine", null)
      
      inline def setSubTickLineUndefined: Self = StObject.set(x, "subTickLine", js.undefined)
      
      inline def setTickLine(value: AxisTickLineCfg | Boolean): Self = StObject.set(x, "tickLine", value.asInstanceOf[js.Any])
      
      inline def setTickLineNull: Self = StObject.set(x, "tickLine", null)
      
      inline def setTickLineUndefined: Self = StObject.set(x, "tickLine", js.undefined)
      
      inline def setTitle(value: Boolean | AxisTitleCfg): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVerticalFactor(value: Double): Self = StObject.set(x, "verticalFactor", value.asInstanceOf[js.Any])
      
      inline def setVerticalFactorUndefined: Self = StObject.set(x, "verticalFactor", js.undefined)
      
      inline def setView(value: Chart | View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
