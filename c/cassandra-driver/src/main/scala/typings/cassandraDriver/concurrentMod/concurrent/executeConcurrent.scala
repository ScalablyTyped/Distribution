package typings.cassandraDriver.concurrentMod.concurrent

import typings.cassandraDriver.anon.Params
import typings.cassandraDriver.mod.Client
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/concurrent", "concurrent.executeConcurrent")
@js.native
object executeConcurrent extends js.Object {
  
  def apply(client: Client, queries: js.Array[Params]): js.Promise[ResultSetGroup] = js.native
  def apply(client: Client, queries: js.Array[Params], options: Options): js.Promise[ResultSetGroup] = js.native
  def apply(client: Client, query: String, parameters: js.Array[js.Array[_]]): js.Promise[ResultSetGroup] = js.native
  def apply(client: Client, query: String, parameters: js.Array[js.Array[_]], options: Options): js.Promise[ResultSetGroup] = js.native
  def apply(client: Client, query: String, parameters: Readable): js.Promise[ResultSetGroup] = js.native
  def apply(client: Client, query: String, parameters: Readable, options: Options): js.Promise[ResultSetGroup] = js.native
}
