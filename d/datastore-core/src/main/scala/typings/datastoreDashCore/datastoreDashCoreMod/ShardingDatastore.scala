package typings.datastoreDashCore.datastoreDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.datastoreDashCore.datastoreDashCoreMod.shard.Shard
import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShardingDatastore[Value] extends Datastore[Value] {
  var child: KeytransformDatastore[Value]
  var shard: Shard
}

@JSImport("datastore-core", "ShardingDatastore")
@js.native
object ShardingDatastore extends TopLevel[ShardingDatastoreConstructor]

