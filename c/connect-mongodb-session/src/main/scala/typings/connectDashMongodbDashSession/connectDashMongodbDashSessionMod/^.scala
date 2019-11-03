package typings.connectDashMongodbDashSession.connectDashMongodbDashSessionMod

import typings.connectDashMongodbDashSession.connectDashMongodbDashSessionMod.connectMongodbSession.MongoDBStore
import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashSession.expressDashSessionMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-mongodb-session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(fn: js.Function1[/* options */ js.UndefOr[SessionOptions], RequestHandler[ParamsDictionary]]): MongoDBStore = js.native
}

