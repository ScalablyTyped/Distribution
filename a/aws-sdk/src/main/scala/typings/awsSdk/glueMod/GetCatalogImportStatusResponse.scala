package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCatalogImportStatusResponse extends StObject {
  
  /**
    * The status of the specified catalog migration.
    */
  var ImportStatus: js.UndefOr[CatalogImportStatus] = js.undefined
}
object GetCatalogImportStatusResponse {
  
  @scala.inline
  def apply(): GetCatalogImportStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCatalogImportStatusResponse]
  }
  
  @scala.inline
  implicit class GetCatalogImportStatusResponseMutableBuilder[Self <: GetCatalogImportStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportStatus(value: CatalogImportStatus): Self = StObject.set(x, "ImportStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportStatusUndefined: Self = StObject.set(x, "ImportStatus", js.undefined)
  }
}
