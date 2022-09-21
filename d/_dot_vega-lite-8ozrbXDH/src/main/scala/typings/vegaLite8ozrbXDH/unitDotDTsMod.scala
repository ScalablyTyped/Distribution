package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.channeldefDTsMod.Field
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.dataDTsMod.Data
import typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.indexDotdDottsMod.CompositeEncoding
import typings.vegaLite8ozrbXDH.indexDotdDottsMod.FacetedCompositeEncoding
import typings.vegaLite8ozrbXDH.markDotDTsMod.AnyMark
import typings.vegaLite8ozrbXDH.markDotDTsMod.Mark
import typings.vegaLite8ozrbXDH.markDotDTsMod.MarkDef
import typings.vegaLite8ozrbXDH.parameterDTsMod.VariableParameter
import typings.vegaLite8ozrbXDH.projectionDTsMod.Projection
import typings.vegaLite8ozrbXDH.resolveDotDTsMod.Resolve
import typings.vegaLite8ozrbXDH.selectionDTsMod.SelectionParameter
import typings.vegaLite8ozrbXDH.selectionDTsMod.SelectionType
import typings.vegaLite8ozrbXDH.selectionDTsMod.TopLevelSelectionParameter
import typings.vegaLite8ozrbXDH.specBaseDTsMod.BaseSpec
import typings.vegaLite8ozrbXDH.specBaseDTsMod.FrameMixins
import typings.vegaLite8ozrbXDH.specBaseDTsMod.GenericCompositionLayout
import typings.vegaLite8ozrbXDH.specBaseDTsMod.ResolveMixins
import typings.vegaLite8ozrbXDH.specBaseDTsMod.Step
import typings.vegaLite8ozrbXDH.specBaseDTsMod.ViewBackground
import typings.vegaLite8ozrbXDH.titleDTsMod.TitleParams
import typings.vegaLite8ozrbXDH.toplevelDTsMod.AutoSizeParams
import typings.vegaLite8ozrbXDH.toplevelDTsMod.AutosizeType
import typings.vegaLite8ozrbXDH.toplevelDTsMod.Datasets
import typings.vegaLite8ozrbXDH.toplevelDTsMod.Padding
import typings.vegaLite8ozrbXDH.transformDTsMod.Transform
import typings.vegaLite8ozrbXDH.utilDTsMod.Dict
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.container
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.flush
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.full
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.RowCol
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.layoutMod.LayoutAlign
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unitDotDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/spec/unit.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isUnitSpec(spec: BaseSpec): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnitSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait FacetedUnitSpec[F /* <: Field */]
    extends StObject
       with GenericUnitSpec[FacetedCompositeEncoding[F], AnyMark]
       with ResolveMixins
       with GenericCompositionLayout
       with FrameMixins[ExprRef | SignalRef]
  object FacetedUnitSpec {
    
    inline def apply[F /* <: Field */](mark: AnyMark): FacetedUnitSpec[F] = {
      val __obj = js.Dynamic.literal(mark = mark.asInstanceOf[js.Any])
      __obj.asInstanceOf[FacetedUnitSpec[F]]
    }
  }
  
  trait GenericUnitSpec[E /* <: Encoding[Any] */, M]
    extends StObject
       with BaseSpec {
    
    /**
      * A key-value mapping between encoding channels and definition of fields.
      */
    var encoding: js.UndefOr[E] = js.undefined
    
    /**
      * A string describing the mark type (one of `"bar"`, `"circle"`, `"square"`, `"tick"`, `"line"`,
      * `"area"`, `"point"`, `"rule"`, `"geoshape"`, and `"text"`) or a [mark definition object](https://vega.github.io/vega-lite/docs/mark.html#mark-def).
      */
    var mark: M
    
    /**
      * An array of parameters that may either be simple variables, or more complex selections that map user input to data queries.
      */
    var params: js.UndefOr[js.Array[VariableParameter | SelectionParameter[SelectionType]]] = js.undefined
    
    /**
      * An object defining properties of geographic projection, which will be applied to `shape` path for `"geoshape"` marks
      * and to `latitude` and `"longitude"` channels for other marks.
      */
    var projection: js.UndefOr[Projection[ExprRef]] = js.undefined
  }
  object GenericUnitSpec {
    
    inline def apply[E /* <: Encoding[Any] */, M](mark: M): GenericUnitSpec[E, M] = {
      val __obj = js.Dynamic.literal(mark = mark.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericUnitSpec[E, M]]
    }
    
    extension [Self <: GenericUnitSpec[?, ?], E /* <: Encoding[Any] */, M](x: Self & (GenericUnitSpec[E, M])) {
      
      inline def setEncoding(value: E): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setMark(value: M): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[VariableParameter | SelectionParameter[SelectionType]]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: (VariableParameter | SelectionParameter[SelectionType])*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setProjection(value: Projection[ExprRef]): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    }
  }
  
  type NormalizedUnitSpec = GenericUnitSpec[Encoding[FieldName], Mark | (MarkDef[Mark, ExprRef | SignalRef])]
  
  /* Inlined .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/toplevel.d.ts.TopLevel<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/unit.d.ts.FacetedUnitSpec<F>> & .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/base.d.ts.DataMixins */
  trait TopLevelUnitSpec[F /* <: Field */] extends StObject {
    
    /**
      * URL to [JSON schema](http://json-schema.org/) for a Vega-Lite specification. Unless you have a reason to change this, use `https://vega.github.io/schema/vega-lite/v5.json`. Setting the `$schema` property allows automatic validation and autocomplete in editors that support JSON schema.
      * @format uri
      */
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.undefined
    
    /**
      * The alignment to apply to grid rows and columns.
      * The supported string values are `"all"`, `"each"`, and `"none"`.
      *
      * - For `"none"`, a flow layout will be used, in which adjacent subviews are simply placed one after the other.
      * - For `"each"`, subviews will be aligned into a clean grid structure, but each row or column may be of variable size.
      * - For `"all"`, subviews will be aligned and each row or column will be sized identically based on the maximum observed size. String values for this property will be applied to both grid rows and columns.
      *
      * Alternatively, an object value of the form `{"row": string, "column": string}` can be used to supply different alignments for rows and columns.
      *
      * __Default value:__ `"all"`.
      */
    var align: js.UndefOr[LayoutAlign | RowCol[LayoutAlign]] = js.undefined
    
    /**
      * How the visualization size should be determined. If a string, should be one of `"pad"`, `"fit"` or `"none"`.
      * Object values can additionally specify parameters for content sizing and automatic resizing.
      *
      * __Default value__: `pad`
      */
    var autosize: js.UndefOr[AutosizeType | AutoSizeParams] = js.undefined
    
    /**
      * CSS color property to use as the background of the entire view.
      *
      * __Default value:__ `"white"`
      */
    var background: js.UndefOr[Color | ExprRef | SignalRef] = js.undefined
    
    /**
      * The bounds calculation method to use for determining the extent of a sub-plot. One of `full` (the default) or `flush`.
      *
      * - If set to `full`, the entire calculated bounds (including axes, title, and legend) will be used.
      * - If set to `flush`, only the specified width and height values for the sub-view will be used. The `flush` setting can be useful when attempting to place sub-plots without axes or legends into a uniform grid structure.
      *
      * __Default value:__ `"full"`
      */
    var bounds: js.UndefOr[full | flush] = js.undefined
    
    /**
      * Boolean flag indicating if subviews should be centered relative to their respective rows or columns.
      *
      * An object value of the form `{"row": boolean, "column": boolean}` can be used to supply different centering values for rows and columns.
      *
      * __Default value:__ `false`
      */
    var center: js.UndefOr[Boolean | RowCol[Boolean]] = js.undefined
    
    /**
      * Vega-Lite configuration object. This property can only be defined at the top-level of a specification.
      */
    var config: js.UndefOr[Config[ExprRef | SignalRef]] = js.undefined
    
    /**
      * An object describing the data source. Set to `null` to ignore the parent's data source. If no data is set, it is derived from the parent.
      */
    /**
      * An object describing the data source.
      */
    var data: (js.UndefOr[Data | Null]) & Data
    
    /**
      * A global data store for named datasets. This is a mapping from names to inline datasets.
      * This can be an array of objects or primitive values or a string. Arrays of primitive values are ingested as objects with a `data` property.
      */
    var datasets: js.UndefOr[Datasets] = js.undefined
    
    /**
      * Description of this mark for commenting purpose.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * A key-value mapping between encoding channels and definition of fields.
      */
    var encoding: js.UndefOr[FacetedCompositeEncoding[F]] = js.undefined
    
    /**
      * The height of a visualization.
      *
      * - For a plot with a continuous y-field, height should be a number.
      * - For a plot with either a discrete y-field or no y-field, height can be either a number indicating a fixed height or an object in the form of `{step: number}` defining the height per discrete step. (No y-field is equivalent to having one discrete step.)
      * - To enable responsive sizing on height, it should be set to `"container"`.
      *
      * __Default value:__ Based on `config.view.continuousHeight` for a plot with a continuous y-field and `config.view.discreteHeight` otherwise.
      *
      * __Note:__ For plots with [`row` and `column` channels](https://vega.github.io/vega-lite/docs/encoding.html#facet), this represents the height of a single view and the `"container"` option cannot be used.
      *
      * __See also:__ [`height`](https://vega.github.io/vega-lite/docs/size.html) documentation.
      */
    var height: js.UndefOr[Double | container | Step] = js.undefined
    
    /**
      * A string describing the mark type (one of `"bar"`, `"circle"`, `"square"`, `"tick"`, `"line"`,
      * `"area"`, `"point"`, `"rule"`, `"geoshape"`, and `"text"`) or a [mark definition object](https://vega.github.io/vega-lite/docs/mark.html#mark-def).
      */
    var mark: AnyMark
    
    /**
      * Name of the visualization for later reference.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The default visualization padding, in pixels, from the edge of the visualization canvas to the data rectangle. If a number, specifies padding for all sides.
      * If an object, the value should have the format `{"left": 5, "top": 5, "right": 5, "bottom": 5}` to specify padding for each side of the visualization.
      *
      * __Default value__: `5`
      */
    var padding: js.UndefOr[Padding | ExprRef | SignalRef] = js.undefined
    
    /**
      * An array of parameters that may either be simple variables, or more complex selections that map user input to data queries.
      */
    /**
      * Dynamic variables or selections that parameterize a visualization.
      */
    var params: (js.UndefOr[js.Array[VariableParameter | SelectionParameter[SelectionType]]]) & (js.UndefOr[js.Array[VariableParameter | TopLevelSelectionParameter]])
    
    /**
      * An object defining properties of geographic projection, which will be applied to `shape` path for `"geoshape"` marks
      * and to `latitude` and `"longitude"` channels for other marks.
      */
    var projection: js.UndefOr[Projection[ExprRef]] = js.undefined
    
    /**
      * Scale, axis, and legend resolutions for view composition specifications.
      */
    var resolve: js.UndefOr[Resolve] = js.undefined
    
    /**
      * The spacing in pixels between sub-views of the composition operator.
      * An object of the form `{"row": number, "column": number}` can be used to set
      * different spacing values for rows and columns.
      *
      * __Default value__: Depends on `"spacing"` property of [the view composition configuration](https://vega.github.io/vega-lite/docs/config.html#view-config) (`20` by default)
      */
    var spacing: js.UndefOr[Double | RowCol[Double]] = js.undefined
    
    /**
      * Title for the plot.
      */
    var title: js.UndefOr[Text | (TitleParams[ExprRef | SignalRef])] = js.undefined
    
    /**
      * An array of data transformations such as filter and new field calculation.
      */
    var transform: js.UndefOr[js.Array[Transform]] = js.undefined
    
    /**
      * Optional metadata that will be passed to Vega.
      * This object is completely ignored by Vega and Vega-Lite and can be used for custom metadata.
      */
    var usermeta: js.UndefOr[Dict[Any]] = js.undefined
    
    /**
      * An object defining the view background's fill and stroke.
      *
      * __Default value:__ none (transparent)
      */
    var view: js.UndefOr[ViewBackground[ExprRef | SignalRef]] = js.undefined
    
    /**
      * The width of a visualization.
      *
      * - For a plot with a continuous x-field, width should be a number.
      * - For a plot with either a discrete x-field or no x-field, width can be either a number indicating a fixed width or an object in the form of `{step: number}` defining the width per discrete step. (No x-field is equivalent to having one discrete step.)
      * - To enable responsive sizing on width, it should be set to `"container"`.
      *
      * __Default value:__
      * Based on `config.view.continuousWidth` for a plot with a continuous x-field and `config.view.discreteWidth` otherwise.
      *
      * __Note:__ For plots with [`row` and `column` channels](https://vega.github.io/vega-lite/docs/encoding.html#facet), this represents the width of a single view and the `"container"` option cannot be used.
      *
      * __See also:__ [`width`](https://vega.github.io/vega-lite/docs/size.html) documentation.
      */
    var width: js.UndefOr[Double | container | Step] = js.undefined
  }
  object TopLevelUnitSpec {
    
    inline def apply[F /* <: Field */](
      data: (js.UndefOr[Data | Null]) & Data,
      mark: AnyMark,
      params: (js.UndefOr[js.Array[VariableParameter | SelectionParameter[SelectionType]]]) & (js.UndefOr[js.Array[VariableParameter | TopLevelSelectionParameter]])
    ): TopLevelUnitSpec[F] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopLevelUnitSpec[F]]
    }
    
    extension [Self <: TopLevelUnitSpec[?], F /* <: Field */](x: Self & TopLevelUnitSpec[F]) {
      
      inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      inline def setAlign(value: LayoutAlign | RowCol[LayoutAlign]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAutosize(value: AutosizeType | AutoSizeParams): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
      
      inline def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
      
      inline def setBackground(value: Color | ExprRef | SignalRef): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBounds(value: full | flush): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setCenter(value: Boolean | RowCol[Boolean]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setConfig(value: Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setData(value: (js.UndefOr[Data | Null]) & Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDatasets(value: Datasets): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
      
      inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEncoding(value: FacetedCompositeEncoding[F]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHeight(value: Double | container | Step): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMark(value: AnyMark): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPadding(value: Padding | ExprRef | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setParams(
        value: (js.UndefOr[js.Array[VariableParameter | SelectionParameter[SelectionType]]]) & (js.UndefOr[js.Array[VariableParameter | TopLevelSelectionParameter]])
      ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setProjection(value: Projection[ExprRef]): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setResolve(value: Resolve): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setSpacing(value: Double | RowCol[Double]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setTitle(value: Text | (TitleParams[ExprRef | SignalRef])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTransform(value: js.Array[Transform]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTransformVarargs(value: Transform*): Self = StObject.set(x, "transform", js.Array(value*))
      
      inline def setUsermeta(value: Dict[Any]): Self = StObject.set(x, "usermeta", value.asInstanceOf[js.Any])
      
      inline def setUsermetaUndefined: Self = StObject.set(x, "usermeta", js.undefined)
      
      inline def setView(value: ViewBackground[ExprRef | SignalRef]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setWidth(value: Double | container | Step): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type UnitSpec[F /* <: Field */] = GenericUnitSpec[CompositeEncoding[F], AnyMark]
  
  trait UnitSpecWithFrame[F /* <: Field */]
    extends StObject
       with GenericUnitSpec[CompositeEncoding[F], AnyMark]
       with FrameMixins[ExprRef | SignalRef]
  object UnitSpecWithFrame {
    
    inline def apply[F /* <: Field */](mark: AnyMark): UnitSpecWithFrame[F] = {
      val __obj = js.Dynamic.literal(mark = mark.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnitSpecWithFrame[F]]
    }
  }
}
