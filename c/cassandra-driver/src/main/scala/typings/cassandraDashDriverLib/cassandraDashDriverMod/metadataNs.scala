package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "metadata")
@js.native
object metadataNs extends js.Object {
  trait Aggregate extends js.Object {
    var argumentTypes: js.Array[cassandraDashDriverLib.Anon_CodeInfo]
    var finalFunction: java.lang.String
    var initCondition: java.lang.String
    var keyspaceName: java.lang.String
    var returnType: java.lang.String
    var signature: js.Array[java.lang.String]
    var stateFunction: java.lang.String
    var stateType: java.lang.String
  }
  
  trait ClientState extends js.Object {
    def getConnectedHosts(): js.Array[cassandraDashDriverLib.cassandraDashDriverMod.Host]
    def getInFlightQueries(host: cassandraDashDriverLib.cassandraDashDriverMod.Host): scala.Double
    def getOpenConnections(host: cassandraDashDriverLib.cassandraDashDriverMod.Host): scala.Double
  }
  
  trait ColumnInfo extends js.Object {
    var name: java.lang.String
    var `type`: DataTypeInfo
  }
  
  trait DataCollection extends js.Object {
    var bloomFilterFalsePositiveChance: scala.Double
    var caching: cassandraDashDriverLib.cassandraDashDriverMod.metadataNs.caching
    var clusterKeys: js.Array[cassandraDashDriverLib.Anon_C]
    var clusteringOrder: js.Array[java.lang.String]
    var columns: js.Array[ColumnInfo]
    var columnsByName: org.scalablytyped.runtime.StringDictionary[ColumnInfo]
    var comment: java.lang.String
    var compactionClass: java.lang.String
    var compactionOptions: js.Any
    var compression: js.Any
    var crcCheckChange: js.UndefOr[scala.Double] = js.undefined
    var defaultTtl: scala.Double
    var extensions: js.Any
    var gcGraceSeconds: scala.Double
    var localReadRepairChance: scala.Double
    var maxIndexInterval: js.UndefOr[scala.Double] = js.undefined
    var minIndexInterval: js.UndefOr[scala.Double] = js.undefined
    var name: java.lang.String
    var partitionKeys: js.Array[cassandraDashDriverLib.Anon_CIndex]
    var populateCacheOnFlush: scala.Boolean
    var readRepairChance: scala.Double
    var speculateRetry: java.lang.String
  }
  
  trait DataTypeInfo extends js.Object {
    var code: scala.Double
    var info: java.lang.String | DataTypeInfo | js.Array[DataTypeInfo]
    var options: cassandraDashDriverLib.Anon_Frozen
  }
  
  trait Index extends js.Object {
    var kind: IndexType
    var name: java.lang.String
    var options: js.Object
    var target: java.lang.String
    def isCompositesKind(): scala.Boolean
    def isCustomKind(): scala.Boolean
    def isKeysKind(): scala.Boolean
  }
  
  @js.native
  sealed trait IndexType extends js.Object
  
