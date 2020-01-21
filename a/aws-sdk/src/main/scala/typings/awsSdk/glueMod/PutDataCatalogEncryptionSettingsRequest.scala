package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(DataCatalogEncryptionSettings: DataCatalogEncryptionSettings, CatalogId: CatalogIdString = null): PutDataCatalogEncryptionSettingsRequest = {
    val __obj = js.Dynamic.literal(DataCatalogEncryptionSettings = DataCatalogEncryptionSettings.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDataCatalogEncryptionSettingsRequest]
  }
}

