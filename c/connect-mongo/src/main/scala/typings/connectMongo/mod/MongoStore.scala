package typings.connectMongo.mod

import typings.expressSession.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-mongo", "MongoStore")
@js.native
class MongoStore () extends Store {
  def close(): Unit = js.native
}

