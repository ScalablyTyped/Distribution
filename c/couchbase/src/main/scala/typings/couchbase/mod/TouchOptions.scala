package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchOptions extends js.Object {
  /**
    *     Ensures this operation is persisted to this many nodes.
    */
  var persist_to: js.UndefOr[Double] = js.undefined
  /**
    * Ensures this operation is replicated to this many nodes.
    */
  var replicate_to: js.UndefOr[Double] = js.undefined
}

object TouchOptions {
  @scala.inline
  def apply(persist_to: js.UndefOr[Double] = js.undefined, replicate_to: js.UndefOr[Double] = js.undefined): TouchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(persist_to)) __obj.updateDynamic("persist_to")(persist_to.get.asInstanceOf[js.Any])
    if (!js.isUndefined(replicate_to)) __obj.updateDynamic("replicate_to")(replicate_to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchOptions]
  }
}

