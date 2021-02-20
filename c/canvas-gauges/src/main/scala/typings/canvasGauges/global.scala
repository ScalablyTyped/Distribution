package typings.canvasGauges

import typings.canvasGauges.CanvasGauges.AnimationRule
import typings.canvasGauges.CanvasGauges.DrawEventCallback
import typings.canvasGauges.CanvasGauges.EndEventCallback
import typings.canvasGauges.CanvasGauges.LinearGaugeOptions
import typings.canvasGauges.CanvasGauges.RadialGaugeOptions
import typings.canvasGauges.CanvasGauges.rules
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object CanvasGauges {
    
    @JSGlobal("CanvasGauges.Animation")
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
    object Animation {
      
      @JSGlobal("CanvasGauges.Animation")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("CanvasGauges.Animation.rules")
      @js.native
      def rules: typings.canvasGauges.CanvasGauges.rules = js.native
      @scala.inline
      def rules_=(x: rules): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rules")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("CanvasGauges.BaseGauge")
    @js.native
    abstract class BaseGauge protected ()
      extends typings.canvasGauges.CanvasGauges.BaseGauge {
      def this(options: typings.canvasGauges.CanvasGauges.GenericOptions) = this()
    }
    /* static members */
    object BaseGauge {
      
      @JSGlobal("CanvasGauges.BaseGauge.ensureValue")
      @js.native
      def ensureValue(value: Double): Double = js.native
      
      @JSGlobal("CanvasGauges.BaseGauge.fromElement")
      @js.native
      def fromElement(element: HTMLElement): js.Any = js.native
      
      @JSGlobal("CanvasGauges.BaseGauge.initialize")
      @js.native
      def initialize(`type`: String, options: typings.canvasGauges.CanvasGauges.GenericOptions): js.Any = js.native
      
      @JSGlobal("CanvasGauges.BaseGauge.version")
      @js.native
      val version: Double = js.native
    }
    
    @JSGlobal("CanvasGauges.DomObserver")
    @js.native
    class DomObserver protected ()
      extends typings.canvasGauges.CanvasGauges.DomObserver {
      def this(options: typings.canvasGauges.CanvasGauges.GenericOptions, element: String, `type`: String) = this()
    }
    /* static members */
    object DomObserver {
      
      @JSGlobal("CanvasGauges.DomObserver.domReady")
      @js.native
      def domReady(handler: js.Function): js.Any = js.native
      
      @JSGlobal("CanvasGauges.DomObserver.parse")
      @js.native
      def parse(value: js.Any): js.Any = js.native
      
      @JSGlobal("CanvasGauges.DomObserver.toAttributeName")
      @js.native
      def toAttributeName(str: String): String = js.native
      
      @JSGlobal("CanvasGauges.DomObserver.toDashed")
      @js.native
      def toDashed(camelCase: String): String = js.native
    }
    
    @JSGlobal("CanvasGauges.GenericOptions")
    @js.native
    val GenericOptions: typings.canvasGauges.CanvasGauges.GenericOptions = js.native
    
    @JSGlobal("CanvasGauges.LinearGauge")
    @js.native
    class LinearGauge protected ()
      extends typings.canvasGauges.CanvasGauges.LinearGauge {
      def this(options: LinearGaugeOptions) = this()
    }
    
    @JSGlobal("CanvasGauges.RadialGauge")
    @js.native
    class RadialGauge protected ()
      extends typings.canvasGauges.CanvasGauges.RadialGauge {
      def this(options: RadialGaugeOptions) = this()
    }
    
    @JSGlobal("CanvasGauges.SmartCanvas")
    @js.native
    class SmartCanvas protected ()
      extends typings.canvasGauges.CanvasGauges.SmartCanvas {
      def this(element: HTMLCanvasElement) = this()
      def this(element: HTMLCanvasElement, width: Double) = this()
      def this(element: HTMLCanvasElement, width: js.UndefOr[scala.Nothing], height: Double) = this()
      def this(element: HTMLCanvasElement, width: Double, height: Double) = this()
    }
    /* static members */
    object SmartCanvas {
      
      @JSGlobal("CanvasGauges.SmartCanvas")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("CanvasGauges.SmartCanvas.collection")
      @js.native
      def collection: js.Array[typings.canvasGauges.CanvasGauges.SmartCanvas] = js.native
      @scala.inline
      def collection_=(x: js.Array[typings.canvasGauges.CanvasGauges.SmartCanvas]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collection")(x.asInstanceOf[js.Any])
      
      @JSGlobal("CanvasGauges.SmartCanvas.redraw")
      @js.native
      def redraw(): js.Any = js.native
    }
  }
}
