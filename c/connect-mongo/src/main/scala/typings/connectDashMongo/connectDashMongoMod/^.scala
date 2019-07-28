package typings.connectDashMongo.connectDashMongoMod

import typings.express.expressMod.RequestHandler
import typings.expressDashSession.expressDashSessionMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-mongo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(connect: js.Function1[/* options */ js.UndefOr[SessionOptions], RequestHandler]): MongoStoreFactory = js.native
}

