package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendOptions extends js.Object {
  /**
    * The CAS value to check. If the item on the server contains a different CAS value, the operation will fail. Note that if this option is undefined, no comparison will be performed.
    */
  var cas: js.UndefOr[couchbaseLib.couchbaseMod.BucketNs.CAS] = js.undefined
  /**
    * Ensures this operation is persisted to this many nodes.
    */
  var persist_to: js.UndefOr[scala.Double] = js.undefined
  /**
    * 	Ensures this operation is replicated to this many nodes.
    */
  var replicate_to: js.UndefOr[scala.Double] = js.undefined
}

object AppendOptions {
  @scala.inline
  def apply(
    cas: couchbaseLib.couchbaseMod.BucketNs.CAS = null,
    persist_to: scala.Int | scala.Double = null,
    replicate_to: scala.Int | scala.Double = null
  ): AppendOptions = {
    val __obj = js.Dynamic.literal()
    if (cas != null) __obj.updateDynamic("cas")(cas)
    if (persist_to != null) __obj.updateDynamic("persist_to")(persist_to.asInstanceOf[js.Any])
    if (replicate_to != null) __obj.updateDynamic("replicate_to")(replicate_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendOptions]
  }
}

