package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImportResponse extends StObject {
  
  /**
    * The unique identifier of the deleted import.
    */
  var importId: js.UndefOr[Id] = js.undefined
  
  /**
    * The current status of the deletion. When the deletion is complete, the import will no longer be returned by the ListImports operation and calls to the DescribeImport operation with the import identifier will fail.
    */
  var importStatus: js.UndefOr[ImportStatus] = js.undefined
}
object DeleteImportResponse {
  
  inline def apply(): DeleteImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteImportResponse]
  }
  
  extension [Self <: DeleteImportResponse](x: Self) {
    
    inline def setImportId(value: Id): Self = StObject.set(x, "importId", value.asInstanceOf[js.Any])
    
    inline def setImportIdUndefined: Self = StObject.set(x, "importId", js.undefined)
    
    inline def setImportStatus(value: ImportStatus): Self = StObject.set(x, "importStatus", value.asInstanceOf[js.Any])
    
    inline def setImportStatusUndefined: Self = StObject.set(x, "importStatus", js.undefined)
  }
}
