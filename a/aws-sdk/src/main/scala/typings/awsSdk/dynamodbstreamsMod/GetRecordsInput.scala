package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecordsInput extends js.Object {
  /**
    * The maximum number of records to return from the shard. The upper limit is 1000.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.native
  /**
    * A shard iterator that was retrieved from a previous GetShardIterator operation. This iterator can be used to access the stream records in this shard.
    */
  var ShardIterator: typings.awsSdk.dynamodbstreamsMod.ShardIterator = js.native
}

object GetRecordsInput {
  @scala.inline
  def apply(ShardIterator: ShardIterator): GetRecordsInput = {
    val __obj = js.Dynamic.literal(ShardIterator = ShardIterator.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecordsInput]
  }
  @scala.inline
  implicit class GetRecordsInputOps[Self <: GetRecordsInput] (val x: Self) extends AnyVal {
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
    def setShardIterator(value: ShardIterator): Self = this.set("ShardIterator", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: PositiveIntegerObject): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
  }
  
}

