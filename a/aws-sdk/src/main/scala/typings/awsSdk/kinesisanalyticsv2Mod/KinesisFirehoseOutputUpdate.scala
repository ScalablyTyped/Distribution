package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisFirehoseOutputUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the delivery stream to write to. 
    */
  var ResourceARNUpdate: ResourceARN = js.native
}

object KinesisFirehoseOutputUpdate {
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN): KinesisFirehoseOutputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseOutputUpdate]
  }
  @scala.inline
  implicit class KinesisFirehoseOutputUpdateOps[Self <: KinesisFirehoseOutputUpdate] (val x: Self) extends AnyVal {
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
    def setResourceARNUpdate(value: ResourceARN): Self = this.set("ResourceARNUpdate", value.asInstanceOf[js.Any])
  }
  
}

