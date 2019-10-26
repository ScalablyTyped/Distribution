package typings.connectDashAzuretables.connectDashAzuretablesMod

import typings.express.expressMod.RequestHandler
import typings.expressDashSession.expressDashSessionMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-azuretables", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(session: js.Function1[/* options */ js.UndefOr[SessionOptions], RequestHandler]): AzureTableStoreFactory = js.native
}

