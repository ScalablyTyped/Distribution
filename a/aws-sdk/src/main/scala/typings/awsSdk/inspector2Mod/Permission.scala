package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permission extends StObject {
  
  /**
    * The operations that can be performed with the given permissions.
    */
  var operation: Operation
  
  /**
    * The services that the permissions allow an account to perform the given operations for.
    */
  var service: Service
}
object Permission {
  
  inline def apply(operation: Operation, service: Service): Permission = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
  
  extension [Self <: Permission](x: Self) {
    
    inline def setOperation(value: Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
