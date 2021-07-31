package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatasetContentRequest extends StObject {
  
  /**
    * The name of the data set whose contents are retrieved.
    */
  var datasetName: DatasetName
  
  /**
    * The version of the data set whose contents are retrieved. You can also use the strings "$LATEST" or "$LATEST_SUCCEEDED" to retrieve the contents of the latest or latest successfully completed data set. If not specified, "$LATEST_SUCCEEDED" is the default.
    */
  var versionId: js.UndefOr[DatasetContentVersion] = js.undefined
}
object GetDatasetContentRequest {
  
  @scala.inline
  def apply(datasetName: DatasetName): GetDatasetContentRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatasetContentRequest]
  }
  
  @scala.inline
  implicit class GetDatasetContentRequestMutableBuilder[Self <: GetDatasetContentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: DatasetContentVersion): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
