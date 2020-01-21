package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDataLakeSettingsRequest extends js.Object {
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your AWS Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * A list of AWS Lake Formation principals.
    */
  var DataLakeSettings: typings.awsSdk.lakeformationMod.DataLakeSettings = js.native
}

object PutDataLakeSettingsRequest {
  @scala.inline
  def apply(DataLakeSettings: DataLakeSettings, CatalogId: CatalogIdString = null): PutDataLakeSettingsRequest = {
    val __obj = js.Dynamic.literal(DataLakeSettings = DataLakeSettings.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDataLakeSettingsRequest]
  }
}

