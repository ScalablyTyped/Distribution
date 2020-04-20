package typings.connectMongodbSession.mod

import typings.connectMongodbSession.mod.connectMongodbSession.MongoDBStore
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressSession.mod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-mongodb-session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    fn: js.Function1[
      /* options */ js.UndefOr[SessionOptions], 
      RequestHandler[ParamsDictionary, _, _, Query]
    ]
  ): MongoDBStore = js.native
}

