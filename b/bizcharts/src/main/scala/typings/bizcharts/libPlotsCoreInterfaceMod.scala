package typings.bizcharts

import typings.antvComponent.libTypesMod.AxisLabelCfg
import typings.antvComponent.libTypesMod.AxisLineCfg
import typings.antvComponent.libTypesMod.AxisTickLineCfg
import typings.antvComponent.libTypesMod.AxisTitleCfg
import typings.antvComponent.libTypesMod.LegendItemNameCfg
import typings.antvComponent.libTypesMod.ListItem
import typings.antvG2.libInterfaceMod.AxisCfg
import typings.antvG2.libInterfaceMod.AxisGridCfg
import typings.antvG2.libInterfaceMod.Datum
import typings.antvG2.libInterfaceMod.G2LegendTitleCfg
import typings.antvG2.libInterfaceMod.GeometryLabelCfg
import typings.antvG2.libInterfaceMod.GeometryLabelContentCallback
import typings.antvG2.libInterfaceMod.LegendCfg
import typings.antvG2.libInterfaceMod.MappingDatum
import typings.antvG2plot.libTypesTooltipMod.TooltipOptions
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsCoreInterfaceMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.bizcharts.bizchartsBooleans.`false`
    - typings.bizcharts.anon.AxisOptionsOmitMetavalues
  */
  trait AxisAPIOptions extends StObject
  
  trait AxisGrid
    extends StObject
       with AxisGridCfg {
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object AxisGrid {
    
    inline def apply(): AxisGrid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisGrid]
    }
    
    extension [Self <: AxisGrid](x: Self) {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait AxisLabel
    extends StObject
       with AxisLabelCfg {
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object AxisLabel {
    
    inline def apply(): AxisLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisLabel]
    }
    
    extension [Self <: AxisLabel](x: Self) {
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait AxisLine
    extends StObject
       with AxisLineCfg {
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object AxisLine {
    
    inline def apply(): AxisLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisLine]
    }
    
    extension [Self <: AxisLine](x: Self) {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait AxisOptions
    extends StObject
       with AxisCfg {
    
    @JSName("grid")
    var grid_AxisOptions: js.UndefOr[Null | AxisGrid] = js.undefined
    
    /**
      * 文本标签的配置项，null 表示不展示。
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
      *
      * 详见 {@link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L127|AxisLabelCfg}
      */
    @JSName("label")
    var label_AxisOptions: js.UndefOr[Null | AxisLabel] = js.undefined
    
    @JSName("line")
    var line_AxisOptions: js.UndefOr[Null | AxisLine] = js.undefined
    
    @JSName("tickLine")
    var tickLine_AxisOptions: js.UndefOr[Null | AxisTickLine] = js.undefined
    
    @JSName("title")
    var title_AxisOptions: js.UndefOr[Null | AxisTitle] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object AxisOptions {
    
    inline def apply(): AxisOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisOptions]
    }
    
    extension [Self <: AxisOptions](x: Self) {
      
      inline def setGrid(value: AxisGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridNull: Self = StObject.set(x, "grid", null)
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setLabel(value: AxisLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLine(value: AxisLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineNull: Self = StObject.set(x, "line", null)
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setTickLine(value: AxisTickLine): Self = StObject.set(x, "tickLine", value.asInstanceOf[js.Any])
      
      inline def setTickLineNull: Self = StObject.set(x, "tickLine", null)
      
      inline def setTickLineUndefined: Self = StObject.set(x, "tickLine", js.undefined)
      
      inline def setTitle(value: AxisTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait AxisTickLine
    extends StObject
       with AxisTickLineCfg {
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object AxisTickLine {
    
    inline def apply(): AxisTickLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisTickLine]
    }
    
    extension [Self <: AxisTickLine](x: Self) {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait AxisTitle
    extends StObject
       with AxisTitleCfg {
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object AxisTitle {
    
    inline def apply(): AxisTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisTitle]
    }
    
    extension [Self <: AxisTitle](x: Self) {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bizcharts.bizchartsBooleans.`false`
    - typings.bizcharts.libPlotsCoreInterfaceMod.LabelOptions
  */
  trait LabelAPIOptions extends StObject
  
  trait LabelOptions
    extends StObject
       with GeometryLabelCfg
       with LabelAPIOptions {
    
    val formatter: js.UndefOr[String | IGroup | IShape | GeometryLabelContentCallback] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object LabelOptions {
    
    inline def apply(): LabelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelOptions]
    }
    
    extension [Self <: LabelOptions](x: Self) {
      
      inline def setFormatter(value: String | IGroup | IShape | GeometryLabelContentCallback): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterFunction3(
        value: (/* data */ Datum, /* mappingData */ MappingDatum, /* index */ Double) => String | IShape | IGroup
      ): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait LegendTitle
    extends StObject
       with G2LegendTitleCfg {
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object LegendTitle {
    
    inline def apply(): LegendTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendTitle]
    }
    
    extension [Self <: LegendTitle](x: Self) {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bizcharts.bizchartsBooleans.`false`
    - typings.bizcharts.libPlotsCoreInterfaceMod.LengendOptions
  */
  trait LengendAPIOptions extends StObject
  
  trait LengendOptions
    extends StObject
       with LegendCfg
       with LengendAPIOptions {
    
    /**
      * 请使用itemName.formatter替代
      * **分类图例适用**，图例项 name 文本的配置。
      * 属性结构如下：
      *
      * ```ts
      * {
      *   spacing?: number; // 图例项 name 同后面 value 的间距
      *   formatter?: (text: string, item: ListItem, index: number) => any; // 格式化文本函数
      *   style?: ShapeAttrs; // 文本配置项
      * }
      * ```
      */
    var formatter: js.UndefOr[formatterCallback] = js.undefined
    
    /**
      * 请使用itemName替代
      * **分类图例适用**，图例项 name 文本的配置。
      * 属性结构如下：
      *
      * ```ts
      * {
      *   spacing?: number; // 图例项 name 同后面 value 的间距
      *   formatter?: (text: string, item: ListItem, index: number) => any; // 格式化文本函数
      *   style?: ShapeAttrs; // 文本配置项
      * }
      * ```
      */
    var text: js.UndefOr[LegendItemNameCfg] = js.undefined
    
    @JSName("title")
    var title_LengendOptions: js.UndefOr[LegendTitle] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object LengendOptions {
    
    inline def apply(container: IGroup): LengendOptions = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[LengendOptions]
    }
    
    extension [Self <: LengendOptions](x: Self) {
      
      inline def setFormatter(value: (/* text */ String, /* item */ ListItem, /* index */ Double) => Any): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setText(value: LegendItemNameCfg): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: LegendTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bizcharts.bizchartsBooleans.`false`
    - typings.bizcharts.libPlotsCoreInterfaceMod.TooltipCfg
  */
  trait TooltipAPIOptions extends StObject
  
  trait TooltipCfg
    extends StObject
       with TooltipOptions
       with TooltipAPIOptions {
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object TooltipCfg {
    
    inline def apply(): TooltipCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipCfg]
    }
    
    extension [Self <: TooltipCfg](x: Self) {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type formatterCallback = js.Function3[/* text */ String, /* item */ ListItem, /* index */ Double, Any]
}
