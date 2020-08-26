package typings.datastoreCore.mod

import org.scalablytyped.runtime.TopLevel
import typings.interfaceDatastore.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceDatastore[Value] extends KeytransformDatastore[Value] {
  var prefix: Key = js.native
}

@JSImport("datastore-core", "NamespaceDatastore")
@js.native
object NamespaceDatastore extends TopLevel[NamespaceDatastoreConstructor]

