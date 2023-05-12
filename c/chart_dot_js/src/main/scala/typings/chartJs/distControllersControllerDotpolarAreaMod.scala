package typings.chartJs

import typings.chartJs.anon.Max
import typings.chartJs.anon.R
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distControllersControllerDotpolarAreaMod {
  
  @JSImport("chart.js/dist/controllers/controller.polarArea", JSImport.Default)
  @js.native
  open class default protected () extends PolarAreaController {
    def this(chart: Any, datasetIndex: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("chart.js/dist/controllers/controller.polarArea", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js/dist/controllers/controller.polarArea", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist/controllers/controller.polarArea", "default.overrides")
    @js.native
    def overrides: Any = js.native
    inline def overrides_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PolarAreaController
    extends typings.chartJs.distCoreCoreDotdatasetControllerMod.default {
    
    /**
      * @private
      */
    /* private */ var _computeAngle: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _updateRadius: Any = js.native
    
    def countVisibleElements(): Double = js.native
    
    /**
      * @protected
      */
    /* protected */ def getMinMax(): Max = js.native
    
    var innerRadius: Double = js.native
    
    var outerRadius: Double = js.native
    
    def parseObjectData(meta: Any, data: Any, start: Any, count: Any): js.Array[R] = js.native
    
    def update(mode: Any): Unit = js.native
  }
}
