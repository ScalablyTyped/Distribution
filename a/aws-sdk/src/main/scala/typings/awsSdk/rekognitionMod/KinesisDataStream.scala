package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisDataStream extends js.Object {
  
  /**
    * ARN of the output Amazon Kinesis Data Streams stream.
    */
  var Arn: js.UndefOr[KinesisDataArn] = js.native
}
object KinesisDataStream {
  
  @scala.inline
  def apply(): KinesisDataStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisDataStream]
  }
  
  @scala.inline
  implicit class KinesisDataStreamOps[Self <: KinesisDataStream] (val x: Self) extends AnyVal {
    
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
    def setArn(value: KinesisDataArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
  }
}
