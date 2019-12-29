package typings.datastoreDashCore.datastoreDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountDatastore
  extends Datastore[js.Any] {
  var mounts: js.Array[Mount[_]]
}

@JSImport("datastore-core", "MountDatastore")
@js.native
object MountDatastore extends TopLevel[MountDatastoreConstructor]

