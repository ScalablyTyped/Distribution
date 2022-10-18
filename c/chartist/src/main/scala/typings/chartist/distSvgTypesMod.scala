package typings.chartist

import typings.chartist.anon.Command
import typings.chartist.chartistStrings.always
import typings.chartist.chartistStrings.discrete
import typings.chartist.chartistStrings.easeInBack
import typings.chartist.chartistStrings.easeInCirc
import typings.chartist.chartistStrings.easeInCubic
import typings.chartist.chartistStrings.easeInExpo
import typings.chartist.chartistStrings.easeInOutBack
import typings.chartist.chartistStrings.easeInOutCirc
import typings.chartist.chartistStrings.easeInOutCubic
import typings.chartist.chartistStrings.easeInOutExpo
import typings.chartist.chartistStrings.easeInOutQuad
import typings.chartist.chartistStrings.easeInOutQuart
import typings.chartist.chartistStrings.easeInOutQuint
import typings.chartist.chartistStrings.easeInOutSine
import typings.chartist.chartistStrings.easeInQuad
import typings.chartist.chartistStrings.easeInQuart
import typings.chartist.chartistStrings.easeInQuint
import typings.chartist.chartistStrings.easeInSine
import typings.chartist.chartistStrings.easeOutBack
import typings.chartist.chartistStrings.easeOutCirc
import typings.chartist.chartistStrings.easeOutCubic
import typings.chartist.chartistStrings.easeOutExpo
import typings.chartist.chartistStrings.easeOutQuad
import typings.chartist.chartistStrings.easeOutQuart
import typings.chartist.chartistStrings.easeOutQuint
import typings.chartist.chartistStrings.easeOutSine
import typings.chartist.chartistStrings.indefinite
import typings.chartist.chartistStrings.linear
import typings.chartist.chartistStrings.never
import typings.chartist.chartistStrings.paced
import typings.chartist.chartistStrings.spline
import typings.chartist.chartistStrings.whenNotActive
import typings.chartist.distSvgSvgMod.Svg
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSvgTypesMod {
  
  trait AnimationDefinition extends StObject {
    
    var begin: js.UndefOr[Double | String] = js.undefined
    
    var calcMode: js.UndefOr[discrete | linear | paced | spline] = js.undefined
    
    var dur: Double | String
    
    var easing: js.UndefOr[
        js.Array[Double] | easeInSine | easeOutSine | easeInOutSine | easeInQuad | easeOutQuad | easeInOutQuad | easeInCubic | easeOutCubic | easeInOutCubic | easeInQuart | easeOutQuart | easeInOutQuart | easeInQuint | easeOutQuint | easeInOutQuint | easeInExpo | easeOutExpo | easeInOutExpo | easeInCirc | easeOutCirc | easeInOutCirc | easeInBack | easeOutBack | easeInOutBack
      ] = js.undefined
    
    var end: js.UndefOr[Double | String] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var from: Double | String
    
    var id: js.UndefOr[String] = js.undefined
    
    var keySplines: js.UndefOr[String] = js.undefined
    
    var keyTimes: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[Double | String] = js.undefined
    
    var min: js.UndefOr[Double | String] = js.undefined
    
    var repeatCount: js.UndefOr[Double | indefinite] = js.undefined
    
    var repeatDur: js.UndefOr[String | indefinite] = js.undefined
    
    var restart: js.UndefOr[always | whenNotActive | never] = js.undefined
    
    var to: Double | String
  }
  object AnimationDefinition {
    
    inline def apply(dur: Double | String, from: Double | String, to: Double | String): AnimationDefinition = {
      val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationDefinition]
    }
    
    extension [Self <: AnimationDefinition](x: Self) {
      
      inline def setBegin(value: Double | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      inline def setCalcMode(value: discrete | linear | paced | spline): Self = StObject.set(x, "calcMode", value.asInstanceOf[js.Any])
      
      inline def setCalcModeUndefined: Self = StObject.set(x, "calcMode", js.undefined)
      
      inline def setDur(value: Double | String): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
      
      inline def setEasing(
        value: js.Array[Double] | easeInSine | easeOutSine | easeInOutSine | easeInQuad | easeOutQuad | easeInOutQuad | easeInCubic | easeOutCubic | easeInOutCubic | easeInQuart | easeOutQuart | easeInOutQuart | easeInQuint | easeOutQuint | easeInOutQuint | easeInExpo | easeOutExpo | easeInOutExpo | easeInCirc | easeOutCirc | easeInOutCirc | easeInBack | easeOutBack | easeInOutBack
      ): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setEasingVarargs(value: Double*): Self = StObject.set(x, "easing", js.Array(value*))
      
      inline def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKeySplines(value: String): Self = StObject.set(x, "keySplines", value.asInstanceOf[js.Any])
      
      inline def setKeySplinesUndefined: Self = StObject.set(x, "keySplines", js.undefined)
      
      inline def setKeyTimes(value: String): Self = StObject.set(x, "keyTimes", value.asInstanceOf[js.Any])
      
      inline def setKeyTimesUndefined: Self = StObject.set(x, "keyTimes", js.undefined)
      
      inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setRepeatCount(value: Double | indefinite): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
      
      inline def setRepeatCountUndefined: Self = StObject.set(x, "repeatCount", js.undefined)
      
      inline def setRepeatDur(value: String | indefinite): Self = StObject.set(x, "repeatDur", value.asInstanceOf[js.Any])
      
      inline def setRepeatDurUndefined: Self = StObject.set(x, "repeatDur", js.undefined)
      
      inline def setRestart(value: always | whenNotActive | never): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
      
      inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
      
      inline def setTo(value: Double | String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnimationEvent extends StObject {
    
    var animate: Element
    
    var element: Svg
    
    var params: AnimationDefinition
  }
  object AnimationEvent {
    
    inline def apply(animate: Element, element: Svg, params: AnimationDefinition): AnimationEvent = {
      val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationEvent]
    }
    
    extension [Self <: AnimationEvent](x: Self) {
      
      inline def setAnimate(value: Element): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Svg): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setParams(value: AnimationDefinition): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArcParams
    extends StObject
       with BasePathParams
       with _PathParams {
    
    var lAf: Double
    
    var rx: Double
    
    var ry: Double
    
    var sf: Double
    
    var xAr: Double
  }
  object ArcParams {
    
    inline def apply(lAf: Double, rx: Double, ry: Double, sf: Double, x: Double, xAr: Double, y: Double): ArcParams = {
      val __obj = js.Dynamic.literal(lAf = lAf.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], sf = sf.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xAr = xAr.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcParams]
    }
    
    extension [Self <: ArcParams](x: Self) {
      
      inline def setLAf(value: Double): Self = StObject.set(x, "lAf", value.asInstanceOf[js.Any])
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setSf(value: Double): Self = StObject.set(x, "sf", value.asInstanceOf[js.Any])
      
      inline def setXAr(value: Double): Self = StObject.set(x, "xAr", value.asInstanceOf[js.Any])
    }
  }
  
  type Attributes = Record[String, js.UndefOr[Double | String | Null]]
  
  trait BasePathParams extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object BasePathParams {
    
    inline def apply(x: Double, y: Double): BasePathParams = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePathParams]
    }
    
    extension [Self <: BasePathParams](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait CurveParams
    extends StObject
       with BasePathParams
       with _PathParams {
    
    var x1: Double
    
    var x2: Double
    
    var y1: Double
    
    var y2: Double
  }
  object CurveParams {
    
    inline def apply(x: Double, x1: Double, x2: Double, y: Double, y1: Double, y2: Double): CurveParams = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurveParams]
    }
    
    extension [Self <: CurveParams](x: Self) {
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  type LineParams = BasePathParams
  
  type MoveParams = BasePathParams
  
  type PathCommand[T /* <: PathParams */] = Command & T
  
  /* Rewritten from type alias, can be one of: 
    - typings.chartist.distSvgTypesMod.MoveParams
    - typings.chartist.distSvgTypesMod.LineParams
    - typings.chartist.distSvgTypesMod.CurveParams
    - typings.chartist.distSvgTypesMod.ArcParams
  */
  type PathParams = _PathParams | MoveParams | LineParams
  
  trait SvgPathOptions extends StObject {
    
    var accuracy: js.UndefOr[Double] = js.undefined
  }
  object SvgPathOptions {
    
    inline def apply(): SvgPathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgPathOptions]
    }
    
    extension [Self <: SvgPathOptions](x: Self) {
      
      inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
      
      inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    }
  }
  
  trait _PathParams extends StObject
  object _PathParams {
    
    inline def ArcParams(lAf: Double, rx: Double, ry: Double, sf: Double, x: Double, xAr: Double, y: Double): typings.chartist.distSvgTypesMod.ArcParams = {
      val __obj = js.Dynamic.literal(lAf = lAf.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], sf = sf.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xAr = xAr.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chartist.distSvgTypesMod.ArcParams]
    }
    
    inline def CurveParams(x: Double, x1: Double, x2: Double, y: Double, y1: Double, y2: Double): typings.chartist.distSvgTypesMod.CurveParams = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chartist.distSvgTypesMod.CurveParams]
    }
  }
}
