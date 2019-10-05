package typings.canvasDashGauges

import typings.canvasDashGauges.CanvasGauges.AnimationRule
import typings.canvasDashGauges.CanvasGauges.DrawEventCallback
import typings.canvasDashGauges.CanvasGauges.EndEventCallback
import typings.canvasDashGauges.CanvasGauges.LinearGaugeOptions
import typings.canvasDashGauges.CanvasGauges.RadialGaugeOptions
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("canvas-gauges", JSImport.Namespace)
@js.native
object canvasDashGaugesMod extends js.Object {
  @js.native
  class Animation ()
    extends typings.canvasDashGauges.CanvasGauges.Animation {
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
    extends typings.canvasDashGauges.CanvasGauges.BaseGauge {
    def this(options: typings.canvasDashGauges.CanvasGauges.GenericOptions) = this()
  }
  
  @js.native
  class DomObserver protected ()
    extends typings.canvasDashGauges.CanvasGauges.DomObserver {
    def this(options: typings.canvasDashGauges.CanvasGauges.GenericOptions, element: String, `type`: String) = this()
  }
  
  @js.native
  class LinearGauge protected ()
    extends typings.canvasDashGauges.CanvasGauges.LinearGauge {
    def this(options: LinearGaugeOptions) = this()
  }
  
  @js.native
  class RadialGauge protected ()
    extends typings.canvasDashGauges.CanvasGauges.RadialGauge {
    def this(options: RadialGaugeOptions) = this()
  }
  
  @js.native
  class SmartCanvas protected ()
    extends typings.canvasDashGauges.CanvasGauges.SmartCanvas {
    def this(element: HTMLCanvasElement) = this()
    def this(element: HTMLCanvasElement, width: Double) = this()
    def this(element: HTMLCanvasElement, width: Double, height: Double) = this()
  }
  
  val GenericOptions: typings.canvasDashGauges.CanvasGauges.GenericOptions = js.native
  /* static members */
  @js.native
  object Animation extends js.Object {
    var rules: typings.canvasDashGauges.CanvasGauges.rules = js.native
  }
  
  /* static members */
  @js.native
  object BaseGauge extends js.Object {
    val version: Double = js.native
    def ensureValue(value: Double): Double = js.native
    def fromElement(element: HTMLElement): js.Any = js.native
    def initialize(`type`: String, options: typings.canvasDashGauges.CanvasGauges.GenericOptions): js.Any = js.native
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
    var collection: js.Array[typings.canvasDashGauges.CanvasGauges.SmartCanvas] = js.native
    def redraw(): js.Any = js.native
  }
  
}

