package typings.chartJs

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.anon.A
import typings.chartJs.anon.Angle
import typings.chartJs.anon.Bottom
import typings.chartJs.anon.Cacheable
import typings.chartJs.anon.Canvas
import typings.chartJs.anon.Ctx
import typings.chartJs.anon.Family
import typings.chartJs.anon.Height
import typings.chartJs.anon.Left
import typings.chartJs.anon.Next
import typings.chartJs.anon.PartialFontSpec
import typings.chartJs.anon.PartialTRBL
import typings.chartJs.anon.PartialTRBLCorners
import typings.chartJs.anon.SplinePointskipbooleanund
import typings.chartJs.anon.X
import typings.chartJs.basicMod.AnyObject
import typings.chartJs.chartJsStrings.height
import typings.chartJs.chartJsStrings.ltr
import typings.chartJs.chartJsStrings.rtl
import typings.chartJs.chartJsStrings.width
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.geometricMod.ChartArea
import typings.chartJs.geometricMod.RoundedRect
import typings.chartJs.geometricMod.TRBL
import typings.chartJs.geometricMod.TRBLCorners
import typings.chartJs.helpersCanvasMod.DrawPointOptions
import typings.chartJs.helpersCanvasMod.RenderTextOpts
import typings.chartJs.helpersCollectionMod.ArrayListener
import typings.chartJs.helpersColorMod.ColorModel
import typings.chartJs.helpersCoreMod.MergeOptions
import typings.chartJs.helpersCurveMod.MonotoneSplinePoint
import typings.chartJs.helpersCurveMod.SplinePoint
import typings.chartJs.helpersEasingMod.EasingFunctionSignature
import typings.chartJs.helpersOptionsMod.CanvasFontSpec
import typings.chartJs.helpersRtlMod.RTLAdapter
import typings.chartJs.mod.ChartEvent
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.Intl.NumberFormatOptions
import typings.std.MouseEvent
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("chart.js/types/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addRoundedRectPath(ctx: CanvasRenderingContext2D, rect: RoundedRect): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoundedRectPath")(ctx.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def almostEquals(x: Double, y: Double, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("almostEquals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def almostWhole(x: Double, epsilon: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("almostWhole")(x.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def callback[T /* <: js.ThisFunction1[/* this */ TA, /* repeated */ Any, R] */, TA, R](fn: T, args: js.Array[Any]): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("callback")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  inline def callback[T /* <: js.ThisFunction1[/* this */ TA, /* repeated */ Any, R] */, TA, R](fn: T, args: js.Array[Any], thisArg: TA): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("callback")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  inline def callback[T /* <: js.ThisFunction1[/* this */ TA, /* repeated */ Any, R] */, TA, R](fn: Unit, args: js.Array[Any]): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("callback")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  inline def callback[T /* <: js.ThisFunction1[/* this */ TA, /* repeated */ Any, R] */, TA, R](fn: Unit, args: js.Array[Any], thisArg: TA): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("callback")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  
  inline def clearCanvas(canvas: HTMLCanvasElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCanvas")(canvas.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearCanvas(canvas: HTMLCanvasElement, ctx: CanvasRenderingContext2D): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearCanvas")(canvas.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clipArea(ctx: CanvasRenderingContext2D, area: ChartArea): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clipArea")(ctx.asInstanceOf[js.Any], area.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clone_[T](source: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(source.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def color(value: String): ColorModel = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[ColorModel]
  inline def color(value: js.Tuple3[Double, Double, Double]): ColorModel = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[ColorModel]
  inline def color(value: js.Tuple4[Double, Double, Double, Double]): ColorModel = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[ColorModel]
  inline def color(value: A): ColorModel = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[ColorModel]
  inline def color(value: CanvasGradient): CanvasGradient = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasGradient]
  inline def color(value: CanvasPattern): CanvasPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasPattern]
  
  inline def createContext[P, T](parentContext: P, context: T): (P & T) | T = (^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(parentContext.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[(P & T) | T]
  
  inline def debounce(fn: js.Function0[Unit], delay: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  
  inline def defined(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def distanceBetweenPoints(pt1: X, pt2: X): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceBetweenPoints")(pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def drawPoint(ctx: CanvasRenderingContext2D, options: DrawPointOptions, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPoint")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def drawPointLegend(ctx: CanvasRenderingContext2D, options: DrawPointOptions, x: Double, y: Double, w: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPointLegend")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def each[T, TA](loopable: js.Array[T], fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: js.Array[T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ Double, Unit],
    thisArg: TA
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: js.Array[T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ Double, Unit],
    thisArg: TA,
    reverse: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: js.Array[T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ Double, Unit],
    thisArg: Unit,
    reverse: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: StringDictionary[T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* k */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: StringDictionary[T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* k */ String, Unit],
    thisArg: TA
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: StringDictionary[T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* k */ String, Unit],
    thisArg: TA,
    reverse: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: StringDictionary[T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* k */ String, Unit],
    thisArg: Unit,
    reverse: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Inlined std.Record<chart.js.chart.js.EasingFunction, chart.js.chart.js/types/helpers/helpers.easing.EasingFunctionSignature> */
  object easingEffects {
    
    @JSImport("chart.js/types/helpers", "easingEffects")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInBack")
    @js.native
    def easeInBack: EasingFunctionSignature = js.native
    inline def easeInBack(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInBack")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInBack_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInBack")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInBounce")
    @js.native
    def easeInBounce: EasingFunctionSignature = js.native
    inline def easeInBounce(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInBounce")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInBounce_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInBounce")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInCirc")
    @js.native
    def easeInCirc: EasingFunctionSignature = js.native
    inline def easeInCirc(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInCirc")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInCirc_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInCirc")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInCubic")
    @js.native
    def easeInCubic: EasingFunctionSignature = js.native
    inline def easeInCubic(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInCubic")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInCubic_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInCubic")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInElastic")
    @js.native
    def easeInElastic: EasingFunctionSignature = js.native
    inline def easeInElastic(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInElastic")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInElastic_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInElastic")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInExpo")
    @js.native
    def easeInExpo: EasingFunctionSignature = js.native
    inline def easeInExpo(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInExpo")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInExpo_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInExpo")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInOutBack")
    @js.native
    def easeInOutBack: EasingFunctionSignature = js.native
    inline def easeInOutBack(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutBack")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInOutBack_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutBack")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInOutBounce")
    @js.native
    def easeInOutBounce: EasingFunctionSignature = js.native
    inline def easeInOutBounce(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutBounce")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInOutBounce_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutBounce")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInOutCirc")
    @js.native
    def easeInOutCirc: EasingFunctionSignature = js.native
    inline def easeInOutCirc(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutCirc")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInOutCirc_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutCirc")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInOutCubic")
    @js.native
    def easeInOutCubic: EasingFunctionSignature = js.native
    inline def easeInOutCubic(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutCubic")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInOutCubic_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutCubic")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInOutElastic")
    @js.native
    def easeInOutElastic: EasingFunctionSignature = js.native
    inline def easeInOutElastic(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutElastic")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInOutElastic_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutElastic")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInOutExpo")
    @js.native
    def easeInOutExpo: EasingFunctionSignature = js.native
    inline def easeInOutExpo(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutExpo")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInOutExpo_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutExpo")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInOutQuad")
    @js.native
    def easeInOutQuad: EasingFunctionSignature = js.native
    inline def easeInOutQuad(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutQuad")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInOutQuad_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutQuad")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInOutQuart")
    @js.native
    def easeInOutQuart: EasingFunctionSignature = js.native
    inline def easeInOutQuart(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutQuart")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInOutQuart_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutQuart")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInOutQuint")
    @js.native
    def easeInOutQuint: EasingFunctionSignature = js.native
    inline def easeInOutQuint(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutQuint")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInOutQuint_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutQuint")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInOutSine")
    @js.native
    def easeInOutSine: EasingFunctionSignature = js.native
    inline def easeInOutSine(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutSine")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInOutSine_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutSine")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInQuad")
    @js.native
    def easeInQuad: EasingFunctionSignature = js.native
    inline def easeInQuad(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInQuad")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInQuad_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInQuad")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInQuart")
    @js.native
    def easeInQuart: EasingFunctionSignature = js.native
    inline def easeInQuart(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInQuart")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInQuart_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInQuart")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInQuint")
    @js.native
    def easeInQuint: EasingFunctionSignature = js.native
    inline def easeInQuint(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInQuint")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInQuint_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInQuint")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeInSine")
    @js.native
    def easeInSine: EasingFunctionSignature = js.native
    inline def easeInSine(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInSine")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInSine_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInSine")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeOutBack")
    @js.native
    def easeOutBack: EasingFunctionSignature = js.native
    inline def easeOutBack(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutBack")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeOutBack_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutBack")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeOutBounce")
    @js.native
    def easeOutBounce: EasingFunctionSignature = js.native
    inline def easeOutBounce(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutBounce")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeOutBounce_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutBounce")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeOutCirc")
    @js.native
    def easeOutCirc: EasingFunctionSignature = js.native
    inline def easeOutCirc(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutCirc")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeOutCirc_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutCirc")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeOutCubic")
    @js.native
    def easeOutCubic: EasingFunctionSignature = js.native
    inline def easeOutCubic(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutCubic")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeOutCubic_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutCubic")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeOutElastic")
    @js.native
    def easeOutElastic: EasingFunctionSignature = js.native
    inline def easeOutElastic(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutElastic")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeOutElastic_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutElastic")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeOutExpo")
    @js.native
    def easeOutExpo: EasingFunctionSignature = js.native
    inline def easeOutExpo(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutExpo")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeOutExpo_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutExpo")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeOutQuad")
    @js.native
    def easeOutQuad: EasingFunctionSignature = js.native
    inline def easeOutQuad(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutQuad")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeOutQuad_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutQuad")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeOutQuart")
    @js.native
    def easeOutQuart: EasingFunctionSignature = js.native
    inline def easeOutQuart(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutQuart")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeOutQuart_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutQuart")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeOutQuint")
    @js.native
    def easeOutQuint: EasingFunctionSignature = js.native
    inline def easeOutQuint(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutQuint")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeOutQuint_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutQuint")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.easeOutSine")
    @js.native
    def easeOutSine: EasingFunctionSignature = js.native
    inline def easeOutSine(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutSine")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeOutSine_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutSine")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/types/helpers", "easingEffects.linear")
    @js.native
    def linear: EasingFunctionSignature = js.native
    inline def linear(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("linear")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def linear_=(x: EasingFunctionSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linear")(x.asInstanceOf[js.Any])
  }
  
  inline def finiteOrDefault(value: Any, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("finiteOrDefault")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fontString(pixelSize: Double, fontStyle: String, fontFamily: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fontString")(pixelSize.asInstanceOf[js.Any], fontStyle.asInstanceOf[js.Any], fontFamily.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatNumber(num: Double, locale: String, options: NumberFormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(num.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAngleFromPoint(centrePoint: X, anglePoint: X): Angle = (^.asInstanceOf[js.Dynamic].applyDynamic("getAngleFromPoint")(centrePoint.asInstanceOf[js.Any], anglePoint.asInstanceOf[js.Any])).asInstanceOf[Angle]
  
  inline def getHoverColor(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoverColor")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getHoverColor(value: CanvasGradient): CanvasGradient = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoverColor")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasGradient]
  inline def getHoverColor(value: CanvasPattern): CanvasPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoverColor")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasPattern]
  
  inline def getMaximumSize(node: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any]).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Double, height: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Double, height: Double, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Double, height: Unit, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Unit, height: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Unit, height: Double, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Unit, height: Unit, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  
  inline def getRelativePosition(evt: ChartEvent, chart: Canvas): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(evt.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def getRelativePosition(evt: MouseEvent, chart: Canvas): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(evt.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def getRtlAdapter(rtl: Boolean, rectX: Double, width: Double): RTLAdapter = (^.asInstanceOf[js.Dynamic].applyDynamic("getRtlAdapter")(rtl.asInstanceOf[js.Any], rectX.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[RTLAdapter]
  
  inline def getStyle(el: HTMLElement, property: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(el.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isArray[T](value: Any): /* is std.ArrayLike<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.ArrayLike<T> */ Boolean]
  
  inline def isFinite(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFinite")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isFunction(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNullOrUndef(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndef")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(value: Any): /* is chart.js.chart.js/types/basic.AnyObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is chart.js.chart.js/types/basic.AnyObject */ Boolean]
  
  inline def isPatternOrGradient(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPatternOrGradient")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isPatternOrGradient(value: AnyObject): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPatternOrGradient")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def listenArrayEvents[T](array: js.Array[T], listener: ArrayListener[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listenArrayEvents")(array.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def log10(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def merge[T](target: T, source: js.Array[AnyObject]): AnyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[AnyObject]
  inline def merge[T](target: T, source: js.Array[AnyObject], options: MergeOptions): AnyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnyObject]
  inline def merge[T, S1](target: T, source: S1): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  inline def merge[T, S1](target: T, source: S1, options: MergeOptions): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  inline def merge[T, S1, S2](target: T, source: js.Tuple2[S1, S2]): T & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2]
  inline def merge[T, S1, S2](target: T, source: js.Tuple2[S1, S2], options: MergeOptions): T & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2]
  inline def merge[T, S1, S2, S3](target: T, source: js.Tuple3[S1, S2, S3]): T & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3]
  inline def merge[T, S1, S2, S3](target: T, source: js.Tuple3[S1, S2, S3], options: MergeOptions): T & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3]
  inline def merge[T, S1, S2, S3, S4](target: T, source: js.Tuple4[S1, S2, S3, S4]): T & S1 & S2 & S3 & S4 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3 & S4]
  inline def merge[T, S1, S2, S3, S4](target: T, source: js.Tuple4[S1, S2, S3, S4], options: MergeOptions): T & S1 & S2 & S3 & S4 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3 & S4]
  
  inline def mergeIf[T](target: T, source: js.Array[AnyObject]): AnyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[AnyObject]
  inline def mergeIf[T, S1](target: T, source: S1): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  inline def mergeIf[T, S1, S2](target: T, source: js.Tuple2[S1, S2]): T & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2]
  inline def mergeIf[T, S1, S2, S3](target: T, source: js.Tuple3[S1, S2, S3]): T & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3]
  inline def mergeIf[T, S1, S2, S3, S4](target: T, source: js.Tuple4[S1, S2, S3, S4]): T & S1 & S2 & S3 & S4 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3 & S4]
  
  inline def mergeIf_TS1_Intersection[T, S1](target: T, source: js.Array[S1]): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  
  inline def mergeIf_T_T[T](target: T, source: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def merge_TS1_Intersection[T, S1](target: T, source: js.Array[S1]): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  inline def merge_TS1_Intersection[T, S1](target: T, source: js.Array[S1], options: MergeOptions): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  
  inline def merge_T_T[T](target: T, source: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def merge_T_T[T](target: T, source: js.Array[Any], options: MergeOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def niceNum(range: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("niceNum")(range.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def overrideTextDirection(ctx: CanvasRenderingContext2D, direction: ltr | rtl): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideTextDirection")(ctx.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readUsedSize(element: HTMLElement, property: width | height): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("readUsedSize")(element.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def renderText(ctx: CanvasRenderingContext2D, text: String, x: Double, y: Double, font: CanvasFontSpec): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderText")(ctx.asInstanceOf[js.Any], text.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderText(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: Double,
    font: CanvasFontSpec,
    opts: RenderTextOpts
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderText")(ctx.asInstanceOf[js.Any], text.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], font.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderText(ctx: CanvasRenderingContext2D, text: js.Array[String], x: Double, y: Double, font: CanvasFontSpec): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderText")(ctx.asInstanceOf[js.Any], text.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderText(
    ctx: CanvasRenderingContext2D,
    text: js.Array[String],
    x: Double,
    y: Double,
    font: CanvasFontSpec,
    opts: RenderTextOpts
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderText")(ctx.asInstanceOf[js.Any], text.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], font.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def requestAnimFrame(cb: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimFrame")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resolve[T, C](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: T, context: C): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: T, context: C, index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: T, context: C, index: Double, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: T, context: C, index: Unit, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: T, context: Unit, index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: T, context: Unit, index: Double, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: T, context: Unit, index: Unit, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Array[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Array[T], context: C): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Array[T], context: C, index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Array[T], context: C, index: Double, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Array[T], context: C, index: Unit, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Array[T], context: Unit, index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Array[T], context: Unit, index: Double, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Array[T], context: Unit, index: Unit, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Function1[/* c */ C, T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Function1[/* c */ C, T], context: C): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Function1[/* c */ C, T], context: C, index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Function1[/* c */ C, T], context: C, index: Double, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Function1[/* c */ C, T], context: C, index: Unit, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Function1[/* c */ C, T], context: Unit, index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Function1[/* c */ C, T], context: Unit, index: Double, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Function1[/* c */ C, T], context: Unit, index: Unit, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: Unit, context: C): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: Unit, context: C, index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: Unit, context: C, index: Double, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: Unit, context: C, index: Unit, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: Unit, context: Unit, index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: Unit, context: Unit, index: Double, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: Unit, context: Unit, index: Unit, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def resolveObjectKey(obj: AnyObject, key: String): AnyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveObjectKey")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[AnyObject]
  
  inline def restoreTextDirection(ctx: CanvasRenderingContext2D): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreTextDirection")(ctx.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def restoreTextDirection(ctx: CanvasRenderingContext2D, original: js.Tuple2[String, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("restoreTextDirection")(ctx.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def retinaScale(chart: Ctx, forceRatio: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaScale")(chart.asInstanceOf[js.Any], forceRatio.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retinaScale(chart: Ctx, forceRatio: Double, forceStyle: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaScale")(chart.asInstanceOf[js.Any], forceRatio.asInstanceOf[js.Any], forceStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setsEqual(a: Set[Any], b: Set[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sign(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def splineCurve(
    firstPoint: SplinePointskipbooleanund,
    middlePoint: SplinePoint,
    afterPoint: SplinePoint,
    t: Double
  ): Next = (^.asInstanceOf[js.Dynamic].applyDynamic("splineCurve")(firstPoint.asInstanceOf[js.Any], middlePoint.asInstanceOf[js.Any], afterPoint.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Next]
  
  inline def splineCurveMonotone(points: js.Array[MonotoneSplinePoint]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("splineCurveMonotone")(points.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def splineCurveMonotone(points: js.Array[MonotoneSplinePoint], indexAxis: x | y): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("splineCurveMonotone")(points.asInstanceOf[js.Any], indexAxis.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def throttled(fn: js.Function1[/* repeated */ Any, Unit], thisArg: Any): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttled")(fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  inline def throttled(
    fn: js.Function1[/* repeated */ Any, Unit],
    thisArg: Any,
    updateFn: js.Function1[/* repeated */ Any, js.Array[Any]]
  ): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttled")(fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], updateFn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  inline def toDegrees(radians: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDegrees")(radians.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toDimension(value: String, dimension: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toDimension")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def toDimension(value: Double, dimension: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toDimension")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toFont(options: PartialFontSpec): CanvasFontSpec = ^.asInstanceOf[js.Dynamic].applyDynamic("toFont")(options.asInstanceOf[js.Any]).asInstanceOf[CanvasFontSpec]
  
  inline def toFontString(font: Family): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toFontString")(font.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def toLineHeight(value: String, size: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toLineHeight")(value.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toPadding(): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("toPadding")().asInstanceOf[Left]
  inline def toPadding(value: Double): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("toPadding")(value.asInstanceOf[js.Any]).asInstanceOf[Left]
  inline def toPadding(value: Bottom): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("toPadding")(value.asInstanceOf[js.Any]).asInstanceOf[Left]
  
  inline def toPercentage(value: String, dimesion: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toPercentage")(value.asInstanceOf[js.Any], dimesion.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def toPercentage(value: Double, dimesion: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toPercentage")(value.asInstanceOf[js.Any], dimesion.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toRadians(degrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toRadians")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toTRBL(value: Double): TRBL = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBL")(value.asInstanceOf[js.Any]).asInstanceOf[TRBL]
  inline def toTRBL(value: PartialTRBL): TRBL = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBL")(value.asInstanceOf[js.Any]).asInstanceOf[TRBL]
  
  inline def toTRBLCorners(value: Double): TRBLCorners = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBLCorners")(value.asInstanceOf[js.Any]).asInstanceOf[TRBLCorners]
  inline def toTRBLCorners(value: PartialTRBLCorners): TRBLCorners = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBLCorners")(value.asInstanceOf[js.Any]).asInstanceOf[TRBLCorners]
  
  inline def uid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[Double]
  
  inline def unclipArea(ctx: CanvasRenderingContext2D): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unclipArea")(ctx.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unlistenArrayEvents[T](array: js.Array[T], listener: ArrayListener[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unlistenArrayEvents")(array.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def valueOrDefault[T](value: T, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("valueOrDefault")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def valueOrDefault[T](value: Unit, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("valueOrDefault")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
}
