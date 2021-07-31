package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetImportJobSummary extends StObject {
  
  /**
    * When the dataset import job was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The location of the training data to import and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the data. The training data must be stored in an Amazon S3 bucket. If encryption is used, DataSource includes an AWS Key Management Service (KMS) key.
    */
  var DataSource: js.UndefOr[typings.awsSdk.forecastserviceMod.DataSource] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset import job.
    */
  var DatasetImportJobArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the dataset import job.
    */
  var DatasetImportJobName: js.UndefOr[Name] = js.undefined
  
  /**
    * The last time that the dataset was modified. The time depends on the status of the job, as follows:    CREATE_PENDING - The same time as CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The status of the dataset import job. The status is reflected in the status of the dataset. For example, when the import job status is CREATE_IN_PROGRESS, the status of the dataset is UPDATE_IN_PROGRESS. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED   
    */
  var Status: js.UndefOr[typings.awsSdk.forecastserviceMod.Status] = js.undefined
}
object DatasetImportJobSummary {
  
  @scala.inline
  def apply(): DatasetImportJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetImportJobSummary]
  }
  
  @scala.inline
  implicit class DatasetImportJobSummaryMutableBuilder[Self <: DatasetImportJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
    
    @scala.inline
    def setDatasetImportJobArn(value: Arn): Self = StObject.set(x, "DatasetImportJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetImportJobArnUndefined: Self = StObject.set(x, "DatasetImportJobArn", js.undefined)
    
    @scala.inline
    def setDatasetImportJobName(value: Name): Self = StObject.set(x, "DatasetImportJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetImportJobNameUndefined: Self = StObject.set(x, "DatasetImportJobName", js.undefined)
    
    @scala.inline
    def setLastModificationTime(value: Timestamp): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    @scala.inline
    def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
