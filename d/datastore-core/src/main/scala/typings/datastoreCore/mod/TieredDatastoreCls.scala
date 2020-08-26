package typings.datastoreCore.mod

import typings.interfaceDatastore.mod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datastore-core", "TieredDatastore")
@js.native
class TieredDatastoreCls protected () extends TieredDatastore {
  def this(stores: js.Array[Datastore[_]]) = this()
}

