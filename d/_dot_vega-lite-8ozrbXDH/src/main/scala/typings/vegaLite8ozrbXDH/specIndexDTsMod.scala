package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.channeldefDTsMod.Field
import typings.vegaLite8ozrbXDH.concatDotDTsMod.GenericConcatSpec
import typings.vegaLite8ozrbXDH.concatDotDTsMod.GenericHConcatSpec
import typings.vegaLite8ozrbXDH.concatDotDTsMod.GenericVConcatSpec
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.dataDTsMod.Data
import typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.facetDDotTsMod.FacetFieldDef
import typings.vegaLite8ozrbXDH.facetDDotTsMod.FacetMapping
import typings.vegaLite8ozrbXDH.facetDDotTsMod.GenericFacetSpec
import typings.vegaLite8ozrbXDH.layerDotDTsMod.GenericLayerSpec
import typings.vegaLite8ozrbXDH.layerDotDTsMod.LayerSpec
import typings.vegaLite8ozrbXDH.parameterDTsMod.VariableParameter
import typings.vegaLite8ozrbXDH.repeatDTsMod.RepeatSpec
import typings.vegaLite8ozrbXDH.resolveDotDTsMod.Resolve
import typings.vegaLite8ozrbXDH.selectionDTsMod.TopLevelSelectionParameter
import typings.vegaLite8ozrbXDH.specBaseDTsMod.BaseSpec
import typings.vegaLite8ozrbXDH.titleDTsMod.TitleParams
import typings.vegaLite8ozrbXDH.toplevelDTsMod.AutoSizeParams
import typings.vegaLite8ozrbXDH.toplevelDTsMod.AutosizeType
import typings.vegaLite8ozrbXDH.toplevelDTsMod.Datasets
import typings.vegaLite8ozrbXDH.toplevelDTsMod.Padding
import typings.vegaLite8ozrbXDH.toplevelDTsMod.TopLevel
import typings.vegaLite8ozrbXDH.transformDTsMod.Transform
import typings.vegaLite8ozrbXDH.unitDotDTsMod.GenericUnitSpec
import typings.vegaLite8ozrbXDH.unitDotDTsMod.TopLevelUnitSpec
import typings.vegaLite8ozrbXDH.unitDotDTsMod.UnitSpec
import typings.vegaLite8ozrbXDH.unitDotDTsMod.UnitSpecWithFrame
import typings.vegaLite8ozrbXDH.utilDTsMod.Dict
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

object specIndexDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/spec/index.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAnyConcatSpec(spec: BaseSpec): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyConcatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFacetSpec(spec: BaseSpec): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/facet.d.ts.GenericFacetSpec<any, any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFacetSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/facet.d.ts.GenericFacetSpec<any, any, any> */ Boolean]
  
  inline def isHConcatSpec(spec: BaseSpec): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/concat.d.ts.GenericHConcatSpec<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHConcatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/concat.d.ts.GenericHConcatSpec<any> */ Boolean]
  
  inline def isLayerSpec(spec: BaseSpec): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/layer.d.ts.GenericLayerSpec<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLayerSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/layer.d.ts.GenericLayerSpec<any> */ Boolean]
  
  inline def isRepeatSpec(spec: BaseSpec): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/repeat.d.ts.RepeatSpec */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRepeatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/repeat.d.ts.RepeatSpec */ Boolean]
  
  inline def isUnitSpec(spec: BaseSpec): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnitSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isVConcatSpec(spec: BaseSpec): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/concat.d.ts.GenericVConcatSpec<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVConcatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/concat.d.ts.GenericVConcatSpec<any> */ Boolean]
  
  type GenericSpec[U /* <: GenericUnitSpec[Encoding[F], Any] */, L /* <: GenericLayerSpec[U] */, R /* <: RepeatSpec */, F /* <: Field */] = U | L | R | (GenericFacetSpec[U, L, F]) | GenericConcatSpec[Any] | GenericVConcatSpec[Any] | GenericHConcatSpec[Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/unit.d.ts.FacetedUnitSpec<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.Field> | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/layer.d.ts.LayerSpec<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.Field> | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/repeat.d.ts.RepeatSpec | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/facet.d.ts.GenericFacetSpec<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/unit.d.ts.FacetedUnitSpec<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.Field>, .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/layer.d.ts.LayerSpec<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.Field>, .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.Field> | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/concat.d.ts.GenericConcatSpec<any> | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/concat.d.ts.GenericVConcatSpec<any> | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/concat.d.ts.GenericHConcatSpec<any> */ trait NonNormalizedSpec extends StObject
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/unit.d.ts.NormalizedUnitSpec | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/layer.d.ts.NormalizedLayerSpec | never | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/facet.d.ts.GenericFacetSpec<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/unit.d.ts.NormalizedUnitSpec, .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/layer.d.ts.NormalizedLayerSpec, .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.FieldName> | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/concat.d.ts.GenericConcatSpec<any> | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/concat.d.ts.GenericVConcatSpec<any> | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/concat.d.ts.GenericHConcatSpec<any> */ trait NormalizedSpec extends StObject
  
  /* Inlined .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/toplevel.d.ts.TopLevel<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/facet.d.ts.GenericFacetSpec<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/unit.d.ts.UnitSpecWithFrame<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.Field>, .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/layer.d.ts.LayerSpec<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.Field>, .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.Field>> & .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/base.d.ts.DataMixins */
  trait TopLevelFacetSpec
    extends StObject
       with _TopLevelSpec {
    
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
      * The number of columns to include in the view composition layout.
      *
      * __Default value__: `undefined` -- An infinite number of columns (a single row) will be assumed. This is equivalent to
      * `hconcat` (for `concat`) and to using the `column` channel (for `facet` and `repeat`).
      *
      * __Note__:
      *
      * 1) This property is only for:
      * - the general (wrappable) `concat` operator (not `hconcat`/`vconcat`)
      * - the `facet` and `repeat` operator with one field/repetition definition (without row/column nesting)
      *
      * 2) Setting the `columns` to `1` is equivalent to `vconcat` (for `concat`) and to using the `row` channel (for `facet` and `repeat`).
      */
    var columns: js.UndefOr[Double] = js.undefined
    
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
      * Definition for how to facet the data. One of:
      * 1) [a field definition for faceting the plot by one field](https://vega.github.io/vega-lite/docs/facet.html#field-def)
      * 2) [An object that maps `row` and `column` channels to their field definitions](https://vega.github.io/vega-lite/docs/facet.html#mapping)
      */
    var facet: (FacetFieldDef[Field, ExprRef | SignalRef]) | (FacetMapping[Field, FacetFieldDef[Field, ExprRef | SignalRef]])
    
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
      * Dynamic variables or selections that parameterize a visualization.
      */
    var params: js.UndefOr[js.Array[VariableParameter | TopLevelSelectionParameter]] = js.undefined
    
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
      * A specification of the view that gets faceted.
      */
    var spec: LayerSpec[Field] | UnitSpecWithFrame[Field]
    
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
  }
  object TopLevelFacetSpec {
    
    inline def apply(
      data: (js.UndefOr[Data | Null]) & Data,
      facet: (FacetFieldDef[Field, ExprRef | SignalRef]) | (FacetMapping[Field, FacetFieldDef[Field, ExprRef | SignalRef]]),
      spec: LayerSpec[Field] | UnitSpecWithFrame[Field]
    ): TopLevelFacetSpec = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], facet = facet.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopLevelFacetSpec]
    }
    
    extension [Self <: TopLevelFacetSpec](x: Self) {
      
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
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setConfig(value: Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setData(value: (js.UndefOr[Data | Null]) & Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDatasets(value: Datasets): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
      
      inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFacet(
        value: (FacetFieldDef[Field, ExprRef | SignalRef]) | (FacetMapping[Field, FacetFieldDef[Field, ExprRef | SignalRef]])
      ): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPadding(value: Padding | ExprRef | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setParams(value: js.Array[VariableParameter | TopLevelSelectionParameter]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: (VariableParameter | TopLevelSelectionParameter)*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setResolve(value: Resolve): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setSpacing(value: Double | RowCol[Double]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setSpec(value: LayerSpec[Field] | UnitSpecWithFrame[Field]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: Text | (TitleParams[ExprRef | SignalRef])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTransform(value: js.Array[Transform]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTransformVarargs(value: Transform*): Self = StObject.set(x, "transform", js.Array(value*))
      
      inline def setUsermeta(value: Dict[Any]): Self = StObject.set(x, "usermeta", value.asInstanceOf[js.Any])
      
      inline def setUsermetaUndefined: Self = StObject.set(x, "usermeta", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.unitDotDTsMod.TopLevelUnitSpec[typings.vegaLite8ozrbXDH.channeldefDTsMod.Field]
    - typings.vegaLite8ozrbXDH.specIndexDTsMod.TopLevelFacetSpec
    - typings.vegaLite8ozrbXDH.anon.TopLevelLayerSpecField
    - typings.vegaLite8ozrbXDH.toplevelDTsMod.TopLevel[typings.vegaLite8ozrbXDH.repeatDTsMod.RepeatSpec]
    - typings.vegaLite8ozrbXDH.anon.TopLevelGenericConcatSpec
    - typings.vegaLite8ozrbXDH.anon.TopLevelGenericVConcatSpe
    - typings.vegaLite8ozrbXDH.anon.TopLevelGenericHConcatSpe
  */
  type TopLevelSpec = _TopLevelSpec | TopLevelUnitSpec[Field] | TopLevel[RepeatSpec]
  
  trait _TopLevelSpec extends StObject
  object _TopLevelSpec {
    
    inline def TopLevelFacetSpec(
      data: (js.UndefOr[Data | Null]) & Data,
      facet: (FacetFieldDef[Field, ExprRef | SignalRef]) | (FacetMapping[Field, FacetFieldDef[Field, ExprRef | SignalRef]]),
      spec: LayerSpec[Field] | UnitSpecWithFrame[Field]
    ): typings.vegaLite8ozrbXDH.specIndexDTsMod.TopLevelFacetSpec = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], facet = facet.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.specIndexDTsMod.TopLevelFacetSpec]
    }
    
    inline def TopLevelGenericConcatSpec(concat: js.Array[NonNormalizedSpec]): typings.vegaLite8ozrbXDH.anon.TopLevelGenericConcatSpec = {
      val __obj = js.Dynamic.literal(concat = concat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.anon.TopLevelGenericConcatSpec]
    }
    
    inline def TopLevelGenericHConcatSpe(hconcat: js.Array[NonNormalizedSpec]): typings.vegaLite8ozrbXDH.anon.TopLevelGenericHConcatSpe = {
      val __obj = js.Dynamic.literal(hconcat = hconcat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.anon.TopLevelGenericHConcatSpe]
    }
    
    inline def TopLevelGenericVConcatSpe(vconcat: js.Array[NonNormalizedSpec]): typings.vegaLite8ozrbXDH.anon.TopLevelGenericVConcatSpe = {
      val __obj = js.Dynamic.literal(vconcat = vconcat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.anon.TopLevelGenericVConcatSpe]
    }
    
    inline def TopLevelLayerSpecField(layer: js.Array[LayerSpec[Field] | UnitSpec[Field]]): typings.vegaLite8ozrbXDH.anon.TopLevelLayerSpecField = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.anon.TopLevelLayerSpecField]
    }
  }
}
