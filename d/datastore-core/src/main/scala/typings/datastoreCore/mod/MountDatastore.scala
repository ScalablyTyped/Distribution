package typings.datastoreCore.mod

import typings.interfaceDatastore.mod.Adapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("datastore-core", "MountDatastore")
@js.native
class MountDatastore[Value] protected () extends Adapter[Value] {
  def this(mounts: js.Array[Mount[Value]]) = this()
  
  var mounts: js.Array[Mount[_]] = js.native
}
