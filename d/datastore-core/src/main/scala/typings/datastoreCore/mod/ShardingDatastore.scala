package typings.datastoreCore.mod

import typings.datastoreCore.mod.shard.Shard
import typings.interfaceDatastore.mod.Adapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("datastore-core", "ShardingDatastore")
@js.native
class ShardingDatastore[Value] protected () extends Adapter[Value] {
  def this(stores: js.Array[Adapter[Value]]) = this()
  
  var child: KeytransformDatastore[Value] = js.native
  
  var shard: Shard = js.native
}
/* static members */
@JSImport("datastore-core", "ShardingDatastore")
@js.native
object ShardingDatastore extends js.Object {
  
  def create[Value](store: Adapter[Value], shard: Shard): js.Promise[ShardingDatastore[Value]] = js.native
  
  def createOrOpen[Value](store: Adapter[Value], shard: Shard): js.Promise[ShardingDatastore[Value]] = js.native
  
  def open[Value](store: Adapter[Value]): js.Promise[ShardingDatastore[Value]] = js.native
}
