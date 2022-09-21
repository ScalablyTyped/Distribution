package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDataLakeSettingsRequest extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * A structure representing a list of Lake Formation principals designated as data lake administrators.
    */
  var DataLakeSettings: typings.awsSdk.lakeformationMod.DataLakeSettings
}
object PutDataLakeSettingsRequest {
  
  inline def apply(DataLakeSettings: DataLakeSettings): PutDataLakeSettingsRequest = {
    val __obj = js.Dynamic.literal(DataLakeSettings = DataLakeSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDataLakeSettingsRequest]
  }
  
  extension [Self <: PutDataLakeSettingsRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDataLakeSettings(value: DataLakeSettings): Self = StObject.set(x, "DataLakeSettings", value.asInstanceOf[js.Any])
  }
}
