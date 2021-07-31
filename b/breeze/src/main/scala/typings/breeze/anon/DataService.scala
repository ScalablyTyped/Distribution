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
  
  @scala.inline
  def apply(dataService: typings.breeze.breeze.DataService, getUrl: () => String, query: EntityQuery): DataService = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], getUrl = js.Any.fromFunction0(getUrl), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataService]
  }
  
  @scala.inline
  implicit class DataServiceMutableBuilder[Self <: DataService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataService(value: typings.breeze.breeze.DataService): Self = StObject.set(x, "dataService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQuery(value: EntityQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
