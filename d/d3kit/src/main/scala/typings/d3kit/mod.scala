package typings.d3kit

import org.scalablytyped.runtime.StringDictionary
import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3kit.anon.Height
import typings.std.CanvasRenderingContext2D
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    def fit(fitOptions: js.UndefOr[scala.Nothing], watchOptions: Boolean): this.type = js.native
    def fit(fitOptions: js.UndefOr[scala.Nothing], watchOptions: WatchOptions): this.type = js.native
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
    
    @JSImport("d3kit", "AbstractChart.getCustomEventNames")
    @js.native
    def getCustomEventNames(): js.Array[String] = js.native
  }
  
  @JSImport("d3kit", "AbstractPlate")
  @js.native
  class AbstractPlate protected () extends Base {
    def this(selector: String) = this()
    def this(selector: Element) = this()
    def this(selector: String, options: ChartOptions) = this()
    def this(selector: Element, options: ChartOptions) = this()
    
    def getNode(): Element = js.native
    
    def getSelection(): Selection_[BaseType, _, BaseType, _] = js.native
  }
  /* static members */
  object AbstractPlate {
    
    @JSImport("d3kit", "AbstractPlate.getDefaultOptions")
    @js.native
    def getDefaultOptions(): ChartOptions = js.native
    @JSImport("d3kit", "AbstractPlate.getDefaultOptions")
    @js.native
    def getDefaultOptions(options: ChartOptions): ChartOptions = js.native
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
    
    @JSImport("d3kit", "Base.getDefaultOptions")
    @js.native
    def getDefaultOptions(): ChartOptions = js.native
    @JSImport("d3kit", "Base.getDefaultOptions")
    @js.native
    def getDefaultOptions(options: ChartOptions): ChartOptions = js.native
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
    
    @JSImport("d3kit", "CanvasChart.getDefaultOptions")
    @js.native
    def getDefaultOptions(): ChartOptions = js.native
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
    
    @JSImport("d3kit", "CanvasPlate.getDefaultOptions")
    @js.native
    def getDefaultOptions(): ChartOptions = js.native
    @JSImport("d3kit", "CanvasPlate.getDefaultOptions")
    @js.native
    def getDefaultOptions(options: ChartOptions): ChartOptions = js.native
  }
  
  @JSImport("d3kit", "DivPlate")
  @js.native
  class DivPlate () extends AbstractPlate {
    def this(options: ChartOptions) = this()
  }
  /* static members */
  object DivPlate {
    
    @JSImport("d3kit", "DivPlate.getDefaultOptions")
    @js.native
    def getDefaultOptions(): ChartOptions = js.native
    @JSImport("d3kit", "DivPlate.getDefaultOptions")
    @js.native
    def getDefaultOptions(options: ChartOptions): ChartOptions = js.native
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
    
    var rootG: Selection_[BaseType, _, BaseType, _] = js.native
    
    var svg: Selection_[BaseType, _, BaseType, _] = js.native
  }
  /* static members */
  object HybridChart {
    
    @JSImport("d3kit", "HybridChart.getDefaultOptions")
    @js.native
    def getDefaultOptions(): ChartOptions = js.native
  }
  
  @JSImport("d3kit", "LayerOrganizer")
  @js.native
  class LayerOrganizer protected () extends StObject {
    def this(container: Selection_[BaseType, _, BaseType, _]) = this()
    def this(container: Selection_[BaseType, _, BaseType, _], defaultTag: String) = this()
    
    def create(layerNames: String): (Selection_[BaseType, _, BaseType, _]) | (js.Array[Selection_[BaseType, _, BaseType, _]]) = js.native
    def create(layerNames: js.Array[LayerConfig | String]): (Selection_[BaseType, _, BaseType, _]) | (js.Array[Selection_[BaseType, _, BaseType, _]]) = js.native
    def create(layerNames: LayerConfig): (Selection_[BaseType, _, BaseType, _]) | (js.Array[Selection_[BaseType, _, BaseType, _]]) = js.native
    
    def get(name: String): Selection_[BaseType, _, BaseType, _] = js.native
    
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
    
    var rootG: Selection_[BaseType, _, BaseType, _] = js.native
    
    var svg: Selection_[BaseType, _, BaseType, _] = js.native
  }
  
  @JSImport("d3kit", "SvgPlate")
  @js.native
  class SvgPlate () extends AbstractPlate {
    def this(options: ChartOptions) = this()
    
    var layers: LayerOrganizer = js.native
    
    var rootG: Selection_[BaseType, _, BaseType, _] = js.native
  }
  /* static members */
  object SvgPlate {
    
    @JSImport("d3kit", "SvgPlate.getDefaultOptions")
    @js.native
    def getDefaultOptions(): ChartOptions = js.native
    @JSImport("d3kit", "SvgPlate.getDefaultOptions")
    @js.native
    def getDefaultOptions(options: ChartOptions): ChartOptions = js.native
  }
  
  object helper {
    
    @JSImport("d3kit", "helper.debounce")
    @js.native
    def debounce(fn: js.Function1[/* repeated */ js.Any, Unit], delay: Double): js.Function1[/* repeated */ js.Any, Unit] = js.native
    
    @JSImport("d3kit", "helper.deepExtend")
    @js.native
    def deepExtend(dest: js.Any, args: js.Any*): js.Any = js.native
    
    @JSImport("d3kit", "helper.extend")
    @js.native
    def extend(dest: js.Any, args: js.Any*): js.Any = js.native
    
    @JSImport("d3kit", "helper.functor")
    @js.native
    def functor(value: js.Any): js.Function1[/* repeated */ js.Any, _] = js.native
    
    @JSImport("d3kit", "helper.isFunction")
    @js.native
    def isFunction(value: js.Any): Boolean = js.native
    
    @JSImport("d3kit", "helper.isObject")
    @js.native
    def isObject(value: js.Any): Boolean = js.native
    
    @JSImport("d3kit", "helper.kebabCase")
    @js.native
    def kebabCase(str: String): String = js.native
    
    @JSImport("d3kit", "helper.rebind")
    @js.native
    def rebind(target: js.Any, source: js.Any): js.Any = js.native
    
    @JSImport("d3kit", "helper.throttle")
    @js.native
    def throttle(fn: js.Function1[/* repeated */ js.Any, Unit], delay: Double): js.Function1[/* repeated */ js.Any, Unit] = js.native
  }
  
  @js.native
  trait ChartMargin extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var left: js.UndefOr[Double] = js.native
    
    var right: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
  }
  object ChartMargin {
    
    @scala.inline
    def apply(): ChartMargin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartMargin]
    }
    
    @scala.inline
    implicit class ChartMarginMutableBuilder[Self <: ChartMargin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait ChartOptions extends StObject {
    
    var initialHeight: js.UndefOr[Double] = js.native
    
    var initialWidth: js.UndefOr[Double] = js.native
    
    var margin: js.UndefOr[ChartMargin] = js.native
    
    var offset: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var pixelRatio: js.UndefOr[Double] = js.native
  }
  object ChartOptions {
    
    @scala.inline
    def apply(): ChartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartOptions]
    }
    
    @scala.inline
    implicit class ChartOptionsMutableBuilder[Self <: ChartOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialHeight(value: Double): Self = StObject.set(x, "initialHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialHeightUndefined: Self = StObject.set(x, "initialHeight", js.undefined)
      
      @scala.inline
      def setInitialWidth(value: Double): Self = StObject.set(x, "initialWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialWidthUndefined: Self = StObject.set(x, "initialWidth", js.undefined)
      
      @scala.inline
      def setMargin(value: ChartMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    }
  }
  
  @js.native
  trait FitOptions extends StObject {
    
    var height: js.UndefOr[String | Double] = js.native
    
    var maxHeight: js.UndefOr[String | Double] = js.native
    
    var maxWidth: js.UndefOr[String | Double] = js.native
    
    var mode: js.UndefOr[String] = js.native
    
    var ratio: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[String | Double] = js.native
  }
  object FitOptions {
    
    @scala.inline
    def apply(): FitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FitOptions]
    }
    
    @scala.inline
    implicit class FitOptionsMutableBuilder[Self <: FitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: String | Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: String | Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait LayerConfig
    extends /* layerName */ StringDictionary[String | (js.Array[LayerConfig | String]) | LayerConfig]
  object LayerConfig {
    
    @scala.inline
    def apply(): LayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerConfig]
    }
  }
  
  @js.native
  trait WatchOptions extends StObject {
    
    var interval: js.UndefOr[Double] = js.native
    
    var mode: js.UndefOr[String] = js.native
    
    var target: js.UndefOr[Element | (js.Tuple2[Double, Double]) | Height | Null] = js.native
  }
  object WatchOptions {
    
    @scala.inline
    def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    @scala.inline
    implicit class WatchOptionsMutableBuilder[Self <: WatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setTarget(value: Element | (js.Tuple2[Double, Double]) | Height): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
