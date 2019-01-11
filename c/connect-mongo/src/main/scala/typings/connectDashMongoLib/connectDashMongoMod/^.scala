package typings
package connectDashMongoLib.connectDashMongoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-mongo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    connect: js.Function1[
      /* options */ js.UndefOr[expressDashSessionLib.expressDashSessionMod.sessionNs.SessionOptions], 
      expressLib.expressMod.eNs.RequestHandler
    ]
  ): connectDashMongoLib.connectDashMongoMod.connectMongoNs.MongoStoreFactory = js.native
}

