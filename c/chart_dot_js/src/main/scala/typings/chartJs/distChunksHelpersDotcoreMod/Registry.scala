package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.chartJs.anon.TypeofDatasetController
import typings.chartJs.anon.TypeofElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Please use the module's default export which provides a singleton instance
  * Note: class is exported for typedoc
  */
trait Registry extends StObject {
  
  /**
    * @private
    */
  /* private */ var _each: Any
  
  /**
    * @private
    */
  /* private */ var _exec: Any
  
  /**
    * @private
    */
  /* private */ var _get: Any
  
  /**
    * @private
    */
  /* private */ var _getRegistryForType: Any
  
  var _typedRegistries: js.Array[TypedRegistry]
  
  /**
    * @param  {...any} args
    */
  def add(args: Any*): Unit
  
  /**
    * @param  {...typeof DatasetController} args
    */
  def addControllers(
    args: (TypeofDatasetController & (Instantiable2[/* chart */ Chart, /* datasetIndex */ Double, DatasetController]))*
  ): Unit
  
  /**
    * @param  {...typeof Element} args
    */
  def addElements(args: (TypeofElement & (Instantiable0[Element[js.Object, js.Object]]))*): Unit
  
  /**
    * @param  {...any} args
    */
  def addPlugins(args: Any*): Unit
  
  /**
    * @param  {...typeof Scale} args
    */
  def addScales(args: (Instantiable1[/* cfg */ Any, Scale1])*): Unit
  
  var controllers: TypedRegistry
  
  var elements: TypedRegistry
  
  /**
    * @param {string} id
    * @returns {typeof DatasetController}
    */
  def getController(id: String): TypeofDatasetController & (Instantiable2[/* chart */ Chart, /* datasetIndex */ Double, DatasetController])
  
  /**
    * @param {string} id
    * @returns {typeof Element}
    */
  def getElement(id: String): TypeofElement & (Instantiable0[Element[js.Object, js.Object]])
  
  /**
    * @param {string} id
    * @returns {object}
    */
  def getPlugin(id: String): js.Object
  
  /**
    * @param {string} id
    * @returns {typeof Scale}
    */
  def getScale(id: String): Instantiable1[/* cfg */ Any, Scale1]
  
  var plugins: TypedRegistry
  
  def remove(args: Any*): Unit
  
  /**
    * @param  {...typeof DatasetController} args
    */
  def removeControllers(
    args: (TypeofDatasetController & (Instantiable2[/* chart */ Chart, /* datasetIndex */ Double, DatasetController]))*
  ): Unit
  
  /**
    * @param  {...typeof Element} args
    */
  def removeElements(args: (TypeofElement & (Instantiable0[Element[js.Object, js.Object]]))*): Unit
  
  /**
    * @param  {...any} args
    */
  def removePlugins(args: Any*): Unit
  
  /**
    * @param  {...typeof Scale} args
    */
  def removeScales(args: (Instantiable1[/* cfg */ Any, Scale1])*): Unit
  
  var scales: TypedRegistry
}
object Registry {
  
