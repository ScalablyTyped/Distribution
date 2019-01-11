package typings
package commonDashErrorsLib.commonDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def log(err: commonDashErrorsLib.commonDashErrorsMod.Error): commonDashErrorsLib.commonDashErrorsMod.Error = js.native
  def log(err: commonDashErrorsLib.commonDashErrorsMod.Error, message: java.lang.String): commonDashErrorsLib.commonDashErrorsMod.Error = js.native
  def logError(err: commonDashErrorsLib.commonDashErrorsMod.Error, cb: js.Function0[_]): scala.Unit = js.native
  def prependCurrentStack(err: commonDashErrorsLib.commonDashErrorsMod.Error): commonDashErrorsLib.commonDashErrorsMod.Error = js.native
}

