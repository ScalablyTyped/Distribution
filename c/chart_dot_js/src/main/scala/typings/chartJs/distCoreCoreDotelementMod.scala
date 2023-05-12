package typings.chartJs

import typings.chartJs.distTypesAnimationMod.Animation
import typings.chartJs.distTypesGeometricMod.Point
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreCoreDotelementMod {
  
  @JSImport("chart.js/dist/core/core.element", JSImport.Default)
  @js.native
  open class default[T, O] ()
    extends StObject
       with Element[T, O]
  /* static members */
  object default {
    
    @JSImport("chart.js/dist/core/core.element", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js/dist/core/core.element", "default.defaultRoutes")
    @js.native
    def defaultRoutes: Any = js.native
    inline def defaultRoutes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist/core/core.element", "default.defaults")
    @js.native
    def defaults: js.Object = js.native
    inline def defaults_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Element[T, O] extends StObject {
    
    @JSName("$animations")
    var $animations: Record[/* keyof T */ String, Animation] = js.native
    
    var active: Boolean = js.native
    
    /**
      * Gets the current or final value of each prop. Can return extra properties (whole object).
      * @param props - properties to get
      * @param [final] - get the final value (animation target)
      */
    def getProps[P /* <: js.Array[/* keyof T */ String] */](props: P): Pick[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any
      ] = js.native
    def getProps[P /* <: js.Array[/* keyof T */ String] */](props: P, `final`: Boolean): Pick[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any
      ] = js.native
    def getProps[P /* <: String */](props: js.Array[P]): Partial[Record[P, Any]] = js.native
    def getProps[P /* <: String */](props: js.Array[P], `final`: Boolean): Partial[Record[P, Any]] = js.native
    
    def hasValue(): Boolean = js.native
    
    var options: O = js.native
    
    def tooltipPosition(useFinalPosition: Boolean): Point = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
}
