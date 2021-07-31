package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDatasetResponse extends StObject {
  
  /**
    * A collection of data for an identity pool. An identity pool can have multiple datasets. A dataset is per identity and can be general or associated with a particular entity in an application (like a saved game). Datasets are automatically created if they don't exist. Data is synced by dataset, and a dataset can hold up to 1MB of key-value pairs.
    */
  var Dataset: js.UndefOr[typings.awsSdk.cognitosyncMod.Dataset] = js.undefined
}
object DeleteDatasetResponse {
  
  @scala.inline
  def apply(): DeleteDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDatasetResponse]
  }
  
  @scala.inline
  implicit class DeleteDatasetResponseMutableBuilder[Self <: DeleteDatasetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: Dataset): Self = StObject.set(x, "Dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "Dataset", js.undefined)
  }
}
