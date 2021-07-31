package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProfileJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
    */
  var EncryptionKeyArn: js.UndefOr[typings.awsSdk.databrewMod.EncryptionKeyArn] = js.undefined
  
  /**
    * The encryption mode for the job, which can be one of the following:    SSE-KMS - Server-side encryption with AWS KMS-managed keys.    SSE-S3 - Server-side encryption with keys managed by Amazon S3.  
    */
  var EncryptionMode: js.UndefOr[typings.awsSdk.databrewMod.EncryptionMode] = js.undefined
  
  /**
    * A value that enables or disables Amazon CloudWatch logging for the current AWS account. If logging is enabled, CloudWatch writes one log stream for each job run.
    */
  var LogSubscription: js.UndefOr[typings.awsSdk.databrewMod.LogSubscription] = js.undefined
  
  /**
    * The maximum number of nodes that DataBrew can use when the job processes data.
    */
  var MaxCapacity: js.UndefOr[typings.awsSdk.databrewMod.MaxCapacity] = js.undefined
  
  /**
    * The maximum number of times to retry the job after a job run fails.
    */
  var MaxRetries: js.UndefOr[typings.awsSdk.databrewMod.MaxRetries] = js.undefined
  
  /**
    * The name of the job to be updated.
    */
  var Name: JobName
  
  var OutputLocation: S3Location
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role to be assumed for this request.
    */
  var RoleArn: Arn
  
  /**
    * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of TIMEOUT.
    */
  var Timeout: js.UndefOr[typings.awsSdk.databrewMod.Timeout] = js.undefined
}
object UpdateProfileJobRequest {
  
  @scala.inline
  def apply(Name: JobName, OutputLocation: S3Location, RoleArn: Arn): UpdateProfileJobRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], OutputLocation = OutputLocation.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProfileJobRequest]
  }
  
  @scala.inline
  implicit class UpdateProfileJobRequestMutableBuilder[Self <: UpdateProfileJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionKeyArn(value: EncryptionKeyArn): Self = StObject.set(x, "EncryptionKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyArnUndefined: Self = StObject.set(x, "EncryptionKeyArn", js.undefined)
    
    @scala.inline
    def setEncryptionMode(value: EncryptionMode): Self = StObject.set(x, "EncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionModeUndefined: Self = StObject.set(x, "EncryptionMode", js.undefined)
    
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
    def setOutputLocation(value: S3Location): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
  }
}
