package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/sub", JSImport.Namespace)
@js.native
object esmSubMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, duration: typings.dateFns.mod.Duration | Duration): Date = js.native
    def apply(date: Date, duration: typings.dateFns.mod.Duration | Duration): Date = js.native
  }
  
}

