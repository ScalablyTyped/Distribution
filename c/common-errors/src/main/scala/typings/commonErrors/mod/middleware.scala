package typings.commonErrors.mod

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
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
    errorHandler: js.Function3[
      /* err */ Error, 
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Express middleware that translates common errors into HTTP status
    * codes and messages.
    */
  def errorHandler(err: Error, req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], next: NextFunction): Unit = js.native
}

