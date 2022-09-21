package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.ContinuousAxisChannelDef
import typings.vegaLite8ozrbXDH.anon.`6`
import typings.vegaLite8ozrbXDH.baseDDotTsMod.CompositeMarkNormalizer
import typings.vegaLite8ozrbXDH.baseDotdDottsMod.NormalizerParams
import typings.vegaLite8ozrbXDH.channeldefDTsMod.ColorDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.Field
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldDefWithoutScale
import typings.vegaLite8ozrbXDH.channeldefDTsMod.NumericMarkPropDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.Position2Def
import typings.vegaLite8ozrbXDH.channeldefDTsMod.PositionDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.SecondaryFieldDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.ValueDef
import typings.vegaLite8ozrbXDH.commonDDotTsMod.GenericCompositeMarkDef
import typings.vegaLite8ozrbXDH.commonDDotTsMod.PartsMixins
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.errorbandDTsMod.ErrorBand
import typings.vegaLite8ozrbXDH.errorbandDTsMod.ErrorBandDef
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.layerDotDTsMod.NormalizedLayerSpec
import typings.vegaLite8ozrbXDH.typeDotDTsMod.StandardType
import typings.vegaLite8ozrbXDH.unitDotDTsMod.GenericUnitSpec
import typings.vegaLite8ozrbXDH.unitDotDTsMod.NormalizedUnitSpec
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.errorbar
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.rule
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ticks
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorbarDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compositemark/errorbar.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compositemark/errorbar.d.ts", "ERRORBAR")
  @js.native
  val ERRORBAR_ : errorbar = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compositemark/errorbar.d.ts", "ERRORBAR_PARTS")
  @js.native
  val ERRORBAR_PARTS: js.Tuple2[ticks, rule] = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compositemark/errorbar.d.ts", "errorBarNormalizer")
  @js.native
  val errorBarNormalizer: CompositeMarkNormalizer[errorbar] = js.native
  
  inline def errorBarParams[M /* <: ErrorBar | ErrorBand */, MD /* <: (ErrorBarDef & GenericCompositeMarkDef[M]) | (ErrorBandDef & GenericCompositeMarkDef[M]) */](
    spec: GenericUnitSpec[ErrorEncoding[String], M | MD],
    compositeMark: M,
    config: Config[ExprRef | SignalRef]
  ): ContinuousAxisChannelDef[MD, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("errorBarParams")(spec.asInstanceOf[js.Any], compositeMark.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ContinuousAxisChannelDef[MD, M]]
  
  inline def normalizeErrorBar(spec: GenericUnitSpec[ErrorEncoding[String], ErrorBar | ErrorBarDef], hasConfig: NormalizerParams): NormalizedLayerSpec | NormalizedUnitSpec = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeErrorBar")(spec.asInstanceOf[js.Any], hasConfig.asInstanceOf[js.Any])).asInstanceOf[NormalizedLayerSpec | NormalizedUnitSpec]
  
  type ErrorBar = errorbar
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.mean
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.median
  */
  trait ErrorBarCenter extends StObject
  object ErrorBarCenter {
    
    inline def mean: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.mean = "mean".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.mean]
    
    inline def median: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.median = "median".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.median]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Record<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compositemark/errorbar.d.ts.ErrorBarPart, boolean | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/mark.d.ts.MarkConfig<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/expr.d.ts.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef>> ]:? std.Record<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compositemark/errorbar.d.ts.ErrorBarPart, boolean | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/mark.d.ts.MarkConfig<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/expr.d.ts.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef>>[P]} */ trait ErrorBarConfig extends StObject {
    
    /**
      * The center of the errorbar. Available options include:
      * - `"mean"`: the mean of the data points.
      * - `"median"`: the median of the data points.
      *
      * __Default value:__ `"mean"`.
      * @hidden
      */
    var center: js.UndefOr[ErrorBarCenter] = js.undefined
    
    /**
      * The extent of the rule. Available options include:
      * - `"ci"`: Extend the rule to the confidence interval of the mean.
      * - `"stderr"`: The size of rule are set to the value of standard error, extending from the mean.
      * - `"stdev"`: The size of rule are set to the value of standard deviation, extending from the mean.
      * - `"iqr"`: Extend the rule to the q1 and q3.
      *
      * __Default value:__ `"stderr"`.
      */
    var extent: js.UndefOr[ErrorBarExtent] = js.undefined
    
    /** Size of the ticks of an error bar */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Thickness of the ticks and the bar of an error bar */
    var thickness: js.UndefOr[Double] = js.undefined
  }
  object ErrorBarConfig {
    
    inline def apply(): ErrorBarConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBarConfig]
    }
    
    extension [Self <: ErrorBarConfig](x: Self) {
      
      inline def setCenter(value: ErrorBarCenter): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setExtent(value: ErrorBarExtent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    }
  }
  
  trait ErrorBarConfigMixins extends StObject {
    
    /**
      * ErrorBar Config
      */
    var errorbar: js.UndefOr[ErrorBarConfig] = js.undefined
  }
  object ErrorBarConfigMixins {
    
    inline def apply(): ErrorBarConfigMixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBarConfigMixins]
    }
    
    extension [Self <: ErrorBarConfigMixins](x: Self) {
      
      inline def setErrorbar(value: ErrorBarConfig): Self = StObject.set(x, "errorbar", value.asInstanceOf[js.Any])
      
      inline def setErrorbarUndefined: Self = StObject.set(x, "errorbar", js.undefined)
    }
  }
  
  type ErrorBarDef = GenericCompositeMarkDef[ErrorBar] & ErrorBarConfig & `6`
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ci
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.iqr
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stderr
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stdev
  */
  trait ErrorBarExtent extends StObject
  object ErrorBarExtent {
    
    inline def ci: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ci = "ci".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ci]
    
    inline def iqr: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.iqr = "iqr".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.iqr]
    
    inline def stderr: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stderr = "stderr".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stderr]
    
    inline def stdev: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stdev = "stdev".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stdev]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ticks
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.rule
  */
  trait ErrorBarPart extends StObject
  
  type ErrorBarPartsMixins = PartsMixins[ErrorBarPart]
  
  /* Inlined std.Pick<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/encoding.d.ts.Encoding<F>, .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channel.d.ts.PositionChannel | 'color' | 'detail' | 'opacity'> & .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compositemark/errorbar.d.ts.ErrorExtraEncoding<F> */
  trait ErrorEncoding[F /* <: Field */] extends StObject {
    
    var color: js.UndefOr[ColorDef[F]] = js.undefined
    
    var detail: js.UndefOr[
        (FieldDefWithoutScale[F, StandardType]) | (js.Array[FieldDefWithoutScale[F, StandardType]])
      ] = js.undefined
    
    var opacity: js.UndefOr[NumericMarkPropDef[F]] = js.undefined
    
    var x: js.UndefOr[PositionDef[F]] = js.undefined
    
    var x2: js.UndefOr[Position2Def[F]] = js.undefined
    
    /**
      * Error value of x coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var xError: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.undefined
    
    /**
      * Secondary error value of x coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var xError2: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.undefined
    
    var y: js.UndefOr[PositionDef[F]] = js.undefined
    
    var y2: js.UndefOr[Position2Def[F]] = js.undefined
    
    /**
      * Error value of y coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var yError: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.undefined
    
    /**
      * Secondary error value of y coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var yError2: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.undefined
  }
  object ErrorEncoding {
    
    inline def apply[F /* <: Field */](): ErrorEncoding[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorEncoding[F]]
    }
    
    extension [Self <: ErrorEncoding[?], F /* <: Field */](x: Self & ErrorEncoding[F]) {
      
      inline def setColor(value: ColorDef[F]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDetail(value: (FieldDefWithoutScale[F, StandardType]) | (js.Array[FieldDefWithoutScale[F, StandardType]])): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setDetailVarargs(value: (FieldDefWithoutScale[F, StandardType])*): Self = StObject.set(x, "detail", js.Array(value*))
      
      inline def setOpacity(value: NumericMarkPropDef[F]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setX(value: PositionDef[F]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Position2Def[F]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      inline def setXError(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "xError", value.asInstanceOf[js.Any])
      
      inline def setXError2(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "xError2", value.asInstanceOf[js.Any])
      
      inline def setXError2Undefined: Self = StObject.set(x, "xError2", js.undefined)
      
      inline def setXErrorUndefined: Self = StObject.set(x, "xError", js.undefined)
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: PositionDef[F]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Position2Def[F]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      inline def setYError(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "yError", value.asInstanceOf[js.Any])
      
      inline def setYError2(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "yError2", value.asInstanceOf[js.Any])
      
      inline def setYError2Undefined: Self = StObject.set(x, "yError2", js.undefined)
      
      inline def setYErrorUndefined: Self = StObject.set(x, "yError", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ErrorExtraEncoding[F /* <: Field */] extends StObject {
    
    /**
      * Error value of x coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var xError: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.undefined
    
    /**
      * Secondary error value of x coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var xError2: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.undefined
    
    /**
      * Error value of y coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var yError: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.undefined
    
    /**
      * Secondary error value of y coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var yError2: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.undefined
  }
  object ErrorExtraEncoding {
    
    inline def apply[F /* <: Field */](): ErrorExtraEncoding[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorExtraEncoding[F]]
    }
    
    extension [Self <: ErrorExtraEncoding[?], F /* <: Field */](x: Self & ErrorExtraEncoding[F]) {
      
      inline def setXError(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "xError", value.asInstanceOf[js.Any])
      
      inline def setXError2(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "xError2", value.asInstanceOf[js.Any])
      
      inline def setXError2Undefined: Self = StObject.set(x, "xError2", js.undefined)
      
      inline def setXErrorUndefined: Self = StObject.set(x, "xError", js.undefined)
      
      inline def setYError(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "yError", value.asInstanceOf[js.Any])
      
      inline def setYError2(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "yError2", value.asInstanceOf[js.Any])
      
      inline def setYError2Undefined: Self = StObject.set(x, "yError2", js.undefined)
      
      inline def setYErrorUndefined: Self = StObject.set(x, "yError", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.raw
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`aggregated-upper-lower`
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`aggregated-error`
  */
  trait ErrorInputType extends StObject
  object ErrorInputType {
    
    inline def `aggregated-error`: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`aggregated-error` = "aggregated-error".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`aggregated-error`]
    
    inline def `aggregated-upper-lower`: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`aggregated-upper-lower` = "aggregated-upper-lower".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`aggregated-upper-lower`]
    
    inline def raw: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.raw = "raw".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.raw]
  }
}
