package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSystemInstanceRequest extends StObject {
  
  /**
    * The ID of the system instance to be deleted.
    */
  var id: js.UndefOr[Urn] = js.undefined
}
object DeleteSystemInstanceRequest {
  
  inline def apply(): DeleteSystemInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSystemInstanceRequest]
  }
  
  extension [Self <: DeleteSystemInstanceRequest](x: Self) {
    
    inline def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
