package typings.datastoreCore.mod

import typings.interfaceDatastore.mod.Adapter
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("datastore-core", "shard")
@js.native
object shard extends js.Object {
  
  @JSName("PREFIX")
  val PREFIX_ : /* "/repo/flatfs/shard/" */ String = js.native
  
  val README_FN: /* "_README" */ String = js.native
  
  val SHARDING_FN: /* "SHARDING" */ String = js.native
  
  def parseShardFun(str: String): Shard = js.native
  
  def readShardFun(path: String, store: Adapter[Buffer]): js.Promise[Shard] = js.native
  
  val readme: String = js.native
  
  @js.native
  class NextToLast () extends Shard
  
  @js.native
  class Prefix () extends Shard
  
  @js.native
  class Shard protected () extends js.Object {
    def this(length: Double) = this()
    
    var _padding: String = js.native
    
    def fun(str: String): String = js.native
    
    var name: String = js.native
    
    var param: Double = js.native
  }
  
  @js.native
  class Suffix () extends Shard
}
