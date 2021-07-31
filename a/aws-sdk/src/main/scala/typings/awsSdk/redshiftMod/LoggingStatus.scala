package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingStatus extends StObject {
  
  /**
    * The name of the S3 bucket where the log files are stored.
    */
  var BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * The message indicating that logs failed to be delivered.
    */
  var LastFailureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The last time when logs failed to be delivered.
    */
  var LastFailureTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The last time that logs were delivered.
    */
  var LastSuccessfulDeliveryTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    *  true if logging is on, false if logging is off.
    */
  var LoggingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The prefix applied to the log file names.
    */
  var S3KeyPrefix: js.UndefOr[String] = js.undefined
}
object LoggingStatus {
  
  @scala.inline
  def apply(): LoggingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingStatus]
  }
  
  @scala.inline
  implicit class LoggingStatusMutableBuilder[Self <: LoggingStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    @scala.inline
    def setLastFailureMessage(value: String): Self = StObject.set(x, "LastFailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFailureMessageUndefined: Self = StObject.set(x, "LastFailureMessage", js.undefined)
    
    @scala.inline
    def setLastFailureTime(value: TStamp): Self = StObject.set(x, "LastFailureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFailureTimeUndefined: Self = StObject.set(x, "LastFailureTime", js.undefined)
    
    @scala.inline
    def setLastSuccessfulDeliveryTime(value: TStamp): Self = StObject.set(x, "LastSuccessfulDeliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSuccessfulDeliveryTimeUndefined: Self = StObject.set(x, "LastSuccessfulDeliveryTime", js.undefined)
    
    @scala.inline
    def setLoggingEnabled(value: Boolean): Self = StObject.set(x, "LoggingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingEnabledUndefined: Self = StObject.set(x, "LoggingEnabled", js.undefined)
    
    @scala.inline
    def setS3KeyPrefix(value: String): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
  }
}
