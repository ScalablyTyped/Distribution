package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPartitionsResponse extends js.Object {
  /**
    * A continuation token, if the returned list of partitions does not include the last one.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A list of requested partitions.
    */
  var Partitions: js.UndefOr[PartitionList] = js.native
}

object GetPartitionsResponse {
  @scala.inline
  def apply(): GetPartitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPartitionsResponse]
  }
  @scala.inline
  implicit class GetPartitionsResponseOps[Self <: GetPartitionsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPartitionsVarargs(value: Partition*): Self = this.set("Partitions", js.Array(value :_*))
    @scala.inline
    def setPartitions(value: PartitionList): Self = this.set("Partitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitions: Self = this.set("Partitions", js.undefined)
  }
  
}

