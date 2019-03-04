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

object DecoratedResult {
  @scala.inline
  def apply[T](cached: PolicyGetCachedOptions[T], report: PolicyGetReportLog, value: T): DecoratedResult[T] = {
    val __obj = js.Dynamic.literal(cached = cached, report = report, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecoratedResult[T]]
  }
}

