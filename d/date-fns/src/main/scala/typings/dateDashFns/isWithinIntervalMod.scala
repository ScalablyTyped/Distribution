package typings.dateDashFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/isWithinInterval", JSImport.Namespace)
@js.native
object isWithinIntervalMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, interval: typings.dateDashFns.dateDashFnsMod.Interval): Boolean = js.native
    def apply(date: Date, interval: typings.dateDashFns.dateDashFnsMod.Interval): Boolean = js.native
  }
  
}

