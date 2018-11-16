package typings
package bugsnagDashJsLib.typesClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bugsnag-js/types/client", "Client")
@js.native
class Client () extends js.Object {
  var BugsnagBreadcrumb: ScalablyTyped.runtime.Instantiable4[
    /* name */ java.lang.String, 
    /* metaData */ js.UndefOr[/* metaData */ js.Object], 
    /* type */ js.UndefOr[/* type */ java.lang.String], 
    /* timestamp */ js.UndefOr[/* timestamp */ java.lang.String], 
    bugsnagDashJsLib.typesBreadcrumbMod.default
  ] = js.native
  var BugsnagReport: ScalablyTyped.runtime.Instantiable4[
    /* errorClass */ java.lang.String, 
    /* errorMessage */ java.lang.String, 
    /* stacktrace */ js.UndefOr[/* stacktrace */ js.Array[js.Any]], 
    /* handledState */ js.UndefOr[/* handledState */ bugsnagDashJsLib.typesReportMod.IHandledState], 
    bugsnagDashJsLib.typesReportMod.default
  ] = js.native
  var BugsnagSession: ScalablyTyped.runtime.Instantiable0[bugsnagDashJsLib.typesSessionMod.default] = js.native
  var app: js.Object = js.native
  var beforeSession: js.Array[bugsnagDashJsLib.typesCommonMod.BeforeSession] = js.native
  var config: bugsnagDashJsLib.typesCommonMod.IFinalConfig = js.native
  var context: java.lang.String | scala.Unit = js.native
  var device: js.Object = js.native
  var metaData: js.Object = js.native
  var user: js.Object = js.native
  def configure(opts: bugsnagDashJsLib.typesCommonMod.IConfig): Client = js.native
  def leaveBreadcrumb(name: java.lang.String): Client = js.native
  def leaveBreadcrumb(name: java.lang.String, metaData: js.Any): Client = js.native
  def leaveBreadcrumb(name: java.lang.String, metaData: js.Any, `type`: java.lang.String): Client = js.native
  def leaveBreadcrumb(name: java.lang.String, metaData: js.Any, `type`: java.lang.String, timestamp: java.lang.String): Client = js.native
  def logger(logger: ILogger): Client = js.native
  def notify(error: NotifiableError): scala.Boolean = js.native
  def notify(error: NotifiableError, opts: INotifyOpts): scala.Boolean = js.native
  def sessionDelegate(sessionDelegate: ISessionDelegate): Client = js.native
  def startSession(): Client = js.native
  def transport(transport: ITransport): Client = js.native
  def use(plugin: IPlugin): js.Any = js.native
}

