package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogSettingsResponse extends StObject {
  
  /**
    * The destination where logs are delivered.
    */
  var destination: js.UndefOr[Destination] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the key used to encrypt audio logs in an S3 bucket.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
  
  /**
    * The type of logging that is enabled.
    */
  var logType: js.UndefOr[LogType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs are delivered.
    */
  var resourceArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The resource prefix is the first part of the S3 object key within the S3 bucket that you specified to contain audio logs. For CloudWatch Logs it is the prefix of the log stream name within the log group that you specified. 
    */
  var resourcePrefix: js.UndefOr[ResourcePrefix] = js.undefined
}
object LogSettingsResponse {
  
  @scala.inline
  def apply(): LogSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogSettingsResponse]
  }
  
  @scala.inline
  implicit class LogSettingsResponseMutableBuilder[Self <: LogSettingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: Destination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    @scala.inline
    def setLogType(value: LogType): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTypeUndefined: Self = StObject.set(x, "logType", js.undefined)
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    
    @scala.inline
    def setResourcePrefix(value: ResourcePrefix): Self = StObject.set(x, "resourcePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePrefixUndefined: Self = StObject.set(x, "resourcePrefix", js.undefined)
  }
}
