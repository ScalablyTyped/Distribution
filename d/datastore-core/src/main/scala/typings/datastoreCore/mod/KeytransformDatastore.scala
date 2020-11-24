package typings.datastoreCore.mod

import typings.interfaceDatastore.mod.Adapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("datastore-core", "KeytransformDatastore")
@js.native
class KeytransformDatastore[Value] protected () extends Adapter[Value] {
  def this(child: Adapter[Value], transform: Transform) = this()
  
  var child: Adapter[Value] = js.native
  
  var transform: Transform = js.native
}
