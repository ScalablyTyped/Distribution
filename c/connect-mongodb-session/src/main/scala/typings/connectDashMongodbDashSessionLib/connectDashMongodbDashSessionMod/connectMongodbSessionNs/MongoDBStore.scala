package typings
package connectDashMongodbDashSessionLib.connectDashMongodbDashSessionMod.connectMongodbSessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoDBStore
  extends expressDashSessionLib.expressDashSessionMod.Store
     with ScalablyTyped.runtime.Instantiable0[MongoDBStore]
     with ScalablyTyped.runtime.Instantiable1[/* connection */ ConnectionInfo, MongoDBStore]
     with ScalablyTyped.runtime.Instantiable2[
      /* connection */ ConnectionInfo, 
      /* callback */ js.Function1[/* error */ nodeLib.Error, scala.Unit], 
      MongoDBStore
    ] {
  var client: mongodbLib.mongodbMod.MongoClient = js.native
}

