package typings.datastoreCore.mod

import org.scalablytyped.runtime.Instantiable1
import typings.datastoreCore.mod.shard.Shard
import typings.interfaceDatastore.mod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShardingDatastoreConstructor
  extends Instantiable1[/* stores */ js.Array[Datastore[js.Object]], ShardingDatastore[js.Object]] {
  def create[Value](store: Datastore[Value], shard: Shard): js.Promise[ShardingDatastore[Value]] = js.native
  def createOrOpen[Value](store: Datastore[Value], shard: Shard): js.Promise[ShardingDatastore[Value]] = js.native
  def open[Value](store: Datastore[Value]): js.Promise[ShardingDatastore[Value]] = js.native
}

