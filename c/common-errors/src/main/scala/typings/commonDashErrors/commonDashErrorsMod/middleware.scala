package typings.commonDashErrors.commonDashErrorsMod

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", "middleware")
@js.native
object middleware extends js.Object {
  /**
    * Express middleware for preventing the web server from crashing when
    * an error is thrown from an asynchronous context. Any error that would
    * have caused a crash is logged to stderr.
    */
  def crashProtector(
    errorHandler: js.Function3[/* err */ Error, /* req */ Request[ParamsDictionary], /* res */ Response, Unit]
  ): Unit = js.native
  /**
    * Express middleware that translates common errors into HTTP status
    * codes and messages.
    */
  def errorHandler(err: Error, req: Request[ParamsDictionary], res: Response, next: NextFunction): Unit = js.native
}

