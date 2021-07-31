package typings.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowConcurrentSaves extends StObject {
  
  var allowConcurrentSaves: js.UndefOr[Boolean] = js.undefined
  
  var dataService: js.UndefOr[typings.breeze.breeze.DataService] = js.undefined
  
  var resourceName: js.UndefOr[String] = js.undefined
  
  var tag: js.UndefOr[js.Any] = js.undefined
}
object AllowConcurrentSaves {
  
  @scala.inline
  def apply(): AllowConcurrentSaves = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowConcurrentSaves]
  }
  
  @scala.inline
  implicit class AllowConcurrentSavesMutableBuilder[Self <: AllowConcurrentSaves] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowConcurrentSaves(value: Boolean): Self = StObject.set(x, "allowConcurrentSaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowConcurrentSavesUndefined: Self = StObject.set(x, "allowConcurrentSaves", js.undefined)
    
    @scala.inline
    def setDataService(value: typings.breeze.breeze.DataService): Self = StObject.set(x, "dataService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataServiceUndefined: Self = StObject.set(x, "dataService", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setTag(value: js.Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
