package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutDataLakeSettingsRequest extends StObject {
  
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
  implicit class PutDataLakeSettingsRequestMutableBuilder[Self <: PutDataLakeSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDataLakeSettings(value: DataLakeSettings): Self = StObject.set(x, "DataLakeSettings", value.asInstanceOf[js.Any])
  }
}
