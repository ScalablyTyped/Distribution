package typings
package bugsnagDashJsLib.typesClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogger extends js.Object {
  def debug(args: js.Any*): scala.Unit
  def error(args: js.Any*): scala.Unit
  def info(args: js.Any*): scala.Unit
  def warn(args: js.Any*): scala.Unit
}

object ILogger {
  @scala.inline
  def apply(
    debug: js.Function1[/* repeated */ js.Any, scala.Unit],
    error: js.Function1[/* repeated */ js.Any, scala.Unit],
    info: js.Function1[/* repeated */ js.Any, scala.Unit],
    warn: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): ILogger = {
    val __obj = js.Dynamic.literal(debug = debug, error = error, info = info, warn = warn)
  
    __obj.asInstanceOf[ILogger]
  }
}

