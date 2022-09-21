package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsAuditLogCreateConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that specifies the destination of the audit logs. The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data Firehose delivery stream ARN, with the following requirements:   The destination ARN that you provide (either CloudWatch Logs log group or Kinesis Data Firehose delivery stream) must be in the same Amazon Web Services partition, Amazon Web Services Region, and Amazon Web Services account as your Amazon FSx file system.   The name of the Amazon CloudWatch Logs log group must begin with the /aws/fsx prefix. The name of the Amazon Kinesis Data Firehouse delivery stream must begin with the aws-fsx prefix.   If you do not provide a destination in AuditLogDestination, Amazon FSx will create and use a log stream in the CloudWatch Logs /aws/fsx/windows log group.   If AuditLogDestination is provided and the resource does not exist, the request will fail with a BadRequest error.   If FileAccessAuditLogLevel and FileShareAccessAuditLogLevel are both set to DISABLED, you cannot specify a destination in AuditLogDestination.  
    */
  var AuditLogDestination: js.UndefOr[GeneralARN] = js.undefined
  
  /**
    * Sets which attempt type is logged by Amazon FSx for file and folder accesses.    SUCCESS_ONLY - only successful attempts to access files or folders are logged.    FAILURE_ONLY - only failed attempts to access files or folders are logged.    SUCCESS_AND_FAILURE - both successful attempts and failed attempts to access files or folders are logged.    DISABLED - access auditing of files and folders is turned off.  
    */
  var FileAccessAuditLogLevel: WindowsAccessAuditLogLevel
  
  /**
    * Sets which attempt type is logged by Amazon FSx for file share accesses.    SUCCESS_ONLY - only successful attempts to access file shares are logged.    FAILURE_ONLY - only failed attempts to access file shares are logged.    SUCCESS_AND_FAILURE - both successful attempts and failed attempts to access file shares are logged.    DISABLED - access auditing of file shares is turned off.  
    */
  var FileShareAccessAuditLogLevel: WindowsAccessAuditLogLevel
}
object WindowsAuditLogCreateConfiguration {
  
  inline def apply(
    FileAccessAuditLogLevel: WindowsAccessAuditLogLevel,
    FileShareAccessAuditLogLevel: WindowsAccessAuditLogLevel
  ): WindowsAuditLogCreateConfiguration = {
    val __obj = js.Dynamic.literal(FileAccessAuditLogLevel = FileAccessAuditLogLevel.asInstanceOf[js.Any], FileShareAccessAuditLogLevel = FileShareAccessAuditLogLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsAuditLogCreateConfiguration]
  }
  
  extension [Self <: WindowsAuditLogCreateConfiguration](x: Self) {
    
    inline def setAuditLogDestination(value: GeneralARN): Self = StObject.set(x, "AuditLogDestination", value.asInstanceOf[js.Any])
    
    inline def setAuditLogDestinationUndefined: Self = StObject.set(x, "AuditLogDestination", js.undefined)
    
    inline def setFileAccessAuditLogLevel(value: WindowsAccessAuditLogLevel): Self = StObject.set(x, "FileAccessAuditLogLevel", value.asInstanceOf[js.Any])
    
    inline def setFileShareAccessAuditLogLevel(value: WindowsAccessAuditLogLevel): Self = StObject.set(x, "FileShareAccessAuditLogLevel", value.asInstanceOf[js.Any])
  }
}
