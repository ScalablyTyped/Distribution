package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamInput extends js.Object {
  /**
    * The number of shards that the stream will use. The throughput of the stream is a function of the number of shards; more shards are required for greater provisioned throughput. DefaultShardLimit;
    */
  var ShardCount: PositiveIntegerObject = js.native
  /**
    * A name to identify the stream. The stream name is scoped to the AWS account used by the application that creates the stream. It is also scoped by AWS Region. That is, two streams in two different AWS accounts can have the same name. Two streams in the same AWS account but in two different Regions can also have the same name.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
}

object CreateStreamInput {
  @scala.inline
  def apply(ShardCount: PositiveIntegerObject, StreamName: StreamName): CreateStreamInput = {
    val __obj = js.Dynamic.literal(ShardCount = ShardCount.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamInput]
  }
  @scala.inline
  implicit class CreateStreamInputOps[Self <: CreateStreamInput] (val x: Self) extends AnyVal {
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
    def setShardCount(value: PositiveIntegerObject): Self = this.set("ShardCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
  }
  
}

