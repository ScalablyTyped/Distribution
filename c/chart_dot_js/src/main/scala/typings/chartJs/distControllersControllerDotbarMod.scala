package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distControllersControllerDotbarMod {
  
  @JSImport("chart.js/dist/controllers/controller.bar", JSImport.Default)
  @js.native
  open class default () extends BarController
  /* static members */
  object default {
    
    @JSImport("chart.js/dist/controllers/controller.bar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js/dist/controllers/controller.bar", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist/controllers/controller.bar", "default.overrides")
    @js.native
    def overrides: Any = js.native
    inline def overrides_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BarController
    extends typings.chartJs.distCoreCoreDotdatasetControllerMod.default {
    
    /**
      * @private
      */
    /* private */ var _calculateBarIndexPixels: Any = js.native
    
    /**
      * Note: pixel values are not clamped to the scale area.
      * @private
      */
    /* private */ var _calculateBarValuePixels: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _getRuler: Any = js.native
    
    /**
      * Returns the effective number of stacks based on groups and bar visibility.
      * @private
      */
    /* private */ var _getStackCount: Any = js.native
    
    /**
      * Returns the stack index for the given dataset based on groups and bar visibility.
      * @param {number} [datasetIndex] - The dataset index
      * @param {string} [name] - The stack name to find
      * @param {number} [dataIndex]
      * @returns {number} The stack index
      * @private
      */
    /* private */ var _getStackIndex: Any = js.native
    
    /**
      * Returns the stacks based on groups and bar visibility.
      * @param {number} [last] - The dataset index
      * @param {number} [dataIndex] - The data index of the ruler
      * @returns {string[]} The list of stack IDs
      * @private
      */
    /* private */ var _getStacks: Any = js.native
    
    /**
      * Overriding array data parsing since we support mixed primitive/array
      * data for float bars
      * @protected
      */
    /* protected */ def parseArrayData(meta: Any, data: Any, start: Any, count: Any): js.Array[Any] = js.native
    
    /**
      * Overriding object data parsing since we support mixed primitive/array
      * value-scale data for float bars
      * @protected
      */
    /* protected */ def parseObjectData(meta: Any, data: Any, start: Any, count: Any): js.Array[Any] = js.native
    
    /**
      * Overriding primitive data parsing since we support mixed primitive/array
      * data for float bars
      * @protected
      */
    /* protected */ def parsePrimitiveData(meta: Any, data: Any, start: Any, count: Any): js.Array[Any] = js.native
    
    def update(mode: Any): Unit = js.native
  }
}
