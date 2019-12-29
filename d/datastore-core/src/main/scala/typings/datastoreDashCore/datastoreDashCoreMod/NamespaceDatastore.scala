package typings.datastoreDashCore.datastoreDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceDatastore[Value] extends KeytransformDatastore[Value] {
  var prefix: Key
}

@JSImport("datastore-core", "NamespaceDatastore")
@js.native
object NamespaceDatastore extends TopLevel[NamespaceDatastoreConstructor]

