package typings.d3kit

import org.scalablytyped.runtime.StringDictionary
import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3kit.anon.Height
import typings.std.CanvasRenderingContext2D
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3kit", "AbstractChart")
  @js.native
  class AbstractChart protected () extends Base {
    def this(selector: String) = this()
    def this(selector: Element) = this()
    def this(selector: String, options: ChartOptions) = this()
    def this(selector: Element, options: ChartOptions) = this()
    
    def addPlate(name: String, plate: AbstractPlate): this.type = js.native
    def addPlate(name: String, plate: AbstractPlate, doNotAppend: Boolean): AbstractPlate = js.native
    
    def data(): js.Any = js.native
    def data(data: js.Any): this.type = js.native
    
    def destroy(): this.type = js.native
    
    def dispatchAs(name: String, args: js.Any*): js.Function1[/* repeated */ js.Any, Unit] = js.native
    
    def fit(): this.type = js.native
    def fit(fitOptions: Unit, watchOptions: Boolean): this.type = js.native
    def fit(fitOptions: Unit, watchOptions: WatchOptions): this.type = js.native
    def fit(fitOptions: FitOptions): this.type = js.native
    def fit(fitOptions: FitOptions, watchOptions: Boolean): this.type = js.native
    def fit(fitOptions: FitOptions, watchOptions: WatchOptions): this.type = js.native
    
    def getCustomEventNames(): js.Array[String] = js.native
    
    def getInnerHeight(): Double = js.native
    
    def getInnerWidth(): Double = js.native
    
    def hasData(): Boolean = js.native
    
    def hasNonZeroArea(): Boolean = js.native
    
    def off(name: String): this.type = js.native
    
    def on(name: String, listener: js.Function0[Unit]): this.type = js.native
    
    def options(): ChartOptions = js.native
    def options(options: ChartOptions): this.type = js.native
    
    def removePlate(name: String): this.type = js.native
    
    def setupDispatcher(): this.type = js.native
    def setupDispatcher(customEventNames: js.Array[String]): this.type = js.native
    
    def stopFitWatcher(): this.type = js.native
  }
  /* static members */
  object AbstractChart {
    
    @JSImport("d3kit", "AbstractChart")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getCustomEventNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomEventNames")().asInstanceOf[js.Array[String]]
  }
  
  @JSImport("d3kit", "AbstractPlate")
  @js.native
  class AbstractPlate protected () extends Base {
    def this(selector: String) = this()
    def this(selector: Element) = this()
    def this(selector: String, options: ChartOptions) = this()
    def this(selector: Element, options: ChartOptions) = this()
    
    def getNode(): Element = js.native
    
    def getSelection(): Selection_[BaseType, js.Any, BaseType, js.Any] = js.native
  }
  /* static members */
  object AbstractPlate {
    
    @JSImport("d3kit", "AbstractPlate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefaultOptions(): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ChartOptions]
    inline def getDefaultOptions(options: ChartOptions): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[ChartOptions]
  }
  
  @JSImport("d3kit", "Base")
  @js.native
  class Base () extends StObject {
    def this(options: ChartOptions) = this()
    
    def copyDimension(another: Base): this.type = js.native
    
    def dimension(): js.Tuple2[Double, Double] = js.native
    def dimension(dimensions: js.Tuple2[Double, Double]): this.type = js.native
    
    def height(): Double = js.native
    def height(value: Double): this.type = js.native
    
    def margin(): ChartMargin = js.native
    def margin(margins: ChartMargin): this.type = js.native
    
    def offset(): js.Tuple2[Double, Double] = js.native
    def offset(offset: js.Tuple2[Double, Double]): this.type = js.native
    
    def pixelRatio(): Double = js.native
    def pixelRatio(value: Double): this.type = js.native
    
    def updateDimensionNow(): this.type = js.native
    
    def width(): Double = js.native
    def width(value: Double): this.type = js.native
  }
  /* static members */
  object Base {
    
    @JSImport("d3kit", "Base")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefaultOptions(): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ChartOptions]
    inline def getDefaultOptions(options: ChartOptions): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[ChartOptions]
  }
  
  @JSImport("d3kit", "CanvasChart")
  @js.native
  class CanvasChart protected () extends AbstractChart {
    def this(selector: String) = this()
    def this(selector: Element) = this()
    def this(selector: String, options: ChartOptions) = this()
    def this(selector: Element, options: ChartOptions) = this()
    
    def clear(): this.type = js.native
    
    def getContext2d(): CanvasRenderingContext2D = js.native
  }
  /* static members */
  object CanvasChart {
    
    @JSImport("d3kit", "CanvasChart")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefaultOptions(): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ChartOptions]
  }
  
  @JSImport("d3kit", "CanvasPlate")
  @js.native
  class CanvasPlate () extends AbstractPlate {
    def this(options: ChartOptions) = this()
    
    def clear(): this.type = js.native
    
    def getContext2d(): CanvasRenderingContext2D = js.native
  }
  /* static members */
  object CanvasPlate {
    
    @JSImport("d3kit", "CanvasPlate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefaultOptions(): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ChartOptions]
    inline def getDefaultOptions(options: ChartOptions): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[ChartOptions]
  }
  
  @JSImport("d3kit", "DivPlate")
  @js.native
  class DivPlate () extends AbstractPlate {
    def this(options: ChartOptions) = this()
  }
  /* static members */
  object DivPlate {
    
    @JSImport("d3kit", "DivPlate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefaultOptions(): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ChartOptions]
    inline def getDefaultOptions(options: ChartOptions): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[ChartOptions]
  }
  
  @JSImport("d3kit", "HybridChart")
  @js.native
  class HybridChart protected () extends CanvasChart {
    def this(selector: String) = this()
    def this(selector: Element) = this()
    def this(selector: String, options: ChartOptions) = this()
    def this(selector: Element, options: ChartOptions) = this()
    
    var layers: LayerOrganizer = js.native
    
    var plate: SvgPlate = js.native
    
    var rootG: Selection_[BaseType, js.Any, BaseType, js.Any] = js.native
    
    var svg: Selection_[BaseType, js.Any, BaseType, js.Any] = js.native
  }
  /* static members */
  object HybridChart {
    
    @JSImport("d3kit", "HybridChart")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefaultOptions(): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ChartOptions]
  }
  
  @JSImport("d3kit", "LayerOrganizer")
  @js.native
  class LayerOrganizer protected () extends StObject {
    def this(container: Selection_[BaseType, js.Any, BaseType, js.Any]) = this()
    def this(container: Selection_[BaseType, js.Any, BaseType, js.Any], defaultTag: String) = this()
    
    def create(layerNames: String): (Selection_[BaseType, js.Any, BaseType, js.Any]) | (js.Array[Selection_[BaseType, js.Any, BaseType, js.Any]]) = js.native
    def create(layerNames: js.Array[LayerConfig | String]): (Selection_[BaseType, js.Any, BaseType, js.Any]) | (js.Array[Selection_[BaseType, js.Any, BaseType, js.Any]]) = js.native
    def create(layerNames: LayerConfig): (Selection_[BaseType, js.Any, BaseType, js.Any]) | (js.Array[Selection_[BaseType, js.Any, BaseType, js.Any]]) = js.native
    
    def get(name: String): Selection_[BaseType, js.Any, BaseType, js.Any] = js.native
    
    def has(name: String): Boolean = js.native
  }
  
  @JSImport("d3kit", "SvgChart")
  @js.native
  class SvgChart protected () extends AbstractChart {
    def this(selector: String) = this()
    def this(selector: Element) = this()
    def this(selector: String, options: ChartOptions) = this()
    def this(selector: Element, options: ChartOptions) = this()
    
    var layers: LayerOrganizer = js.native
    
    var plate: SvgPlate = js.native
    
    var rootG: Selection_[BaseType, js.Any, BaseType, js.Any] = js.native
    
    var svg: Selection_[BaseType, js.Any, BaseType, js.Any] = js.native
  }
  
  @JSImport("d3kit", "SvgPlate")
  @js.native
  class SvgPlate () extends AbstractPlate {
    def this(options: ChartOptions) = this()
    
    var layers: LayerOrganizer = js.native
    
    var rootG: Selection_[BaseType, js.Any, BaseType, js.Any] = js.native
  }
  /* static members */
  object SvgPlate {
    
    @JSImport("d3kit", "SvgPlate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefaultOptions(): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ChartOptions]
    inline def getDefaultOptions(options: ChartOptions): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[ChartOptions]
  }
  
  object helper {
    
    @JSImport("d3kit", "helper")
    @js.native
    val ^ : js.Any = js.native
    
    inline def debounce(fn: js.Function1[/* repeated */ js.Any, Unit], delay: Double): js.Function1[/* repeated */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
    
    inline def deepExtend(dest: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deepExtend")(dest.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def extend(dest: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def functor(value: js.Any): js.Function1[/* repeated */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("functor")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Any]]
    
    inline def isFunction(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def kebabCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("kebabCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def rebind(target: js.Any, source: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("rebind")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def throttle(fn: js.Function1[/* repeated */ js.Any, Unit], delay: Double): js.Function1[/* repeated */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  }
  
  trait ChartMargin extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object ChartMargin {
    
    inline def apply(): ChartMargin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartMargin]
    }
    
    extension [Self <: ChartMargin](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait ChartOptions extends StObject {
    
    var initialHeight: js.UndefOr[Double] = js.undefined
    
    var initialWidth: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[ChartMargin] = js.undefined
    
    var offset: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
  }
  object ChartOptions {
    
    inline def apply(): ChartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartOptions]
    }
    
    extension [Self <: ChartOptions](x: Self) {
      
      inline def setInitialHeight(value: Double): Self = StObject.set(x, "initialHeight", value.asInstanceOf[js.Any])
      
      inline def setInitialHeightUndefined: Self = StObject.set(x, "initialHeight", js.undefined)
      
      inline def setInitialWidth(value: Double): Self = StObject.set(x, "initialWidth", value.asInstanceOf[js.Any])
      
      inline def setInitialWidthUndefined: Self = StObject.set(x, "initialWidth", js.undefined)
      
      inline def setMargin(value: ChartMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOffset(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    }
  }
  
  trait FitOptions extends StObject {
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var maxHeight: js.UndefOr[String | Double] = js.undefined
    
    var maxWidth: js.UndefOr[String | Double] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
    
    var ratio: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object FitOptions {
    
    inline def apply(): FitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FitOptions]
    }
    
    extension [Self <: FitOptions](x: Self) {
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMaxHeight(value: String | Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: String | Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LayerConfig
    extends StObject
       with /* layerName */ StringDictionary[String | (js.Array[LayerConfig | String]) | LayerConfig]
  object LayerConfig {
    
    inline def apply(): LayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerConfig]
    }
  }
  
  trait WatchOptions extends StObject {
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[Element | (js.Tuple2[Double, Double]) | Height | Null] = js.undefined
  }
  object WatchOptions {
    
    inline def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    extension [Self <: WatchOptions](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setTarget(value: Element | (js.Tuple2[Double, Double]) | Height): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
