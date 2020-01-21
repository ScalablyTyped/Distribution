package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/formatDistanceToNow", JSImport.Namespace)
@js.native
object formatDistanceToNowMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double): String = js.native
    def apply(date: Double, options: AnonAddSuffix): String = js.native
    def apply(date: Double, options: AnonAddSuffixIncludeSeconds): String = js.native
    def apply(date: Date): String = js.native
    def apply(date: Date, options: AnonAddSuffix): String = js.native
    def apply(date: Date, options: AnonAddSuffixIncludeSeconds): String = js.native
  }
  
}

