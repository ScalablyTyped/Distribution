package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveOptionsConfiguration extends StObject {
  
  var allowConcurrentSaves: js.UndefOr[Boolean] = js.native
  
  var dataService: js.UndefOr[DataService] = js.native
  
  var resourceName: js.UndefOr[String] = js.native
  
  var tag: js.UndefOr[js.Object] = js.native
}
object SaveOptionsConfiguration {
  
  @scala.inline
  def apply(): SaveOptionsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptionsConfiguration]
  }
  
  @scala.inline
  implicit class SaveOptionsConfigurationMutableBuilder[Self <: SaveOptionsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowConcurrentSaves(value: Boolean): Self = StObject.set(x, "allowConcurrentSaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowConcurrentSavesUndefined: Self = StObject.set(x, "allowConcurrentSaves", js.undefined)
    
    @scala.inline
    def setDataService(value: DataService): Self = StObject.set(x, "dataService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataServiceUndefined: Self = StObject.set(x, "dataService", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setTag(value: js.Object): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
