package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDatasetRequest extends StObject {
  
  /**
    * The name of the data set to delete.
    */
  var datasetName: DatasetName
}
object DeleteDatasetRequest {
  
  @scala.inline
  def apply(datasetName: DatasetName): DeleteDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetRequest]
  }
  
  @scala.inline
  implicit class DeleteDatasetRequestMutableBuilder[Self <: DeleteDatasetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
  }
}
