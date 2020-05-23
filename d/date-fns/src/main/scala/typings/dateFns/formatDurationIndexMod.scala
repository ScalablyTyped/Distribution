package typings.dateFns

import typings.dateFns.anon.Delimiter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/formatDuration/index", JSImport.Namespace)
@js.native
object formatDurationIndexMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(duration: Duration): String = js.native
    def apply(duration: Duration, options: Delimiter): String = js.native
  }
  
}

