package typings.dateFns.mod

import typings.dateFns.anon.Delimiter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns", "formatDuration")
@js.native
object formatDuration extends js.Object {
  def apply(duration: Duration): String = js.native
  def apply(duration: Duration, options: Delimiter): String = js.native
}

