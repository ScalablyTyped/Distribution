package typings.datastoreCore.mod

import typings.interfaceDatastore.mod.Datastore
import typings.interfaceDatastore.mod.Key
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datastore-core", "NamespaceDatastore")
@js.native
class NamespaceDatastoreCls protected () extends NamespaceDatastore[Buffer] {
  def this(child: Datastore[_], prefix: Key) = this()
}