  @js.native
  trait Metadata extends js.Object {
    def clearPrepared(): scala.Unit = js.native
    def getAggregate(
      keyspaceName: java.lang.String,
      name: java.lang.String,
      signature: js.Array[cassandraDashDriverLib.Anon_CodeInfo | java.lang.String]
    ): js.Promise[Aggregate] = js.native
    def getAggregate(
      keyspaceName: java.lang.String,
      name: java.lang.String,
      signature: js.Array[cassandraDashDriverLib.Anon_CodeInfo | java.lang.String],
      callback: MetadataCallback[Aggregate]
    ): scala.Unit = js.native
    def getAggregates(keyspaceName: java.lang.String, name: java.lang.String): js.Promise[js.Array[Aggregate]] = js.native
    def getAggregates(
      keyspaceName: java.lang.String,
      name: java.lang.String,
      callback: MetadataCallback[js.Array[Aggregate]]
    ): scala.Unit = js.native
    def getFunction(
      keyspaceName: java.lang.String,
      name: java.lang.String,
      signature: js.Array[cassandraDashDriverLib.Anon_CodeInfo | java.lang.String]
    ): js.Promise[SchemaFunction] = js.native
    def getFunction(
      keyspaceName: java.lang.String,
      name: java.lang.String,
      signature: js.Array[cassandraDashDriverLib.Anon_CodeInfo | java.lang.String],
      callback: MetadataCallback[SchemaFunction]
    ): scala.Unit = js.native
    def getFunctions(keyspaceName: java.lang.String, name: java.lang.String): js.Promise[js.Array[SchemaFunction]] = js.native
    def getFunctions(
      keyspaceName: java.lang.String,
      name: java.lang.String,
      callback: MetadataCallback[js.Array[SchemaFunction]]
    ): scala.Unit = js.native
    def getMaterializedView(
      keyspaceName: java.lang.String,
      name: java.lang.String,
      callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback
    ): js.Promise[MaterializedView] = js.native
    def getMaterializedView(
      keyspaceName: java.lang.String,
      name: java.lang.String,
      callback: MetadataCallback[MaterializedView]
    ): scala.Unit = js.native
    def getReplicas(keyspaceName: java.lang.String, token: cassandraDashDriverLib.cassandraDashDriverMod.tokenNs.Token): js.Array[_] = js.native
    def getReplicas(
      keyspaceName: java.lang.String,
      token: cassandraDashDriverLib.cassandraDashDriverMod.tokenNs.TokenRange
    ): js.Array[_] = js.native
    def getReplicas(keyspaceName: java.lang.String, token: nodeLib.Buffer): js.Array[_] = js.native
    def getTable(keyspaceName: java.lang.String, name: java.lang.String): js.Promise[TableMetadata] = js.native
     // TODO
    def getTable(keyspaceName: java.lang.String, name: java.lang.String, callback: MetadataCallback[TableMetadata]): scala.Unit = js.native
    def getTokenRanges(): stdLib.Set[cassandraDashDriverLib.cassandraDashDriverMod.tokenNs.TokenRange] = js.native
    def getTokenRangesForHost(keyspaceName: java.lang.String, host: cassandraDashDriverLib.cassandraDashDriverMod.Host): stdLib.Set[cassandraDashDriverLib.cassandraDashDriverMod.tokenNs.TokenRange] | scala.Null = js.native
    def getTrace(traceId: cassandraDashDriverLib.cassandraDashDriverMod.typesNs.Uuid): js.Promise[QueryTrace] = js.native
    def getTrace(
      traceId: cassandraDashDriverLib.cassandraDashDriverMod.typesNs.Uuid,
      callback: MetadataCallback[QueryTrace]
    ): scala.Unit = js.native
    def getTrace(
      traceId: cassandraDashDriverLib.cassandraDashDriverMod.typesNs.Uuid,
      consistency: cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies,
      callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback
    ): js.Promise[QueryTrace] = js.native
    def getTrace(
      traceId: cassandraDashDriverLib.cassandraDashDriverMod.typesNs.Uuid,
      consistency: cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies,
      callback: MetadataCallback[QueryTrace]
    ): scala.Unit = js.native
     // TODO
    def getUdt(keyspaceName: java.lang.String, name: java.lang.String): js.Promise[_] = js.native
    def getUdt(keyspaceName: java.lang.String, name: java.lang.String, callback: MetadataCallback[_]): scala.Unit = js.native
    def newToken(components: java.lang.String): cassandraDashDriverLib.cassandraDashDriverMod.tokenNs.Token = js.native
     // TODO
    def newToken(components: js.Array[nodeLib.Buffer]): cassandraDashDriverLib.cassandraDashDriverMod.tokenNs.Token = js.native
    def newToken(components: nodeLib.Buffer): cassandraDashDriverLib.cassandraDashDriverMod.tokenNs.Token = js.native
    def newTokenRange(
      start: cassandraDashDriverLib.cassandraDashDriverMod.tokenNs.Token,
      end: cassandraDashDriverLib.cassandraDashDriverMod.tokenNs.Token
    ): cassandraDashDriverLib.cassandraDashDriverMod.tokenNs.TokenRange = js.native
    def refreshKeyspace(name: java.lang.String): js.Promise[scala.Unit] = js.native
    def refreshKeyspace(name: java.lang.String, callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback): scala.Unit = js.native
    def refreshKeyspaces(): js.Promise[scala.Unit] = js.native
    def refreshKeyspaces(callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback): scala.Unit = js.native
    def refreshKeyspaces(waitReconnect: scala.Boolean): js.Promise[scala.Unit] = js.native
    def refreshKeyspaces(waitReconnect: scala.Boolean, callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback): scala.Unit = js.native
  }
  
