package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisStreamConfig extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that CloudFront can use to send real-time log data to your Kinesis data stream. For more information the IAM role, see Real-time log configuration IAM role in the Amazon CloudFront Developer Guide.
    */
  var RoleARN: String = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Kinesis data stream where you are sending real-time log data.
    */
  var StreamARN: String = js.native
}
object KinesisStreamConfig {
  
  @scala.inline
  def apply(RoleARN: String, StreamARN: String): KinesisStreamConfig = {
    val __obj = js.Dynamic.literal(RoleARN = RoleARN.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamConfig]
  }
  
  @scala.inline
  implicit class KinesisStreamConfigOps[Self <: KinesisStreamConfig] (val x: Self) extends AnyVal {
    
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
    def setRoleARN(value: String): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamARN(value: String): Self = this.set("StreamARN", value.asInstanceOf[js.Any])
  }
}
