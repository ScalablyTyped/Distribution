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
  def apply(KinesisStreamSourceDescription: KinesisStreamSourceDescription = null): SourceDescription = {
    val __obj = js.Dynamic.literal()
    if (KinesisStreamSourceDescription != null) __obj.updateDynamic("KinesisStreamSourceDescription")(KinesisStreamSourceDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceDescription]
  }
}

