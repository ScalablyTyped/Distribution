package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopActivityStreamResponse extends js.Object {
  
  /**
    * The name of the Amazon Kinesis data stream used for the database activity stream.
    */
  var KinesisStreamName: js.UndefOr[String] = js.native
  
  /**
    * The AWS KMS key identifier used for encrypting messages in the database activity stream.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * The status of the database activity stream.
    */
  var Status: js.UndefOr[ActivityStreamStatus] = js.native
}
object StopActivityStreamResponse {
  
  @scala.inline
  def apply(): StopActivityStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopActivityStreamResponse]
  }
  
  @scala.inline
  implicit class StopActivityStreamResponseOps[Self <: StopActivityStreamResponse] (val x: Self) extends AnyVal {
    
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
    def setKinesisStreamName(value: String): Self = this.set("KinesisStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisStreamName: Self = this.set("KinesisStreamName", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setStatus(value: ActivityStreamStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
