package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/sub/index", JSImport.Namespace)
@js.native
object esmSubIndexMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, duration: Duration): Date = js.native
    def apply(date: Date, duration: Duration): Date = js.native
  }
  
}

