package typings.cassandraDashDriver.cassandraDashDriverMod.concurrent

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.Anon_ParamsQuery
import typings.cassandraDashDriver.cassandraDashDriverMod.Client
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "concurrent.executeConcurrent")
@js.native
object executeConcurrent extends js.Object {
  def apply(client: Client, query: String, parameters: js.Array[js.Array[_]]): js.Promise[ResultSetGroup] = js.native
  def apply(
    client: Client,
    query: String,
    parameters: js.Array[js.Array[_]],
    options: executeConcurrentOptions
  ): js.Promise[ResultSetGroup] = js.native
  def apply(client: Client, query: String, parameters: StringDictionary[js.Any]): js.Promise[ResultSetGroup] = js.native
  def apply(
    client: Client,
    query: String,
    parameters: StringDictionary[js.Any],
    options: executeConcurrentOptions
  ): js.Promise[ResultSetGroup] = js.native
  def apply(client: Client, query: String, parameters: Readable): js.Promise[ResultSetGroup] = js.native
  def apply(client: Client, query: String, parameters: Readable, options: executeConcurrentOptions): js.Promise[ResultSetGroup] = js.native
  def apply(client: Client, query: js.Array[Anon_ParamsQuery], parameters: js.Array[js.Array[_]]): js.Promise[ResultSetGroup] = js.native
  def apply(
    client: Client,
    query: js.Array[Anon_ParamsQuery],
    parameters: js.Array[js.Array[_]],
    options: executeConcurrentOptions
  ): js.Promise[ResultSetGroup] = js.native
  def apply(client: Client, query: js.Array[Anon_ParamsQuery], parameters: StringDictionary[js.Any]): js.Promise[ResultSetGroup] = js.native
  def apply(
    client: Client,
    query: js.Array[Anon_ParamsQuery],
    parameters: StringDictionary[js.Any],
    options: executeConcurrentOptions
  ): js.Promise[ResultSetGroup] = js.native
  def apply(client: Client, query: js.Array[Anon_ParamsQuery], parameters: Readable): js.Promise[ResultSetGroup] = js.native
  def apply(
    client: Client,
    query: js.Array[Anon_ParamsQuery],
    parameters: Readable,
    options: executeConcurrentOptions
  ): js.Promise[ResultSetGroup] = js.native
}

