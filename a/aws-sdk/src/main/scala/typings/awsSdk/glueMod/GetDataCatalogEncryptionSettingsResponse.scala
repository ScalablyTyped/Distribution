package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataCatalogEncryptionSettingsResponse extends StObject {
  
  /**
    * The requested security configuration.
    */
  var DataCatalogEncryptionSettings: js.UndefOr[typings.awsSdk.glueMod.DataCatalogEncryptionSettings] = js.native
}
object GetDataCatalogEncryptionSettingsResponse {
  
  @scala.inline
  def apply(): GetDataCatalogEncryptionSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataCatalogEncryptionSettingsResponse]
  }
  
  @scala.inline
  implicit class GetDataCatalogEncryptionSettingsResponseMutableBuilder[Self <: GetDataCatalogEncryptionSettingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataCatalogEncryptionSettings(value: DataCatalogEncryptionSettings): Self = StObject.set(x, "DataCatalogEncryptionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCatalogEncryptionSettingsUndefined: Self = StObject.set(x, "DataCatalogEncryptionSettings", js.undefined)
  }
}
