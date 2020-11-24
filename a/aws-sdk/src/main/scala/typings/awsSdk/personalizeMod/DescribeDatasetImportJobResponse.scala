package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDatasetImportJobResponse extends js.Object {
  
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
  implicit class DescribeDatasetImportJobResponseOps[Self <: DescribeDatasetImportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatasetImportJob(value: DatasetImportJob): Self = this.set("datasetImportJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetImportJob: Self = this.set("datasetImportJob", js.undefined)
  }
}
