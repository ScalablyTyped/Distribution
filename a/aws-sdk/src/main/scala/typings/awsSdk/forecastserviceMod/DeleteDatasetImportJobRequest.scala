package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDatasetImportJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset import job to delete.
    */
  var DatasetImportJobArn: Arn
}
object DeleteDatasetImportJobRequest {
  
  @scala.inline
  def apply(DatasetImportJobArn: Arn): DeleteDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(DatasetImportJobArn = DatasetImportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetImportJobRequest]
  }
  
  @scala.inline
  implicit class DeleteDatasetImportJobRequestMutableBuilder[Self <: DeleteDatasetImportJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetImportJobArn(value: Arn): Self = StObject.set(x, "DatasetImportJobArn", value.asInstanceOf[js.Any])
  }
}
