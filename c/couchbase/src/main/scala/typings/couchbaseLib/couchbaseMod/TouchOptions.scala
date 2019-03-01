package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchOptions extends js.Object {
  /**
    * 	Ensures this operation is persisted to this many nodes.
    */
  var persist_to: js.UndefOr[scala.Double] = js.undefined
  /**
    * Ensures this operation is replicated to this many nodes.
    */
  var replicate_to: js.UndefOr[scala.Double] = js.undefined
}

object TouchOptions {
  @scala.inline
  def apply(persist_to: scala.Int | scala.Double = null, replicate_to: scala.Int | scala.Double = null): TouchOptions = {
    val __obj = js.Dynamic.literal()
    if (persist_to != null) __obj.updateDynamic("persist_to")(persist_to.asInstanceOf[js.Any])
    if (replicate_to != null) __obj.updateDynamic("replicate_to")(replicate_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchOptions]
  }
}

