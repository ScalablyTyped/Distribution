package typings.cassandraDashDriver.cassandraDashDriverMod

import typings.cassandraDashDriver.Anon_Params
import typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.ClientState
import typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.Metadata
import typings.cassandraDashDriver.cassandraDashDriverMod.metricsNs.ClientMetrics
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.ResultSet
import typings.node.Buffer
import typings.node.NodeJSNs.ReadableStream
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends EventEmitter {
  var hosts: HostMap = js.native
  var keyspace: String = js.native
  var metadata: Metadata = js.native
  var metrics: ClientMetrics = js.native
  def batch(queries: js.Array[Anon_Params | String]): js.Promise[ResultSet] = js.native
  def batch(queries: js.Array[Anon_Params | String], callback: ResultCallback): Unit = js.native
  def batch(queries: js.Array[Anon_Params | String], options: QueryOptions): js.Promise[ResultSet] = js.native
  def batch(queries: js.Array[Anon_Params | String], options: QueryOptions, callback: ResultCallback): Unit = js.native
  def connect(): js.Promise[Unit] = js.native
  def connect(callback: Callback): Unit = js.native
  def eachRow(query: String): Unit = js.native
  def eachRow(query: String, params: js.Any): Unit = js.native
  def eachRow(query: String, params: js.Any, options: QueryOptions): Unit = js.native
  def eachRow(query: String, params: js.Any, options: QueryOptions, rowCallback: Callback): Unit = js.native
  def eachRow(query: String, params: js.Any, options: QueryOptions, rowCallback: Callback, callback: Callback): Unit = js.native
  def execute(query: String): js.Promise[ResultSet] = js.native
  def execute(query: String, callback: ResultCallback): Unit = js.native
  def execute(query: String, params: js.Any): js.Promise[ResultSet] = js.native
  def execute(query: String, params: js.Any, callback: ResultCallback): Unit = js.native
  def execute(query: String, params: js.Any, options: QueryOptions): js.Promise[ResultSet] = js.native
  def execute(query: String, params: js.Any, options: QueryOptions, callback: ResultCallback): Unit = js.native
  def getReplicas(keyspace: String, token: Buffer): js.Array[_] = js.native
   // TODO: Should this be a more explicit return?
  def getState(): ClientState = js.native
  def shutdown(): js.Promise[Unit] = js.native
  def shutdown(callback: Callback): Unit = js.native
  @JSName("shutdown")
  def shutdown_Unit(): Unit = js.native
  def stream(query: String): ReadableStream = js.native
  def stream(query: String, params: js.Any): ReadableStream = js.native
  def stream(query: String, params: js.Any, options: QueryOptions): ReadableStream = js.native
  def stream(query: String, params: js.Any, options: QueryOptions, callback: Callback): ReadableStream = js.native
}

@JSImport("cassandra-driver", "Client")
@js.native
class ClientCls () extends Client {
  def this(options: ClientOptions) = this()
}

