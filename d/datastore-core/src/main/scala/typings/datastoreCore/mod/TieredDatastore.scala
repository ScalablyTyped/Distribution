package typings.datastoreCore.mod

import typings.interfaceDatastore.mod.Adapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("datastore-core", "TieredDatastore")
@js.native
class TieredDatastore[Value] protected () extends Adapter[Value] {
  def this(stores: js.Array[Adapter[Value]]) = this()
  
  var stores: js.Array[Adapter[Value]] = js.native
}
