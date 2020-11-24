package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndPoint extends js.Object {
  
  /**
    * Contains information about the Amazon Kinesis data stream where you are sending real-time log data.
    */
  var KinesisStreamConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.KinesisStreamConfig] = js.native
  
  /**
    * The type of data stream where you are sending real-time log data. The only valid value is Kinesis.
    */
  var StreamType: String = js.native
}
object EndPoint {
  
  @scala.inline
  def apply(StreamType: String): EndPoint = {
    val __obj = js.Dynamic.literal(StreamType = StreamType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndPoint]
  }
  
  @scala.inline
  implicit class EndPointOps[Self <: EndPoint] (val x: Self) extends AnyVal {
    
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
    def setStreamType(value: String): Self = this.set("StreamType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamConfig(value: KinesisStreamConfig): Self = this.set("KinesisStreamConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisStreamConfig: Self = this.set("KinesisStreamConfig", js.undefined)
  }
}
