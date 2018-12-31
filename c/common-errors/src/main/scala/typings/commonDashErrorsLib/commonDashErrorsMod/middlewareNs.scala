package typings
package commonDashErrorsLib.commonDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", "middleware")
@js.native
object middlewareNs extends js.Object {
  /**
    * Express middleware for preventing the web server from crashing when
    * an error is thrown from an asynchronous context. Any error that would
    * have caused a crash is logged to stderr.
    */
  def crashProtector(
    errorHandler: js.Function3[
      /* err */ commonDashErrorsLib.commonDashErrorsMod.Error, 
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Express middleware that translates common errors into HTTP status
    * codes and messages.
    */
  def errorHandler(
    err: commonDashErrorsLib.commonDashErrorsMod.Error,
    req: expressLib.expressMod.eNs.Request,
    res: expressLib.expressMod.eNs.Response,
    next: expressLib.expressMod.eNs.NextFunction
  ): scala.Unit = js.native
}

