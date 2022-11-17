package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @typedef {{id: string, defaults: any, overrides?: any, defaultRoutes: any}} IChartComponent
  */
trait TypedRegistry extends StObject {
  
  /**
    * @param {string} id
    * @returns {object?}
    */
  def get(id: String): js.Object | Null
  
  def isForType(`type`: Any): Boolean
  
  var items: Any
  
  var `override`: Any
  
  /**
    * @param {IChartComponent} item
    * @returns {string} The scope where items defaults were registered to.
    */
  def register(item: IChartComponent): String
  
  var scope: Any
  
  var `type`: Any
  
  /**
    * @param {IChartComponent} item
    */
  def unregister(item: IChartComponent): Unit
}
object TypedRegistry {
  
  inline def apply(
    get: String => js.Object | Null,
    isForType: Any => Boolean,
    items: Any,
    `override`: Any,
    register: IChartComponent => String,
    scope: Any,
    `type`: Any,
    unregister: IChartComponent => Unit
  ): TypedRegistry = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), isForType = js.Any.fromFunction1(isForType), items = items.asInstanceOf[js.Any], register = js.Any.fromFunction1(register), scope = scope.asInstanceOf[js.Any], unregister = js.Any.fromFunction1(unregister))
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedRegistry]
  }
  
  extension [Self <: TypedRegistry](x: Self) {
    
    inline def setGet(value: String => js.Object | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setIsForType(value: Any => Boolean): Self = StObject.set(x, "isForType", js.Any.fromFunction1(value))
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setOverride(value: Any): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setRegister(value: IChartComponent => String): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    
    inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnregister(value: IChartComponent => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
  }
}
