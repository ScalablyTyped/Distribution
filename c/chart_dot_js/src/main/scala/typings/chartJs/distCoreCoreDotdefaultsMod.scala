package typings.chartJs

import org.scalablytyped.runtime.Shortcut
import typings.chartJs.anon.Family
import typings.chartJs.anon.IncludeInvisible
import typings.std.CanvasGradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreCoreDotdefaultsMod extends Shortcut {
  
  @JSImport("chart.js/dist/core/core.defaults", JSImport.Default)
  @js.native
  val default: Defaults = js.native
  
  @JSImport("chart.js/dist/core/core.defaults", "Defaults")
  @js.native
  open class Defaults protected () extends StObject {
    def this(_descriptors: Any, _appliers: Any) = this()
    
    var animation: Any = js.native
    
    @JSName("apply")
    def apply(appliers: Any): Unit = js.native
    
    var backgroundColor: String = js.native
    
    var borderColor: String = js.native
    
    var color: String = js.native
    
    /**
      * @param {string|object} scope
      * @param {object} [values]
      */
    def describe(scope: String): Any = js.native
    def describe(scope: String, values: js.Object): Any = js.native
    def describe(scope: js.Object): Any = js.native
    def describe(scope: js.Object, values: js.Object): Any = js.native
    
    def devicePixelRatio(context: Any): Any = js.native
    
    var drawActiveElementsOnTop: Boolean = js.native
    
    var events: js.Array[String] = js.native
    
    var font: Family = js.native
    
    /**
      * @param {string} scope
      */
    def get(scope: String): Any = js.native
    
    def hoverBackgroundColor(ctx: Any, options: Any): CanvasGradient = js.native
    
    def hoverBorderColor(ctx: Any, options: Any): CanvasGradient = js.native
    
    def hoverColor(ctx: Any, options: Any): CanvasGradient = js.native
    
    var indexAxis: String = js.native
    
    var interaction: IncludeInvisible = js.native
    
    var maintainAspectRatio: Boolean = js.native
    
    var onClick: Any = js.native
    
    var onHover: Any = js.native
    
    def `override`(scope: Any, values: Any): Any = js.native
    
    var parsing: Boolean = js.native
    
    var responsive: Boolean = js.native
    
    /**
      * Routes the named defaults to fallback to another scope/name.
      * This routing is useful when those target values, like defaults.color, are changed runtime.
      * If the values would be copied, the runtime change would not take effect. By routing, the
      * fallback is evaluated at each access, so its always up to date.
      *
      * Example:
      *
      * 	defaults.route('elements.arc', 'backgroundColor', '', 'color')
      *   - reads the backgroundColor from defaults.color when undefined locally
      *
      * @param {string} scope Scope this route applies to.
      * @param {string} name Property name that should be routed to different namespace when not defined here.
      * @param {string} targetScope The namespace where those properties should be routed to.
      * Empty string ('') is the root of defaults.
      * @param {string} targetName The target name in the target scope the property should be routed to.
      */
    def route(scope: String, name: String, targetScope: String, targetName: String): Unit = js.native
    
    var scale: Any = js.native
    
    /**
      * @param {string|object} scope
      * @param {object} [values]
      */
    def set(scope: String): Any = js.native
    def set(scope: String, values: js.Object): Any = js.native
    def set(scope: js.Object): Any = js.native
    def set(scope: js.Object, values: js.Object): Any = js.native
    
    var showLine: Boolean = js.native
  }
  
  @JSImport("chart.js/dist/core/core.defaults", "descriptors")
  @js.native
  val descriptors: Any = js.native
  
  @JSImport("chart.js/dist/core/core.defaults", "overrides")
  @js.native
  val overrides: Any = js.native
  
  type _To = Defaults
  
  /* This means you don't have to write `default`, but can instead just say `distCoreCoreDotdefaultsMod.foo` */
  override def _to: Defaults = default
}
