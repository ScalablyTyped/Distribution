package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecordsOutput extends js.Object {
  /**
    * The next position in the shard from which to start sequentially reading stream records. If set to null, the shard has been closed and the requested iterator will not return any more data.
    */
  var NextShardIterator: js.UndefOr[ShardIterator] = js.native
  /**
    * The stream records from the shard, which were retrieved using the shard iterator.
    */
  var Records: js.UndefOr[RecordList] = js.native
}

object GetRecordsOutput {
  @scala.inline
  def apply(): GetRecordsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecordsOutput]
  }
  @scala.inline
  implicit class GetRecordsOutputOps[Self <: GetRecordsOutput] (val x: Self) extends AnyVal {
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
    def setNextShardIterator(value: ShardIterator): Self = this.set("NextShardIterator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextShardIterator: Self = this.set("NextShardIterator", js.undefined)
    @scala.inline
    def setRecordsVarargs(value: Record*): Self = this.set("Records", js.Array(value :_*))
    @scala.inline
    def setRecords(value: RecordList): Self = this.set("Records", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecords: Self = this.set("Records", js.undefined)
  }
  
}