  inline def apply(
    _each: Any,
    _exec: Any,
    _get: Any,
    _getRegistryForType: Any,
    _typedRegistries: js.Array[TypedRegistry],
    add: /* repeated */ Any => Unit,
    addControllers: /* repeated */ TypeofDatasetController & (Instantiable2[/* chart */ Chart, /* datasetIndex */ Double, DatasetController]) => Unit,
    addElements: /* repeated */ TypeofElement & (Instantiable0[Element[js.Object, js.Object]]) => Unit,
    addPlugins: /* repeated */ Any => Unit,
    addScales: /* repeated */ Instantiable1[/* cfg */ Any, Scale1] => Unit,
    controllers: TypedRegistry,
    elements: TypedRegistry,
    getController: String => TypeofDatasetController & (Instantiable2[/* chart */ Chart, /* datasetIndex */ Double, DatasetController]),
    getElement: String => TypeofElement & (Instantiable0[Element[js.Object, js.Object]]),
    getPlugin: String => js.Object,
    getScale: String => Instantiable1[/* cfg */ Any, Scale1],
    plugins: TypedRegistry,
    remove: /* repeated */ Any => Unit,
    removeControllers: /* repeated */ TypeofDatasetController & (Instantiable2[/* chart */ Chart, /* datasetIndex */ Double, DatasetController]) => Unit,
    removeElements: /* repeated */ TypeofElement & (Instantiable0[Element[js.Object, js.Object]]) => Unit,
    removePlugins: /* repeated */ Any => Unit,
    removeScales: /* repeated */ Instantiable1[/* cfg */ Any, Scale1] => Unit,
    scales: TypedRegistry
  ): Registry = {
    val __obj = js.Dynamic.literal(_each = _each.asInstanceOf[js.Any], _exec = _exec.asInstanceOf[js.Any], _get = _get.asInstanceOf[js.Any], _getRegistryForType = _getRegistryForType.asInstanceOf[js.Any], _typedRegistries = _typedRegistries.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), addControllers = js.Any.fromFunction1(addControllers), addElements = js.Any.fromFunction1(addElements), addPlugins = js.Any.fromFunction1(addPlugins), addScales = js.Any.fromFunction1(addScales), controllers = controllers.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], getController = js.Any.fromFunction1(getController), getElement = js.Any.fromFunction1(getElement), getPlugin = js.Any.fromFunction1(getPlugin), getScale = js.Any.fromFunction1(getScale), plugins = plugins.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), removeControllers = js.Any.fromFunction1(removeControllers), removeElements = js.Any.fromFunction1(removeElements), removePlugins = js.Any.fromFunction1(removePlugins), removeScales = js.Any.fromFunction1(removeScales), scales = scales.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registry]
  }
  
  extension [Self <: Registry](x: Self) {
    
    inline def setAdd(value: /* repeated */ Any => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddControllers(
      value: /* repeated */ TypeofDatasetController & (Instantiable2[/* chart */ Chart, /* datasetIndex */ Double, DatasetController]) => Unit
    ): Self = StObject.set(x, "addControllers", js.Any.fromFunction1(value))
    
    inline def setAddElements(value: /* repeated */ TypeofElement & (Instantiable0[Element[js.Object, js.Object]]) => Unit): Self = StObject.set(x, "addElements", js.Any.fromFunction1(value))
    
    inline def setAddPlugins(value: /* repeated */ Any => Unit): Self = StObject.set(x, "addPlugins", js.Any.fromFunction1(value))
    
    inline def setAddScales(value: /* repeated */ Instantiable1[/* cfg */ Any, Scale1] => Unit): Self = StObject.set(x, "addScales", js.Any.fromFunction1(value))
    
    inline def setControllers(value: TypedRegistry): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
    
    inline def setElements(value: TypedRegistry): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setGetController(
      value: String => TypeofDatasetController & (Instantiable2[/* chart */ Chart, /* datasetIndex */ Double, DatasetController])
    ): Self = StObject.set(x, "getController", js.Any.fromFunction1(value))
    
    inline def setGetElement(value: String => TypeofElement & (Instantiable0[Element[js.Object, js.Object]])): Self = StObject.set(x, "getElement", js.Any.fromFunction1(value))
    
    inline def setGetPlugin(value: String => js.Object): Self = StObject.set(x, "getPlugin", js.Any.fromFunction1(value))
    
    inline def setGetScale(value: String => Instantiable1[/* cfg */ Any, Scale1]): Self = StObject.set(x, "getScale", js.Any.fromFunction1(value))
    
    inline def setPlugins(value: TypedRegistry): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: /* repeated */ Any => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRemoveControllers(
      value: /* repeated */ TypeofDatasetController & (Instantiable2[/* chart */ Chart, /* datasetIndex */ Double, DatasetController]) => Unit
    ): Self = StObject.set(x, "removeControllers", js.Any.fromFunction1(value))
    
    inline def setRemoveElements(value: /* repeated */ TypeofElement & (Instantiable0[Element[js.Object, js.Object]]) => Unit): Self = StObject.set(x, "removeElements", js.Any.fromFunction1(value))
    
    inline def setRemovePlugins(value: /* repeated */ Any => Unit): Self = StObject.set(x, "removePlugins", js.Any.fromFunction1(value))
    
    inline def setRemoveScales(value: /* repeated */ Instantiable1[/* cfg */ Any, Scale1] => Unit): Self = StObject.set(x, "removeScales", js.Any.fromFunction1(value))
    
    inline def setScales(value: TypedRegistry): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
    
    inline def set_each(value: Any): Self = StObject.set(x, "_each", value.asInstanceOf[js.Any])
    
    inline def set_exec(value: Any): Self = StObject.set(x, "_exec", value.asInstanceOf[js.Any])
    
    inline def set_get(value: Any): Self = StObject.set(x, "_get", value.asInstanceOf[js.Any])
    
    inline def set_getRegistryForType(value: Any): Self = StObject.set(x, "_getRegistryForType", value.asInstanceOf[js.Any])
    
    inline def set_typedRegistries(value: js.Array[TypedRegistry]): Self = StObject.set(x, "_typedRegistries", value.asInstanceOf[js.Any])
    
    inline def set_typedRegistriesVarargs(value: TypedRegistry*): Self = StObject.set(x, "_typedRegistries", js.Array(value*))
  }
}
