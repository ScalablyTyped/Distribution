package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceDescription extends js.Object {
  /**
    * The KinesisStreamSourceDescription value for the source Kinesis data stream.
    */
  var KinesisStreamSourceDescription: js.UndefOr[typings.awsSdk.firehoseMod.KinesisStreamSourceDescription] = js.native
}

object SourceDescription {
  @scala.inline
  def apply(): SourceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceDescription]
  }
  @scala.inline
  implicit class SourceDescriptionOps[Self <: SourceDescription] (val x: Self) extends AnyVal {
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
    def setKinesisStreamSourceDescription(value: KinesisStreamSourceDescription): Self = this.set("KinesisStreamSourceDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinesisStreamSourceDescription: Self = this.set("KinesisStreamSourceDescription", js.undefined)
  }
  
}

