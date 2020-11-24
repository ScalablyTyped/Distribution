package typings.canvasGauges

import typings.canvasGauges.CanvasGauges.AnimationRule
import typings.canvasGauges.CanvasGauges.DrawEventCallback
import typings.canvasGauges.CanvasGauges.EndEventCallback
import typings.canvasGauges.CanvasGauges.LinearGaugeOptions
import typings.canvasGauges.CanvasGauges.RadialGaugeOptions
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object CanvasGauges extends js.Object {
    
    val GenericOptions: typings.canvasGauges.CanvasGauges.GenericOptions = js.native
    
    @js.native
    class Animation ()
      extends typings.canvasGauges.CanvasGauges.Animation {
      def this(rule: String) = this()
      def this(rule: AnimationRule) = this()
      def this(rule: js.UndefOr[scala.Nothing], duration: Double) = this()
      def this(rule: String, duration: Double) = this()
      def this(rule: AnimationRule, duration: Double) = this()
      def this(rule: js.UndefOr[scala.Nothing], duration: js.UndefOr[scala.Nothing], draw: DrawEventCallback) = this()
      def this(rule: js.UndefOr[scala.Nothing], duration: Double, draw: DrawEventCallback) = this()
      def this(rule: String, duration: js.UndefOr[scala.Nothing], draw: DrawEventCallback) = this()
      def this(rule: String, duration: Double, draw: DrawEventCallback) = this()
      def this(rule: AnimationRule, duration: js.UndefOr[scala.Nothing], draw: DrawEventCallback) = this()
      def this(rule: AnimationRule, duration: Double, draw: DrawEventCallback) = this()
      def this(
        rule: js.UndefOr[scala.Nothing],
        duration: js.UndefOr[scala.Nothing],
        draw: js.UndefOr[scala.Nothing],
        end: EndEventCallback
      ) = this()
      def this(
        rule: js.UndefOr[scala.Nothing],
        duration: js.UndefOr[scala.Nothing],
        draw: DrawEventCallback,
        end: EndEventCallback
      ) = this()
      def this(
        rule: js.UndefOr[scala.Nothing],
        duration: Double,
        draw: js.UndefOr[scala.Nothing],
        end: EndEventCallback
      ) = this()
      def this(rule: js.UndefOr[scala.Nothing], duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
      def this(
        rule: String,
        duration: js.UndefOr[scala.Nothing],
        draw: js.UndefOr[scala.Nothing],
        end: EndEventCallback
      ) = this()
      def this(rule: String, duration: js.UndefOr[scala.Nothing], draw: DrawEventCallback, end: EndEventCallback) = this()
      def this(rule: String, duration: Double, draw: js.UndefOr[scala.Nothing], end: EndEventCallback) = this()
      def this(rule: String, duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
      def this(
        rule: AnimationRule,
        duration: js.UndefOr[scala.Nothing],
        draw: js.UndefOr[scala.Nothing],
        end: EndEventCallback
      ) = this()
      def this(
        rule: AnimationRule,
        duration: js.UndefOr[scala.Nothing],
        draw: DrawEventCallback,
        end: EndEventCallback
      ) = this()
      def this(rule: AnimationRule, duration: Double, draw: js.UndefOr[scala.Nothing], end: EndEventCallback) = this()
      def this(rule: AnimationRule, duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
    }
    /* static members */
    @js.native
    object Animation extends js.Object {
      
      var rules: typings.canvasGauges.CanvasGauges.rules = js.native
    }
    
    @js.native
    abstract class BaseGauge protected ()
      extends typings.canvasGauges.CanvasGauges.BaseGauge {
      def this(options: typings.canvasGauges.CanvasGauges.GenericOptions) = this()
    }
    /* static members */
    @js.native
    object BaseGauge extends js.Object {
      
      def ensureValue(value: Double): Double = js.native
      
      def fromElement(element: HTMLElement): js.Any = js.native
      
      def initialize(`type`: String, options: typings.canvasGauges.CanvasGauges.GenericOptions): js.Any = js.native
      
      val version: Double = js.native
    }
    
    @js.native
    class DomObserver protected ()
      extends typings.canvasGauges.CanvasGauges.DomObserver {
      def this(options: typings.canvasGauges.CanvasGauges.GenericOptions, element: String, `type`: String) = this()
    }
    /* static members */
    @js.native
    object DomObserver extends js.Object {
      
      def domReady(handler: js.Function): js.Any = js.native
      
      def parse(value: js.Any): js.Any = js.native
      
      def toAttributeName(str: String): String = js.native
      
      def toDashed(camelCase: String): String = js.native
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
      def this(element: HTMLCanvasElement, width: js.UndefOr[scala.Nothing], height: Double) = this()
      def this(element: HTMLCanvasElement, width: Double, height: Double) = this()
    }
    /* static members */
    @js.native
    object SmartCanvas extends js.Object {
      
      var collection: js.Array[typings.canvasGauges.CanvasGauges.SmartCanvas] = js.native
      
      def redraw(): js.Any = js.native
    }
  }
}
