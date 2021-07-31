package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataCatalogEncryptionSettingsRequest extends StObject {
  
  /**
    * The ID of the Data Catalog to retrieve the security configuration for. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
}
object GetDataCatalogEncryptionSettingsRequest {
  
  @scala.inline
  def apply(): GetDataCatalogEncryptionSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataCatalogEncryptionSettingsRequest]
  }
  
  @scala.inline
  implicit class GetDataCatalogEncryptionSettingsRequestMutableBuilder[Self <: GetDataCatalogEncryptionSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
  }
}
