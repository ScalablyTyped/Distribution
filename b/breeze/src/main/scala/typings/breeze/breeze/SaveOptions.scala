package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveOptions extends StObject {
  
  var allowConcurrentSaves: Boolean
  
  var dataService: DataService
  
  var resourceName: String
  
  def setAsDefault(): SaveOptions
  
  var tag: js.Object
  
  def `using`(config: SaveOptionsConfiguration): SaveOptions
}
object SaveOptions {
  
  inline def apply(
    allowConcurrentSaves: Boolean,
    dataService: DataService,
    resourceName: String,
    setAsDefault: () => SaveOptions,
    tag: js.Object,
    `using`: SaveOptionsConfiguration => SaveOptions
  ): SaveOptions = {
    val __obj = js.Dynamic.literal(allowConcurrentSaves = allowConcurrentSaves.asInstanceOf[js.Any], dataService = dataService.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any], setAsDefault = js.Any.fromFunction0(setAsDefault), tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("using")(js.Any.fromFunction1(`using`))
    __obj.asInstanceOf[SaveOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaveOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowConcurrentSaves(value: Boolean): Self = StObject.set(x, "allowConcurrentSaves", value.asInstanceOf[js.Any])
    
    inline def setDataService(value: DataService): Self = StObject.set(x, "dataService", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setSetAsDefault(value: () => SaveOptions): Self = StObject.set(x, "setAsDefault", js.Any.fromFunction0(value))
    
    inline def setTag(value: js.Object): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setUsing(value: SaveOptionsConfiguration => SaveOptions): Self = StObject.set(x, "using", js.Any.fromFunction1(value))
  }
}
