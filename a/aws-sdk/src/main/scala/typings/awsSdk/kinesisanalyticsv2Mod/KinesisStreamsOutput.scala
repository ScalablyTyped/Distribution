package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamsOutput extends js.Object {
  /**
    * The ARN of the destination Kinesis data stream to write to.
    */
  var ResourceARN: typings.awsSdk.kinesisanalyticsv2Mod.ResourceARN = js.native
}

object KinesisStreamsOutput {
  @scala.inline
  def apply(ResourceARN: ResourceARN): KinesisStreamsOutput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinesisStreamsOutput]
  }
}

