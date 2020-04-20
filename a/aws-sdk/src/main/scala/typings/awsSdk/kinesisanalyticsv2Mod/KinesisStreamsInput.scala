package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamsInput extends js.Object {
  /**
    * The ARN of the input Kinesis data stream to read.
    */
  var ResourceARN: typings.awsSdk.kinesisanalyticsv2Mod.ResourceARN = js.native
}

object KinesisStreamsInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN): KinesisStreamsInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsInput]
  }
}

