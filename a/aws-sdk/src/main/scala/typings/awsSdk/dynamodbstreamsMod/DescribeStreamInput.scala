package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamInput extends js.Object {
  /**
    * The shard ID of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedShardId in the previous operation. 
    */
  var ExclusiveStartShardId: js.UndefOr[ShardId] = js.native
  /**
    * The maximum number of shard objects to return. The upper limit is 100.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.native
  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var StreamArn: typings.awsSdk.dynamodbstreamsMod.StreamArn = js.native
}

object DescribeStreamInput {
  @scala.inline
  def apply(StreamArn: StreamArn): DescribeStreamInput = {
    val __obj = js.Dynamic.literal(StreamArn = StreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamInput]
  }
  @scala.inline
  implicit class DescribeStreamInputOps[Self <: DescribeStreamInput] (val x: Self) extends AnyVal {
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
    def setStreamArn(value: StreamArn): Self = this.set("StreamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setExclusiveStartShardId(value: ShardId): Self = this.set("ExclusiveStartShardId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveStartShardId: Self = this.set("ExclusiveStartShardId", js.undefined)
    @scala.inline
    def setLimit(value: PositiveIntegerObject): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
  }
  
}

