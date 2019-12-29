package typings.datastoreDashCore.datastoreDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeytransformDatastore[Value] extends Datastore[Value] {
  var child: Datastore[Value]
  var transform: Transform
}

@JSImport("datastore-core", "KeytransformDatastore")
@js.native
object KeytransformDatastore extends TopLevel[KeytransformDatastoreConstructor]

