package typings
package connectDashMongodbDashSessionLib.connectDashMongodbDashSessionMod.connectMongodbSessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoDBStore
  extends expressDashSessionLib.expressDashSessionMod.Store
     with org.scalablytyped.runtime.Instantiable0[MongoDBStore]
     with org.scalablytyped.runtime.Instantiable1[/* connection */ ConnectionInfo, MongoDBStore]
     with org.scalablytyped.runtime.Instantiable2[
      /* connection */ ConnectionInfo, 
      /* callback */ js.Function1[/* error */ stdLib.Error, scala.Unit], 
      MongoDBStore
    ] {
  var client: mongodbLib.mongodbMod.MongoClient = js.native
}

