package typings.datastoreDashCore.datastoreDashCoreMod

import org.scalablytyped.runtime.Instantiable1
import typings.datastoreDashCore.datastoreDashCoreMod.shard.Shard
import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Datastore
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

