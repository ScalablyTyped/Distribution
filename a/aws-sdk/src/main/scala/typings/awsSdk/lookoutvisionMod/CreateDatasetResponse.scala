package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetResponse extends StObject {
  
  /**
    * Information about the dataset.
    */
  var DatasetMetadata: js.UndefOr[typings.awsSdk.lookoutvisionMod.DatasetMetadata] = js.undefined
}
object CreateDatasetResponse {
  
  inline def apply(): CreateDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetResponse]
  }
  
  extension [Self <: CreateDatasetResponse](x: Self) {
    
    inline def setDatasetMetadata(value: DatasetMetadata): Self = StObject.set(x, "DatasetMetadata", value.asInstanceOf[js.Any])
    
    inline def setDatasetMetadataUndefined: Self = StObject.set(x, "DatasetMetadata", js.undefined)
  }
}
