package typings.couchbase.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertOptions extends js.Object {
  /**
    * Set the initial expiration time for the document. A value of 0 represents never expiring.
    */
  var expiry: js.UndefOr[Double] = js.undefined
  /**
    * Ensures this operation is persisted to this many nodes.
    */
  var persist_to: js.UndefOr[Double] = js.undefined
  /**
    * 	Ensures this operation is replicated to this many nodes.
    */
  var replicate_to: js.UndefOr[Double] = js.undefined
}

object InsertOptions {
  @scala.inline
  def apply(expiry: Int | Double = null, persist_to: Int | Double = null, replicate_to: Int | Double = null): InsertOptions = {
    val __obj = js.Dynamic.literal()
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (persist_to != null) __obj.updateDynamic("persist_to")(persist_to.asInstanceOf[js.Any])
    if (replicate_to != null) __obj.updateDynamic("replicate_to")(replicate_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertOptions]
  }
}

