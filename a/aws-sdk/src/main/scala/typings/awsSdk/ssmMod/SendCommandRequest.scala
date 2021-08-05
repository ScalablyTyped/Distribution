package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendCommandRequest extends StObject {
  
  /**
    * Enables Systems Manager to send Run Command output to Amazon CloudWatch Logs. 
    */
  var CloudWatchOutputConfig: js.UndefOr[typings.awsSdk.ssmMod.CloudWatchOutputConfig] = js.undefined
  
  /**
    * User-specified information about the command, such as a brief description of what the command should do.
    */
  var Comment: js.UndefOr[typings.awsSdk.ssmMod.Comment] = js.undefined
  
  /**
    * The Sha256 or Sha1 hash created by the system when the document was created.   Sha1 hashes have been deprecated. 
    */
  var DocumentHash: js.UndefOr[typings.awsSdk.ssmMod.DocumentHash] = js.undefined
  
  /**
    * Sha256 or Sha1.  Sha1 hashes have been deprecated. 
    */
  var DocumentHashType: js.UndefOr[typings.awsSdk.ssmMod.DocumentHashType] = js.undefined
  
  /**
    * Required. The name of the Systems Manager document to run. This can be a public document or a custom document.
    */
  var DocumentName: DocumentARN
  
  /**
    * The SSM document version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version number. If you run commands by using the AWS CLI, then you must escape the first two options by using a backslash. If you specify a version number, then you don't need to use the backslash. For example: --document-version "\$DEFAULT" --document-version "\$LATEST" --document-version "3"
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.undefined
  
  /**
    * The IDs of the instances where the command should run. Specifying instance IDs is most useful when you are targeting a limited number of instances, though you can specify up to 50 IDs. To target a larger number of instances, or if you prefer not to list individual instance IDs, we recommend using the Targets option instead. Using Targets, which accepts tag key-value pairs to identify the instances to send commands to, you can a send command to tens, hundreds, or thousands of instances at once. For more information about how to use targets, see Using targets and rate controls to send commands to a fleet in the AWS Systems Manager User Guide.
    */
  var InstanceIds: js.UndefOr[InstanceIdList] = js.undefined
  
  /**
    * (Optional) The maximum number of instances that are allowed to run the command at the same time. You can specify a number such as 10 or a percentage such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see Using concurrency controls in the AWS Systems Manager User Guide.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.undefined
  
  /**
    * The maximum number of errors allowed without the command failing. When the command fails one more time beyond the value of MaxErrors, the systems stops sending the command to additional targets. You can specify a number like 10 or a percentage like 10%. The default value is 0. For more information about how to use MaxErrors, see Using error controls in the AWS Systems Manager User Guide.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.undefined
  
  /**
    * Configurations for sending notifications.
    */
  var NotificationConfig: js.UndefOr[typings.awsSdk.ssmMod.NotificationConfig] = js.undefined
  
  /**
    * The name of the S3 bucket where command execution responses should be stored.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined
  
  /**
    * The directory structure within the S3 bucket where the responses should be stored.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
  
  /**
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Region of the S3 bucket.
    */
  var OutputS3Region: js.UndefOr[S3Region] = js.undefined
  
  /**
    * The required and optional parameters specified in the document being run.
    */
  var Parameters: js.UndefOr[typings.awsSdk.ssmMod.Parameters] = js.undefined
  
  /**
    * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for Run Command commands.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
  
  /**
    * An array of search criteria that targets instances using a Key,Value combination that you specify. Specifying targets is most useful when you want to send a command to a large number of instances at once. Using Targets, which accepts tag key-value pairs to identify instances, you can send a command to tens, hundreds, or thousands of instances at once. To send a command to a smaller number of instances, you can use the InstanceIds option instead. For more information about how to use targets, see Sending commands to a fleet in the AWS Systems Manager User Guide.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.undefined
  
  /**
    * If this time is reached and the command has not already started running, it will not run.
    */
  var TimeoutSeconds: js.UndefOr[typings.awsSdk.ssmMod.TimeoutSeconds] = js.undefined
}
object SendCommandRequest {
  
  inline def apply(DocumentName: DocumentARN): SendCommandRequest = {
    val __obj = js.Dynamic.literal(DocumentName = DocumentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendCommandRequest]
  }
  
  extension [Self <: SendCommandRequest](x: Self) {
    
    inline def setCloudWatchOutputConfig(value: CloudWatchOutputConfig): Self = StObject.set(x, "CloudWatchOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchOutputConfigUndefined: Self = StObject.set(x, "CloudWatchOutputConfig", js.undefined)
    
    inline def setComment(value: Comment): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setDocumentHash(value: DocumentHash): Self = StObject.set(x, "DocumentHash", value.asInstanceOf[js.Any])
    
    inline def setDocumentHashType(value: DocumentHashType): Self = StObject.set(x, "DocumentHashType", value.asInstanceOf[js.Any])
    
    inline def setDocumentHashTypeUndefined: Self = StObject.set(x, "DocumentHashType", js.undefined)
    
    inline def setDocumentHashUndefined: Self = StObject.set(x, "DocumentHash", js.undefined)
    
    inline def setDocumentName(value: DocumentARN): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setInstanceIds(value: InstanceIdList): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    inline def setInstanceIdsVarargs(value: InstanceId*): Self = StObject.set(x, "InstanceIds", js.Array(value :_*))
    
    inline def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    inline def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    inline def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    inline def setNotificationConfig(value: NotificationConfig): Self = StObject.set(x, "NotificationConfig", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigUndefined: Self = StObject.set(x, "NotificationConfig", js.undefined)
    
    inline def setOutputS3BucketName(value: S3BucketName): Self = StObject.set(x, "OutputS3BucketName", value.asInstanceOf[js.Any])
    
    inline def setOutputS3BucketNameUndefined: Self = StObject.set(x, "OutputS3BucketName", js.undefined)
    
    inline def setOutputS3KeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "OutputS3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setOutputS3KeyPrefixUndefined: Self = StObject.set(x, "OutputS3KeyPrefix", js.undefined)
    
    inline def setOutputS3Region(value: S3Region): Self = StObject.set(x, "OutputS3Region", value.asInstanceOf[js.Any])
    
    inline def setOutputS3RegionUndefined: Self = StObject.set(x, "OutputS3Region", js.undefined)
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setServiceRoleArn(value: ServiceRole): Self = StObject.set(x, "ServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleArnUndefined: Self = StObject.set(x, "ServiceRoleArn", js.undefined)
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
    
    inline def setTimeoutSeconds(value: TimeoutSeconds): Self = StObject.set(x, "TimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "TimeoutSeconds", js.undefined)
  }
}
