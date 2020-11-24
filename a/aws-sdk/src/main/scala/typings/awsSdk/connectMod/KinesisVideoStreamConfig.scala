package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisVideoStreamConfig extends js.Object {
  
  /**
    * The encryption configuration.
    */
  var EncryptionConfig: typings.awsSdk.connectMod.EncryptionConfig = js.native
  
  /**
    * The prefix of the video stream.
    */
  var Prefix: typings.awsSdk.connectMod.Prefix = js.native
  
  /**
    * The number of hours data is retained in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is 0, indicating that the stream does not persist data.
    */
  var RetentionPeriodHours: Hours = js.native
}
object KinesisVideoStreamConfig {
  
  @scala.inline
  def apply(EncryptionConfig: EncryptionConfig, Prefix: Prefix, RetentionPeriodHours: Hours): KinesisVideoStreamConfig = {
    val __obj = js.Dynamic.literal(EncryptionConfig = EncryptionConfig.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisVideoStreamConfig]
  }
  
  @scala.inline
  implicit class KinesisVideoStreamConfigOps[Self <: KinesisVideoStreamConfig] (val x: Self) extends AnyVal {
    
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
    def setEncryptionConfig(value: EncryptionConfig): Self = this.set("EncryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Prefix): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPeriodHours(value: Hours): Self = this.set("RetentionPeriodHours", value.asInstanceOf[js.Any])
  }
}
