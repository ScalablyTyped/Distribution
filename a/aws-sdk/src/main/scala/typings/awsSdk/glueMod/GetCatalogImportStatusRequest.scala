package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCatalogImportStatusRequest extends StObject {
  
  /**
    * The ID of the catalog to migrate. Currently, this should be the Amazon Web Services account ID.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
}
object GetCatalogImportStatusRequest {
  
  inline def apply(): GetCatalogImportStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCatalogImportStatusRequest]
  }
  
  extension [Self <: GetCatalogImportStatusRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
  }
}
