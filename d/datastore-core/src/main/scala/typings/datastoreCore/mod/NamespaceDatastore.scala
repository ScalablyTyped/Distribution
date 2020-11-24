package typings.datastoreCore.mod

import typings.interfaceDatastore.mod.Adapter
import typings.interfaceDatastore.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("datastore-core", "NamespaceDatastore")
@js.native
class NamespaceDatastore[Value] protected () extends KeytransformDatastore[Value] {
  def this(child: Adapter[Value], prefix: Key) = this()
  
  var prefix: Key = js.native
}
