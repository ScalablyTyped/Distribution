package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExportRequest extends StObject {
  
  /**
    * The unique identifier Amazon Lex assigned to the export.
    */
  var exportId: Id
  
  /**
    * The new password to use to encrypt the export zip archive.
    */
  var filePassword: js.UndefOr[ImportExportFilePassword] = js.undefined
}
object UpdateExportRequest {
  
  inline def apply(exportId: Id): UpdateExportRequest = {
    val __obj = js.Dynamic.literal(exportId = exportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExportRequest]
  }
  
  extension [Self <: UpdateExportRequest](x: Self) {
    
    inline def setExportId(value: Id): Self = StObject.set(x, "exportId", value.asInstanceOf[js.Any])
    
    inline def setFilePassword(value: ImportExportFilePassword): Self = StObject.set(x, "filePassword", value.asInstanceOf[js.Any])
    
    inline def setFilePasswordUndefined: Self = StObject.set(x, "filePassword", js.undefined)
  }
}
