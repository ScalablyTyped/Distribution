package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataServiceSaveContext extends StObject {
  
  var adapter: DataServiceAdapter
  
  var contentKeys: js.Array[Any]
  
  var dataService: DataService
  
  var entityManager: EntityManager
  
  var resourceName: String
  
  var routePrefix: String
  
  var tempKeys: js.Array[Any]
}
object DataServiceSaveContext {
  
  inline def apply(
    adapter: DataServiceAdapter,
    contentKeys: js.Array[Any],
    dataService: DataService,
    entityManager: EntityManager,
    resourceName: String,
    routePrefix: String,
    tempKeys: js.Array[Any]
  ): DataServiceSaveContext = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], contentKeys = contentKeys.asInstanceOf[js.Any], dataService = dataService.asInstanceOf[js.Any], entityManager = entityManager.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any], routePrefix = routePrefix.asInstanceOf[js.Any], tempKeys = tempKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataServiceSaveContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataServiceSaveContext] (val x: Self) extends AnyVal {
    
    inline def setAdapter(value: DataServiceAdapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setContentKeys(value: js.Array[Any]): Self = StObject.set(x, "contentKeys", value.asInstanceOf[js.Any])
    
    inline def setContentKeysVarargs(value: Any*): Self = StObject.set(x, "contentKeys", js.Array(value*))
    
    inline def setDataService(value: DataService): Self = StObject.set(x, "dataService", value.asInstanceOf[js.Any])
    
    inline def setEntityManager(value: EntityManager): Self = StObject.set(x, "entityManager", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setRoutePrefix(value: String): Self = StObject.set(x, "routePrefix", value.asInstanceOf[js.Any])
    
    inline def setTempKeys(value: js.Array[Any]): Self = StObject.set(x, "tempKeys", value.asInstanceOf[js.Any])
    
    inline def setTempKeysVarargs(value: Any*): Self = StObject.set(x, "tempKeys", js.Array(value*))
  }
}
