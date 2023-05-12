package typings.chartJs

import typings.chartJs.anon.Angle
import typings.chartJs.anon.BackgroundColor
import typings.chartJs.anon.Indexable
import typings.chartJs.anon.X
import typings.chartJs.distTypesGeometricMod.Point
import typings.chartJs.distTypesIndexMod.ArcOptions
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distElementsElementDotarcMod {
  
  @JSImport("chart.js/dist/elements/element.arc", JSImport.Default)
  @js.native
  open class default protected () extends ArcElement {
    def this(cfg: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("chart.js/dist/elements/element.arc", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js/dist/elements/element.arc", "default.defaultRoutes")
    @js.native
    def defaultRoutes: BackgroundColor = js.native
    inline def defaultRoutes_=(x: BackgroundColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist/elements/element.arc", "default.defaults")
    @js.native
    def defaults: Angle = js.native
    inline def defaults_=(x: Angle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist/elements/element.arc", "default.descriptors")
    @js.native
    def descriptors: Indexable = js.native
    inline def descriptors_=(x: Indexable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist/elements/element.arc", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ArcElement
    extends typings.chartJs.distCoreCoreDotelementMod.default[ArcProps, ArcOptions] {
    
    var circumference: Double = js.native
    
    def draw(ctx: CanvasRenderingContext2D): Unit = js.native
    
    var endAngle: Double = js.native
    
    var fullCircles: Double = js.native
    
    def getCenterPoint(useFinalPosition: Boolean): X = js.native
    
    def inRange(chartX: Double, chartY: Double, useFinalPosition: Boolean): Boolean = js.native
    
    var innerRadius: Double = js.native
    
    var outerRadius: Double = js.native
    
    var pixelMargin: Double = js.native
    
    var startAngle: Double = js.native
  }
  
  trait ArcProps
    extends StObject
       with Point {
    
    var circumference: Double
    
    var endAngle: Double
    
    var innerRadius: Double
    
    var outerRadius: Double
    
    var startAngle: Double
  }
  object ArcProps {
    
    inline def apply(
      circumference: Double,
      endAngle: Double,
      innerRadius: Double,
      outerRadius: Double,
      startAngle: Double,
      x: Double,
      y: Double
    ): ArcProps = {
      val __obj = js.Dynamic.literal(circumference = circumference.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArcProps] (val x: Self) extends AnyVal {
      
      inline def setCircumference(value: Double): Self = StObject.set(x, "circumference", value.asInstanceOf[js.Any])
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    }
  }
}
