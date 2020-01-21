package typings.bristolSentry.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bristol-sentry", "formatter")
@js.native
object formatter extends js.Object {
  def apply(opts: js.Object, severity: String, date: Date, elems: js.Array[_]): FormattedLog = js.native
}

