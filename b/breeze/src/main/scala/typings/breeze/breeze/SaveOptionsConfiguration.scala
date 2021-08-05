package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveOptionsConfiguration extends StObject {
  
  var allowConcurrentSaves: js.UndefOr[Boolean] = js.undefined
  
  var dataService: js.UndefOr[DataService] = js.undefined
  
  var resourceName: js.UndefOr[String] = js.undefined
  
  var tag: js.UndefOr[js.Object] = js.undefined
}
object SaveOptionsConfiguration {
  
  inline def apply(): SaveOptionsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptionsConfiguration]
  }
  
  extension [Self <: SaveOptionsConfiguration](x: Self) {
    
    inline def setAllowConcurrentSaves(value: Boolean): Self = StObject.set(x, "allowConcurrentSaves", value.asInstanceOf[js.Any])
    
    inline def setAllowConcurrentSavesUndefined: Self = StObject.set(x, "allowConcurrentSaves", js.undefined)
    
    inline def setDataService(value: DataService): Self = StObject.set(x, "dataService", value.asInstanceOf[js.Any])
    
    inline def setDataServiceUndefined: Self = StObject.set(x, "dataService", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setTag(value: js.Object): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
