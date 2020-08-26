package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisFirehoseInputUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the input delivery stream to read.
    */
  var ResourceARNUpdate: ResourceARN = js.native
}

object KinesisFirehoseInputUpdate {
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN): KinesisFirehoseInputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseInputUpdate]
  }
  @scala.inline
  implicit class KinesisFirehoseInputUpdateOps[Self <: KinesisFirehoseInputUpdate] (val x: Self) extends AnyVal {
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

