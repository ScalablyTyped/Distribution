package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSignalCatalogRequest extends StObject {
  
  /**
    *  The name of the signal catalog to delete. 
    */
  var name: resourceName
}
object DeleteSignalCatalogRequest {
  
  inline def apply(name: resourceName): DeleteSignalCatalogRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSignalCatalogRequest]
  }
  
  extension [Self <: DeleteSignalCatalogRequest](x: Self) {
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
