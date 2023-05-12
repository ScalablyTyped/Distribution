package typings.chartJs

import typings.chartJs.anon.AngleLines
import typings.chartJs.anon.AngleLinescolor
import typings.chartJs.anon.AngleX
import typings.chartJs.anon.Right
import typings.chartJs.distTypesGeometricMod.ChartArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distScalesScaleDotradialLinearMod {
  
  @JSImport("chart.js/dist/scales/scale.radialLinear", JSImport.Default)
  @js.native
  open class default () extends RadialLinearScale
  /* static members */
  object default {
    
    @JSImport("chart.js/dist/scales/scale.radialLinear", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js/dist/scales/scale.radialLinear", "default.defaultRoutes")
    @js.native
    def defaultRoutes: AngleLinescolor = js.native
    inline def defaultRoutes_=(x: AngleLinescolor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist/scales/scale.radialLinear", "default.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist/scales/scale.radialLinear", "default.descriptors")
    @js.native
    def descriptors: AngleLines = js.native
    inline def descriptors_=(x: AngleLines): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist/scales/scale.radialLinear", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait RadialLinearScale
    extends typings.chartJs.distScalesScaleDotlinearbaseMod.default {
    
    var _padding: ChartArea = js.native
    
    var _pointLabelItems: js.Array[Any] = js.native
    
    /** @type {string[]} */
    var _pointLabels: js.Array[String] = js.native
    
    /**
      * @protected
      */
    /* protected */ def drawGrid(): Unit = js.native
    
    /**
      * @protected
      */
    /* protected */ def drawLabels(): Unit = js.native
    
    /** @type {number} */
    var drawingArea: Double = js.native
    
    def generateTickLabels(ticks: Any): Unit = js.native
    
    def getBasePosition(index: Any): AngleX = js.native
    
    def getDistanceFromCenterForValue(value: Any): Double = js.native
    
    def getIndexAngle(index: Any): Double = js.native
    
    def getPointLabelContext(index: Any): Any = js.native
    
    def getPointLabelPosition(index: Any): Right = js.native
    
    def getPointPosition(index: Any, distanceFromCenter: Any): AngleX = js.native
    def getPointPosition(index: Any, distanceFromCenter: Any, additionalAngle: Double): AngleX = js.native
    
    def getPointPositionForValue(index: Any, value: Any): AngleX = js.native
    
    def getValueForDistanceFromCenter(distance: Any): Any = js.native
    
    def setCenterPoint(leftMovement: Any, rightMovement: Any, topMovement: Any, bottomMovement: Any): Unit = js.native
    
    /** @type {number} */
    var xCenter: Double = js.native
    
    /** @type {number} */
    var yCenter: Double = js.native
  }
}
