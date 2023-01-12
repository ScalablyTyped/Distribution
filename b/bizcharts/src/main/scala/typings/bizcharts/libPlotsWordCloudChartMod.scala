package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.antvG2.libChartLayoutPaddingCalMod.PaddingCalCtor
import typings.antvG2.libChartViewMod.View
import typings.antvG2.libInterfaceMod.SyncViewPaddingFn
import typings.antvG2plot.anon.PartialTagxnumberynumber
import typings.antvG2plot.libCorePlotMod.Plot
import typings.antvG2plot.libPlotsWordCloudTypesMod.Word
import typings.antvG2plot.libPlotsWordCloudTypesMod.WordStyle
import typings.antvG2plot.libTypesAnimationMod.Animation
import typings.antvG2plot.libTypesAnnotationMod.Annotation
import typings.antvG2plot.libTypesAttrMod.ColorAttr
import typings.antvG2plot.libTypesAttrMod.PatternAttr
import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.antvG2plot.libTypesAxisMod.Axis
import typings.antvG2plot.libTypesCommonMod.Datum
import typings.antvG2plot.libTypesInteractionMod.Interaction
import typings.antvG2plot.libTypesLabelMod.Label
import typings.antvG2plot.libTypesLegendMod.Legend
import typings.antvG2plot.libTypesMetaMod.Meta
import typings.antvG2plot.libTypesScrollbarMod.Scrollbar
import typings.antvG2plot.libTypesSliderMod.Slider
import typings.antvG2plot.libTypesStateMod.State
import typings.antvG2plot.libUtilsPatternMod.PatternOption
import typings.bizcharts.anon.OnWordCloudClick
import typings.bizcharts.bizchartsStrings.archimedean
import typings.bizcharts.bizchartsStrings.auto
import typings.bizcharts.bizchartsStrings.canvas
import typings.bizcharts.bizchartsStrings.rectangular
import typings.bizcharts.bizchartsStrings.svg
import typings.bizcharts.libCreatePlotMod.VisibleText
import typings.bizcharts.libPlotsCoreInterfaceMod.TooltipAPIOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.CanvasPattern
import typings.std.HTMLImageElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsWordCloudChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/WordCloudChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[WordCloudCfg & RefAttributes[Any]] = js.native
  
  /* Inlined parent std.Partial<@antv/g2plot.@antv/g2plot/lib/plots/word-cloud.WordCloudOptions> */
  /* Inlined parent std.Omit<bizcharts.bizcharts/lib/createPlot.BasePlotOptions, 'events'> */
  trait WordCloudCfg extends StObject {
    
    var animation: js.UndefOr[Animation] = js.undefined
    
    var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
    
    var appendPadding: js.UndefOr[js.Array[Double] | Double] = js.undefined
    
    var autoFit: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[ColorAttr] = js.undefined
    
    var colorField: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Array[Record[String, Any]]] = js.undefined
    
    var defaultInteractions: js.UndefOr[js.Array[String]] = js.undefined
    
    var description: js.UndefOr[ReactNode | VisibleText] = js.undefined
    
    var errorContent: js.UndefOr[ReactNode] = js.undefined
    
    var events: js.UndefOr[OnWordCloudClick] = js.undefined
    
    var forceFit: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var imageMask: js.UndefOr[HTMLImageElement | String] = js.undefined
    
    var interactions: js.UndefOr[js.Array[Interaction]] = js.undefined
    
    var isMaterial: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[Label] = js.undefined
    
    var legend: js.UndefOr[Legend] = js.undefined
    
    var limitInPlot: js.UndefOr[Boolean] = js.undefined
    
    var localRefresh: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maskImage: js.UndefOr[String] = js.undefined
    
    var meta: js.UndefOr[Record[String, Meta]] = js.undefined
    
    var onGetG2Instance: js.UndefOr[js.Function1[/* chart */ Plot[Any], Unit]] = js.undefined
    
    var padding: js.UndefOr[js.Array[Double] | Double | auto] = js.undefined
    
    var pattern: js.UndefOr[PatternAttr] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var placementStrategy: js.UndefOr[
        js.Function3[
          /* word */ Word, 
          /* index */ js.UndefOr[Double], 
          /* words */ js.UndefOr[js.Array[Word]], 
          PartialTagxnumberynumber
        ]
      ] = js.undefined
    
    var random: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    
    var renderer: js.UndefOr[svg | canvas] = js.undefined
    
    var scrollbar: js.UndefOr[Scrollbar] = js.undefined
    
    var selected: js.UndefOr[Double] = js.undefined
    
    var shuffle: js.UndefOr[Boolean] = js.undefined
    
    var slider: js.UndefOr[Slider] = js.undefined
    
    var spiral: js.UndefOr[archimedean | rectangular] = js.undefined
    
    var state: js.UndefOr[State] = js.undefined
    
    var supportCSSTransform: js.UndefOr[Boolean] = js.undefined
    
    var syncViewPadding: js.UndefOr[Boolean | SyncViewPaddingFn] = js.undefined
    
    var theme: js.UndefOr[String | js.Object] = js.undefined
    
    var timeInterval: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[ReactNode | VisibleText] = js.undefined
    
    var tooltip: js.UndefOr[TooltipAPIOptions] = js.undefined
    
    var useDeferredLabel: js.UndefOr[Boolean | Double] = js.undefined
    
    var weightField: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var wordField: js.UndefOr[String] = js.undefined
    
    var wordStyle: js.UndefOr[WordStylePolyfill] = js.undefined
    
    var xAxis: js.UndefOr[Axis] = js.undefined
    
    var yAxis: js.UndefOr[Axis] = js.undefined
  }
  object WordCloudCfg {
    
    inline def apply(): WordCloudCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WordCloudCfg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WordCloudCfg] (val x: Self) extends AnyVal {
      
      inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setAppendPadding(value: js.Array[Double] | Double): Self = StObject.set(x, "appendPadding", value.asInstanceOf[js.Any])
      
      inline def setAppendPaddingUndefined: Self = StObject.set(x, "appendPadding", js.undefined)
      
      inline def setAppendPaddingVarargs(value: Double*): Self = StObject.set(x, "appendPadding", js.Array(value*))
      
      inline def setAutoFit(value: Boolean): Self = StObject.set(x, "autoFit", value.asInstanceOf[js.Any])
      
      inline def setAutoFitUndefined: Self = StObject.set(x, "autoFit", js.undefined)
      
      inline def setColor(value: ColorAttr): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
      
      inline def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
      
      inline def setColorFunction2(value: (/* datum */ Datum, /* defaultColor */ js.UndefOr[String]) => String): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setData(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDefaultInteractions(value: js.Array[String]): Self = StObject.set(x, "defaultInteractions", value.asInstanceOf[js.Any])
      
      inline def setDefaultInteractionsUndefined: Self = StObject.set(x, "defaultInteractions", js.undefined)
      
      inline def setDefaultInteractionsVarargs(value: String*): Self = StObject.set(x, "defaultInteractions", js.Array(value*))
      
      inline def setDescription(value: ReactNode | VisibleText): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setErrorContent(value: ReactNode): Self = StObject.set(x, "errorContent", value.asInstanceOf[js.Any])
      
      inline def setErrorContentUndefined: Self = StObject.set(x, "errorContent", js.undefined)
      
      inline def setEvents(value: OnWordCloudClick): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setForceFit(value: Boolean): Self = StObject.set(x, "forceFit", value.asInstanceOf[js.Any])
      
      inline def setForceFitUndefined: Self = StObject.set(x, "forceFit", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImageMask(value: HTMLImageElement | String): Self = StObject.set(x, "imageMask", value.asInstanceOf[js.Any])
      
      inline def setImageMaskUndefined: Self = StObject.set(x, "imageMask", js.undefined)
      
      inline def setInteractions(value: js.Array[Interaction]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
      
      inline def setInteractionsVarargs(value: Interaction*): Self = StObject.set(x, "interactions", js.Array(value*))
      
      inline def setIsMaterial(value: Boolean): Self = StObject.set(x, "isMaterial", value.asInstanceOf[js.Any])
      
      inline def setIsMaterialUndefined: Self = StObject.set(x, "isMaterial", js.undefined)
      
      inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLegend(value: Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setLimitInPlot(value: Boolean): Self = StObject.set(x, "limitInPlot", value.asInstanceOf[js.Any])
      
      inline def setLimitInPlotUndefined: Self = StObject.set(x, "limitInPlot", js.undefined)
      
      inline def setLocalRefresh(value: Boolean): Self = StObject.set(x, "localRefresh", value.asInstanceOf[js.Any])
      
      inline def setLocalRefreshUndefined: Self = StObject.set(x, "localRefresh", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaskImage(value: String): Self = StObject.set(x, "maskImage", value.asInstanceOf[js.Any])
      
      inline def setMaskImageUndefined: Self = StObject.set(x, "maskImage", js.undefined)
      
      inline def setMeta(value: Record[String, Meta]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setOnGetG2Instance(value: /* chart */ Plot[Any] => Unit): Self = StObject.set(x, "onGetG2Instance", js.Any.fromFunction1(value))
      
      inline def setOnGetG2InstanceUndefined: Self = StObject.set(x, "onGetG2Instance", js.undefined)
      
      inline def setPadding(value: js.Array[Double] | Double | auto): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setPattern(value: PatternAttr): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternFunction2(value: (/* datum */ Datum, /* color */ String) => PatternOption | CanvasPattern): Self = StObject.set(x, "pattern", js.Any.fromFunction2(value))
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setPlacementStrategy(
        value: (/* word */ Word, /* index */ js.UndefOr[Double], /* words */ js.UndefOr[js.Array[Word]]) => PartialTagxnumberynumber
      ): Self = StObject.set(x, "placementStrategy", js.Any.fromFunction3(value))
      
      inline def setPlacementStrategyUndefined: Self = StObject.set(x, "placementStrategy", js.undefined)
      
      inline def setRandom(value: Double | js.Function0[Double]): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      inline def setRandomFunction0(value: () => Double): Self = StObject.set(x, "random", js.Any.fromFunction0(value))
      
      inline def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
      
      inline def setRenderer(value: svg | canvas): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setScrollbar(value: Scrollbar): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
      
      inline def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
      
      inline def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
      
      inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setSpiral(value: archimedean | rectangular): Self = StObject.set(x, "spiral", value.asInstanceOf[js.Any])
      
      inline def setSpiralUndefined: Self = StObject.set(x, "spiral", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setSupportCSSTransform(value: Boolean): Self = StObject.set(x, "supportCSSTransform", value.asInstanceOf[js.Any])
      
      inline def setSupportCSSTransformUndefined: Self = StObject.set(x, "supportCSSTransform", js.undefined)
      
      inline def setSyncViewPadding(value: Boolean | SyncViewPaddingFn): Self = StObject.set(x, "syncViewPadding", value.asInstanceOf[js.Any])
      
      inline def setSyncViewPaddingFunction3(value: (/* chart */ View, /* views */ js.Array[View], /* PC */ PaddingCalCtor) => Unit): Self = StObject.set(x, "syncViewPadding", js.Any.fromFunction3(value))
      
      inline def setSyncViewPaddingUndefined: Self = StObject.set(x, "syncViewPadding", js.undefined)
      
      inline def setTheme(value: String | js.Object): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTimeInterval(value: Double): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
      
      inline def setTimeIntervalUndefined: Self = StObject.set(x, "timeInterval", js.undefined)
      
      inline def setTitle(value: ReactNode | VisibleText): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTooltip(value: TooltipAPIOptions): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setUseDeferredLabel(value: Boolean | Double): Self = StObject.set(x, "useDeferredLabel", value.asInstanceOf[js.Any])
      
      inline def setUseDeferredLabelUndefined: Self = StObject.set(x, "useDeferredLabel", js.undefined)
      
      inline def setWeightField(value: String): Self = StObject.set(x, "weightField", value.asInstanceOf[js.Any])
      
      inline def setWeightFieldUndefined: Self = StObject.set(x, "weightField", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWordField(value: String): Self = StObject.set(x, "wordField", value.asInstanceOf[js.Any])
      
      inline def setWordFieldUndefined: Self = StObject.set(x, "wordField", js.undefined)
      
      inline def setWordStyle(value: WordStylePolyfill): Self = StObject.set(x, "wordStyle", value.asInstanceOf[js.Any])
      
      inline def setWordStyleUndefined: Self = StObject.set(x, "wordStyle", js.undefined)
      
      inline def setXAxis(value: Axis): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
      
      inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
      
      inline def setYAxis(value: Axis): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
      
      inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    }
  }
  
  trait WordStylePolyfill
    extends StObject
       with WordStyle {
    
    var active: js.UndefOr[ShapeStyle] = js.undefined
  }
  object WordStylePolyfill {
    
    inline def apply(): WordStylePolyfill = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WordStylePolyfill]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WordStylePolyfill] (val x: Self) extends AnyVal {
      
      inline def setActive(value: ShapeStyle): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[WordCloudCfg & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsWordCloudChartMod.foo` */
  override def _to: ForwardRefExoticComponent[WordCloudCfg & RefAttributes[Any]] = default
}
