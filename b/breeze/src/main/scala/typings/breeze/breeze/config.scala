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
    var modelLibary: js.UndefOr[String] = js.undefined
    
    /** the name of a previously registered "uriBuilder" adapter */
    var uriBuilder: js.UndefOr[String] = js.undefined
  }
  object AdapterInstancesConfig {
    
    inline def apply(): AdapterInstancesConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdapterInstancesConfig]
    }
    
    extension [Self <: AdapterInstancesConfig](x: Self) {
      
      inline def setAjax(value: String): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
      
      inline def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
      
      inline def setDataService(value: String): Self = StObject.set(x, "dataService", value.asInstanceOf[js.Any])
      
      inline def setDataServiceUndefined: Self = StObject.set(x, "dataService", js.undefined)
      
      inline def setModelLibary(value: String): Self = StObject.set(x, "modelLibary", value.asInstanceOf[js.Any])
      
      inline def setModelLibaryUndefined: Self = StObject.set(x, "modelLibary", js.undefined)
      
      inline def setUriBuilder(value: String): Self = StObject.set(x, "uriBuilder", value.asInstanceOf[js.Any])
      
      inline def setUriBuilderUndefined: Self = StObject.set(x, "uriBuilder", js.undefined)
    }
  }
}
