package typings.canvasGauges

import org.scalablytyped.runtime.StringDictionary
import typings.canvasGauges.canvasGaugesStrings.animate
import typings.canvasGauges.canvasGaugesStrings.animationEnd
import typings.canvasGauges.canvasGaugesStrings.animationStart
import typings.canvasGauges.canvasGaugesStrings.beforeHighlights
import typings.canvasGauges.canvasGaugesStrings.beforeMajorTicks
import typings.canvasGauges.canvasGaugesStrings.beforeMinorTicks
import typings.canvasGauges.canvasGaugesStrings.beforeNeedle
import typings.canvasGauges.canvasGaugesStrings.beforeNumbers
import typings.canvasGauges.canvasGaugesStrings.beforePlate
import typings.canvasGauges.canvasGaugesStrings.beforeProgressBar
import typings.canvasGauges.canvasGaugesStrings.beforeTitle
import typings.canvasGauges.canvasGaugesStrings.beforeUnits
import typings.canvasGauges.canvasGaugesStrings.beforeValueBox
import typings.canvasGauges.canvasGaugesStrings.destroy
import typings.canvasGauges.canvasGaugesStrings.init
import typings.canvasGauges.canvasGaugesStrings.render
import typings.std.Array
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.MutationRecord
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CanvasGauges {
  
  @js.native
  trait Animation extends StObject {
    
    def animate(): js.Any = js.native
    def animate(draw: Unit, end: EndEventCallback): js.Any = js.native
    def animate(draw: DrawEventCallback): js.Any = js.native
    def animate(draw: DrawEventCallback, end: EndEventCallback): js.Any = js.native
    
    def destroy(): js.Any = js.native
    
    def draw(percent: Double): js.Any = js.native
    @JSName("draw")
    var draw_Original: DrawEventCallback = js.native
    
    var duration: Double = js.native
    
    def end(): js.Any = js.native
    @JSName("end")
    var end_Original: EndEventCallback = js.native
    
    var rule: String | AnimationRule = js.native
  }
  
  type AnimationRule = js.Function1[/* percent */ Double, Double]
  
  @js.native
  trait BaseGauge extends StObject {
    
    var animation: Animation = js.native
    
    var canvas: SmartCanvas = js.native
    
    def destroy(): js.Any = js.native
    
    def draw(): BaseGauge = js.native
    
    @JSName("on")
    def on_animate(event: animate, listeners: js.Function2[/* percent */ Double, /* value */ Double, Unit]): Unit = js.native
    @JSName("on")
    def on_animationEnd(event: animationEnd, listeners: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_animationStart(event: animationStart, listeners: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_beforeHighlights(event: beforeHighlights, listeners: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_beforeMajorTicks(event: beforeMajorTicks, listeners: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_beforeMinorTicks(event: beforeMinorTicks, listeners: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_beforeNeedle(event: beforeNeedle, listeners: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_beforeNumbers(event: beforeNumbers, listeners: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_beforePlate(event: beforePlate, listeners: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_beforeProgressBar(event: beforeProgressBar, listeners: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_beforeTitle(event: beforeTitle, listeners: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_beforeUnits(event: beforeUnits, listeners: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_beforeValueBox(event: beforeValueBox, listeners: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_destroy(event: destroy, listeners: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_init(event: init, listeners: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_render(event: render, listeners: js.Function0[Unit]): Unit = js.native
    
    var options: GenericOptions = js.native
    
    var `type`: BaseGauge = js.native
    
    def update(options: GenericOptions): BaseGauge = js.native
    
    var value: Double = js.native
  }
  
  @js.native
  trait Collection
    extends StObject
       with Array[BaseGauge] {
    
    def get(id: String): BaseGauge = js.native
    def get(id: Double): BaseGauge = js.native
  }
  
  @js.native
  trait DomObserver extends StObject {
    
    var Type: BaseGauge = js.native
    
    var element: String = js.native
    
    var isObservable: Boolean = js.native
    
    def isValidNode(node: HTMLElement): Boolean = js.native
    def isValidNode(node: Node): Boolean = js.native
    
    var mutationsObserved: Boolean = js.native
    
    def observe(records: js.Array[MutationRecord]): js.Any = js.native
    
    var options: GenericOptions = js.native
    
    def process(node: HTMLElement): BaseGauge = js.native
    def process(node: Node): BaseGauge = js.native
    
    def traverse(): js.Any = js.native
    
    var `type`: String = js.native
  }
  
  type DrawEventCallback = js.Function1[/* percent */ Double, js.Any]
  
  type EndEventCallback = js.Function0[js.Any]
  
  type EventListeners = StringDictionary[js.Function | js.Array[js.Function]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.canvasGauges.canvasGaugesStrings.normal
    - typings.canvasGauges.canvasGaugesStrings.italic
    - typings.canvasGauges.canvasGaugesStrings.oblique
  */
  trait FontStyle extends StObject
  object FontStyle {
    
    @scala.inline
    def italic: typings.canvasGauges.canvasGaugesStrings.italic = "italic".asInstanceOf[typings.canvasGauges.canvasGaugesStrings.italic]
    
    @scala.inline
    def normal: typings.canvasGauges.canvasGaugesStrings.normal = "normal".asInstanceOf[typings.canvasGauges.canvasGaugesStrings.normal]
    
    @scala.inline
    def oblique: typings.canvasGauges.canvasGaugesStrings.oblique = "oblique".asInstanceOf[typings.canvasGauges.canvasGaugesStrings.oblique]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.canvasGauges.canvasGaugesStrings.normal
    - typings.canvasGauges.canvasGaugesStrings.bold
    - typings.canvasGauges.canvasGaugesStrings.bolder
    - typings.canvasGauges.canvasGaugesStrings.lighter
    - typings.canvasGauges.canvasGaugesStrings.`100`
    - typings.canvasGauges.canvasGaugesStrings.`200`
    - typings.canvasGauges.canvasGaugesStrings.`300`
    - typings.canvasGauges.canvasGaugesStrings.`400`
    - typings.canvasGauges.canvasGaugesStrings.`500`
    - typings.canvasGauges.canvasGaugesStrings.`600`
    - typings.canvasGauges.canvasGaugesStrings.`700`
    - typings.canvasGauges.canvasGaugesStrings.`800`
    - typings.canvasGauges.canvasGaugesStrings.`900`
  */
  trait FontWeight extends StObject
  object FontWeight {
    
    @scala.inline
    def `100`: typings.canvasGauges.canvasGaugesStrings.`100` = "100".asInstanceOf[typings.canvasGauges.canvasGaugesStrings.`100`]
    
    @scala.inline
    def `200`: typings.canvasGauges.canvasGaugesStrings.`200` = "200".asInstanceOf[typings.canvasGauges.canvasGaugesStrings.`200`]
    
    @scala.inline
    def `300`: typings.canvasGauges.canvasGaugesStrings.`300` = "300".asInstanceOf[typings.canvasGauges.canvasGaugesStrings.`300`]
    
    @scala.inline
    def `400`: typings.canvasGauges.canvasGaugesStrings.`400` = "400".asInstanceOf[typings.canvasGauges.canvasGaugesStrings.`400`]
    
    @scala.inline
    def `500`: typings.canvasGauges.canvasGaugesStrings.`500` = "500".asInstanceOf[typings.canvasGauges.canvasGaugesStrings.`500`]
    
    @scala.inline
    def `600`: typings.canvasGauges.canvasGaugesStrings.`600` = "600".asInstanceOf[typings.canvasGauges.canvasGaugesStrings.`600`]
    
    @scala.inline
    def `700`: typings.canvasGauges.canvasGaugesStrings.`700` = "700".asInstanceOf[typings.canvasGauges.canvasGaugesStrings.`700`]
    
    @scala.inline
    def `800`: typings.canvasGauges.canvasGaugesStrings.`800` = "800".asInstanceOf[typings.canvasGauges.canvasGaugesStrings.`800`]
    
    @scala.inline
    def `900`: typings.canvasGauges.canvasGaugesStrings.`900` = "900".asInstanceOf[typings.canvasGauges.canvasGaugesStrings.`900`]
    
    @scala.inline
    def bold: typings.canvasGauges.canvasGaugesStrings.bold = "bold".asInstanceOf[typings.canvasGauges.canvasGaugesStrings.bold]
    
    @scala.inline
    def bolder: typings.canvasGauges.canvasGaugesStrings.bolder = "bolder".asInstanceOf[typings.canvasGauges.canvasGaugesStrings.bolder]
    
    @scala.inline
    def lighter: typings.canvasGauges.canvasGaugesStrings.lighter = "lighter".asInstanceOf[typings.canvasGauges.canvasGaugesStrings.lighter]
    
    @scala.inline
    def normal: typings.canvasGauges.canvasGaugesStrings.normal = "normal".asInstanceOf[typings.canvasGauges.canvasGaugesStrings.normal]
  }
  
  trait GenericOptions extends StObject {
    
    var animateOnInit: js.UndefOr[Boolean] = js.undefined
    
    var animatedValue: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[Boolean] = js.undefined
    
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    var animationRule: js.UndefOr[String | AnimationRule] = js.undefined
    
    var barProgress: js.UndefOr[Boolean] = js.undefined
    
    var barShadow: js.UndefOr[Double] = js.undefined
    
    var barStrokeWidth: js.UndefOr[Double] = js.undefined
    
    var barWidth: js.UndefOr[Double] = js.undefined
    
    var borderInnerWidth: js.UndefOr[Double] = js.undefined
    
    var borderMiddleWidth: js.UndefOr[Double] = js.undefined
    
    var borderOuterWidth: js.UndefOr[Double] = js.undefined
    
    var borderShadowWidth: js.UndefOr[Double] = js.undefined
    
    var borders: js.UndefOr[Boolean] = js.undefined
    
    var colorBar: js.UndefOr[String] = js.undefined
    
    var colorBarProgress: js.UndefOr[String] = js.undefined
    
    var colorBarShadow: js.UndefOr[String] = js.undefined
    
    var colorBarStroke: js.UndefOr[String] = js.undefined
    
    var colorBorderInner: js.UndefOr[String] = js.undefined
    
    var colorBorderInnerEnd: js.UndefOr[String] = js.undefined
    
    var colorBorderMiddle: js.UndefOr[String] = js.undefined
    
    var colorBorderMiddleEnd: js.UndefOr[String] = js.undefined
    
    var colorBorderOuter: js.UndefOr[String] = js.undefined
    
    var colorBorderOuterEnd: js.UndefOr[String] = js.undefined
    
    var colorBorderShadow: js.UndefOr[String] = js.undefined
    
    var colorMajorTicks: js.UndefOr[String] = js.undefined
    
    var colorMinorTicks: js.UndefOr[String] = js.undefined
    
    var colorNeedle: js.UndefOr[String] = js.undefined
    
    var colorNeedleEnd: js.UndefOr[String] = js.undefined
    
    var colorNeedleShadowDown: js.UndefOr[String] = js.undefined
    
    var colorNeedleShadowUp: js.UndefOr[String] = js.undefined
    
    var colorNumbers: js.UndefOr[String] = js.undefined
    
    var colorPlate: js.UndefOr[String] = js.undefined
    
    var colorPlateEnd: js.UndefOr[String] = js.undefined
    
    var colorTitle: js.UndefOr[String] = js.undefined
    
    var colorUnits: js.UndefOr[String] = js.undefined
    
    var colorValueBoxBackground: js.UndefOr[String] = js.undefined
    
    var colorValueBoxRect: js.UndefOr[String] = js.undefined
    
    var colorValueBoxRectEnd: js.UndefOr[String] = js.undefined
    
    var colorValueBoxShadow: js.UndefOr[String] = js.undefined
    
    var colorValueText: js.UndefOr[String] = js.undefined
    
    var colorValueTextShadow: js.UndefOr[String] = js.undefined
    
    var exactTicks: js.UndefOr[Boolean] = js.undefined
    
    var fontNumbers: js.UndefOr[String] = js.undefined
    
    var fontNumbersSize: js.UndefOr[Double] = js.undefined
    
    var fontNumbersStyle: js.UndefOr[FontStyle] = js.undefined
    
    var fontNumbersWeight: js.UndefOr[FontWeight] = js.undefined
    
    var fontTitle: js.UndefOr[String] = js.undefined
    
    var fontTitleSize: js.UndefOr[Double] = js.undefined
    
    var fontTitleStyle: js.UndefOr[FontStyle] = js.undefined
    
    var fontTitleWeight: js.UndefOr[FontWeight] = js.undefined
    
    var fontUnits: js.UndefOr[String] = js.undefined
    
    var fontUnitsSize: js.UndefOr[Double] = js.undefined
    
    var fontUnitsStyle: js.UndefOr[FontStyle] = js.undefined
    
    var fontUnitsWeight: js.UndefOr[FontWeight] = js.undefined
    
    var fontValue: js.UndefOr[String] = js.undefined
    
    var fontValueSize: js.UndefOr[Double] = js.undefined
    
    var fontValueStyle: js.UndefOr[FontStyle] = js.undefined
    
    var fontValueWeight: js.UndefOr[FontWeight] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var highlights: js.UndefOr[js.Array[Highlight]] = js.undefined
    
    var highlightsWidth: js.UndefOr[Double] = js.undefined
    
    var listeners: js.UndefOr[EventListeners] = js.undefined
    
    var majorTicks: js.UndefOr[MajorTicks] = js.undefined
    
    var majorTicksDec: js.UndefOr[Double] = js.undefined
    
    var majorTicksInt: js.UndefOr[Double] = js.undefined
    
    var maxValue: js.UndefOr[Double] = js.undefined
    
    var minValue: js.UndefOr[Double] = js.undefined
    
    var minorTicks: js.UndefOr[Double] = js.undefined
    
    var needle: js.UndefOr[Boolean] = js.undefined
    
    var needleEnd: js.UndefOr[Double] = js.undefined
    
    var needleShadow: js.UndefOr[Boolean] = js.undefined
    
    var needleStart: js.UndefOr[Double] = js.undefined
    
    var needleType: js.UndefOr[String] = js.undefined
    
    var needleWidth: js.UndefOr[Double] = js.undefined
    
    var numbersMargin: js.UndefOr[Double] = js.undefined
    
    var renderTo: RenderTarget
    
    var strokeTicks: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String | Boolean] = js.undefined
    
    var units: js.UndefOr[String | Boolean] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
    
    var valueBox: js.UndefOr[Boolean] = js.undefined
    
    var valueBoxBorderRadius: js.UndefOr[Double] = js.undefined
    
    var valueBoxStroke: js.UndefOr[Double] = js.undefined
    
    var valueBoxWidth: js.UndefOr[Double] = js.undefined
    
    var valueDec: js.UndefOr[Double] = js.undefined
    
    var valueInt: js.UndefOr[Double] = js.undefined
    
    var valueText: js.UndefOr[String] = js.undefined
    
    var valueTextShadow: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object GenericOptions {
    
    @scala.inline
    def apply(renderTo: RenderTarget): GenericOptions = {
      val __obj = js.Dynamic.literal(renderTo = renderTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericOptions]
    }
    
    @scala.inline
    implicit class GenericOptionsMutableBuilder[Self <: GenericOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimateOnInit(value: Boolean): Self = StObject.set(x, "animateOnInit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateOnInitUndefined: Self = StObject.set(x, "animateOnInit", js.undefined)
      
      @scala.inline
      def setAnimatedValue(value: Boolean): Self = StObject.set(x, "animatedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedValueUndefined: Self = StObject.set(x, "animatedValue", js.undefined)
      
      @scala.inline
      def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setAnimationRule(value: String | AnimationRule): Self = StObject.set(x, "animationRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationRuleFunction1(value: /* percent */ Double => Double): Self = StObject.set(x, "animationRule", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAnimationRuleUndefined: Self = StObject.set(x, "animationRule", js.undefined)
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setBarProgress(value: Boolean): Self = StObject.set(x, "barProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarProgressUndefined: Self = StObject.set(x, "barProgress", js.undefined)
      
      @scala.inline
      def setBarShadow(value: Double): Self = StObject.set(x, "barShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarShadowUndefined: Self = StObject.set(x, "barShadow", js.undefined)
      
      @scala.inline
      def setBarStrokeWidth(value: Double): Self = StObject.set(x, "barStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarStrokeWidthUndefined: Self = StObject.set(x, "barStrokeWidth", js.undefined)
      
      @scala.inline
      def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
      
      @scala.inline
      def setBorderInnerWidth(value: Double): Self = StObject.set(x, "borderInnerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderInnerWidthUndefined: Self = StObject.set(x, "borderInnerWidth", js.undefined)
      
      @scala.inline
      def setBorderMiddleWidth(value: Double): Self = StObject.set(x, "borderMiddleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderMiddleWidthUndefined: Self = StObject.set(x, "borderMiddleWidth", js.undefined)
      
      @scala.inline
      def setBorderOuterWidth(value: Double): Self = StObject.set(x, "borderOuterWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderOuterWidthUndefined: Self = StObject.set(x, "borderOuterWidth", js.undefined)
      
      @scala.inline
      def setBorderShadowWidth(value: Double): Self = StObject.set(x, "borderShadowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderShadowWidthUndefined: Self = StObject.set(x, "borderShadowWidth", js.undefined)
      
      @scala.inline
      def setBorders(value: Boolean): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
      
      @scala.inline
      def setColorBar(value: String): Self = StObject.set(x, "colorBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBarProgress(value: String): Self = StObject.set(x, "colorBarProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBarProgressUndefined: Self = StObject.set(x, "colorBarProgress", js.undefined)
      
      @scala.inline
      def setColorBarShadow(value: String): Self = StObject.set(x, "colorBarShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBarShadowUndefined: Self = StObject.set(x, "colorBarShadow", js.undefined)
      
      @scala.inline
      def setColorBarStroke(value: String): Self = StObject.set(x, "colorBarStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBarStrokeUndefined: Self = StObject.set(x, "colorBarStroke", js.undefined)
      
      @scala.inline
      def setColorBarUndefined: Self = StObject.set(x, "colorBar", js.undefined)
      
      @scala.inline
      def setColorBorderInner(value: String): Self = StObject.set(x, "colorBorderInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBorderInnerEnd(value: String): Self = StObject.set(x, "colorBorderInnerEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBorderInnerEndUndefined: Self = StObject.set(x, "colorBorderInnerEnd", js.undefined)
      
      @scala.inline
      def setColorBorderInnerUndefined: Self = StObject.set(x, "colorBorderInner", js.undefined)
      
      @scala.inline
      def setColorBorderMiddle(value: String): Self = StObject.set(x, "colorBorderMiddle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBorderMiddleEnd(value: String): Self = StObject.set(x, "colorBorderMiddleEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBorderMiddleEndUndefined: Self = StObject.set(x, "colorBorderMiddleEnd", js.undefined)
      
      @scala.inline
      def setColorBorderMiddleUndefined: Self = StObject.set(x, "colorBorderMiddle", js.undefined)
      
      @scala.inline
      def setColorBorderOuter(value: String): Self = StObject.set(x, "colorBorderOuter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBorderOuterEnd(value: String): Self = StObject.set(x, "colorBorderOuterEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBorderOuterEndUndefined: Self = StObject.set(x, "colorBorderOuterEnd", js.undefined)
      
      @scala.inline
      def setColorBorderOuterUndefined: Self = StObject.set(x, "colorBorderOuter", js.undefined)
      
      @scala.inline
      def setColorBorderShadow(value: String): Self = StObject.set(x, "colorBorderShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBorderShadowUndefined: Self = StObject.set(x, "colorBorderShadow", js.undefined)
      
      @scala.inline
      def setColorMajorTicks(value: String): Self = StObject.set(x, "colorMajorTicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMajorTicksUndefined: Self = StObject.set(x, "colorMajorTicks", js.undefined)
      
      @scala.inline
      def setColorMinorTicks(value: String): Self = StObject.set(x, "colorMinorTicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMinorTicksUndefined: Self = StObject.set(x, "colorMinorTicks", js.undefined)
      
      @scala.inline
      def setColorNeedle(value: String): Self = StObject.set(x, "colorNeedle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNeedleEnd(value: String): Self = StObject.set(x, "colorNeedleEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNeedleEndUndefined: Self = StObject.set(x, "colorNeedleEnd", js.undefined)
      
      @scala.inline
      def setColorNeedleShadowDown(value: String): Self = StObject.set(x, "colorNeedleShadowDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNeedleShadowDownUndefined: Self = StObject.set(x, "colorNeedleShadowDown", js.undefined)
      
      @scala.inline
      def setColorNeedleShadowUp(value: String): Self = StObject.set(x, "colorNeedleShadowUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNeedleShadowUpUndefined: Self = StObject.set(x, "colorNeedleShadowUp", js.undefined)
      
      @scala.inline
      def setColorNeedleUndefined: Self = StObject.set(x, "colorNeedle", js.undefined)
      
      @scala.inline
      def setColorNumbers(value: String): Self = StObject.set(x, "colorNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNumbersUndefined: Self = StObject.set(x, "colorNumbers", js.undefined)
      
      @scala.inline
      def setColorPlate(value: String): Self = StObject.set(x, "colorPlate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPlateEnd(value: String): Self = StObject.set(x, "colorPlateEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPlateEndUndefined: Self = StObject.set(x, "colorPlateEnd", js.undefined)
      
      @scala.inline
      def setColorPlateUndefined: Self = StObject.set(x, "colorPlate", js.undefined)
      
      @scala.inline
      def setColorTitle(value: String): Self = StObject.set(x, "colorTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorTitleUndefined: Self = StObject.set(x, "colorTitle", js.undefined)
      
      @scala.inline
      def setColorUnits(value: String): Self = StObject.set(x, "colorUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUnitsUndefined: Self = StObject.set(x, "colorUnits", js.undefined)
      
      @scala.inline
      def setColorValueBoxBackground(value: String): Self = StObject.set(x, "colorValueBoxBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorValueBoxBackgroundUndefined: Self = StObject.set(x, "colorValueBoxBackground", js.undefined)
      
      @scala.inline
      def setColorValueBoxRect(value: String): Self = StObject.set(x, "colorValueBoxRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorValueBoxRectEnd(value: String): Self = StObject.set(x, "colorValueBoxRectEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorValueBoxRectEndUndefined: Self = StObject.set(x, "colorValueBoxRectEnd", js.undefined)
      
      @scala.inline
      def setColorValueBoxRectUndefined: Self = StObject.set(x, "colorValueBoxRect", js.undefined)
      
      @scala.inline
      def setColorValueBoxShadow(value: String): Self = StObject.set(x, "colorValueBoxShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorValueBoxShadowUndefined: Self = StObject.set(x, "colorValueBoxShadow", js.undefined)
      
      @scala.inline
      def setColorValueText(value: String): Self = StObject.set(x, "colorValueText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorValueTextShadow(value: String): Self = StObject.set(x, "colorValueTextShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorValueTextShadowUndefined: Self = StObject.set(x, "colorValueTextShadow", js.undefined)
      
      @scala.inline
      def setColorValueTextUndefined: Self = StObject.set(x, "colorValueText", js.undefined)
      
      @scala.inline
      def setExactTicks(value: Boolean): Self = StObject.set(x, "exactTicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactTicksUndefined: Self = StObject.set(x, "exactTicks", js.undefined)
      
      @scala.inline
      def setFontNumbers(value: String): Self = StObject.set(x, "fontNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontNumbersSize(value: Double): Self = StObject.set(x, "fontNumbersSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontNumbersSizeUndefined: Self = StObject.set(x, "fontNumbersSize", js.undefined)
      
      @scala.inline
      def setFontNumbersStyle(value: FontStyle): Self = StObject.set(x, "fontNumbersStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontNumbersStyleUndefined: Self = StObject.set(x, "fontNumbersStyle", js.undefined)
      
      @scala.inline
      def setFontNumbersUndefined: Self = StObject.set(x, "fontNumbers", js.undefined)
      
      @scala.inline
      def setFontNumbersWeight(value: FontWeight): Self = StObject.set(x, "fontNumbersWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontNumbersWeightUndefined: Self = StObject.set(x, "fontNumbersWeight", js.undefined)
      
      @scala.inline
      def setFontTitle(value: String): Self = StObject.set(x, "fontTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontTitleSize(value: Double): Self = StObject.set(x, "fontTitleSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontTitleSizeUndefined: Self = StObject.set(x, "fontTitleSize", js.undefined)
      
      @scala.inline
      def setFontTitleStyle(value: FontStyle): Self = StObject.set(x, "fontTitleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontTitleStyleUndefined: Self = StObject.set(x, "fontTitleStyle", js.undefined)
      
      @scala.inline
      def setFontTitleUndefined: Self = StObject.set(x, "fontTitle", js.undefined)
      
      @scala.inline
      def setFontTitleWeight(value: FontWeight): Self = StObject.set(x, "fontTitleWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontTitleWeightUndefined: Self = StObject.set(x, "fontTitleWeight", js.undefined)
      
      @scala.inline
      def setFontUnits(value: String): Self = StObject.set(x, "fontUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUnitsSize(value: Double): Self = StObject.set(x, "fontUnitsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUnitsSizeUndefined: Self = StObject.set(x, "fontUnitsSize", js.undefined)
      
      @scala.inline
      def setFontUnitsStyle(value: FontStyle): Self = StObject.set(x, "fontUnitsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUnitsStyleUndefined: Self = StObject.set(x, "fontUnitsStyle", js.undefined)
      
      @scala.inline
      def setFontUnitsUndefined: Self = StObject.set(x, "fontUnits", js.undefined)
      
      @scala.inline
      def setFontUnitsWeight(value: FontWeight): Self = StObject.set(x, "fontUnitsWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUnitsWeightUndefined: Self = StObject.set(x, "fontUnitsWeight", js.undefined)
      
      @scala.inline
      def setFontValue(value: String): Self = StObject.set(x, "fontValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontValueSize(value: Double): Self = StObject.set(x, "fontValueSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontValueSizeUndefined: Self = StObject.set(x, "fontValueSize", js.undefined)
      
      @scala.inline
      def setFontValueStyle(value: FontStyle): Self = StObject.set(x, "fontValueStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontValueStyleUndefined: Self = StObject.set(x, "fontValueStyle", js.undefined)
      
      @scala.inline
      def setFontValueUndefined: Self = StObject.set(x, "fontValue", js.undefined)
      
      @scala.inline
      def setFontValueWeight(value: FontWeight): Self = StObject.set(x, "fontValueWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontValueWeightUndefined: Self = StObject.set(x, "fontValueWeight", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHighlights(value: js.Array[Highlight]): Self = StObject.set(x, "highlights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightsUndefined: Self = StObject.set(x, "highlights", js.undefined)
      
      @scala.inline
      def setHighlightsVarargs(value: Highlight*): Self = StObject.set(x, "highlights", js.Array(value :_*))
      
      @scala.inline
      def setHighlightsWidth(value: Double): Self = StObject.set(x, "highlightsWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightsWidthUndefined: Self = StObject.set(x, "highlightsWidth", js.undefined)
      
      @scala.inline
      def setListeners(value: EventListeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      @scala.inline
      def setMajorTicks(value: MajorTicks): Self = StObject.set(x, "majorTicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorTicksDec(value: Double): Self = StObject.set(x, "majorTicksDec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorTicksDecUndefined: Self = StObject.set(x, "majorTicksDec", js.undefined)
      
      @scala.inline
      def setMajorTicksInt(value: Double): Self = StObject.set(x, "majorTicksInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorTicksIntUndefined: Self = StObject.set(x, "majorTicksInt", js.undefined)
      
      @scala.inline
      def setMajorTicksUndefined: Self = StObject.set(x, "majorTicks", js.undefined)
      
      @scala.inline
      def setMajorTicksVarargs(value: (Double | String)*): Self = StObject.set(x, "majorTicks", js.Array(value :_*))
      
      @scala.inline
      def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      @scala.inline
      def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      @scala.inline
      def setMinorTicks(value: Double): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorTicksUndefined: Self = StObject.set(x, "minorTicks", js.undefined)
      
      @scala.inline
      def setNeedle(value: Boolean): Self = StObject.set(x, "needle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedleEnd(value: Double): Self = StObject.set(x, "needleEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedleEndUndefined: Self = StObject.set(x, "needleEnd", js.undefined)
      
      @scala.inline
      def setNeedleShadow(value: Boolean): Self = StObject.set(x, "needleShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedleShadowUndefined: Self = StObject.set(x, "needleShadow", js.undefined)
      
      @scala.inline
      def setNeedleStart(value: Double): Self = StObject.set(x, "needleStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedleStartUndefined: Self = StObject.set(x, "needleStart", js.undefined)
      
      @scala.inline
      def setNeedleType(value: String): Self = StObject.set(x, "needleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedleTypeUndefined: Self = StObject.set(x, "needleType", js.undefined)
      
      @scala.inline
      def setNeedleUndefined: Self = StObject.set(x, "needle", js.undefined)
      
      @scala.inline
      def setNeedleWidth(value: Double): Self = StObject.set(x, "needleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedleWidthUndefined: Self = StObject.set(x, "needleWidth", js.undefined)
      
      @scala.inline
      def setNumbersMargin(value: Double): Self = StObject.set(x, "numbersMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumbersMarginUndefined: Self = StObject.set(x, "numbersMargin", js.undefined)
      
      @scala.inline
      def setRenderTo(value: RenderTarget): Self = StObject.set(x, "renderTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeTicks(value: Boolean): Self = StObject.set(x, "strokeTicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeTicksUndefined: Self = StObject.set(x, "strokeTicks", js.undefined)
      
      @scala.inline
      def setTitle(value: String | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUnits(value: String | Boolean): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueBox(value: Boolean): Self = StObject.set(x, "valueBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueBoxBorderRadius(value: Double): Self = StObject.set(x, "valueBoxBorderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueBoxBorderRadiusUndefined: Self = StObject.set(x, "valueBoxBorderRadius", js.undefined)
      
      @scala.inline
      def setValueBoxStroke(value: Double): Self = StObject.set(x, "valueBoxStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueBoxStrokeUndefined: Self = StObject.set(x, "valueBoxStroke", js.undefined)
      
      @scala.inline
      def setValueBoxUndefined: Self = StObject.set(x, "valueBox", js.undefined)
      
      @scala.inline
      def setValueBoxWidth(value: Double): Self = StObject.set(x, "valueBoxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueBoxWidthUndefined: Self = StObject.set(x, "valueBoxWidth", js.undefined)
      
      @scala.inline
      def setValueDec(value: Double): Self = StObject.set(x, "valueDec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueDecUndefined: Self = StObject.set(x, "valueDec", js.undefined)
      
      @scala.inline
      def setValueInt(value: Double): Self = StObject.set(x, "valueInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueIntUndefined: Self = StObject.set(x, "valueInt", js.undefined)
      
      @scala.inline
      def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueTextShadow(value: Boolean): Self = StObject.set(x, "valueTextShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueTextShadowUndefined: Self = StObject.set(x, "valueTextShadow", js.undefined)
      
      @scala.inline
      def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Highlight extends StObject {
    
    var color: String
    
    var from: Double
    
    var to: Double
  }
  object Highlight {
    
    @scala.inline
    def apply(color: String, from: Double, to: Double): Highlight = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Highlight]
    }
    
    @scala.inline
    implicit class HighlightMutableBuilder[Self <: Highlight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LinearGauge
    extends StObject
       with BaseGauge {
    
    @JSName("options")
    var options_LinearGauge: LinearGaugeOptions = js.native
    
    @JSName("type")
    var type_LinearGauge: LinearGauge = js.native
  }
  
  trait LinearGaugeOptions
    extends StObject
       with GenericOptions {
    
    var barBeginCircle: js.UndefOr[Double] = js.undefined
    
    var barLength: js.UndefOr[Double] = js.undefined
    
    var borderRadius: js.UndefOr[Double] = js.undefined
    
    var colorBarEnd: js.UndefOr[String] = js.undefined
    
    var colorBarProgressEnd: js.UndefOr[String] = js.undefined
    
    var needleSide: js.UndefOr[String] = js.undefined
    
    var numberSide: js.UndefOr[String] = js.undefined
    
    var tickSide: js.UndefOr[String] = js.undefined
    
    var ticksPadding: js.UndefOr[Double] = js.undefined
    
    var ticksWidth: js.UndefOr[Double] = js.undefined
    
    var ticksWidthMinor: js.UndefOr[Double] = js.undefined
  }
  object LinearGaugeOptions {
    
    @scala.inline
    def apply(renderTo: RenderTarget): LinearGaugeOptions = {
      val __obj = js.Dynamic.literal(renderTo = renderTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinearGaugeOptions]
    }
    
    @scala.inline
    implicit class LinearGaugeOptionsMutableBuilder[Self <: LinearGaugeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBarBeginCircle(value: Double): Self = StObject.set(x, "barBeginCircle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarBeginCircleUndefined: Self = StObject.set(x, "barBeginCircle", js.undefined)
      
      @scala.inline
      def setBarLength(value: Double): Self = StObject.set(x, "barLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarLengthUndefined: Self = StObject.set(x, "barLength", js.undefined)
      
      @scala.inline
      def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      @scala.inline
      def setColorBarEnd(value: String): Self = StObject.set(x, "colorBarEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBarEndUndefined: Self = StObject.set(x, "colorBarEnd", js.undefined)
      
      @scala.inline
      def setColorBarProgressEnd(value: String): Self = StObject.set(x, "colorBarProgressEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBarProgressEndUndefined: Self = StObject.set(x, "colorBarProgressEnd", js.undefined)
      
      @scala.inline
      def setNeedleSide(value: String): Self = StObject.set(x, "needleSide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedleSideUndefined: Self = StObject.set(x, "needleSide", js.undefined)
      
      @scala.inline
      def setNumberSide(value: String): Self = StObject.set(x, "numberSide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberSideUndefined: Self = StObject.set(x, "numberSide", js.undefined)
      
      @scala.inline
      def setTickSide(value: String): Self = StObject.set(x, "tickSide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickSideUndefined: Self = StObject.set(x, "tickSide", js.undefined)
      
      @scala.inline
      def setTicksPadding(value: Double): Self = StObject.set(x, "ticksPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksPaddingUndefined: Self = StObject.set(x, "ticksPadding", js.undefined)
      
      @scala.inline
      def setTicksWidth(value: Double): Self = StObject.set(x, "ticksWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksWidthMinor(value: Double): Self = StObject.set(x, "ticksWidthMinor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksWidthMinorUndefined: Self = StObject.set(x, "ticksWidthMinor", js.undefined)
      
      @scala.inline
      def setTicksWidthUndefined: Self = StObject.set(x, "ticksWidth", js.undefined)
    }
  }
  
  type MajorTicks = js.Array[Double | String]
  
  @js.native
  trait RadialGauge
    extends StObject
       with BaseGauge {
    
    @JSName("options")
    var options_RadialGauge: RadialGaugeOptions = js.native
    
    @JSName("type")
    var type_RadialGauge: RadialGauge = js.native
  }
  
  trait RadialGaugeOptions
    extends StObject
       with GenericOptions {
    
    var animationTarget: js.UndefOr[String] = js.undefined
    
    var colorNeedleCircleInner: js.UndefOr[String] = js.undefined
    
    var colorNeedleCircleInnerEnd: js.UndefOr[String] = js.undefined
    
    var colorNeedleCircleOuter: js.UndefOr[String] = js.undefined
    
    var colorNeedleCircleOuterEnd: js.UndefOr[String] = js.undefined
    
    var needleCircleInner: js.UndefOr[Boolean] = js.undefined
    
    var needleCircleOuter: js.UndefOr[Boolean] = js.undefined
    
    var needleCircleSize: js.UndefOr[Double] = js.undefined
    
    var startAngle: js.UndefOr[Double] = js.undefined
    
    var ticksAngle: js.UndefOr[Double] = js.undefined
    
    var useMinPath: js.UndefOr[Boolean] = js.undefined
  }
  object RadialGaugeOptions {
    
    @scala.inline
    def apply(renderTo: RenderTarget): RadialGaugeOptions = {
      val __obj = js.Dynamic.literal(renderTo = renderTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadialGaugeOptions]
    }
    
    @scala.inline
    implicit class RadialGaugeOptionsMutableBuilder[Self <: RadialGaugeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationTarget(value: String): Self = StObject.set(x, "animationTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationTargetUndefined: Self = StObject.set(x, "animationTarget", js.undefined)
      
      @scala.inline
      def setColorNeedleCircleInner(value: String): Self = StObject.set(x, "colorNeedleCircleInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNeedleCircleInnerEnd(value: String): Self = StObject.set(x, "colorNeedleCircleInnerEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNeedleCircleInnerEndUndefined: Self = StObject.set(x, "colorNeedleCircleInnerEnd", js.undefined)
      
      @scala.inline
      def setColorNeedleCircleInnerUndefined: Self = StObject.set(x, "colorNeedleCircleInner", js.undefined)
      
      @scala.inline
      def setColorNeedleCircleOuter(value: String): Self = StObject.set(x, "colorNeedleCircleOuter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNeedleCircleOuterEnd(value: String): Self = StObject.set(x, "colorNeedleCircleOuterEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNeedleCircleOuterEndUndefined: Self = StObject.set(x, "colorNeedleCircleOuterEnd", js.undefined)
      
      @scala.inline
      def setColorNeedleCircleOuterUndefined: Self = StObject.set(x, "colorNeedleCircleOuter", js.undefined)
      
      @scala.inline
      def setNeedleCircleInner(value: Boolean): Self = StObject.set(x, "needleCircleInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedleCircleInnerUndefined: Self = StObject.set(x, "needleCircleInner", js.undefined)
      
      @scala.inline
      def setNeedleCircleOuter(value: Boolean): Self = StObject.set(x, "needleCircleOuter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedleCircleOuterUndefined: Self = StObject.set(x, "needleCircleOuter", js.undefined)
      
      @scala.inline
      def setNeedleCircleSize(value: Double): Self = StObject.set(x, "needleCircleSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedleCircleSizeUndefined: Self = StObject.set(x, "needleCircleSize", js.undefined)
      
      @scala.inline
      def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      @scala.inline
      def setTicksAngle(value: Double): Self = StObject.set(x, "ticksAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksAngleUndefined: Self = StObject.set(x, "ticksAngle", js.undefined)
      
      @scala.inline
      def setUseMinPath(value: Boolean): Self = StObject.set(x, "useMinPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseMinPathUndefined: Self = StObject.set(x, "useMinPath", js.undefined)
    }
  }
  
  type RenderTarget = String | HTMLElement
  
  trait SmartCanvas extends StObject {
    
    def commit(): SmartCanvas
    
    var context: CanvasRenderingContext2D
    
    var contextClone: CanvasRenderingContext2D
    
    def destroy(): js.Any
    
    var drawHeight: Double
    
    var drawWidth: Double
    
    var drawX: Double
    
    var drawY: Double
    
    var element: HTMLCanvasElement
    
    var elementClone: HTMLCanvasElement
    
    var height: Double
    
    def init(): js.Any
    
    var minSide: Double
    
    def onRedraw(): js.Any
    
    var pixelRatio: Double
    
    def redraw(): SmartCanvas
    
    var width: Double
  }
  object SmartCanvas {
    
    @scala.inline
    def apply(
      commit: () => SmartCanvas,
      context: CanvasRenderingContext2D,
      contextClone: CanvasRenderingContext2D,
      destroy: () => js.Any,
      drawHeight: Double,
      drawWidth: Double,
      drawX: Double,
      drawY: Double,
      element: HTMLCanvasElement,
      elementClone: HTMLCanvasElement,
      height: Double,
      init: () => js.Any,
      minSide: Double,
      onRedraw: () => js.Any,
      pixelRatio: Double,
      redraw: () => SmartCanvas,
      width: Double
    ): SmartCanvas = {
      val __obj = js.Dynamic.literal(commit = js.Any.fromFunction0(commit), context = context.asInstanceOf[js.Any], contextClone = contextClone.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), drawHeight = drawHeight.asInstanceOf[js.Any], drawWidth = drawWidth.asInstanceOf[js.Any], drawX = drawX.asInstanceOf[js.Any], drawY = drawY.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], elementClone = elementClone.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), minSide = minSide.asInstanceOf[js.Any], onRedraw = js.Any.fromFunction0(onRedraw), pixelRatio = pixelRatio.asInstanceOf[js.Any], redraw = js.Any.fromFunction0(redraw), width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmartCanvas]
    }
    
    @scala.inline
    implicit class SmartCanvasMutableBuilder[Self <: SmartCanvas] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommit(value: () => SmartCanvas): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextClone(value: CanvasRenderingContext2D): Self = StObject.set(x, "contextClone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroy(value: () => js.Any): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDrawHeight(value: Double): Self = StObject.set(x, "drawHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawWidth(value: Double): Self = StObject.set(x, "drawWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawX(value: Double): Self = StObject.set(x, "drawX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawY(value: Double): Self = StObject.set(x, "drawY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElement(value: HTMLCanvasElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementClone(value: HTMLCanvasElement): Self = StObject.set(x, "elementClone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInit(value: () => js.Any): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMinSide(value: Double): Self = StObject.set(x, "minSide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRedraw(value: () => js.Any): Self = StObject.set(x, "onRedraw", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedraw(value: () => SmartCanvas): Self = StObject.set(x, "redraw", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait rules extends StObject {
    
    def bounce(percent: Double): Double
    @JSName("bounce")
    var bounce_Original: AnimationRule
    
    def cycle(percent: Double): Double
    @JSName("cycle")
    var cycle_Original: AnimationRule
    
    def debounce(percent: Double): Double
    @JSName("debounce")
    var debounce_Original: AnimationRule
    
    def decycle(percent: Double): Double
    @JSName("decycle")
    var decycle_Original: AnimationRule
    
    def delastic(percent: Double): Double
    @JSName("delastic")
    var delastic_Original: AnimationRule
    
    def dequad(percent: Double): Double
    @JSName("dequad")
    var dequad_Original: AnimationRule
    
    def dequint(percent: Double): Double
    @JSName("dequint")
    var dequint_Original: AnimationRule
    
    def elastic(percent: Double): Double
    @JSName("elastic")
    var elastic_Original: AnimationRule
    
    def linear(percent: Double): Double
    @JSName("linear")
    var linear_Original: AnimationRule
    
    def quad(percent: Double): Double
    @JSName("quad")
    var quad_Original: AnimationRule
    
    def quint(percent: Double): Double
    @JSName("quint")
    var quint_Original: AnimationRule
  }
  object rules {
    
    @scala.inline
    def apply(
      bounce: /* percent */ Double => Double,
      cycle: /* percent */ Double => Double,
      debounce: /* percent */ Double => Double,
      decycle: /* percent */ Double => Double,
      delastic: /* percent */ Double => Double,
      dequad: /* percent */ Double => Double,
      dequint: /* percent */ Double => Double,
      elastic: /* percent */ Double => Double,
      linear: /* percent */ Double => Double,
      quad: /* percent */ Double => Double,
      quint: /* percent */ Double => Double
    ): rules = {
      val __obj = js.Dynamic.literal(bounce = js.Any.fromFunction1(bounce), cycle = js.Any.fromFunction1(cycle), debounce = js.Any.fromFunction1(debounce), decycle = js.Any.fromFunction1(decycle), delastic = js.Any.fromFunction1(delastic), dequad = js.Any.fromFunction1(dequad), dequint = js.Any.fromFunction1(dequint), elastic = js.Any.fromFunction1(elastic), linear = js.Any.fromFunction1(linear), quad = js.Any.fromFunction1(quad), quint = js.Any.fromFunction1(quint))
      __obj.asInstanceOf[rules]
    }
    
    @scala.inline
    implicit class rulesMutableBuilder[Self <: rules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounce(value: /* percent */ Double => Double): Self = StObject.set(x, "bounce", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCycle(value: /* percent */ Double => Double): Self = StObject.set(x, "cycle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDebounce(value: /* percent */ Double => Double): Self = StObject.set(x, "debounce", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDecycle(value: /* percent */ Double => Double): Self = StObject.set(x, "decycle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDelastic(value: /* percent */ Double => Double): Self = StObject.set(x, "delastic", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDequad(value: /* percent */ Double => Double): Self = StObject.set(x, "dequad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDequint(value: /* percent */ Double => Double): Self = StObject.set(x, "dequint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElastic(value: /* percent */ Double => Double): Self = StObject.set(x, "elastic", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLinear(value: /* percent */ Double => Double): Self = StObject.set(x, "linear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuad(value: /* percent */ Double => Double): Self = StObject.set(x, "quad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuint(value: /* percent */ Double => Double): Self = StObject.set(x, "quint", js.Any.fromFunction1(value))
    }
  }
}
