package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReplicaOptions extends js.Object {
  /**
    * The index for which replica you wish to retrieve this value from, or if undefined, use the value from the first server that replies.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
}

object GetReplicaOptions {
  @scala.inline
  def apply(index: scala.Int | scala.Double = null): GetReplicaOptions = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReplicaOptions]
  }
}

