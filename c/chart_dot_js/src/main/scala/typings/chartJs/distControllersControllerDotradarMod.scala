package typings.chartJs

import typings.chartJs.anon.R
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distControllersControllerDotradarMod {
  
  @JSImport("chart.js/dist/controllers/controller.radar", JSImport.Default)
  @js.native
  open class default () extends RadarController
  /* static members */
  object default {
    
    @JSImport("chart.js/dist/controllers/controller.radar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js/dist/controllers/controller.radar", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist/controllers/controller.radar", "default.overrides")
    @js.native
    def overrides: Any = js.native
    inline def overrides_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait RadarController
    extends typings.chartJs.distCoreCoreDotdatasetControllerMod.default {
    
    def parseObjectData(meta: Any, data: Any, start: Any, count: Any): js.Array[R] = js.native
    
    def update(mode: Any): Unit = js.native
  }
}
