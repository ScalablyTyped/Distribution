package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetImportJobResponse extends StObject {
  
  /**
    * When the dataset import job was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The size of the dataset in gigabytes (GB) after the import job has finished.
    */
  var DataSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The location of the training data to import and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the data. If encryption is used, DataSource includes an AWS Key Management Service (KMS) key.
    */
  var DataSource: js.UndefOr[typings.awsSdk.forecastserviceMod.DataSource] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset that the training data was imported to.
    */
  var DatasetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the dataset import job.
    */
  var DatasetImportJobArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the dataset import job.
    */
  var DatasetImportJobName: js.UndefOr[Name] = js.undefined
  
  /**
    * Statistical information about each field in the input data.
    */
  var FieldStatistics: js.UndefOr[typings.awsSdk.forecastserviceMod.FieldStatistics] = js.undefined
  
  /**
    * The last time that the dataset was modified. The time depends on the status of the job, as follows:    CREATE_PENDING - The same time as CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[typings.awsSdk.forecastserviceMod.Message] = js.undefined
  
  /**
    * The status of the dataset import job. The status is reflected in the status of the dataset. For example, when the import job status is CREATE_IN_PROGRESS, the status of the dataset is UPDATE_IN_PROGRESS. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED   
    */
  var Status: js.UndefOr[typings.awsSdk.forecastserviceMod.Status] = js.undefined
  
  /**
    * The format of timestamps in the dataset. The format that you specify depends on the DataFrequency specified when the dataset was created. The following formats are supported   "yyyy-MM-dd" For the following data frequencies: Y, M, W, and D   "yyyy-MM-dd HH:mm:ss" For the following data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D  
    */
  var TimestampFormat: js.UndefOr[typings.awsSdk.forecastserviceMod.TimestampFormat] = js.undefined
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
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDataSize(value: Double): Self = StObject.set(x, "DataSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSizeUndefined: Self = StObject.set(x, "DataSize", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
    
    @scala.inline
    def setDatasetArn(value: Arn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
    
    @scala.inline
    def setDatasetImportJobArn(value: Arn): Self = StObject.set(x, "DatasetImportJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetImportJobArnUndefined: Self = StObject.set(x, "DatasetImportJobArn", js.undefined)
    
    @scala.inline
    def setDatasetImportJobName(value: Name): Self = StObject.set(x, "DatasetImportJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetImportJobNameUndefined: Self = StObject.set(x, "DatasetImportJobName", js.undefined)
    
    @scala.inline
    def setFieldStatistics(value: FieldStatistics): Self = StObject.set(x, "FieldStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldStatisticsUndefined: Self = StObject.set(x, "FieldStatistics", js.undefined)
    
    @scala.inline
    def setLastModificationTime(value: Timestamp): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTimestampFormat(value: TimestampFormat): Self = StObject.set(x, "TimestampFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampFormatUndefined: Self = StObject.set(x, "TimestampFormat", js.undefined)
  }
}
