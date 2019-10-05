package typings.cassandraDashDriver.cassandraDashDriverMod.metadata

import org.scalablytyped.runtime.TopLevel
import typings.cassandraDashDriver.Anon_CodeInfo
import typings.cassandraDashDriver.cassandraDashDriverMod.Callback
import typings.cassandraDashDriver.cassandraDashDriverMod.Host
import typings.cassandraDashDriver.cassandraDashDriverMod.token.Token
import typings.cassandraDashDriver.cassandraDashDriverMod.token.TokenRange
import typings.cassandraDashDriver.cassandraDashDriverMod.types.Uuid
import typings.cassandraDashDriver.cassandraDashDriverMod.types.consistencies
import typings.node.Buffer
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  def clearPrepared(): Unit = js.native
  def getAggregate(keyspaceName: String, name: String, signature: js.Array[Anon_CodeInfo | String]): js.Promise[Aggregate] = js.native
  def getAggregate(
    keyspaceName: String,
    name: String,
    signature: js.Array[Anon_CodeInfo | String],
    callback: MetadataCallback[Aggregate]
  ): Unit = js.native
  def getAggregates(keyspaceName: String, name: String): js.Promise[js.Array[Aggregate]] = js.native
  def getAggregates(keyspaceName: String, name: String, callback: MetadataCallback[js.Array[Aggregate]]): Unit = js.native
  def getFunction(keyspaceName: String, name: String, signature: js.Array[Anon_CodeInfo | String]): js.Promise[SchemaFunction] = js.native
  def getFunction(
    keyspaceName: String,
    name: String,
    signature: js.Array[Anon_CodeInfo | String],
    callback: MetadataCallback[SchemaFunction]
  ): Unit = js.native
  def getFunctions(keyspaceName: String, name: String): js.Promise[js.Array[SchemaFunction]] = js.native
  def getFunctions(keyspaceName: String, name: String, callback: MetadataCallback[js.Array[SchemaFunction]]): Unit = js.native
  def getMaterializedView(keyspaceName: String, name: String, callback: Callback): js.Promise[MaterializedView] = js.native
  def getMaterializedView(keyspaceName: String, name: String, callback: MetadataCallback[MaterializedView]): Unit = js.native
  def getReplicas(keyspaceName: String, token: Token): js.Array[_] = js.native
  def getReplicas(keyspaceName: String, token: TokenRange): js.Array[_] = js.native
  def getReplicas(keyspaceName: String, token: Buffer): js.Array[_] = js.native
  def getTable(keyspaceName: String, name: String): js.Promise[TableMetadata] = js.native
   // TODO
  def getTable(keyspaceName: String, name: String, callback: MetadataCallback[TableMetadata]): Unit = js.native
  def getTokenRanges(): Set[TokenRange] = js.native
  def getTokenRangesForHost(keyspaceName: String, host: Host): Set[TokenRange] | Null = js.native
  def getTrace(traceId: Uuid): js.Promise[QueryTrace] = js.native
  def getTrace(traceId: Uuid, callback: MetadataCallback[QueryTrace]): Unit = js.native
  def getTrace(traceId: Uuid, consistency: consistencies, callback: Callback): js.Promise[QueryTrace] = js.native
  def getTrace(traceId: Uuid, consistency: consistencies, callback: MetadataCallback[QueryTrace]): Unit = js.native
   // TODO
  def getUdt(keyspaceName: String, name: String): js.Promise[_] = js.native
  def getUdt(keyspaceName: String, name: String, callback: MetadataCallback[_]): Unit = js.native
  def newToken(components: String): Token = js.native
   // TODO
  def newToken(components: js.Array[Buffer]): Token = js.native
  def newToken(components: Buffer): Token = js.native
  def newTokenRange(start: Token, end: Token): TokenRange = js.native
  def refreshKeyspace(name: String): js.Promise[Unit] = js.native
  def refreshKeyspace(name: String, callback: Callback): Unit = js.native
  def refreshKeyspaces(): js.Promise[Unit] = js.native
  def refreshKeyspaces(callback: Callback): Unit = js.native
  def refreshKeyspaces(waitReconnect: Boolean): js.Promise[Unit] = js.native
  def refreshKeyspaces(waitReconnect: Boolean, callback: Callback): Unit = js.native
}

@JSImport("cassandra-driver", "metadata.Metadata")
@js.native
object Metadata extends TopLevel[MetadataStatic]

