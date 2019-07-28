package typings.blowDashHttpDashStatuses.blowDashHttpDashStatusesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blow-http-statuses", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isEmpty(code: js.Any): Boolean = js.native
  def isRedirect(code: js.Any): Boolean = js.native
  def isRetry(code: js.Any): Boolean = js.native
  def status(codeOrLiteral: String): IStatus = js.native
  def status(codeOrLiteral: Double): IStatus = js.native
}

