package typings.connectDashMongodbDashSession.connectDashMongodbDashSessionMod.connectMongodbSession

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.expressDashSession.expressDashSessionMod.Store
import typings.mongodb.mongodbMod.MongoClient
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoDBStore
  extends Store
     with Instantiable0[MongoDBStore]
     with Instantiable1[/* connection */ ConnectionInfo, MongoDBStore]
     with Instantiable2[
      /* connection */ ConnectionInfo, 
      /* callback */ js.Function1[/* error */ Error, Unit], 
      MongoDBStore
    ] {
  var client: MongoClient = js.native
}

