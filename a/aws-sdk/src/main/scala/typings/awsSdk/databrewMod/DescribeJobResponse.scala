package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobResponse extends js.Object {
  
  /**
    * The date and time that the job was created.
    */
  var CreateDate: js.UndefOr[Date] = js.native
  
  /**
    * The identifier (user name) of the user associated with the creation of the job.
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.databrewMod.CreatedBy] = js.native
  
  /**
    * The dataset that the job acts upon.
    */
  var DatasetName: js.UndefOr[typings.awsSdk.databrewMod.DatasetName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
    */
  var EncryptionKeyArn: js.UndefOr[typings.awsSdk.databrewMod.EncryptionKeyArn] = js.native
  
  /**
    * The encryption mode for the job, which can be one of the following:    SSE-KMS - Server-side encryption with AWS KMS-managed keys.    SSE-S3 - Server-side encryption with keys managed by Amazon S3.  
    */
  var EncryptionMode: js.UndefOr[typings.awsSdk.databrewMod.EncryptionMode] = js.native
  
  /**
    * The identifier (user name) of the user who last modified the job.
    */
  var LastModifiedBy: js.UndefOr[typings.awsSdk.databrewMod.LastModifiedBy] = js.native
  
  /**
    * The date and time that the job was last modified.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.native
  
  /**
    * A value that indicates whether Amazon CloudWatch logging is enabled for this job.
    */
  var LogSubscription: js.UndefOr[typings.awsSdk.databrewMod.LogSubscription] = js.native
  
  /**
    * The maximum number of nodes that AWS Glue DataBrew can consume when the job processes data.
    */
  var MaxCapacity: js.UndefOr[typings.awsSdk.databrewMod.MaxCapacity] = js.native
  
  /**
    * The maximum number of times to retry the job after a job run fails.
    */
  var MaxRetries: js.UndefOr[typings.awsSdk.databrewMod.MaxRetries] = js.native
  
  /**
    * The name of the job.
    */
  var Name: JobName = js.native
  
  /**
    * One or more artifacts that represent the output from running the job.
    */
  var Outputs: js.UndefOr[OutputList] = js.native
  
  /**
    * The DataBrew project associated with this job.
    */
  var ProjectName: js.UndefOr[typings.awsSdk.databrewMod.ProjectName] = js.native
  
  var RecipeReference: js.UndefOr[typings.awsSdk.databrewMod.RecipeReference] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the job.
    */
  var ResourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that was assumed for this request.
    */
  var RoleArn: js.UndefOr[Arn] = js.native
  
  /**
    * Metadata tags associated with this job.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of TIMEOUT.
    */
  var Timeout: js.UndefOr[typings.awsSdk.databrewMod.Timeout] = js.native
  
  /**
    * The job type, which must be one of the following:    PROFILE - The job analyzes the dataset to determine its size, data types, data distribution, and more.    RECIPE - The job applies one or more transformations to a dataset.  
    */
  var Type: js.UndefOr[JobType] = js.native
}
object DescribeJobResponse {
  
  @scala.inline
  def apply(Name: JobName): DescribeJobResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobResponse]
  }
  
  @scala.inline
  implicit class DescribeJobResponseOps[Self <: DescribeJobResponse] (val x: Self) extends AnyVal {
    
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
    def setName(value: JobName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDate(value: Date): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: CreatedBy): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = this.set("DatasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetName: Self = this.set("DatasetName", js.undefined)
    
    @scala.inline
    def setEncryptionKeyArn(value: EncryptionKeyArn): Self = this.set("EncryptionKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKeyArn: Self = this.set("EncryptionKeyArn", js.undefined)
    
    @scala.inline
    def setEncryptionMode(value: EncryptionMode): Self = this.set("EncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionMode: Self = this.set("EncryptionMode", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: LastModifiedBy): Self = this.set("LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    
    @scala.inline
    def setLogSubscription(value: LogSubscription): Self = this.set("LogSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogSubscription: Self = this.set("LogSubscription", js.undefined)
    
    @scala.inline
    def setMaxCapacity(value: MaxCapacity): Self = this.set("MaxCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCapacity: Self = this.set("MaxCapacity", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: MaxRetries): Self = this.set("MaxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("MaxRetries", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = this.set("Outputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: OutputList): Self = this.set("Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("Outputs", js.undefined)
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = this.set("ProjectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectName: Self = this.set("ProjectName", js.undefined)
    
    @scala.inline
    def setRecipeReference(value: RecipeReference): Self = this.set("RecipeReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipeReference: Self = this.set("RecipeReference", js.undefined)
    
    @scala.inline
    def setResourceArn(value: Arn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Arn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTimeout(value: Timeout): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("Timeout", js.undefined)
    
    @scala.inline
    def setType(value: JobType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
