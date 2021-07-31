package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetImportJobResponse extends StObject {
  
  /**
    * The ARN of the dataset import job.
    */
  var datasetImportJobArn: js.UndefOr[Arn] = js.undefined
}
object CreateDatasetImportJobResponse {
  
  @scala.inline
  def apply(): CreateDatasetImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetImportJobResponse]
  }
  
  @scala.inline
  implicit class CreateDatasetImportJobResponseMutableBuilder[Self <: CreateDatasetImportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetImportJobArn(value: Arn): Self = StObject.set(x, "datasetImportJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetImportJobArnUndefined: Self = StObject.set(x, "datasetImportJobArn", js.undefined)
  }
}
