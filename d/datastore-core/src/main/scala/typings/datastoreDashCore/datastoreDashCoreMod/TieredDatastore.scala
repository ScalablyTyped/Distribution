package typings.datastoreDashCore.datastoreDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TieredDatastore
  extends Datastore[js.Any] {
  var stores: js.Array[Datastore[_]]
}

@JSImport("datastore-core", "TieredDatastore")
@js.native
object TieredDatastore extends TopLevel[TieredDatastoreConstructor]

