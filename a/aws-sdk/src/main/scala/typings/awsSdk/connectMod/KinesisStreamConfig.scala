package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisStreamConfig extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the data stream.
    */
  var StreamArn: ARN = js.native
}
object KinesisStreamConfig {
  
  @scala.inline
  def apply(StreamArn: ARN): KinesisStreamConfig = {
    val __obj = js.Dynamic.literal(StreamArn = StreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamConfig]
  }
  
  @scala.inline
  implicit class KinesisStreamConfigOps[Self <: KinesisStreamConfig] (val x: Self) extends AnyVal {
    
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
    def setStreamArn(value: ARN): Self = this.set("StreamArn", value.asInstanceOf[js.Any])
  }
}
