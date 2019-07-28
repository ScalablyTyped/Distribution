package typings.cassandraDashDriver.cassandraDashDriverMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.Anon_Activity
import typings.cassandraDashDriver.Anon_C
import typings.cassandraDashDriver.Anon_CIndex
import typings.cassandraDashDriver.Anon_CodeInfo
import typings.cassandraDashDriver.Anon_Frozen
import typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.Aggregate
import typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.ColumnInfo
import typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.DataCollection
import typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.DataTypeInfo
import typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.Index
import typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.IndexType
import typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.MaterializedView
import typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.Metadata
import typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.MetadataCallback
import typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.MetadataStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.QueryTrace
import typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.SchemaFunction
import typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.TableMetadata
import typings.cassandraDashDriver.cassandraDashDriverMod.tokenNs.Token
import typings.cassandraDashDriver.cassandraDashDriverMod.tokenNs.TokenRange
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.Uuid
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.consistencies
import typings.node.Buffer
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "metadata")
@js.native
object metadataNs extends js.Object {
  trait Aggregate extends js.Object {
    var argumentTypes: js.Array[Anon_CodeInfo]
    var finalFunction: String
    var initCondition: String
    var keyspaceName: String
    var returnType: String
    var signature: js.Array[String]
    var stateFunction: String
    var stateType: String
  }
  
  trait ClientState extends js.Object {
    def getConnectedHosts(): js.Array[Host]
    def getInFlightQueries(host: Host): Double
    def getOpenConnections(host: Host): Double
  }
  
  trait ColumnInfo extends js.Object {
    var name: String
    var `type`: DataTypeInfo
  }
  
  trait DataCollection extends js.Object {
    var bloomFilterFalsePositiveChance: Double
    var caching: typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.caching
    var clusterKeys: js.Array[Anon_C]
    var clusteringOrder: js.Array[String]
    var columns: js.Array[ColumnInfo]
    var columnsByName: StringDictionary[ColumnInfo]
    var comment: String
    var compactionClass: String
    var compactionOptions: js.Any
    var compression: js.Any
    var crcCheckChange: js.UndefOr[Double] = js.undefined
    var defaultTtl: Double
    var extensions: js.Any
    var gcGraceSeconds: Double
    var localReadRepairChance: Double
    var maxIndexInterval: js.UndefOr[Double] = js.undefined
    var minIndexInterval: js.UndefOr[Double] = js.undefined
    var name: String
    var partitionKeys: js.Array[Anon_CIndex]
    var populateCacheOnFlush: Boolean
    var readRepairChance: Double
    var speculateRetry: String
  }
  
  trait DataTypeInfo extends js.Object {
    var code: Double
    var info: String | DataTypeInfo | js.Array[DataTypeInfo]
    var options: Anon_Frozen
  }
  
  trait Index extends js.Object {
    var kind: IndexType
    var name: String
    var options: js.Object
    var target: String
    def isCompositesKind(): Boolean
    def isCustomKind(): Boolean
    def isKeysKind(): Boolean
  }
  
  @js.native
  sealed trait IndexType extends js.Object
  
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
  
  @js.native
  class MetadataCls protected () extends Metadata {
    def this(options: ClientOptions, controlConnection: js.Any) = this()
  }
  
  @js.native
  trait MetadataStatic
    extends Instantiable2[/* options */ ClientOptions, /* controlConnection */ js.Any, Metadata]
  
  trait QueryTrace extends js.Object {
    var clientAddress: js.Any
    var coordinator: js.Any
    var duration: js.Any
    var events: js.Array[Anon_Activity]
    var parameters: js.Any
    var requestType: js.Any
    var startedAt: js.Any
  }
  
  trait SchemaFunction extends js.Object {
    var argumentNames: js.Array[String]
    var argumentTypes: js.Array[Anon_CodeInfo]
    var body: String
    var calledOnNullInput: Boolean
    var keyspaceName: String
    var language: String
    var name: String
    var returnType: String
    var signature: js.Array[String]
  }
  
  trait TableMetadata extends DataCollection {
    var cdc: js.UndefOr[Boolean] = js.undefined
    var indexInterval: js.UndefOr[Double] = js.undefined
    var indexes: js.Array[Index]
    var isCompact: Boolean
    var memtableFlushPeriod: Double
    var replicateOnWrite: Boolean
    var virtual: Boolean
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cassandraDashDriver.cassandraDashDriverStrings.all
    - typings.cassandraDashDriver.cassandraDashDriverStrings.keys_only
    - typings.cassandraDashDriver.cassandraDashDriverStrings.rows_only
    - typings.cassandraDashDriver.cassandraDashDriverStrings.none
  */
  trait caching extends js.Object
  
  var Metadata: MetadataStatic = js.native
  @js.native
  object IndexType extends js.Object {
    @js.native
    sealed trait composites extends IndexType
    
    @js.native
    sealed trait custom extends IndexType
    
    @js.native
    sealed trait keys extends IndexType
    
    /* 1 */ val composites: typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.IndexType.composites with Double = js.native
    /* 0 */ val custom: typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.IndexType.custom with Double = js.native
    /* 0 */ val keys: typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.IndexType.keys with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[IndexType with Double] = js.native
  }
  
  type MaterializedView = DataCollection
  type MetadataCallback[T] = js.Function2[/* err */ js.Any, /* retVal */ T, Unit]
}

