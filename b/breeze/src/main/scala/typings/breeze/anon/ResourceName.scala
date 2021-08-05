package typings.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceName extends StObject {
  
  var dataService: typings.breeze.breeze.DataService
  
  var resourceName: String
}
object ResourceName {
  
  inline def apply(dataService: typings.breeze.breeze.DataService, resourceName: String): ResourceName = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceName]
  }
  
  extension [Self <: ResourceName](x: Self) {
    
    inline def setDataService(value: typings.breeze.breeze.DataService): Self = StObject.set(x, "dataService", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
  }
}
