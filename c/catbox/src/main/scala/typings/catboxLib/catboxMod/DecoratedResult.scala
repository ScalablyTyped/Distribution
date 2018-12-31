package typings
package catboxLib.catboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratedResult[T] extends js.Object {
  var cached: PolicyGetCachedOptions[T]
  var report: PolicyGetReportLog
  var value: T
}

