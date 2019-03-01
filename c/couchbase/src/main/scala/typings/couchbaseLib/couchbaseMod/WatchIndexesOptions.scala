package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchIndexesOptions extends js.Object {
  /**
    * Timeout for the operation in milliseconds.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object WatchIndexesOptions {
  @scala.inline
  def apply(timeout: scala.Int | scala.Double = null): WatchIndexesOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchIndexesOptions]
  }
}

