package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamsOutputUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Kinesis data stream where you want to write the output.
    */
  var ResourceARNUpdate: ResourceARN = js.native
}

object KinesisStreamsOutputUpdate {
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN): KinesisStreamsOutputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsOutputUpdate]
  }
}

