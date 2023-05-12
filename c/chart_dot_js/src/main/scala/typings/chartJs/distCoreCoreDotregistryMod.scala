package typings.chartJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.chartJs.anon.TypeofDatasetController
import typings.chartJs.anon.TypeofElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreCoreDotregistryMod extends Shortcut {
  
  @JSImport("chart.js/dist/core/core.registry", JSImport.Default)
  @js.native
  val default: Registry = js.native
  
  @JSImport("chart.js/dist/core/core.registry", "Registry")
  @js.native
  open class Registry () extends StObject {
    
    /**
      * @private
      */
    /* private */ var _each: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _exec: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _get: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _getRegistryForType: Any = js.native
    
    var _typedRegistries: js.Array[typings.chartJs.distCoreCoreDottypedRegistryMod.default] = js.native
    
    /**
      * @param  {...any} args
      */
    def add(args: Any*): Unit = js.native
    
    /**
      * @param  {...typeof DatasetController} args
      */
    def addControllers(args: TypeofDatasetController*): Unit = js.native
    
    /**
      * @param  {...typeof Element} args
      */
    def addElements(args: TypeofElement*): Unit = js.native
    
    /**
      * @param  {...any} args
      */
    def addPlugins(args: Any*): Unit = js.native
    
    /**
      * @param  {...typeof Scale} args
      */
    def addScales(args: (Instantiable1[/* cfg */ Any, typings.chartJs.distCoreCoreDotscaleMod.default])*): Unit = js.native
    
    var controllers: typings.chartJs.distCoreCoreDottypedRegistryMod.default = js.native
    
    var elements: typings.chartJs.distCoreCoreDottypedRegistryMod.default = js.native
    
    /**
      * @param {string} id
      * @returns {typeof DatasetController}
      */
    def getController(id: String): TypeofDatasetController = js.native
    
    /**
      * @param {string} id
      * @returns {typeof Element}
      */
    def getElement(id: String): TypeofElement = js.native
    
    /**
      * @param {string} id
      * @returns {object}
      */
    def getPlugin(id: String): js.Object = js.native
    
    /**
      * @param {string} id
      * @returns {typeof Scale}
      */
    def getScale(id: String): Instantiable1[/* cfg */ Any, typings.chartJs.distCoreCoreDotscaleMod.default] = js.native
    
    var plugins: typings.chartJs.distCoreCoreDottypedRegistryMod.default = js.native
    
    def remove(args: Any*): Unit = js.native
    
    /**
      * @param  {...typeof DatasetController} args
      */
    def removeControllers(args: TypeofDatasetController*): Unit = js.native
    
    /**
      * @param  {...typeof Element} args
      */
    def removeElements(args: TypeofElement*): Unit = js.native
    
    /**
      * @param  {...any} args
      */
    def removePlugins(args: Any*): Unit = js.native
    
    /**
      * @param  {...typeof Scale} args
      */
    def removeScales(args: (Instantiable1[/* cfg */ Any, typings.chartJs.distCoreCoreDotscaleMod.default])*): Unit = js.native
    
    var scales: typings.chartJs.distCoreCoreDottypedRegistryMod.default = js.native
  }
  
  type _To = Registry
  
  /* This means you don't have to write `default`, but can instead just say `distCoreCoreDotregistryMod.foo` */
  override def _to: Registry = default
}
