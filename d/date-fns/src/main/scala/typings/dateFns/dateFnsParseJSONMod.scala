package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/parseJSON", JSImport.Namespace)
@js.native
object dateFnsParseJSONMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(argument: String): Date = js.native
    def apply(argument: Double): Date = js.native
    def apply(argument: Date): Date = js.native
  }
  
}

