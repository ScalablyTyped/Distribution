package typings
package commonDashErrorsLib.commonDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def log(err: Error): Error = js.native
  def log(err: Error, message: java.lang.String): Error = js.native
  def logError(err: Error, cb: js.Function0[_]): scala.Unit = js.native
  def prependCurrentStack(err: Error): Error = js.native
}

