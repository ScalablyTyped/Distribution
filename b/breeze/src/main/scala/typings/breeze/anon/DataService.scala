package typings.breeze.anon

import typings.breeze.breeze.EntityQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataService extends StObject {
  
  var dataService: typings.breeze.breeze.DataService
  
  def getUrl(): String
  
  var query: EntityQuery
}
object DataService {
  
  inline def apply(dataService: typings.breeze.breeze.DataService, getUrl: () => String, query: EntityQuery): DataService = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], getUrl = js.Any.fromFunction0(getUrl), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataService]
  }
  
  extension [Self <: DataService](x: Self) {
    
    inline def setDataService(value: typings.breeze.breeze.DataService): Self = StObject.set(x, "dataService", value.asInstanceOf[js.Any])
    
    inline def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    inline def setQuery(value: EntityQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
