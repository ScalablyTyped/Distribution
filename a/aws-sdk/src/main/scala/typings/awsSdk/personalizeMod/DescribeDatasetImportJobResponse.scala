package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDatasetImportJobResponse extends StObject {
  
  /**
    * Information about the dataset import job, including the status. The status is one of the following values:   CREATE PENDING   CREATE IN_PROGRESS   ACTIVE   CREATE FAILED  
    */
  var datasetImportJob: js.UndefOr[DatasetImportJob] = js.native
}
object DescribeDatasetImportJobResponse {
  
  @scala.inline
  def apply(): DescribeDatasetImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetImportJobResponse]
  }
  
  @scala.inline
  implicit class DescribeDatasetImportJobResponseMutableBuilder[Self <: DescribeDatasetImportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetImportJob(value: DatasetImportJob): Self = StObject.set(x, "datasetImportJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetImportJobUndefined: Self = StObject.set(x, "datasetImportJob", js.undefined)
  }
}
