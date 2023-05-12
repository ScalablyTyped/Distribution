package typings.chartJs

import typings.chartJs.anon.BorderColor
import typings.chartJs.anon.BorderWidth
import typings.chartJs.anon.PartialPointOptionsPointH
import typings.chartJs.anon.X
import typings.chartJs.distTypesGeometricMod.ChartArea
import typings.chartJs.distTypesGeometricMod.Point
import typings.chartJs.distTypesIndexMod.CartesianParsedData
import typings.chartJs.distTypesIndexMod.PointHoverOptions
import typings.chartJs.distTypesIndexMod.PointOptions
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distElementsElementDotpointMod {
  
  @JSImport("chart.js/dist/elements/element.point", JSImport.Default)
  @js.native
  open class default protected () extends PointElement {
    def this(cfg: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("chart.js/dist/elements/element.point", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist/elements/element.point", "default.defaultRoutes")
    @js.native
    def defaultRoutes: BorderColor = js.native
    inline def defaultRoutes_=(x: BorderColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist/elements/element.point", "default.defaults")
    @js.native
    def defaults: BorderWidth = js.native
    inline def defaults_=(x: BorderWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist/elements/element.point", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PointElement
    extends typings.chartJs.distCoreCoreDotelementMod.default[PointProps, PointOptions & PointHoverOptions] {
    
    def draw(ctx: CanvasRenderingContext2D, area: ChartArea): Unit = js.native
    
    def getCenterPoint(): X = js.native
    def getCenterPoint(useFinalPosition: Boolean): X = js.native
    
    def getRange(): Any = js.native
    
    def inRange(mouseX: Double, mouseY: Double): Boolean = js.native
    def inRange(mouseX: Double, mouseY: Double, useFinalPosition: Boolean): Boolean = js.native
    
    def inXRange(mouseX: Double): Boolean = js.native
    def inXRange(mouseX: Double, useFinalPosition: Boolean): Boolean = js.native
    
    def inYRange(mouseY: Double): Boolean = js.native
    def inYRange(mouseY: Double, useFinalPosition: Boolean): Boolean = js.native
    
    var parsed: CartesianParsedData = js.native
    
    def size(): Double = js.native
    def size(options: PartialPointOptionsPointH): Double = js.native
    
    var skip: js.UndefOr[Boolean] = js.native
    
    var stop: js.UndefOr[Boolean] = js.native
  }
  
  type PointProps = Point
}
