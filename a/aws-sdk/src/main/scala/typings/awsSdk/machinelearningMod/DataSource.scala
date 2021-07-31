package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  /**
    *  The parameter is true if statistics need to be generated from the observation data. 
    */
  var ComputeStatistics: js.UndefOr[typings.awsSdk.machinelearningMod.ComputeStatistics] = js.undefined
  
  var ComputeTime: js.UndefOr[LongType] = js.undefined
  
  /**
    * The time that the DataSource was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[EpochTime] = js.undefined
  
  /**
    * The AWS user account from which the DataSource was created. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined
  
  /**
    * The location and name of the data in Amazon Simple Storage Service (Amazon S3) that is used by a DataSource.
    */
  var DataLocationS3: js.UndefOr[S3Url] = js.undefined
  
  /**
    * A JSON string that represents the splitting and rearrangement requirement used when this DataSource was created.
    */
  var DataRearrangement: js.UndefOr[typings.awsSdk.machinelearningMod.DataRearrangement] = js.undefined
  
  /**
    * The total number of observations contained in the data files that the DataSource references.
    */
  var DataSizeInBytes: js.UndefOr[LongType] = js.undefined
  
  /**
    * The ID that is assigned to the DataSource during creation.
    */
  var DataSourceId: js.UndefOr[EntityId] = js.undefined
  
  var FinishedAt: js.UndefOr[EpochTime] = js.undefined
  
  /**
    * The time of the most recent edit to the BatchPrediction. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined
  
  /**
    * A description of the most recent details about creating the DataSource.
    */
  var Message: js.UndefOr[typings.awsSdk.machinelearningMod.Message] = js.undefined
  
  /**
    * A user-supplied name or description of the DataSource.
    */
  var Name: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The number of data files referenced by the DataSource.
    */
  var NumberOfFiles: js.UndefOr[LongType] = js.undefined
  
  var RDSMetadata: js.UndefOr[typings.awsSdk.machinelearningMod.RDSMetadata] = js.undefined
  
  var RedshiftMetadata: js.UndefOr[typings.awsSdk.machinelearningMod.RedshiftMetadata] = js.undefined
  
  var RoleARN: js.UndefOr[typings.awsSdk.machinelearningMod.RoleARN] = js.undefined
  
  var StartedAt: js.UndefOr[EpochTime] = js.undefined
  
  /**
    * The current status of the DataSource. This element can have one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a DataSource. INPROGRESS - The creation process is underway. FAILED - The request to create a DataSource did not run to completion. It is not usable. COMPLETED - The creation process completed successfully. DELETED - The DataSource is marked as deleted. It is not usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.undefined
}
object DataSource {
  
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeStatistics(value: ComputeStatistics): Self = StObject.set(x, "ComputeStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeStatisticsUndefined: Self = StObject.set(x, "ComputeStatistics", js.undefined)
    
    @scala.inline
    def setComputeTime(value: LongType): Self = StObject.set(x, "ComputeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeTimeUndefined: Self = StObject.set(x, "ComputeTime", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: EpochTime): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setCreatedByIamUser(value: AwsUserArn): Self = StObject.set(x, "CreatedByIamUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByIamUserUndefined: Self = StObject.set(x, "CreatedByIamUser", js.undefined)
    
    @scala.inline
    def setDataLocationS3(value: S3Url): Self = StObject.set(x, "DataLocationS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLocationS3Undefined: Self = StObject.set(x, "DataLocationS3", js.undefined)
    
    @scala.inline
    def setDataRearrangement(value: DataRearrangement): Self = StObject.set(x, "DataRearrangement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRearrangementUndefined: Self = StObject.set(x, "DataRearrangement", js.undefined)
    
    @scala.inline
    def setDataSizeInBytes(value: LongType): Self = StObject.set(x, "DataSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSizeInBytesUndefined: Self = StObject.set(x, "DataSizeInBytes", js.undefined)
    
    @scala.inline
    def setDataSourceId(value: EntityId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceIdUndefined: Self = StObject.set(x, "DataSourceId", js.undefined)
    
    @scala.inline
    def setFinishedAt(value: EpochTime): Self = StObject.set(x, "FinishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedAtUndefined: Self = StObject.set(x, "FinishedAt", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: EpochTime): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNumberOfFiles(value: LongType): Self = StObject.set(x, "NumberOfFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfFilesUndefined: Self = StObject.set(x, "NumberOfFiles", js.undefined)
    
    @scala.inline
    def setRDSMetadata(value: RDSMetadata): Self = StObject.set(x, "RDSMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRDSMetadataUndefined: Self = StObject.set(x, "RDSMetadata", js.undefined)
    
    @scala.inline
    def setRedshiftMetadata(value: RedshiftMetadata): Self = StObject.set(x, "RedshiftMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftMetadataUndefined: Self = StObject.set(x, "RedshiftMetadata", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    @scala.inline
    def setStartedAt(value: EpochTime): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAtUndefined: Self = StObject.set(x, "StartedAt", js.undefined)
    
    @scala.inline
    def setStatus(value: EntityStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
