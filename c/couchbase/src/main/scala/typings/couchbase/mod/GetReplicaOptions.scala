package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReplicaOptions extends js.Object {
  /**
    * The index for which replica you wish to retrieve this value from, or if undefined, use the value from the first server that replies.
    */
  var index: js.UndefOr[Double] = js.undefined
}

object GetReplicaOptions {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined): GetReplicaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReplicaOptions]
  }
}

