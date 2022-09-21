package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatasetEntriesRequest extends StObject {
  
  /**
    * The entries to add to the dataset.
    */
  var Changes: DatasetChanges
  
  /**
    * ClientToken is an idempotency token that ensures a call to UpdateDatasetEntries completes only once. You choose the value to pass. For example, An issue might prevent you from getting a response from UpdateDatasetEntries. In this case, safely retry your call to UpdateDatasetEntries by using the same ClientToken parameter value. If you don't supply a value for ClientToken, the AWS SDK you are using inserts a value for you. This prevents retries after a network error from making multiple updates with the same dataset entries. You'll need to provide your own value for other use cases.  An error occurs if the other input parameters are not the same as in the first request. Using a different value for ClientToken is considered a new call to UpdateDatasetEntries. An idempotency token is active for 8 hours. 
    */
  var ClientToken: js.UndefOr[typings.awsSdk.lookoutvisionMod.ClientToken] = js.undefined
  
  /**
    * The type of the dataset that you want to update. Specify train to update the training dataset. Specify test to update the test dataset. If you have a single dataset project, specify train.
    */
  var DatasetType: typings.awsSdk.lookoutvisionMod.DatasetType
  
  /**
    * The name of the project that contains the dataset that you want to update.
    */
  var ProjectName: typings.awsSdk.lookoutvisionMod.ProjectName
}
object UpdateDatasetEntriesRequest {
  
  inline def apply(Changes: DatasetChanges, DatasetType: DatasetType, ProjectName: ProjectName): UpdateDatasetEntriesRequest = {
    val __obj = js.Dynamic.literal(Changes = Changes.asInstanceOf[js.Any], DatasetType = DatasetType.asInstanceOf[js.Any], ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatasetEntriesRequest]
  }
  
  extension [Self <: UpdateDatasetEntriesRequest](x: Self) {
    
    inline def setChanges(value: DatasetChanges): Self = StObject.set(x, "Changes", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDatasetType(value: DatasetType): Self = StObject.set(x, "DatasetType", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
  }
}
