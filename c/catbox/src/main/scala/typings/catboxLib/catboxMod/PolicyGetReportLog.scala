package typings
package catboxLib.catboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyGetReportLog extends js.Object {
  /** error - lookup error. */
  var error: js.UndefOr[stdLib.Error] = js.undefined
  /** isStale - true if the item is stale. */
  var isStale: scala.Boolean
  /** msec - the cache lookup time in milliseconds. */
  var msec: scala.Double
  /** stored - the timestamp when the item was stored in the cache. */
  var stored: scala.Double
  /** ttl - the cache ttl value for the record. */
  var ttl: scala.Double
}

