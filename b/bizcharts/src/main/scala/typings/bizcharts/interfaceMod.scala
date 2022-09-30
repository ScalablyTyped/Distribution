package typings.bizcharts

import org.scalablytyped.runtime.StringDictionary
import typings.antvG2.libInterfaceMod.AdjustOption
import typings.antvG2.libInterfaceMod.AnimateOption
import typings.antvG2.libInterfaceMod.ChartCfg
import typings.antvG2.libInterfaceMod.ColorAttrCallback
import typings.antvG2.libInterfaceMod.Datum
import typings.antvG2.libInterfaceMod.GeometryLabelCfg
import typings.antvG2.libInterfaceMod.GeometryTooltipOption
import typings.antvG2.libInterfaceMod.LabelCallback
import typings.antvG2.libInterfaceMod.LabelOption
import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvG2.libInterfaceMod.ScaleOption
import typings.antvG2.libInterfaceMod.ShapeAttrCallback
import typings.antvG2.libInterfaceMod.SizeAttrCallback
import typings.antvG2.libInterfaceMod.StateOption
import typings.antvG2.libInterfaceMod.StyleCallback
import typings.antvG2.libInterfaceMod.StyleOption
import typings.antvG2.libInterfaceMod.TooltipCallback
import typings.antvG2.libInterfaceMod.ViewCfg
import typings.antvG2.libInterfaceMod.ViewPadding
import typings.bizcharts.anon.End
import typings.bizcharts.bizchartsBooleans.`false`
import typings.bizcharts.bizchartsStrings.dodge
import typings.bizcharts.bizchartsStrings.jitter
import typings.bizcharts.bizchartsStrings.stack
import typings.bizcharts.bizchartsStrings.symmetric
import typings.react.mod.ReactElement
import typings.reactErrorBoundary.mod.ErrorBoundaryProps
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @JSImport("bizcharts/lib/interface", "Chart")
  @js.native
  open class Chart protected ()
    extends typings.antvG2.chartMod.Chart {
    def this(props: ChartCfg) = this()
  }
  
  @JSImport("bizcharts/lib/interface", "View")
  @js.native
  open class View protected ()
    extends typings.antvG2.viewMod.View {
    def this(props: ViewCfg) = this()
  }
  
  type ColorString = String
  
  type EventFunc = js.Function1[/* IEvent */ Any, Any]
  
  type FieldString = String
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped 'ref' extends keyof any ? any extends react.anon.Ref ? string extends any ? react.react.PropsWithoutRef<any> & react.anon.1 : any : any : any */ trait IBaseGemoProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * 设置数据调整方式。G2 目前内置了四种类型：
      * 1. dodge
      * 2. stack
      * 3. symmetric
      * 4. jitter
      *
      * **Tip**
      * + 对于 'dodge' 类型，可以额外进行如下属性的配置:
      * ```typescript
      * <Geom adjust={['dodge', {
      *   marginRatio: 0, // 取 0 到 1 范围的值（相对于每个柱子宽度），用于控制一个分组中柱子之间的间距
      *   dodgeBy: 'x', // 该属性只对 'dodge' 类型生效，声明以哪个数据字段为分组依据
      * }]}
      * ```
      *
      * + 对于 'stack' 类型，可以额外进行如下属性的配置:
      * ```typescript
      * <Geom adjust={{
      *   type: 'stack',
      *   reverseOrder: false, // 用于控制是否对数据进行反序操作
      * }} />
      * ```
      *
      * @example
      * ```typescript
      * <Geom adjust="stack" />
      *
      * <Geom adjust={{
      *   type: 'stack',
      *   reverseOrder: false,
      * }} />
      *
      * // 组合使用 adjust
      * <Geom adjust={[
      *   { type: 'stack' },
      *   { type: 'dodge', dodgeBy: 'x' },
      * ]} />
      * ```
      *
      * @type {('dodge' | 'stack' | 'symmetric' | 'jitter' | string | string[] | AdjustOption | AdjustOption[])}
      * @memberof IBaseGemo
      */
    var adjust: js.UndefOr[
        dodge | stack | symmetric | jitter | String | AdjustOption | js.Array[AdjustOption]
      ] = js.undefined
    
    /**
      * Geometry 动画配置。
      *
      * + `<Geom animate={false} />` 关闭动画
      * + `<Geom animate />` 开启动画，默认开启。
      *
      * 我们将动画分为四个场景：
      * 1. appear: 图表第一次加载时的入场动画；
      * 2. enter: 图表绘制完成，发生更新后，产生的新图形的进场动画；
      * 3. update: 图表绘制完成，数据发生变更后，有状态变更的图形的更新动画；
      * 4. leave: 图表绘制完成，数据发生变更后，被销毁图形的销毁动画。
      *
      * @example
      * ```typescript
      * <Geom animate={{
      *   enter: {
      *     duration: 1000, // enter 动画执行时间
      *   },
      *   leave: false, // 关闭 leave 销毁动画
      * }} />;
      * ```
      *
      *
      * @type {(AnimateOption | boolean)}
      * @memberof IBaseGemo
      */
    var animate: js.UndefOr[AnimateOption | Boolean] = js.undefined
    
    /**
      * @example
      * ```typescript
      * // data: [{ x: 'A', y: 10, color: 'red' }, { x: 'B', y: 30, color: 'yellow' }]
      * <Geomy color={{
      *   fields: [ 'x' ],
      *   values: [ '#1890ff', '#5AD8A6' ],
      * }} />;
      *
      * // 使用 '#1890ff' 颜色渲染图形
      * <Geom color="#1890ff" />
      *
      * // 根据 x 字段的数据值进行颜色的映射，这时候会在内部调用默认的回调函数，读取默认提供的颜色进行数据值到颜色值的映射。
      * <Geom color="x" />
      *
      * // 将 'x' 字段的数据值映射至指定的颜色值 colors（可以是字符串也可以是数组），此时用于通常映射分类数据
      * <Geom color={['x', [ '#1890ff', '#5AD8A6' ]]} />
      *
      * // 使用回调函数进行颜色值的自定义；可以使用多个字段使用、*号连接
      * <Geom color={['x', (xVal) => {
      *   if (xVal === 'a') {
      *     return 'red';
      *   }
      *   return 'blue';
      * }]} />
      *
      * // 指定颜色的渐变路径，用于映射连续的数据
      * <Geom color={['x', '#BAE7FF-#1890FF-#0050B3']} />
      * ```
      * @type {(ColorString | [ FieldString, ColorString | ColorString[] | ColorAttrCallback ])}
      * @memberof IBaseGemo
      */
    var color: js.UndefOr[
        ColorString | FieldString | (js.Tuple2[FieldString, ColorString | js.Array[ColorString] | ColorAttrCallback])
      ] = js.undefined
    
    /**
      *
      * Geometry label 配置。
      *
      * @example
      * ```ts
      * // data: [ {x: 1, y: 2, z: 'a'}, {x: 2, y: 2, z: 'b'} ]
      *
      * <Interval label="y" />
      *
      
      *
      * @type {(LabelOption | false | FieldString | [FieldString, GeometryLabelCfg | LabelCallback] | [FieldString, LabelCallback, GeometryLabelCfg])}
      * @memberof IBaseGemo
      */
    var label: js.UndefOr[
        LabelOption | `false` | FieldString | (js.Tuple2[FieldString, GeometryLabelCfg | LabelCallback]) | (js.Tuple3[FieldString, LabelCallback, GeometryLabelCfg])
      ] = js.undefined
    
    /** 图形数据坐标 */
    var position: String
    
    /**
      * 用来设置默认选中的图形元素，或者做条件样式。
      * 在图表绘制后执行。
      * <Geom setElements={(elements) => {
      *   elements.forEach(ele => {
      *     const data = elements.data;
      *     if (data.id = 'xx') {
      *       ele.setState('selected', true); // 默认选中
      *     }
      *   })
      *  }} />
      * @type (elements:Element[]) => {}
      * @memberof IBaseGemoProps
      */
    var setElements: js.UndefOr[js.Function1[/* elements */ js.Array[Element], js.Object]] = js.undefined
    
    /**
      *
      * @example
      * ```typescript
      * // data: [{ x: 'A', y: 10, color: 'red' }, { x: 'B', y: 30, color: 'yellow' }]
      *
      * // 指定常量，将所有数据值映射到固定的 shape
      * <Geom shape="circle" />
      *
      * // 将指定的字段映射到内置的 shapes 数组中
      * <Geom shape="x" />
      *
      * // 将指定的字段映射到指定的 shapes 数组中
      * <Geom shape={['x', [ 'circle', 'diamond', 'square' ]]} />
      *
      * // 使用回调函数获取 shape，用于个性化的 shape 定制，可以根据单个或者多个字段确定
      * <Geom shape={[
      *   'x',
      *   (xVal) => {
      *     if (xVal === 'a') {
      *       return 'circle';
      *     }
      *     return 'diamond';
      *   }
      * ]} />
      * ```
      * @type {(ShapeString | FieldString | [ShapeString, ShapeString[] | ShapeAttrCallback])}
      * @memberof IBaseGemo
      */
    var shape: js.UndefOr[
        ShapeString | FieldString | (js.Tuple2[ShapeString, js.Array[ShapeString] | ShapeAttrCallback])
      ] = js.undefined
    
    /**
      *
      * @example
      * ```typescript
      * // data: [{ x: 'A', y: 10, color: 'red' }, { x: 'B', y: 30, color: 'yellow' }]
      *
      * // 直接指定像素大小
      * <Geom size={10} />
      *
      * // 指定映射到 size 的字段，使用内置的默认大小范围为 [1, 10]
      * <Geom size="x" />
      *
      * // 指定映射到 size 字段外，还提供了 size 的最大值和最小值范围
      * <Geom size={['x', [ 5, 30 ]]} />
      *
      * // 使用回调函数映射 size，用于个性化的 size 定制，可以使用多个字段进行映射
      * <Geom size={['x', (xVal) => {
      *   if (xVal === 'a') {
      *     return 10;
      *   }
      *   return 5;
      * }]} />
      * ```
      *
      * @type {( number | FieldString | [FieldString, SizeAttrCallback | SizeRange])}
      * @memberof IBaseGemo
      */
    var size: js.UndefOr[Double | FieldString | (js.Tuple2[FieldString, SizeAttrCallback | SizeRange])] = js.undefined
    
    /**
      *设置状态对应的样式。
      *
      * @example
      * ```ts
      * <Geom state={{
      *   selected: {
      *     animate: { duration: 100, easing: 'easeLinear' },
      *     style: {
      *       lineWidth: 2,
      *       stroke: '#000',
      *     },
      *   },
      * }} />
      * ```
      *
      * 如果图形 shape 是由多个 shape 组成，即为一个 G.Group 对象，那么针对 group 中的每个 shape，我们需要使用下列方式进行状态样式设置：
      * 如果我们为 group 中的每个 shape 设置了 'name' 属性(shape.set('name', 'xx'))，则以 'name' 作为 key，否则默认以索引值（即 shape 的 添加顺序）为 key。
      *
      * ```ts
      * <Geom state={{
      *   selected: {
      *     style: {
      *       0: { lineWidth: 2 },
      *       1: { fillOpacity: 1 },
      *     }
      *   }
      * }} />
      * ```
      *
      * @type {StateOption}
      * @memberof IBaseGemo
      */
    var state: js.UndefOr[StateOption] = js.undefined
    
    /**
      *
      * 图形样式配置。
      *
      * @example
      * ```typescript
      * // 配置图形样式
      * <Geom style={{
      *   lineWidth: 2,
      *   stroke: '#1890ff',
      * }} />
      *
      * // 根据具体的数据进行详细配置
      * <Geom style={{
      *   fields: [ 'x', 'y' ], // 数据字段
      *   callback: (xVal, yVal) => {
      *     const style = { lineWidth: 2, stroke: '#1890ff' };
      *     if (xVal === 'a') {
      *       style.lineDash = [ 2, 2 ];
      *     }
      *     return style;
      *   },
      * }} />
      * ```
      * ```typescript
      * // 根据具体的数据进行详细配置 [FieldString, StyleCallback]
      * <Geom style={['x*y', (xVal, yVal) => {
      *   const style = { lineWidth: 2, stroke: '#1890ff' };
      *   if (xVal === 'a') {
      *     style.lineDash = [ 2, 2 ];
      *   }
      *   return style;
      * }]} />
      * ```
      *
      * @type {(StyleOption | LooseObject | [FieldString, StyleCallback])}
      * @memberof IBaseGemo
      */
    var style: js.UndefOr[StyleOption | LooseObject | (js.Tuple2[FieldString, StyleCallback])] = js.undefined
    
    /**
      * 配置 Geometry 显示的 tooltip 内容。
      *
      * `tooltip={false}` 代表关闭 tooltip。
      * `tooltip={true}` 代表开启 tooltip。
      *
      * Geometry 默认允许 tooltip 展示，我们可以使用以下方法对 tooltip 的展示内容进行配置：
      *
      * @example
      * ```typescript
      * // data: [{x: 'a', y: 10}]
      * <Geom tooltip="x" />
      * ```
      *
      * ```typescript
      * <Geom tooltip={{
      *   fields: [ 'x', 'y' ],
      * }} />
      * ```
      * 方法同样支持数据映射及回调用法：
      *
      * @example
      * ```typescript
      * <Tooltip itemTpl="<li>{x}: {y}</li>" />
      *
      * <Line tooltip={{
      *     fields: [ 'x', 'y' ],
      *     callback: (x, y) => {
      *       return {
      *         x,
      *         y,
      *       };
      *     },
      *   }} />
      * // 等同于
      * <Line tooltip={['x*y', (x, y) => {
      *       return {
      *         x,
      *         y,
      *       };
      *     }]} />
      *
      * 其返回的值必须为对象，该值中的属性同 Tooltip 的 itemTpl 模板相对应，返回的变量可用于 itemTpl 的字符串模板。
      *
      *
      * @type {(GeometryTooltipOption | boolean | FieldString | [FieldString, TooltipCallback])}
      * @memberof IBaseGemo
      */
    var tooltip: js.UndefOr[
        GeometryTooltipOption | Boolean | FieldString | (js.Tuple2[FieldString, TooltipCallback])
      ] = js.undefined
  }
  object IBaseGemoProps {
    
    inline def apply(position: String): IBaseGemoProps = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBaseGemoProps]
    }
    
    extension [Self <: IBaseGemoProps](x: Self) {
      
      inline def setAdjust(value: dodge | stack | symmetric | jitter | String | AdjustOption | js.Array[AdjustOption]): Self = StObject.set(x, "adjust", value.asInstanceOf[js.Any])
      
      inline def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
      
      inline def setAdjustVarargs(value: AdjustOption*): Self = StObject.set(x, "adjust", js.Array(value*))
      
      inline def setAnimate(value: AnimateOption | Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setColor(
        value: ColorString | FieldString | (js.Tuple2[FieldString, ColorString | js.Array[ColorString] | ColorAttrCallback])
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setLabel(
        value: LabelOption | `false` | FieldString | (js.Tuple2[FieldString, GeometryLabelCfg | LabelCallback]) | (js.Tuple3[FieldString, LabelCallback, GeometryLabelCfg])
      ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setSetElements(value: /* elements */ js.Array[Element] => js.Object): Self = StObject.set(x, "setElements", js.Any.fromFunction1(value))
      
      inline def setSetElementsUndefined: Self = StObject.set(x, "setElements", js.undefined)
      
      inline def setShape(
        value: ShapeString | FieldString | (js.Tuple2[ShapeString, js.Array[ShapeString] | ShapeAttrCallback])
      ): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: Double | FieldString | (js.Tuple2[FieldString, SizeAttrCallback | SizeRange])): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setState(value: StateOption): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStyle(value: StyleOption | LooseObject | (js.Tuple2[FieldString, StyleCallback])): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTooltip(value: GeometryTooltipOption | Boolean | FieldString | (js.Tuple2[FieldString, TooltipCallback])): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait IChartProps
    extends StObject
       with IViewProps {
    
    /**
      *  ErrorBoundary 使用的是 react-error-boundary, 可通过ErrorBoundaryProps透传其属性
      *  @example ErrorBoundaryProps={{FallbackComponent: error => <div>{error}</div>}}
      */
    var ErrorBoundaryProps: js.UndefOr[typings.reactErrorBoundary.mod.ErrorBoundaryProps] = js.undefined
    
    /**
      * 图表是否自适应容器宽高，默认为 false，用户需要手动设置 width 和 height。
      * 当 `autoFit: true` 时，会自动取图表容器的宽高，如果用户设置了 height，那么会以用户设置的 height 为准。
      */
    var autoFit: js.UndefOr[Boolean] = js.undefined
    
    /** 指定 chart 绘制的 DOM，可以传入 DOM id，也可以直接传入 dom 实例。 */
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * 配置图表默认交互，仅支持字符串形式。
      */
    var defaultInteractions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * 发生错误的时候显示的内容, errorContent api已调整，
      * 请使用 ErrorBoundaryProps
      * @example ErrorBoundaryProps={{FallbackComponent: error => <div>{error}</div>}}
      */
    var errorContent: js.UndefOr[ReactElement] = js.undefined
    
    var events: js.UndefOr[StringDictionary[EventFunc]] = js.undefined
    
    var forceUpdate: js.UndefOr[Boolean] = js.undefined
    
    /** 图表高度。 */
    var height: js.UndefOr[Double] = js.undefined
    
    /** 是否对超出坐标系范围的 Geometry 进行剪切 */
    var limitInPlot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 是否开启局部刷新，默认开启。
      */
    var localRefresh: js.UndefOr[Boolean] = js.undefined
    
    /** 当数据量过大的时候，可以手动关闭此选项，避免对比数据带来的性能开销 */
    var notCompareData: js.UndefOr[Boolean] = js.undefined
    
    var onAfterchangedata: js.UndefOr[EventFunc] = js.undefined
    
    var onAfterclear: js.UndefOr[EventFunc] = js.undefined
    
    var onAfterpaint: js.UndefOr[EventFunc] = js.undefined
    
    var onAfterrender: js.UndefOr[EventFunc] = js.undefined
    
    var onBeforechangedata: js.UndefOr[EventFunc] = js.undefined
    
    var onBeforeclear: js.UndefOr[EventFunc] = js.undefined
    
    var onBeforedestroy: js.UndefOr[EventFunc] = js.undefined
    
    var onBeforepaint: js.UndefOr[EventFunc] = js.undefined
    
    var onBeforerender: js.UndefOr[EventFunc] = js.undefined
    
    var onClick: js.UndefOr[EventFunc] = js.undefined
    
    var onContextmenu: js.UndefOr[EventFunc] = js.undefined
    
    var onDblclick: js.UndefOr[EventFunc] = js.undefined
    
    var onDrag: js.UndefOr[EventFunc] = js.undefined
    
    var onDragend: js.UndefOr[EventFunc] = js.undefined
    
    var onDragenter: js.UndefOr[EventFunc] = js.undefined
    
    var onDragleave: js.UndefOr[EventFunc] = js.undefined
    
    var onDragover: js.UndefOr[EventFunc] = js.undefined
    
    var onDragstart: js.UndefOr[EventFunc] = js.undefined
    
    var onDrop: js.UndefOr[EventFunc] = js.undefined
    
    var onMousedown: js.UndefOr[EventFunc] = js.undefined
    
    var onMouseenter: js.UndefOr[EventFunc] = js.undefined
    
    var onMouseleave: js.UndefOr[EventFunc] = js.undefined
    
    var onMousemove: js.UndefOr[EventFunc] = js.undefined
    
    var onMouseout: js.UndefOr[EventFunc] = js.undefined
    
    var onMouseover: js.UndefOr[EventFunc] = js.undefined
    
    var onMouseup: js.UndefOr[EventFunc] = js.undefined
    
    var onTouchend: js.UndefOr[EventFunc] = js.undefined
    
    var onTouchmove: js.UndefOr[EventFunc] = js.undefined
    
    var onTouchstart: js.UndefOr[EventFunc] = js.undefined
    
    /** 设置设备像素比，默认取浏览器的值 `window.devicePixelRatio`。 */
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var pure: js.UndefOr[Boolean] = js.undefined
    
    /** 主题 */
    var theme: js.UndefOr[js.Object | String] = js.undefined
    
    /**
      * chart 是否可见，默认为 true，设置为 false 则会隐藏。
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** 图表宽度。 */
    var width: js.UndefOr[Double] = js.undefined
  }
  object IChartProps {
    
    inline def apply(): IChartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IChartProps]
    }
    
    extension [Self <: IChartProps](x: Self) {
      
      inline def setAutoFit(value: Boolean): Self = StObject.set(x, "autoFit", value.asInstanceOf[js.Any])
      
      inline def setAutoFitUndefined: Self = StObject.set(x, "autoFit", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDefaultInteractions(value: js.Array[String]): Self = StObject.set(x, "defaultInteractions", value.asInstanceOf[js.Any])
      
      inline def setDefaultInteractionsUndefined: Self = StObject.set(x, "defaultInteractions", js.undefined)
      
      inline def setDefaultInteractionsVarargs(value: String*): Self = StObject.set(x, "defaultInteractions", js.Array(value*))
      
      inline def setErrorBoundaryProps(value: ErrorBoundaryProps): Self = StObject.set(x, "ErrorBoundaryProps", value.asInstanceOf[js.Any])
      
      inline def setErrorBoundaryPropsUndefined: Self = StObject.set(x, "ErrorBoundaryProps", js.undefined)
      
      inline def setErrorContent(value: ReactElement): Self = StObject.set(x, "errorContent", value.asInstanceOf[js.Any])
      
      inline def setErrorContentUndefined: Self = StObject.set(x, "errorContent", js.undefined)
      
      inline def setEvents(value: StringDictionary[EventFunc]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setForceUpdate(value: Boolean): Self = StObject.set(x, "forceUpdate", value.asInstanceOf[js.Any])
      
      inline def setForceUpdateUndefined: Self = StObject.set(x, "forceUpdate", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLimitInPlot(value: Boolean): Self = StObject.set(x, "limitInPlot", value.asInstanceOf[js.Any])
      
      inline def setLimitInPlotUndefined: Self = StObject.set(x, "limitInPlot", js.undefined)
      
      inline def setLocalRefresh(value: Boolean): Self = StObject.set(x, "localRefresh", value.asInstanceOf[js.Any])
      
      inline def setLocalRefreshUndefined: Self = StObject.set(x, "localRefresh", js.undefined)
      
      inline def setNotCompareData(value: Boolean): Self = StObject.set(x, "notCompareData", value.asInstanceOf[js.Any])
      
      inline def setNotCompareDataUndefined: Self = StObject.set(x, "notCompareData", js.undefined)
      
      inline def setOnAfterchangedata(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onAfterchangedata", js.Any.fromFunction1(value))
      
      inline def setOnAfterchangedataUndefined: Self = StObject.set(x, "onAfterchangedata", js.undefined)
      
      inline def setOnAfterclear(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onAfterclear", js.Any.fromFunction1(value))
      
      inline def setOnAfterclearUndefined: Self = StObject.set(x, "onAfterclear", js.undefined)
      
      inline def setOnAfterpaint(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onAfterpaint", js.Any.fromFunction1(value))
      
      inline def setOnAfterpaintUndefined: Self = StObject.set(x, "onAfterpaint", js.undefined)
      
      inline def setOnAfterrender(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onAfterrender", js.Any.fromFunction1(value))
      
      inline def setOnAfterrenderUndefined: Self = StObject.set(x, "onAfterrender", js.undefined)
      
      inline def setOnBeforechangedata(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onBeforechangedata", js.Any.fromFunction1(value))
      
      inline def setOnBeforechangedataUndefined: Self = StObject.set(x, "onBeforechangedata", js.undefined)
      
      inline def setOnBeforeclear(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onBeforeclear", js.Any.fromFunction1(value))
      
      inline def setOnBeforeclearUndefined: Self = StObject.set(x, "onBeforeclear", js.undefined)
      
      inline def setOnBeforedestroy(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onBeforedestroy", js.Any.fromFunction1(value))
      
      inline def setOnBeforedestroyUndefined: Self = StObject.set(x, "onBeforedestroy", js.undefined)
      
      inline def setOnBeforepaint(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onBeforepaint", js.Any.fromFunction1(value))
      
      inline def setOnBeforepaintUndefined: Self = StObject.set(x, "onBeforepaint", js.undefined)
      
      inline def setOnBeforerender(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onBeforerender", js.Any.fromFunction1(value))
      
      inline def setOnBeforerenderUndefined: Self = StObject.set(x, "onBeforerender", js.undefined)
      
      inline def setOnClick(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextmenu(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onContextmenu", js.Any.fromFunction1(value))
      
      inline def setOnContextmenuUndefined: Self = StObject.set(x, "onContextmenu", js.undefined)
      
      inline def setOnDblclick(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onDblclick", js.Any.fromFunction1(value))
      
      inline def setOnDblclickUndefined: Self = StObject.set(x, "onDblclick", js.undefined)
      
      inline def setOnDrag(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDragend(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onDragend", js.Any.fromFunction1(value))
      
      inline def setOnDragendUndefined: Self = StObject.set(x, "onDragend", js.undefined)
      
      inline def setOnDragenter(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onDragenter", js.Any.fromFunction1(value))
      
      inline def setOnDragenterUndefined: Self = StObject.set(x, "onDragenter", js.undefined)
      
      inline def setOnDragleave(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onDragleave", js.Any.fromFunction1(value))
      
      inline def setOnDragleaveUndefined: Self = StObject.set(x, "onDragleave", js.undefined)
      
      inline def setOnDragover(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onDragover", js.Any.fromFunction1(value))
      
      inline def setOnDragoverUndefined: Self = StObject.set(x, "onDragover", js.undefined)
      
      inline def setOnDragstart(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onDragstart", js.Any.fromFunction1(value))
      
      inline def setOnDragstartUndefined: Self = StObject.set(x, "onDragstart", js.undefined)
      
      inline def setOnDrop(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnMousedown(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onMousedown", js.Any.fromFunction1(value))
      
      inline def setOnMousedownUndefined: Self = StObject.set(x, "onMousedown", js.undefined)
      
      inline def setOnMouseenter(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onMouseenter", js.Any.fromFunction1(value))
      
      inline def setOnMouseenterUndefined: Self = StObject.set(x, "onMouseenter", js.undefined)
      
      inline def setOnMouseleave(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onMouseleave", js.Any.fromFunction1(value))
      
      inline def setOnMouseleaveUndefined: Self = StObject.set(x, "onMouseleave", js.undefined)
      
      inline def setOnMousemove(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onMousemove", js.Any.fromFunction1(value))
      
      inline def setOnMousemoveUndefined: Self = StObject.set(x, "onMousemove", js.undefined)
      
      inline def setOnMouseout(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onMouseout", js.Any.fromFunction1(value))
      
      inline def setOnMouseoutUndefined: Self = StObject.set(x, "onMouseout", js.undefined)
      
      inline def setOnMouseover(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onMouseover", js.Any.fromFunction1(value))
      
      inline def setOnMouseoverUndefined: Self = StObject.set(x, "onMouseover", js.undefined)
      
      inline def setOnMouseup(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onMouseup", js.Any.fromFunction1(value))
      
      inline def setOnMouseupUndefined: Self = StObject.set(x, "onMouseup", js.undefined)
      
      inline def setOnTouchend(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onTouchend", js.Any.fromFunction1(value))
      
      inline def setOnTouchendUndefined: Self = StObject.set(x, "onTouchend", js.undefined)
      
      inline def setOnTouchmove(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onTouchmove", js.Any.fromFunction1(value))
      
      inline def setOnTouchmoveUndefined: Self = StObject.set(x, "onTouchmove", js.undefined)
      
      inline def setOnTouchstart(value: /* IEvent */ Any => Any): Self = StObject.set(x, "onTouchstart", js.Any.fromFunction1(value))
      
      inline def setOnTouchstartUndefined: Self = StObject.set(x, "onTouchstart", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
      
      inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
      
      inline def setTheme(value: js.Object | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IEvent
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var clientX: js.UndefOr[Double] = js.undefined
    
    var clientY: js.UndefOr[Double] = js.undefined
    
    var event: js.UndefOr[Any] = js.undefined
    
    var gEvent: js.UndefOr[Any] = js.undefined
    
    var target: js.UndefOr[Any] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var view: js.UndefOr[typings.antvG2.viewMod.View] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object IEvent {
    
    inline def apply(): IEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEvent]
    }
    
    extension [Self <: IEvent](x: Self) {
      
      inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      inline def setClientXUndefined: Self = StObject.set(x, "clientX", js.undefined)
      
      inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      inline def setClientYUndefined: Self = StObject.set(x, "clientY", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setGEvent(value: Any): Self = StObject.set(x, "gEvent", value.asInstanceOf[js.Any])
      
      inline def setGEventUndefined: Self = StObject.set(x, "gEvent", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setView(value: typings.antvG2.viewMod.View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any extends new (props : infer P): react.react.Component<any, any, any> ? react.react.PropsWithoutRef<any> & react.react.RefAttributes<std.InstanceType<any>> : react.react.PropsWithRef<react.react.ComponentProps<any>> */ trait IViewProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /** 数据源配置。 */
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * @memberof IView
      * 设置数据筛选规则。
      *
      * ```ts
      * 3.x 写法
      * <View filter={[
      *   ['city', (value: any, datum: Datum) => value !== '杭州'],
      *   ['value', (value: any, datum: Datum) => value > 100]
      * ]} />
      *
      * <View filter={{
      *   'city': (value: any, datum: Datum) => value !== '杭州'],
      *   'value': (value: any, datum: Datum) => value > 100],
      * }} />
      *
      * // 删除 'city' 字段对应的筛选规则。
      * <View filter={{
      *  'city': null
      * }} />
      * ```
      *
      * @param filter [string, null | ((value: any, datum: Datum) => boolean)][] 或者 Record<string, (value: any, datum: Datum) => boolean>
      */
    var filter: js.UndefOr[
        (js.Array[
          js.Tuple2[String, Null | (js.Function2[/* value */ Any, /* datum */ Datum, Boolean])]
        ]) | (Record[String, js.Function2[/* value */ Any, /* datum */ Datum, Boolean]])
      ] = js.undefined
    
    /**
      * 设置图表的内边距，使用方式参考 CSS 盒模型。
      * @example
      * 1. padding: 20
      * 2. padding: [ 10, 30, 30 ]
      */
    var padding: js.UndefOr[ViewPadding] = js.undefined
    
    /** view 的绘制范围，起始点为左上角。 */
    var region: js.UndefOr[End] = js.undefined
    
    /** 列定义配置，用于配置数值的类型等，以 data 中的数据属性为 key。 */
    var scale: js.UndefOr[StringDictionary[ScaleOption]] = js.undefined
  }
  object IViewProps {
    
    inline def apply(): IViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IViewProps]
    }
    
    extension [Self <: IViewProps](x: Self) {
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFilter(
        value: (js.Array[
              js.Tuple2[String, Null | (js.Function2[/* value */ Any, /* datum */ Datum, Boolean])]
            ]) | (Record[String, js.Function2[/* value */ Any, /* datum */ Datum, Boolean]])
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: (js.Tuple2[String, Null | (js.Function2[/* value */ Any, /* datum */ Datum, Boolean])])*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setPadding(value: ViewPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setRegion(value: End): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setScale(value: StringDictionary[ScaleOption]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
  
  type ShapeString = String
  
  type SizeRange = js.Tuple2[Double, Double]
}
