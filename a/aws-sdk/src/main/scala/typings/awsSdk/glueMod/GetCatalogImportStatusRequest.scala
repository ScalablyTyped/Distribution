package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCatalogImportStatusRequest extends StObject {
  
  /**
    * The ID of the catalog to migrate. Currently, this should be the AWS account ID.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
}
object GetCatalogImportStatusRequest {
  
  @scala.inline
  def apply(): GetCatalogImportStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCatalogImportStatusRequest]
  }
  
  @scala.inline
  implicit class GetCatalogImportStatusRequestMutableBuilder[Self <: GetCatalogImportStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
  }
}
