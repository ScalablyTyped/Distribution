package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImportRequest extends StObject {
  
  /**
    * The unique identifier of the import to delete.
    */
  var importId: Id
}
object DeleteImportRequest {
  
  inline def apply(importId: Id): DeleteImportRequest = {
    val __obj = js.Dynamic.literal(importId = importId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImportRequest]
  }
  
  extension [Self <: DeleteImportRequest](x: Self) {
    
    inline def setImportId(value: Id): Self = StObject.set(x, "importId", value.asInstanceOf[js.Any])
  }
}
