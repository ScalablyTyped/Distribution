package typings.canvasGauges

import typings.canvasGauges.CanvasGauges.AnimationRule
import typings.canvasGauges.CanvasGauges.DrawEventCallback
import typings.canvasGauges.CanvasGauges.EndEventCallback
import typings.canvasGauges.CanvasGauges.LinearGaugeOptions
import typings.canvasGauges.CanvasGauges.RadialGaugeOptions
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object CanvasGauges extends js.Object {
    @js.native
    class Animation ()
      extends typings.canvasGauges.CanvasGauges.Animation {
      def this(rule: String) = this()
      def this(rule: AnimationRule) = this()
      def this(rule: String, duration: Double) = this()
      def this(rule: AnimationRule, duration: Double) = this()
      def this(rule: String, duration: Double, draw: DrawEventCallback) = this()
      def this(rule: AnimationRule, duration: Double, draw: DrawEventCallback) = this()
      def this(rule: String, duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
      def this(rule: AnimationRule, duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
    }
    
    @js.native
    abstract class BaseGauge protected ()
      extends typings.canvasGauges.CanvasGauges.BaseGauge {
      def this(options: typings.canvasGauges.CanvasGauges.GenericOptions) = this()
    }
    
    @js.native
    class DomObserver protected ()
      extends typings.canvasGauges.CanvasGauges.DomObserver {
      def this(options: typings.canvasGauges.CanvasGauges.GenericOptions, element: String, `type`: String) = this()
    }
    
    @js.native
    class LinearGauge protected ()
      extends typings.canvasGauges.CanvasGauges.LinearGauge {
      def this(options: LinearGaugeOptions) = this()
    }
    
    @js.native
    class RadialGauge protected ()
      extends typings.canvasGauges.CanvasGauges.RadialGauge {
      def this(options: RadialGaugeOptions) = this()
    }
    
    @js.native
    class SmartCanvas protected ()
      extends typings.canvasGauges.CanvasGauges.SmartCanvas {
      def this(element: HTMLCanvasElement) = this()
      def this(element: HTMLCanvasElement, width: Double) = this()
      def this(element: HTMLCanvasElement, width: Double, height: Double) = this()
      /* CompleteClass */
      override var context: CanvasRenderingContext2D = js.native
      /* CompleteClass */
      override var contextClone: CanvasRenderingContext2D = js.native
      /* CompleteClass */
      override var drawHeight: Double = js.native
      /* CompleteClass */
      override var drawWidth: Double = js.native
      /* CompleteClass */
      override var drawX: Double = js.native
      /* CompleteClass */
      override var drawY: Double = js.native
      /* CompleteClass */
      override var element: HTMLCanvasElement = js.native
      /* CompleteClass */
      override var elementClone: HTMLCanvasElement = js.native
      /* CompleteClass */
      override var height: Double = js.native
      /* CompleteClass */
      override var minSide: Double = js.native
      /* CompleteClass */
      override var pixelRatio: Double = js.native
      /* CompleteClass */
      override var width: Double = js.native
      /* CompleteClass */
      override def commit(): typings.canvasGauges.CanvasGauges.SmartCanvas = js.native
      /* CompleteClass */
      override def destroy(): js.Any = js.native
      /* CompleteClass */
      override def init(): js.Any = js.native
      /* CompleteClass */
      override def onRedraw(): js.Any = js.native
      /* CompleteClass */
      override def redraw(): typings.canvasGauges.CanvasGauges.SmartCanvas = js.native
    }
    
    val GenericOptions: typings.canvasGauges.CanvasGauges.GenericOptions = js.native
    /* static members */
    @js.native
    object Animation extends js.Object {
      var rules: typings.canvasGauges.CanvasGauges.rules = js.native
    }
    
    /* static members */
    @js.native
    object BaseGauge extends js.Object {
      val version: Double = js.native
      def ensureValue(value: Double): Double = js.native
      def fromElement(element: HTMLElement): js.Any = js.native
      def initialize(`type`: String, options: typings.canvasGauges.CanvasGauges.GenericOptions): js.Any = js.native
    }
    
    /* static members */
    @js.native
    object DomObserver extends js.Object {
      def domReady(handler: js.Function): js.Any = js.native
      def parse(value: js.Any): js.Any = js.native
      def toAttributeName(str: String): String = js.native
      def toDashed(camelCase: String): String = js.native
    }
    
    /* static members */
    @js.native
    object SmartCanvas extends js.Object {
      var collection: js.Array[typings.canvasGauges.CanvasGauges.SmartCanvas] = js.native
      def redraw(): js.Any = js.native
    }
    
  }
  
}

