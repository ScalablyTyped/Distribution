package typings.vegaLite8ozrbXDH

import typings.std.Record
import typings.vegaLite8ozrbXDH.channelDTsMod.SingleDefUnitChannel
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaLite8ozrbXDH.channeldefDTsMod.PrimitiveValue
import typings.vegaLite8ozrbXDH.datetimeDTsMod.DateTime
import typings.vegaLite8ozrbXDH.parameterDTsMod.ParameterName
import typings.vegaLite8ozrbXDH.scaleDTsMod._Domain
import typings.vegaLite8ozrbXDH.utilDTsMod.Dict
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.interval
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.point
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.scales
import typings.vegaTypings.bindMod.Binding
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.configMod.Cursor
import typings.vegaTypings.streamMod.Stream
import typings.vegaTypings.utilMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/selection.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/selection.d.ts", "SELECTION_ID")
  @js.native
  val SELECTION_ID: /* "_vgsid_" */ String = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/selection.d.ts", "defaultConfig")
  @js.native
  val defaultConfig: SelectionConfig = js.native
  
  inline def isLegendBinding(bind: Any): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/selection.d.ts.LegendBinding */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegendBinding")(bind.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/selection.d.ts.LegendBinding */ Boolean]
  
  inline def isLegendStreamBinding(bind: Any): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/selection.d.ts.LegendStreamBinding */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegendStreamBinding")(bind.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/selection.d.ts.LegendStreamBinding */ Boolean]
  
  inline def isSelectionParameter(param: Any): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/selection.d.ts.SelectionParameter<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/selection.d.ts.SelectionType> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelectionParameter")(param.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/selection.d.ts.SelectionParameter<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/selection.d.ts.SelectionType> */ Boolean]
  
  trait BaseSelectionConfig[T /* <: SelectionType */] extends StObject {
    
    /**
      * Clears the selection, emptying it of all values. This property can be a
      * [Event Stream](https://vega.github.io/vega/docs/event-streams/) or `false` to disable clear.
      *
      * __Default value:__ `dblclick`.
      *
      * __See also:__ [`clear` examples ](https://vega.github.io/vega-lite/docs/selection.html#clear) in the documentation.
      */
    var clear: js.UndefOr[Stream | String | Boolean] = js.undefined
    
    /**
      * An array of encoding channels. The corresponding data field values
      * must match for a data tuple to fall within the selection.
      *
      * __See also:__ The [projection with `encodings` and `fields` section](https://vega.github.io/vega-lite/docs/selection.html#project) in the documentation.
      */
    var encodings: js.UndefOr[js.Array[SingleDefUnitChannel]] = js.undefined
    
    /**
      * A [Vega event stream](https://vega.github.io/vega/docs/event-streams/) (object or selector) that triggers the selection.
      * For interval selections, the event stream must specify a [start and end](https://vega.github.io/vega/docs/event-streams/#between-filters).
      *
      * __See also:__ [`on` examples](https://vega.github.io/vega-lite/docs/selection.html#on) in the documentation.
      */
    var on: js.UndefOr[Stream | String] = js.undefined
    
    /**
      * With layered and multi-view displays, a strategy that determines how
      * selections' data queries are resolved when applied in a filter transform,
      * conditional encoding rule, or scale domain.
      *
      * One of:
      * - `"global"` -- only one brush exists for the entire SPLOM. When the user begins to drag, any previous brushes are cleared, and a new one is constructed.
      * - `"union"` -- each cell contains its own brush, and points are highlighted if they lie within _any_ of these individual brushes.
      * - `"intersect"` -- each cell contains its own brush, and points are highlighted only if they fall within _all_ of these individual brushes.
      *
      * __Default value:__ `global`.
      *
      * __See also:__ [`resolve` examples](https://vega.github.io/vega-lite/docs/selection.html#resolve) in the documentation.
      */
    var resolve: js.UndefOr[SelectionResolution] = js.undefined
    
    /**
      * Determines the default event processing and data query for the selection. Vega-Lite currently supports two selection types:
      *
      * - `"point"` -- to select multiple discrete data values; the first value is selected on `click` and additional values toggled on shift-click.
      * - `"interval"` -- to select a continuous range of data values on `drag`.
      */
    var `type`: T
  }
  object BaseSelectionConfig {
    
    inline def apply[T /* <: SelectionType */](`type`: T): BaseSelectionConfig[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseSelectionConfig[T]]
    }
    
    extension [Self <: BaseSelectionConfig[?], T /* <: SelectionType */](x: Self & BaseSelectionConfig[T]) {
      
      inline def setClear(value: Stream | String | Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setEncodings(value: js.Array[SingleDefUnitChannel]): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
      
      inline def setEncodingsUndefined: Self = StObject.set(x, "encodings", js.undefined)
      
      inline def setEncodingsVarargs(value: SingleDefUnitChannel*): Self = StObject.set(x, "encodings", js.Array(value*))
      
      inline def setOn(value: Stream | String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setResolve(value: SelectionResolution): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BrushConfig extends StObject {
    
    /**
      * The mouse cursor used over the interval mark. Any valid [CSS cursor type](https://developer.mozilla.org/en-US/docs/Web/CSS/cursor#Values) can be used.
      */
    var cursor: js.UndefOr[Cursor] = js.undefined
    
    /**
      * The fill color of the interval mark.
      *
      * __Default value:__ `"#333333"`
      *
      */
    var fill: js.UndefOr[Color] = js.undefined
    
    /**
      * The fill opacity of the interval mark (a value between `0` and `1`).
      *
      * __Default value:__ `0.125`
      */
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * The stroke color of the interval mark.
      *
      * __Default value:__ `"#ffffff"`
      */
    var stroke: js.UndefOr[Color] = js.undefined
    
    /**
      * An array of alternating stroke and space lengths, for creating dashed or dotted lines.
      */
    var strokeDash: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The offset (in pixels) with which to begin drawing the stroke dash array.
      */
    var strokeDashOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * The stroke opacity of the interval mark (a value between `0` and `1`).
      */
    var strokeOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * The stroke width of the interval mark.
      */
    var strokeWidth: js.UndefOr[Double] = js.undefined
  }
  object BrushConfig {
    
    inline def apply(): BrushConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrushConfig]
    }
    
    extension [Self <: BrushConfig](x: Self) {
      
      inline def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setFill(value: Color): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setStroke(value: Color): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeDash(value: js.Array[Double]): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashOffset(value: Double): Self = StObject.set(x, "strokeDashOffset", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashOffsetUndefined: Self = StObject.set(x, "strokeDashOffset", js.undefined)
      
      inline def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
      
      inline def setStrokeDashVarargs(value: Double*): Self = StObject.set(x, "strokeDash", js.Array(value*))
      
      inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    }
  }
  
  trait IntervalSelectionConfig
    extends StObject
       with BaseSelectionConfig[interval] {
    
    /**
      * An interval selection also adds a rectangle mark to depict the
      * extents of the interval. The `mark` property can be used to customize the
      * appearance of the mark.
      *
      * __See also:__ [`mark` examples](https://vega.github.io/vega-lite/docs/selection.html#mark) in the documentation.
      */
    var mark: js.UndefOr[BrushConfig] = js.undefined
    
    /**
      * When truthy, allows a user to interactively move an interval selection
      * back-and-forth. Can be `true`, `false` (to disable panning), or a
      * [Vega event stream definition](https://vega.github.io/vega/docs/event-streams/)
      * which must include a start and end event to trigger continuous panning.
      * Discrete panning (e.g., pressing the left/right arrow keys) will be supported in future versions.
      *
      * __Default value:__ `true`, which corresponds to `[mousedown, window:mouseup] > window:mousemove!`.
      * This default allows users to clicks and drags within an interval selection to reposition it.
      *
      * __See also:__ [`translate` examples](https://vega.github.io/vega-lite/docs/selection.html#translate) in the documentation.
      */
    var translate: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * When truthy, allows a user to interactively resize an interval selection.
      * Can be `true`, `false` (to disable zooming), or a [Vega event stream
      * definition](https://vega.github.io/vega/docs/event-streams/). Currently,
      * only `wheel` events are supported,
      * but custom event streams can still be used to specify filters, debouncing, and throttling.
      * Future versions will expand the set of events that can trigger this transformation.
      *
      * __Default value:__ `true`, which corresponds to `wheel!`. This default allows users to use the mouse wheel to resize an interval selection.
      *
      * __See also:__ [`zoom` examples](https://vega.github.io/vega-lite/docs/selection.html#zoom) in the documentation.
      */
    var zoom: js.UndefOr[String | Boolean] = js.undefined
  }
  object IntervalSelectionConfig {
    
    inline def apply(): IntervalSelectionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("interval")
      __obj.asInstanceOf[IntervalSelectionConfig]
    }
    
    extension [Self <: IntervalSelectionConfig](x: Self) {
      
      inline def setMark(value: BrushConfig): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setTranslate(value: String | Boolean): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setZoom(value: String | Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  /* Inlined std.Omit<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/selection.d.ts.IntervalSelectionConfig, 'type'> */
  trait IntervalSelectionConfigWithoutType extends StObject {
    
    var clear: js.UndefOr[Stream | String | Boolean] = js.undefined
    
    var encodings: js.UndefOr[js.Array[SingleDefUnitChannel]] = js.undefined
    
    var mark: js.UndefOr[BrushConfig] = js.undefined
    
    var on: js.UndefOr[Stream | String] = js.undefined
    
    var resolve: js.UndefOr[SelectionResolution] = js.undefined
    
    var translate: js.UndefOr[String | Boolean] = js.undefined
    
    var zoom: js.UndefOr[String | Boolean] = js.undefined
  }
  object IntervalSelectionConfigWithoutType {
    
    inline def apply(): IntervalSelectionConfigWithoutType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntervalSelectionConfigWithoutType]
    }
    
    extension [Self <: IntervalSelectionConfigWithoutType](x: Self) {
      
      inline def setClear(value: Stream | String | Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setEncodings(value: js.Array[SingleDefUnitChannel]): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
      
      inline def setEncodingsUndefined: Self = StObject.set(x, "encodings", js.undefined)
      
      inline def setEncodingsVarargs(value: SingleDefUnitChannel*): Self = StObject.set(x, "encodings", js.Array(value*))
      
      inline def setMark(value: BrushConfig): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setOn(value: Stream | String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setResolve(value: SelectionResolution): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setTranslate(value: String | Boolean): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setZoom(value: String | Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.legend
    - typings.vegaLite8ozrbXDH.selectionDTsMod.LegendStreamBinding
  */
  trait LegendBinding extends StObject
  
  trait LegendStreamBinding
    extends StObject
       with LegendBinding {
    
    var legend: String | Stream
  }
  object LegendStreamBinding {
    
    inline def apply(legend: String | Stream): LegendStreamBinding = {
      val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendStreamBinding]
    }
    
    extension [Self <: LegendStreamBinding](x: Self) {
      
      inline def setLegend(value: String | Stream): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.anon.Param
    - typings.vegaLite8ozrbXDH.anon.EncodingParam
  */
  trait ParameterExtent
    extends StObject
       with _Domain
  object ParameterExtent {
    
    inline def EncodingParam(param: ParameterName): typings.vegaLite8ozrbXDH.anon.EncodingParam = {
      val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.anon.EncodingParam]
    }
    
    inline def Param(param: ParameterName): typings.vegaLite8ozrbXDH.anon.Param = {
      val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.anon.Param]
    }
  }
  
  trait PointSelectionConfig
    extends StObject
       with BaseSelectionConfig[point] {
    
    /**
      * An array of field names whose values must match for a data tuple to
      * fall within the selection.
      *
      * __See also:__ The [projection with `encodings` and `fields` section](https://vega.github.io/vega-lite/docs/selection.html#project) in the documentation.
      */
    var fields: js.UndefOr[js.Array[FieldName]] = js.undefined
    
    /**
      * When true, an invisible voronoi diagram is computed to accelerate discrete
      * selection. The data value _nearest_ the mouse cursor is added to the selection.
      *
      * __Default value:__ `false`, which means that data values must be interacted with directly (e.g., clicked on) to be added to the selection.
      *
      * __See also:__ [`nearest` examples](https://vega.github.io/vega-lite/docs/selection.html#nearest) documentation.
      */
    var nearest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls whether data values should be toggled (inserted or removed from a point selection)
      * or only ever inserted into multi selections.
      *
      * One of:
      * - `true` -- the default behavior, which corresponds to `"event.shiftKey"`.  As a result, data values are toggled when the user interacts with the shift-key pressed.
      * - `false` -- disables toggling behaviour; as the user interacts, data values are only inserted into the multi selection and never removed.
      * - A [Vega expression](https://vega.github.io/vega/docs/expressions/) which is re-evaluated as the user interacts. If the expression evaluates to `true`, the data value is toggled into or out of the multi selection. If the expression evaluates to `false`, the multi selection is first clear, and the data value is then inserted. For example, setting the value to the Vega expression `"true"` will toggle data values
      * without the user pressing the shift-key.
      *
      * __Default value:__ `true`
      *
      * __See also:__ [`toggle` examples](https://vega.github.io/vega-lite/docs/selection.html#toggle) in the documentation.
      */
    var toggle: js.UndefOr[String | Boolean] = js.undefined
  }
  object PointSelectionConfig {
    
    inline def apply(): PointSelectionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("point")
      __obj.asInstanceOf[PointSelectionConfig]
    }
    
    extension [Self <: PointSelectionConfig](x: Self) {
      
      inline def setFields(value: js.Array[FieldName]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: FieldName*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setNearest(value: Boolean): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
      
      inline def setNearestUndefined: Self = StObject.set(x, "nearest", js.undefined)
      
      inline def setToggle(value: String | Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  /* Inlined std.Omit<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/selection.d.ts.PointSelectionConfig, 'type'> */
  trait PointSelectionConfigWithoutType extends StObject {
    
    var clear: js.UndefOr[Stream | String | Boolean] = js.undefined
    
    var encodings: js.UndefOr[js.Array[SingleDefUnitChannel]] = js.undefined
    
    var fields: js.UndefOr[js.Array[FieldName]] = js.undefined
    
    var nearest: js.UndefOr[Boolean] = js.undefined
    
    var on: js.UndefOr[Stream | String] = js.undefined
    
    var resolve: js.UndefOr[SelectionResolution] = js.undefined
    
    var toggle: js.UndefOr[String | Boolean] = js.undefined
  }
  object PointSelectionConfigWithoutType {
    
    inline def apply(): PointSelectionConfigWithoutType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointSelectionConfigWithoutType]
    }
    
    extension [Self <: PointSelectionConfigWithoutType](x: Self) {
      
      inline def setClear(value: Stream | String | Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setEncodings(value: js.Array[SingleDefUnitChannel]): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
      
      inline def setEncodingsUndefined: Self = StObject.set(x, "encodings", js.undefined)
      
      inline def setEncodingsVarargs(value: SingleDefUnitChannel*): Self = StObject.set(x, "encodings", js.Array(value*))
      
      inline def setFields(value: js.Array[FieldName]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: FieldName*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setNearest(value: Boolean): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
      
      inline def setNearestUndefined: Self = StObject.set(x, "nearest", js.undefined)
      
      inline def setOn(value: Stream | String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setResolve(value: SelectionResolution): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setToggle(value: String | Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  trait SelectionConfig extends StObject {
    
    /**
      * The default definition for an [`interval`](https://vega.github.io/vega-lite/docs/parameter.html#select) selection. All properties and transformations
      * for an interval selection definition (except `type`) may be specified here.
      *
      * For instance, setting `interval` to `{"translate": false}` disables the ability to move
      * interval selections by default.
      */
    var interval: js.UndefOr[IntervalSelectionConfigWithoutType] = js.undefined
    
    /**
      * The default definition for a [`point`](https://vega.github.io/vega-lite/docs/parameter.html#select) selection. All properties and transformations
      *  for a point selection definition (except `type`) may be specified here.
      *
      * For instance, setting `point` to `{"on": "dblclick"}` populates point selections on double-click by default.
      */
    var point: js.UndefOr[PointSelectionConfigWithoutType] = js.undefined
  }
  object SelectionConfig {
    
    inline def apply(): SelectionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionConfig]
    }
    
    extension [Self <: SelectionConfig](x: Self) {
      
      inline def setInterval(value: IntervalSelectionConfigWithoutType): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setPoint(value: PointSelectionConfigWithoutType): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    }
  }
  
  type SelectionInit = PrimitiveValue | DateTime
  
  type SelectionInitInterval = Vector2[Boolean | DateTime | Double | String]
  
  type SelectionInitIntervalMapping = Dict[SelectionInitInterval]
  
  type SelectionInitMapping = Dict[SelectionInit]
  
  trait SelectionParameter[T /* <: SelectionType */] extends StObject {
    
    /**
      * When set, a selection is populated by input elements (also known as dynamic query widgets)
      * or by interacting with the corresponding legend. Direct manipulation interaction is disabled by default;
      * to re-enable it, set the selection's [`on`](https://vega.github.io/vega-lite/docs/selection.html#common-selection-properties) property.
      *
      * Legend bindings are restricted to selections that only specify a single field or encoding.
      *
      * Query widget binding takes the form of Vega's [input element binding definition](https://vega.github.io/vega/docs/signals/#bind)
      * or can be a mapping between projected field/encodings and binding definitions.
      *
      * __See also:__ [`bind`](https://vega.github.io/vega-lite/docs/bind.html) documentation.
      */
    var bind: js.UndefOr[scales | Binding | (Record[String, Binding]) | LegendBinding] = js.undefined
    
    /**
      * Required. A unique name for the selection parameter. Selection names should be valid JavaScript identifiers: they should contain only alphanumeric characters (or "$", or "_") and may not start with a digit. Reserved keywords that may not be used as parameter names are "datum", "event", "item", and "parent".
      */
    var name: ParameterName
    
    /**
      * Determines the default event processing and data query for the selection. Vega-Lite currently supports two selection types:
      *
      * - `"point"` -- to select multiple discrete data values; the first value is selected on `click` and additional values toggled on shift-click.
      * - `"interval"` -- to select a continuous range of data values on `drag`.
      */
    var select: T | IntervalSelectionConfig | PointSelectionConfig
    
    /**
      * Initialize the selection with a mapping between [projected channels or field names](https://vega.github.io/vega-lite/docs/selection.html#project) and initial values.
      *
      * __See also:__ [`init`](https://vega.github.io/vega-lite/docs/value.html) documentation.
      */
    var value: js.UndefOr[SelectionInitIntervalMapping | SelectionInit | js.Array[SelectionInitMapping]] = js.undefined
  }
  object SelectionParameter {
    
    inline def apply[T /* <: SelectionType */](name: ParameterName, select: T | IntervalSelectionConfig | PointSelectionConfig): SelectionParameter[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionParameter[T]]
    }
    
    extension [Self <: SelectionParameter[?], T /* <: SelectionType */](x: Self & SelectionParameter[T]) {
      
      inline def setBind(value: scales | Binding | (Record[String, Binding]) | LegendBinding): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      inline def setName(value: ParameterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: T | IntervalSelectionConfig | PointSelectionConfig): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setValue(value: SelectionInitIntervalMapping | SelectionInit | js.Array[SelectionInitMapping]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: SelectionInitMapping*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.global
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.union
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.intersect
  */
  trait SelectionResolution extends StObject
  object SelectionResolution {
    
    inline def global: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.global = "global".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.global]
    
    inline def intersect: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.intersect = "intersect".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.intersect]
    
    inline def union: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.union = "union".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.union]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.point
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.interval
  */
  trait SelectionType extends StObject
  object SelectionType {
    
    inline def interval: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.interval = "interval".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.interval]
    
    inline def point: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.point = "point".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.point]
  }
  
  trait TopLevelSelectionParameter
    extends StObject
       with SelectionParameter[SelectionType] {
    
    /**
      * By default, top-level selections are applied to every view in the visualization.
      * If this property is specified, selections will only be applied to views with the given names.
      */
    var views: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
  }
  object TopLevelSelectionParameter {
    
    inline def apply(name: ParameterName, select: SelectionType | IntervalSelectionConfig | PointSelectionConfig): TopLevelSelectionParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopLevelSelectionParameter]
    }
    
    extension [Self <: TopLevelSelectionParameter](x: Self) {
      
      inline def setViews(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
      
      inline def setViewsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "views", js.Array(value*))
    }
  }
}
