package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetImportJob extends js.Object {
  
  /**
    * The creation date and time (in Unix time) of the dataset import job.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The Amazon S3 bucket that contains the training data to import.
    */
  var dataSource: js.UndefOr[DataSource] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the dataset that receives the imported data.
    */
  var datasetArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ARN of the dataset import job.
    */
  var datasetImportJobArn: js.UndefOr[Arn] = js.native
  
  /**
    * If a dataset import job fails, provides the reason why.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  
  /**
    * The name of the import job.
    */
  var jobName: js.UndefOr[Name] = js.native
  
  /**
    * The date and time (in Unix time) the dataset was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that has permissions to read from the Amazon S3 data source.
    */
  var roleArn: js.UndefOr[Arn] = js.native
  
  /**
    * The status of the dataset import job. A dataset import job can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.native
}
object DatasetImportJob {
  
  @scala.inline
  def apply(): DatasetImportJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetImportJob]
  }
  
  @scala.inline
  implicit class DatasetImportJobOps[Self <: DatasetImportJob] (val x: Self) extends AnyVal {
    
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
    def setCreationDateTime(value: Date): Self = this.set("creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDateTime: Self = this.set("creationDateTime", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDatasetArn(value: Arn): Self = this.set("datasetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetArn: Self = this.set("datasetArn", js.undefined)
    
    @scala.inline
    def setDatasetImportJobArn(value: Arn): Self = this.set("datasetImportJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetImportJobArn: Self = this.set("datasetImportJobArn", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    
    @scala.inline
    def setJobName(value: Name): Self = this.set("jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobName: Self = this.set("jobName", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: Date): Self = this.set("lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Arn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
