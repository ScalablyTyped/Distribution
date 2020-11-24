package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingStatus extends js.Object {
  
  /**
    * The name of the S3 bucket where the log files are stored.
    */
  var BucketName: js.UndefOr[String] = js.native
  
  /**
    * The message indicating that logs failed to be delivered.
    */
  var LastFailureMessage: js.UndefOr[String] = js.native
  
  /**
    * The last time when logs failed to be delivered.
    */
  var LastFailureTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The last time that logs were delivered.
    */
  var LastSuccessfulDeliveryTime: js.UndefOr[TStamp] = js.native
  
  /**
    *  true if logging is on, false if logging is off.
    */
  var LoggingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The prefix applied to the log file names.
    */
  var S3KeyPrefix: js.UndefOr[String] = js.native
}
object LoggingStatus {
  
  @scala.inline
  def apply(): LoggingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingStatus]
  }
  
  @scala.inline
  implicit class LoggingStatusOps[Self <: LoggingStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucketName(value: String): Self = this.set("BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketName: Self = this.set("BucketName", js.undefined)
    
    @scala.inline
    def setLastFailureMessage(value: String): Self = this.set("LastFailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastFailureMessage: Self = this.set("LastFailureMessage", js.undefined)
    
    @scala.inline
    def setLastFailureTime(value: TStamp): Self = this.set("LastFailureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastFailureTime: Self = this.set("LastFailureTime", js.undefined)
    
    @scala.inline
    def setLastSuccessfulDeliveryTime(value: TStamp): Self = this.set("LastSuccessfulDeliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSuccessfulDeliveryTime: Self = this.set("LastSuccessfulDeliveryTime", js.undefined)
    
    @scala.inline
    def setLoggingEnabled(value: Boolean): Self = this.set("LoggingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingEnabled: Self = this.set("LoggingEnabled", js.undefined)
    
    @scala.inline
    def setS3KeyPrefix(value: String): Self = this.set("S3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3KeyPrefix: Self = this.set("S3KeyPrefix", js.undefined)
  }
}
