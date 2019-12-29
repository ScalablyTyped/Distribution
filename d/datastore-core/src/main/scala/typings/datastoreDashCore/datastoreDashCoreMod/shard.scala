package typings.datastoreDashCore.datastoreDashCoreMod

import typings.datastoreDashCore.datastoreDashCoreStrings.SHARDING
import typings.datastoreDashCore.datastoreDashCoreStrings.SlashrepoSlashflatfsSlashshardSlash
import typings.datastoreDashCore.datastoreDashCoreStrings._README
import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Datastore
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datastore-core", "shard")
@js.native
object shard extends js.Object {
  @js.native
  class NextToLast () extends Shard
  
  @js.native
  class Prefix () extends Shard
  
  @js.native
  class Shard protected () extends js.Object {
    def this(length: Double) = this()
    var _padding: String = js.native
    var name: String = js.native
    var param: Double = js.native
    def fun(str: String): String = js.native
  }
  
  @js.native
  class Suffix () extends Shard
  
  val PREFIX: SlashrepoSlashflatfsSlashshardSlash = js.native
  val README_FN: _README = js.native
  val SHARDING_FN: SHARDING = js.native
  val readme: String = js.native
  def parseShardFun(str: String): Shard = js.native
  def readShardFun(path: String, store: Datastore[Buffer]): js.Promise[Shard] = js.native
}

