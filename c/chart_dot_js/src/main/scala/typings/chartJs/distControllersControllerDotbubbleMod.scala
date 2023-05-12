package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distControllersControllerDotbubbleMod {
  
  @JSImport("chart.js/dist/controllers/controller.bubble", JSImport.Default)
  @js.native
  open class default () extends BubbleController
  /* static members */
  object default {
    
    @JSImport("chart.js/dist/controllers/controller.bubble", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js/dist/controllers/controller.bubble", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist/controllers/controller.bubble", "default.overrides")
    @js.native
    def overrides: Any = js.native
    inline def overrides_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BubbleController
    extends typings.chartJs.distCoreCoreDotdatasetControllerMod.default {
    
    /**
      * Parse array of arrays
      * @protected
      */
    /* protected */ def parseArrayData(meta: Any, data: Any, start: Any, count: Any): Any = js.native
    
    /**
      * Parse array of objects
      * @protected
      */
    /* protected */ def parseObjectData(meta: Any, data: Any, start: Any, count: Any): Any = js.native
    
    /**
      * Parse array of primitive values
      * @protected
      */
    /* protected */ def parsePrimitiveData(meta: Any, data: Any, start: Any, count: Any): Any = js.native
    
    def update(mode: Any): Unit = js.native
  }
}
