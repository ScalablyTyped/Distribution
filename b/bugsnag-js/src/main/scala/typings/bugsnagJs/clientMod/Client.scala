package typings.bugsnagJs.clientMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable4
import typings.bugsnagJs.anon.Instantiable
import typings.bugsnagJs.commonMod.BeforeSession
import typings.bugsnagJs.commonMod.IConfig
import typings.bugsnagJs.commonMod.IFinalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bugsnag-js/types/client", "Client")
@js.native
class Client () extends js.Object {
  var BugsnagBreadcrumb: Instantiable4[
    /* name */ String, 
    js.UndefOr[/* metaData */ js.Object], 
    js.UndefOr[/* type */ String], 
    js.UndefOr[/* timestamp */ String], 
    typings.bugsnagJs.breadcrumbMod.default
  ] = js.native
  var BugsnagReport: Instantiable = js.native
  var BugsnagSession: Instantiable0[typings.bugsnagJs.sessionMod.default] = js.native
  var app: js.Object = js.native
  var beforeSession: js.Array[BeforeSession] = js.native
  var config: IFinalConfig = js.native
  var context: String | Unit = js.native
  var device: js.Object = js.native
  var metaData: js.Object = js.native
  var user: js.Object = js.native
  def configure(opts: IConfig): Client = js.native
  def leaveBreadcrumb(name: String): Client = js.native
  def leaveBreadcrumb(name: String, metaData: js.Any): Client = js.native
  def leaveBreadcrumb(name: String, metaData: js.Any, `type`: String): Client = js.native
  def leaveBreadcrumb(name: String, metaData: js.Any, `type`: String, timestamp: String): Client = js.native
  def logger(logger: ILogger): Client = js.native
  def notify(error: NotifiableError): Boolean = js.native
  def notify(error: NotifiableError, opts: INotifyOpts): Boolean = js.native
  def sessionDelegate(sessionDelegate: ISessionDelegate): Client = js.native
  def startSession(): Client = js.native
  def transport(transport: ITransport): Client = js.native
  def use(plugin: IPlugin): js.Any = js.native
}

