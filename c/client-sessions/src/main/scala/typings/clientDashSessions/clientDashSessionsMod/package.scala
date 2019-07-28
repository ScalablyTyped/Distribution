package typings.clientDashSessions

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientDashSessionsMod {
  type NextFunction = js.Function1[/* err */ js.UndefOr[Error], Unit]
  type RequestHandler = js.Function3[/* req */ js.Any, /* res */ js.Any, /* next */ NextFunction, js.Any]
}
