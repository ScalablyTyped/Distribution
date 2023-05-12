package typings.chartJs

import typings.chartJs.anon.Circumference
import typings.chartJs.anon.Scriptable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distControllersControllerDotdoughnutMod {
  
  @JSImport("chart.js/dist/controllers/controller.doughnut", JSImport.Default)
  @js.native
  open class default protected () extends DoughnutController {
    def this(chart: Any, datasetIndex: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("chart.js/dist/controllers/controller.doughnut", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js/dist/controllers/controller.doughnut", "default.descriptors")
    @js.native
    def descriptors: Scriptable = js.native
    inline def descriptors_=(x: Scriptable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist/controllers/controller.doughnut", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist/controllers/controller.doughnut", "default.overrides")
    @js.native
    def overrides: Any = js.native
    inline def overrides_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
  }
  
  type Chart = typings.chartJs.distCoreCoreDotcontrollerMod.default
  
  @js.native
  trait DoughnutController
    extends typings.chartJs.distCoreCoreDotdatasetControllerMod.default {
    
    /**
      * @private
      */
    /* private */ var _circumference: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _getCircumference: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _getRingWeight: Any = js.native
    
    /**
      * Get radius length offset of the dataset in relation to the visible datasets weights. This allows determining the inner and outer radius correctly
      * @private
      */
    /* private */ var _getRingWeightOffset: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _getRotation: Any = js.native
    
    /**
      * Get the maximal rotation & circumference extents
      * across all visible datasets.
      */
    def _getRotationExtents(): Circumference = js.native
    
    /**
      * Returns the sum of all visible data set weights.
      * @private
      */
    /* private */ var _getVisibleDatasetWeightTotal: Any = js.native
    
    def calculateCircumference(value: Any): Double = js.native
    
    def calculateTotal(): Double = js.native
    
    def getMaxBorderWidth(arcs: Any): Double = js.native
    
    def getMaxOffset(arcs: Any): Double = js.native
    
    var innerRadius: Double = js.native
    
    var offsetX: Double = js.native
    
    var offsetY: Double = js.native
    
    var outerRadius: Double = js.native
    
    /**
      * Override data parsing, since we are not using scales
      */
    def parse(start: Any, count: Any): Unit = js.native
  }
}
