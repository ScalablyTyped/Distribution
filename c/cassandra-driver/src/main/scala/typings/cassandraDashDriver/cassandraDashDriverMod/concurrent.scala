package typings.cassandraDashDriver.cassandraDashDriverMod

import typings.cassandraDashDriver.Anon_Params
import typings.cassandraDashDriver.libConcurrentMod.concurrent.Options
import typings.cassandraDashDriver.libConcurrentMod.concurrent.ResultSetGroup
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "concurrent")
@js.native
object concurrent extends js.Object {
  def executeConcurrent(client: Client, queries: js.Array[Anon_Params]): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(client: Client, queries: js.Array[Anon_Params], options: Options): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(client: Client, query: String, parameters: js.Array[js.Array[_]]): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(client: Client, query: String, parameters: js.Array[js.Array[_]], options: Options): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(client: Client, query: String, parameters: Readable): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(client: Client, query: String, parameters: Readable, options: Options): js.Promise[ResultSetGroup] = js.native
}

