package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client
  extends nodeLib.eventsMod.EventEmitter {
  var hosts: HostMap = js.native
  var keyspace: java.lang.String = js.native
  var metadata: cassandraDashDriverLib.cassandraDashDriverMod.metadataNs.Metadata = js.native
  var metrics: cassandraDashDriverLib.cassandraDashDriverMod.metricsNs.ClientMetrics = js.native
  def batch(queries: js.Array[cassandraDashDriverLib.Anon_Params | java.lang.String]): js.Promise[cassandraDashDriverLib.cassandraDashDriverMod.typesNs.ResultSet] = js.native
  def batch(queries: js.Array[cassandraDashDriverLib.Anon_Params | java.lang.String], callback: ResultCallback): scala.Unit = js.native
  def batch(queries: js.Array[cassandraDashDriverLib.Anon_Params | java.lang.String], options: QueryOptions): js.Promise[cassandraDashDriverLib.cassandraDashDriverMod.typesNs.ResultSet] = js.native
  def batch(
    queries: js.Array[cassandraDashDriverLib.Anon_Params | java.lang.String],
    options: QueryOptions,
    callback: ResultCallback
  ): scala.Unit = js.native
  def connect(): js.Promise[scala.Unit] = js.native
  def connect(callback: Callback): scala.Unit = js.native
  def eachRow(query: java.lang.String): scala.Unit = js.native
  def eachRow(query: java.lang.String, params: js.Any): scala.Unit = js.native
  def eachRow(query: java.lang.String, params: js.Any, options: QueryOptions): scala.Unit = js.native
  def eachRow(query: java.lang.String, params: js.Any, options: QueryOptions, rowCallback: Callback): scala.Unit = js.native
  def eachRow(
    query: java.lang.String,
    params: js.Any,
    options: QueryOptions,
    rowCallback: Callback,
    callback: Callback
  ): scala.Unit = js.native
  def execute(query: java.lang.String): js.Promise[cassandraDashDriverLib.cassandraDashDriverMod.typesNs.ResultSet] = js.native
  def execute(query: java.lang.String, callback: ResultCallback): scala.Unit = js.native
  def execute(query: java.lang.String, params: js.Any): js.Promise[cassandraDashDriverLib.cassandraDashDriverMod.typesNs.ResultSet] = js.native
  def execute(query: java.lang.String, params: js.Any, callback: ResultCallback): scala.Unit = js.native
  def execute(query: java.lang.String, params: js.Any, options: QueryOptions): js.Promise[cassandraDashDriverLib.cassandraDashDriverMod.typesNs.ResultSet] = js.native
  def execute(query: java.lang.String, params: js.Any, options: QueryOptions, callback: ResultCallback): scala.Unit = js.native
  def getReplicas(keyspace: java.lang.String, token: nodeLib.Buffer): js.Array[_] = js.native
   // TODO: Should this be a more explicit return?
  def getState(): cassandraDashDriverLib.cassandraDashDriverMod.metadataNs.ClientState = js.native
  def shutdown(): js.Promise[scala.Unit] = js.native
  def shutdown(callback: Callback): scala.Unit = js.native
  @JSName("shutdown")
  def shutdown_Unit(): scala.Unit = js.native
  def stream(query: java.lang.String): nodeLib.NodeJSNs.ReadableStream = js.native
  def stream(query: java.lang.String, params: js.Any): nodeLib.NodeJSNs.ReadableStream = js.native
  def stream(query: java.lang.String, params: js.Any, options: QueryOptions): nodeLib.NodeJSNs.ReadableStream = js.native
  def stream(query: java.lang.String, params: js.Any, options: QueryOptions, callback: Callback): nodeLib.NodeJSNs.ReadableStream = js.native
}

@JSImport("cassandra-driver", "Client")
@js.native
class ClientCls () extends Client {
  def this(options: ClientOptions) = this()
}

