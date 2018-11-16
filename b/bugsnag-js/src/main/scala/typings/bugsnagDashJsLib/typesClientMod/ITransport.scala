package typings
package bugsnagDashJsLib.typesClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransport extends js.Object {
  var name: java.lang.String = js.native
  def sendReport(logger: ILogger, config: js.Any, report: IReportPayload): scala.Unit = js.native
  def sendReport(
    logger: ILogger,
    config: js.Any,
    report: IReportPayload,
    cb: js.Function2[/* e */ stdLib.Error | scala.Null, /* resText */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def sendSession(logger: ILogger, config: js.Any, report: ISessionPayload): scala.Unit = js.native
  def sendSession(
    logger: ILogger,
    config: js.Any,
    report: ISessionPayload,
    cb: js.Function2[/* e */ stdLib.Error | scala.Null, /* resText */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

