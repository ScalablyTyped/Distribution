package typings.bristolDashSentry.bristolDashSentryMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bristol-sentry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(config: SentryConfig): js.Function0[Unit] = js.native
  def formatter(opts: js.Object, severity: String, date: Date, elems: js.Array[_]): FormattedLog = js.native
}

