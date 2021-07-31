package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobResponse extends StObject {
  
  /**
    * The date and time that the job was created.
    */
  var CreateDate: js.UndefOr[Date] = js.undefined
  
  /**
    * The identifier (user name) of the user associated with the creation of the job.
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.databrewMod.CreatedBy] = js.undefined
  
  /**
    * The dataset that the job acts upon.
    */
  var DatasetName: js.UndefOr[typings.awsSdk.databrewMod.DatasetName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
    */
  var EncryptionKeyArn: js.UndefOr[typings.awsSdk.databrewMod.EncryptionKeyArn] = js.undefined
  
  /**
    * The encryption mode for the job, which can be one of the following:    SSE-KMS - Server-side encryption with AWS KMS-managed keys.    SSE-S3 - Server-side encryption with keys managed by Amazon S3.  
    */
  var EncryptionMode: js.UndefOr[typings.awsSdk.databrewMod.EncryptionMode] = js.undefined
  
  /**
    * The identifier (user name) of the user who last modified the job.
    */
  var LastModifiedBy: js.UndefOr[typings.awsSdk.databrewMod.LastModifiedBy] = js.undefined
  
  /**
    * The date and time that the job was last modified.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.undefined
  
  /**
    * A value that indicates whether Amazon CloudWatch logging is enabled for this job.
    */
  var LogSubscription: js.UndefOr[typings.awsSdk.databrewMod.LogSubscription] = js.undefined
  
  /**
    * The maximum number of nodes that AWS Glue DataBrew can consume when the job processes data.
    */
  var MaxCapacity: js.UndefOr[typings.awsSdk.databrewMod.MaxCapacity] = js.undefined
  
  /**
    * The maximum number of times to retry the job after a job run fails.
    */
  var MaxRetries: js.UndefOr[typings.awsSdk.databrewMod.MaxRetries] = js.undefined
  
  /**
    * The name of the job.
    */
  var Name: JobName
  
  /**
    * One or more artifacts that represent the output from running the job.
    */
  var Outputs: js.UndefOr[OutputList] = js.undefined
  
  /**
    * The DataBrew project associated with this job.
    */
  var ProjectName: js.UndefOr[typings.awsSdk.databrewMod.ProjectName] = js.undefined
  
  var RecipeReference: js.UndefOr[typings.awsSdk.databrewMod.RecipeReference] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the job.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that was assumed for this request.
    */
  var RoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Metadata tags associated with this job.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of TIMEOUT.
    */
  var Timeout: js.UndefOr[typings.awsSdk.databrewMod.Timeout] = js.undefined
  
  /**
    * The job type, which must be one of the following:    PROFILE - The job analyzes the dataset to determine its size, data types, data distribution, and more.    RECIPE - The job applies one or more transformations to a dataset.  
    */
  var Type: js.UndefOr[JobType] = js.undefined
}
object DescribeJobResponse {
  
  @scala.inline
  def apply(Name: JobName): DescribeJobResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobResponse]
  }
  
  @scala.inline
  implicit class DescribeJobResponseMutableBuilder[Self <: DescribeJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDate(value: Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    @scala.inline
    def setEncryptionKeyArn(value: EncryptionKeyArn): Self = StObject.set(x, "EncryptionKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyArnUndefined: Self = StObject.set(x, "EncryptionKeyArn", js.undefined)
    
    @scala.inline
    def setEncryptionMode(value: EncryptionMode): Self = StObject.set(x, "EncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionModeUndefined: Self = StObject.set(x, "EncryptionMode", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: LastModifiedBy): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setLogSubscription(value: LogSubscription): Self = StObject.set(x, "LogSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogSubscriptionUndefined: Self = StObject.set(x, "LogSubscription", js.undefined)
    
    @scala.inline
    def setMaxCapacity(value: MaxCapacity): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: MaxRetries): Self = StObject.set(x, "MaxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "MaxRetries", js.undefined)
    
    @scala.inline
    def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputs(value: OutputList): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = StObject.set(x, "Outputs", js.Array(value :_*))
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNameUndefined: Self = StObject.set(x, "ProjectName", js.undefined)
    
    @scala.inline
    def setRecipeReference(value: RecipeReference): Self = StObject.set(x, "RecipeReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeReferenceUndefined: Self = StObject.set(x, "RecipeReference", js.undefined)
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    @scala.inline
    def setType(value: JobType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
