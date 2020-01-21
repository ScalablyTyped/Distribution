package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetPartitionResponse extends js.Object {
  /**
    * A list of the requested partitions.
    */
  var Partitions: js.UndefOr[PartitionList] = js.native
  /**
    * A list of the partition values in the request for which partitions were not returned.
    */
  var UnprocessedKeys: js.UndefOr[BatchGetPartitionValueList] = js.native
}

object BatchGetPartitionResponse {
  @scala.inline
  def apply(Partitions: PartitionList = null, UnprocessedKeys: BatchGetPartitionValueList = null): BatchGetPartitionResponse = {
    val __obj = js.Dynamic.literal()
    if (Partitions != null) __obj.updateDynamic("Partitions")(Partitions.asInstanceOf[js.Any])
    if (UnprocessedKeys != null) __obj.updateDynamic("UnprocessedKeys")(UnprocessedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetPartitionResponse]
  }
}

