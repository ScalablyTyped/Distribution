package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisParameters extends js.Object {
  /**
    * The JSON path to be extracted from the event and used as the partition key. For more information, see Amazon Kinesis Streams Key Concepts in the Amazon Kinesis Streams Developer Guide.
    */
  var PartitionKeyPath: TargetPartitionKeyPath = js.native
}

object KinesisParameters {
  @scala.inline
  def apply(PartitionKeyPath: TargetPartitionKeyPath): KinesisParameters = {
    val __obj = js.Dynamic.literal(PartitionKeyPath = PartitionKeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisParameters]
  }
  @scala.inline
  implicit class KinesisParametersOps[Self <: KinesisParameters] (val x: Self) extends AnyVal {
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
    def setPartitionKeyPath(value: TargetPartitionKeyPath): Self = this.set("PartitionKeyPath", value.asInstanceOf[js.Any])
  }
  
}

