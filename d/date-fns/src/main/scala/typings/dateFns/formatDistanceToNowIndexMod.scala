package typings.dateFns

import typings.dateFns.anon.IncludeSeconds
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/formatDistanceToNow/index", JSImport.Namespace)
@js.native
object formatDistanceToNowIndexMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double): String = js.native
    def apply(date: Double, options: IncludeSeconds): String = js.native
    def apply(date: Date): String = js.native
    def apply(date: Date, options: IncludeSeconds): String = js.native
  }
  
}

