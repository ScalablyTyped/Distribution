package typings.chartjsPluginDoughnutlabelRebourne

import org.scalablytyped.runtime.Shortcut
import typings.chartJs.basicMod.AnyObject
import typings.chartJs.mod.Chart
import typings.chartJs.mod.ChartType
import typings.chartJs.mod.DefaultDataPoint
import typings.chartJs.mod.Plugin
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.$LeftcurlybracketnumberRightcurlybracket
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterBuildTicks
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterDataLimits
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterDatasetDraw
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterDatasetUpdate
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterDatasetsDraw
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterDatasetsUpdate
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterDestroy
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterDraw
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterEvent
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterInit
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterLayout
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterRender
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterTooltipDraw
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterUpdate
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeBuildTicks
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeDataLimits
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeDatasetDraw
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeDatasetUpdate
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeDatasetsDraw
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeDatasetsUpdate
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeDestroy
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeDraw
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeElementsUpdate
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeEvent
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeInit
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeLayout
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeRender
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeTooltipDraw
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeUpdate
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.destroy
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.doughnut
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.id
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.inherit
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.initial
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.install
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.italic
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.normal
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.oblique
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.reset
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.resize
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.start
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.stop
import typings.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.uninstall
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chartjs-plugin-doughnutlabel-rebourne", JSImport.Namespace)
  @js.native
  val ^ : Plugin[doughnut, AnyObject] = js.native
  
  trait Font extends StObject {
    
    /** Defaults to `Chart.defaults.global.defaultFontFamily` */
    var family: js.UndefOr[String] = js.undefined
    
    /** Defaults to 1.2 */
    var lineHeight: js.UndefOr[Double | $LeftcurlybracketnumberRightcurlybracket] = js.undefined
    
    /** Defaults to `Chart.defaults.global.defaultFontSize` */
    var size: js.UndefOr[Double | $LeftcurlybracketnumberRightcurlybracket] = js.undefined
    
    /** Defaults to `Chart.defaults.global.defaultFontStyle` */
    var style: js.UndefOr[normal | italic | oblique | initial | inherit] = js.undefined
    
    /** Defaults to `'normal'` */
    var weight: js.UndefOr[String] = js.undefined
  }
  object Font {
    
    inline def apply(): Font = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Font]
    }
    
    extension [Self <: Font](x: Self) {
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setLineHeight(value: Double | $LeftcurlybracketnumberRightcurlybracket): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setSize(value: Double | $LeftcurlybracketnumberRightcurlybracket): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: normal | italic | oblique | initial | inherit): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  trait Label extends StObject {
    
    /** Color of the labels (single label scope) */
    var color: js.UndefOr[String | CanvasGradient | CanvasPattern] = js.undefined
    
    /** Show the label or not (single label scope) */
    var display: js.UndefOr[Boolean] = js.undefined
    
    /** The font options used to draw the label text (single label scope) */
    var font: js.UndefOr[Font] = js.undefined
    
    /** The text to display */
    var text: String | Double | (js.Function1[/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], String | Double])
  }
  object Label {
    
    inline def apply(
      text: String | Double | (js.Function1[/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], String | Double])
    ): Label = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setColor(value: String | CanvasGradient | CanvasPattern): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setText(
        value: String | Double | (js.Function1[/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], String | Double])
      ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextFunction1(value: /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any] => String | Double): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    }
  }
  
  trait Options extends StObject {
    
    /** Which plugin core api to use to draw labels */
    var api: js.UndefOr[
        Exclude[
          /* keyof chart.js.chart.js.Plugin<chart.js.chart.js.ChartType, chart.js.chart.js/types/basic.AnyObject> */ id | install | start | stop | beforeInit | afterInit | beforeUpdate | afterUpdate | beforeElementsUpdate | reset | beforeDatasetsUpdate | afterDatasetsUpdate | beforeDatasetUpdate | afterDatasetUpdate | beforeLayout | beforeDataLimits | afterDataLimits | beforeBuildTicks | afterBuildTicks | afterLayout | beforeRender | afterRender | beforeDraw | afterDraw | beforeDatasetsDraw | afterDatasetsDraw | beforeDatasetDraw | afterDatasetDraw | beforeEvent | afterEvent | resize | beforeDestroy | destroy | afterDestroy | uninstall | beforeTooltipDraw | afterTooltipDraw, 
          id
        ]
      ] = js.undefined
    
    /** Color of the labels (plugin scope) */
    var color: js.UndefOr[String | CanvasGradient | CanvasPattern] = js.undefined
    
    /** Show labels or not (plugin scope) */
    var display: js.UndefOr[Boolean] = js.undefined
    
    /** The font options used to draw the label text (plugin scope) */
    var font: js.UndefOr[Font] = js.undefined
    
    var labels: js.UndefOr[js.Array[Label]] = js.undefined
    
    /** How much padding to add when scaling very large text (value in percentage of 100) */
    var paddingPercentage: js.UndefOr[Double | $LeftcurlybracketnumberRightcurlybracket] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setApi(
        value: Exclude[
              /* keyof chart.js.chart.js.Plugin<chart.js.chart.js.ChartType, chart.js.chart.js/types/basic.AnyObject> */ id | install | start | stop | beforeInit | afterInit | beforeUpdate | afterUpdate | beforeElementsUpdate | reset | beforeDatasetsUpdate | afterDatasetsUpdate | beforeDatasetUpdate | afterDatasetUpdate | beforeLayout | beforeDataLimits | afterDataLimits | beforeBuildTicks | afterBuildTicks | afterLayout | beforeRender | afterRender | beforeDraw | afterDraw | beforeDatasetsDraw | afterDatasetsDraw | beforeDatasetDraw | afterDatasetDraw | beforeEvent | afterEvent | resize | beforeDestroy | destroy | afterDestroy | uninstall | beforeTooltipDraw | afterTooltipDraw, 
              id
            ]
      ): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setColor(value: String | CanvasGradient | CanvasPattern): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setLabels(value: js.Array[Label]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLabelsVarargs(value: Label*): Self = StObject.set(x, "labels", js.Array(value*))
      
      inline def setPaddingPercentage(value: Double | $LeftcurlybracketnumberRightcurlybracket): Self = StObject.set(x, "paddingPercentage", value.asInstanceOf[js.Any])
      
      inline def setPaddingPercentageUndefined: Self = StObject.set(x, "paddingPercentage", js.undefined)
    }
  }
  
  type _To = Plugin[doughnut, AnyObject]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[doughnut, AnyObject] = ^
  
  /* augmented module */
  object chartJsAugmentingMod {
    
    trait PluginOptionsByType[TType /* <: ChartType */] extends StObject {
      
      var doughnutlabel: js.UndefOr[Options] = js.undefined
    }
    object PluginOptionsByType {
      
      inline def apply[TType /* <: ChartType */](): PluginOptionsByType[TType] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PluginOptionsByType[TType]]
      }
      
      extension [Self <: PluginOptionsByType[?], TType /* <: ChartType */](x: Self & PluginOptionsByType[TType]) {
        
        inline def setDoughnutlabel(value: Options): Self = StObject.set(x, "doughnutlabel", value.asInstanceOf[js.Any])
        
        inline def setDoughnutlabelUndefined: Self = StObject.set(x, "doughnutlabel", js.undefined)
      }
    }
  }
}
