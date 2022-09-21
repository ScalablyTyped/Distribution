package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.Orient
import typings.vegaLite8ozrbXDH.baseDDotTsMod.CompositeMarkNormalizer
import typings.vegaLite8ozrbXDH.baseDotdDottsMod.NormalizerParams
import typings.vegaLite8ozrbXDH.commonDDotTsMod.GenericCompositeMarkDef
import typings.vegaLite8ozrbXDH.commonDDotTsMod.PartsMixins
import typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding
import typings.vegaLite8ozrbXDH.layerDotDTsMod.NormalizedLayerSpec
import typings.vegaLite8ozrbXDH.unitDotDTsMod.GenericUnitSpec
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`min-max`
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.box
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.boxplot
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.median
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.outliers
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.rule
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ticks
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.tukey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxplotDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compositemark/boxplot.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compositemark/boxplot.d.ts", "BOXPLOT")
  @js.native
  val BOXPLOT_ : boxplot = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compositemark/boxplot.d.ts", "BOXPLOT_PARTS")
  @js.native
  val BOXPLOT_PARTS: js.Tuple5[box, median, outliers, rule, ticks] = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compositemark/boxplot.d.ts", "boxPlotNormalizer")
  @js.native
  val boxPlotNormalizer: CompositeMarkNormalizer[boxplot] = js.native
  
  inline def getBoxPlotType(extent: Double): `min-max` | tukey = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoxPlotType")(extent.asInstanceOf[js.Any]).asInstanceOf[`min-max` | tukey]
  
  inline def getBoxPlotType_minmax(extent: `min-max`): `min-max` | tukey = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoxPlotType")(extent.asInstanceOf[js.Any]).asInstanceOf[`min-max` | tukey]
  
  inline def normalizeBoxPlot(spec: GenericUnitSpec[Encoding[String], BoxPlot | BoxPlotDef], hasConfig: NormalizerParams): NormalizedLayerSpec = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBoxPlot")(spec.asInstanceOf[js.Any], hasConfig.asInstanceOf[js.Any])).asInstanceOf[NormalizedLayerSpec]
  
  type BoxPlot = boxplot
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Record<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compositemark/boxplot.d.ts.BoxPlotPart, boolean | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/mark.d.ts.MarkConfig<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/expr.d.ts.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef>> ]:? std.Record<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compositemark/boxplot.d.ts.BoxPlotPart, boolean | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/mark.d.ts.MarkConfig<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/expr.d.ts.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef>>[P]} */ trait BoxPlotConfig extends StObject {
    
    /**
      * The extent of the whiskers. Available options include:
      * - `"min-max"`: min and max are the lower and upper whiskers respectively.
      * - A number representing multiple of the interquartile range. This number will be multiplied by the IQR to determine whisker boundary, which spans from the smallest data to the largest data within the range _[Q1 - k * IQR, Q3 + k * IQR]_ where _Q1_ and _Q3_ are the first and third quartiles while _IQR_ is the interquartile range (_Q3-Q1_).
      *
      * __Default value:__ `1.5`.
      */
    var extent: js.UndefOr[`min-max` | Double] = js.undefined
    
    /** Size of the box and median tick of a box plot */
    var size: js.UndefOr[Double] = js.undefined
  }
  object BoxPlotConfig {
    
    inline def apply(): BoxPlotConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxPlotConfig]
    }
    
    extension [Self <: BoxPlotConfig](x: Self) {
      
      inline def setExtent(value: `min-max` | Double): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait BoxPlotConfigMixins extends StObject {
    
    /**
      * Box Config
      */
    var boxplot: js.UndefOr[BoxPlotConfig] = js.undefined
  }
  object BoxPlotConfigMixins {
    
    inline def apply(): BoxPlotConfigMixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxPlotConfigMixins]
    }
    
    extension [Self <: BoxPlotConfigMixins](x: Self) {
      
      inline def setBoxplot(value: BoxPlotConfig): Self = StObject.set(x, "boxplot", value.asInstanceOf[js.Any])
      
      inline def setBoxplotUndefined: Self = StObject.set(x, "boxplot", js.undefined)
    }
  }
  
  type BoxPlotDef = GenericCompositeMarkDef[BoxPlot] & BoxPlotConfig & Orient
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.box
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.median
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.outliers
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.rule
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ticks
  */
  trait BoxPlotPart extends StObject
  
  type BoxPlotPartsMixins = PartsMixins[BoxPlotPart]
}
