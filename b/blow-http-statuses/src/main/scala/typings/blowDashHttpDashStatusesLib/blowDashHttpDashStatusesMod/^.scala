package typings
package blowDashHttpDashStatusesLib.blowDashHttpDashStatusesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blow-http-statuses", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isEmpty(code: js.Any): scala.Boolean = js.native
  def isRedirect(code: js.Any): scala.Boolean = js.native
  def isRetry(code: js.Any): scala.Boolean = js.native
  def status(codeOrLiteral: java.lang.String): IStatus = js.native
  def status(codeOrLiteral: scala.Double): IStatus = js.native
}

