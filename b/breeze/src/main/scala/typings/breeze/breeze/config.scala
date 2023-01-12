package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config {
  
  trait AdapterInstancesConfig extends StObject {
    
    /** the name of a previously registered "ajax" adapter */
    var ajax: js.UndefOr[String] = js.undefined
    
    /** the name of a previously registered "dataService" adapter */
    var dataService: js.UndefOr[String] = js.undefined
    
    /** the name of a previously registered "modelLibrary" adapter */
    var modelLibrary: js.UndefOr[String] = js.undefined
    
    /** the name of a previously registered "uriBuilder" adapter */
    var uriBuilder: js.UndefOr[String] = js.undefined
  }
  object AdapterInstancesConfig {
    
    inline def apply(): AdapterInstancesConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdapterInstancesConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdapterInstancesConfig] (val x: Self) extends AnyVal {
      
      inline def setAjax(value: String): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
      
      inline def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
      
      inline def setDataService(value: String): Self = StObject.set(x, "dataService", value.asInstanceOf[js.Any])
      
      inline def setDataServiceUndefined: Self = StObject.set(x, "dataService", js.undefined)
      
      inline def setModelLibrary(value: String): Self = StObject.set(x, "modelLibrary", value.asInstanceOf[js.Any])
      
      inline def setModelLibraryUndefined: Self = StObject.set(x, "modelLibrary", js.undefined)
      
      inline def setUriBuilder(value: String): Self = StObject.set(x, "uriBuilder", value.asInstanceOf[js.Any])
      
      inline def setUriBuilderUndefined: Self = StObject.set(x, "uriBuilder", js.undefined)
    }
  }
}
