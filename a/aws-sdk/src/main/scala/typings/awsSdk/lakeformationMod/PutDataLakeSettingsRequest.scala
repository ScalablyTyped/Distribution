package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutDataLakeSettingsRequest extends js.Object {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your AWS Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * A structure representing a list of AWS Lake Formation principals designated as data lake administrators.
    */
  var DataLakeSettings: typings.awsSdk.lakeformationMod.DataLakeSettings = js.native
}
object PutDataLakeSettingsRequest {
  
  @scala.inline
  def apply(DataLakeSettings: DataLakeSettings): PutDataLakeSettingsRequest = {
    val __obj = js.Dynamic.literal(DataLakeSettings = DataLakeSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDataLakeSettingsRequest]
  }
  
  @scala.inline
  implicit class PutDataLakeSettingsRequestOps[Self <: PutDataLakeSettingsRequest] (val x: Self) extends AnyVal {
    
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
    def setDataLakeSettings(value: DataLakeSettings): Self = this.set("DataLakeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
}
