package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutDataCatalogEncryptionSettingsRequest extends js.Object {
  
  /**
    * The ID of the Data Catalog to set the security configuration for. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The security configuration to set.
    */
  var DataCatalogEncryptionSettings: typings.awsSdk.glueMod.DataCatalogEncryptionSettings = js.native
}
object PutDataCatalogEncryptionSettingsRequest {
  
  @scala.inline
  def apply(DataCatalogEncryptionSettings: DataCatalogEncryptionSettings): PutDataCatalogEncryptionSettingsRequest = {
    val __obj = js.Dynamic.literal(DataCatalogEncryptionSettings = DataCatalogEncryptionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDataCatalogEncryptionSettingsRequest]
  }
  
  @scala.inline
  implicit class PutDataCatalogEncryptionSettingsRequestOps[Self <: PutDataCatalogEncryptionSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataCatalogEncryptionSettings(value: DataCatalogEncryptionSettings): Self = this.set("DataCatalogEncryptionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
}
