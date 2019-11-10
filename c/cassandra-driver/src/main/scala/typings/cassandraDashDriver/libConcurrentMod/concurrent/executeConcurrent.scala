package typings.cassandraDashDriver.libConcurrentMod.concurrent

import typings.cassandraDashDriver.Anon_Params
import typings.cassandraDashDriver.cassandraDashDriverMod.Client
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/concurrent", "concurrent.executeConcurrent")
@js.native
object executeConcurrent extends js.Object {
  def apply(client: Client, queries: js.Array[Anon_Params]): js.Promise[ResultSetGroup] = js.native
  def apply(client: Client, queries: js.Array[Anon_Params], options: Options): js.Promise[ResultSetGroup] = js.native
  def apply(client: Client, query: String, parameters: js.Array[js.Array[_]]): js.Promise[ResultSetGroup] = js.native
  def apply(client: Client, query: String, parameters: js.Array[js.Array[_]], options: Options): js.Promise[ResultSetGroup] = js.native
  def apply(client: Client, query: String, parameters: Readable): js.Promise[ResultSetGroup] = js.native
  def apply(client: Client, query: String, parameters: Readable, options: Options): js.Promise[ResultSetGroup] = js.native
}