  @js.native
  class MetadataCls protected () extends Metadata {
    def this(options: cassandraDashDriverLib.cassandraDashDriverMod.ClientOptions, controlConnection: js.Any) = this()
  }
  
  @js.native
  trait MetadataStatic
    extends org.scalablytyped.runtime.Instantiable2[
          /* options */ cassandraDashDriverLib.cassandraDashDriverMod.ClientOptions, 
          /* controlConnection */ js.Any, 
          Metadata
        ]
  
  trait QueryTrace extends js.Object {
    var clientAddress: js.Any
    var coordinator: js.Any
    var duration: js.Any
    var events: js.Array[cassandraDashDriverLib.Anon_Activity]
    var parameters: js.Any
    var requestType: js.Any
    var startedAt: js.Any
  }
  
  trait SchemaFunction extends js.Object {
    var argumentNames: js.Array[java.lang.String]
    var argumentTypes: js.Array[cassandraDashDriverLib.Anon_CodeInfo]
    var body: java.lang.String
    var calledOnNullInput: scala.Boolean
    var keyspaceName: java.lang.String
    var language: java.lang.String
    var name: java.lang.String
    var returnType: java.lang.String
    var signature: js.Array[java.lang.String]
  }
  
  trait TableMetadata extends DataCollection {
    var cdc: js.UndefOr[scala.Boolean] = js.undefined
    var indexInterval: js.UndefOr[scala.Double] = js.undefined
    var indexes: js.Array[Index]
    var isCompact: scala.Boolean
    var memtableFlushPeriod: scala.Double
    var replicateOnWrite: scala.Boolean
    var virtual: scala.Boolean
  }
  
  /* Rewritten from type alias, can be one of: 
    - cassandraDashDriverLib.cassandraDashDriverLibStrings.all
    - cassandraDashDriverLib.cassandraDashDriverLibStrings.keys_only
    - cassandraDashDriverLib.cassandraDashDriverLibStrings.rows_only
    - cassandraDashDriverLib.cassandraDashDriverLibStrings.none
  */
  trait caching extends js.Object
  
  var Metadata: MetadataStatic = js.native
  @js.native
  object IndexType extends js.Object {
    @js.native
    sealed trait composites
      extends cassandraDashDriverLib.cassandraDashDriverMod.metadataNs.IndexType
    
    @js.native
    sealed trait custom
      extends cassandraDashDriverLib.cassandraDashDriverMod.metadataNs.IndexType
    
    @js.native
    sealed trait keys
      extends cassandraDashDriverLib.cassandraDashDriverMod.metadataNs.IndexType
    
    /* 1 */ val composites: composites with scala.Double = js.native
    /* 0 */ val custom: custom with scala.Double = js.native
    /* 0 */ val keys: keys with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        cassandraDashDriverLib.cassandraDashDriverMod.metadataNs.IndexType with scala.Double
      ] = js.native
  }
  
  type MaterializedView = DataCollection
  type MetadataCallback[T] = js.Function2[/* err */ js.Any, /* retVal */ T, scala.Unit]
}

