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
  
  @js.native
  trait AggregateStatic
    extends ScalablyTyped.runtime.Instantiable0[Aggregate]
  
  
  trait ClientState extends js.Object {
    def getConnectedHosts(): js.Array[cassandraDashDriverLib.cassandraDashDriverMod.Host]
    def getInFlightQueries(host: cassandraDashDriverLib.cassandraDashDriverMod.Host): scala.Double
    def getOpenConnections(host: cassandraDashDriverLib.cassandraDashDriverMod.Host): scala.Double
  }
  
  @js.native
  trait ClientStateStatic
    extends ScalablyTyped.runtime.Instantiable0[ClientState]
  
  
  trait ColumnInfo extends js.Object {
    var name: java.lang.String
    var `type`: DataTypeInfo
  }
  
  
  trait DataCollection extends js.Object {
    var bloomFilterFalsePositiveChance: scala.Double
    var caching: caching
    var clusterKeys: js.Array[cassandraDashDriverLib.Anon_Order]
    var clusteringOrder: js.Array[java.lang.String]
    var columns: js.Array[ColumnInfo]
    var columnsByName: ScalablyTyped.runtime.StringDictionary[ColumnInfo]
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
    var partitionKeys: js.Array[cassandraDashDriverLib.Anon_Index]
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
  trait IndexStatic
    extends ScalablyTyped.runtime.Instantiable4[
          /* name */ java.lang.String, 
          /* target */ java.lang.String, 
          /* kind */ IndexType, 
          /* options */ js.Object, 
          Index
        ] {
    def fromColumnRows(
      columnRows: js.Array[cassandraDashDriverLib.cassandraDashDriverMod.typesNs.Row],
      columnsByName: ScalablyTyped.runtime.StringDictionary[ColumnInfo]
    ): js.Array[Index] = js.native
    def fromRows(indexRows: js.Array[cassandraDashDriverLib.cassandraDashDriverMod.typesNs.Row]): js.Array[Index] = js.native
  }
  
  @js.native
  sealed trait IndexType extends js.Object
  
  @js.native
  trait MaterializedViewStatic
    extends ScalablyTyped.runtime.Instantiable1[/* name */ java.lang.String, MaterializedView]
  
  @js.native
  trait Metadata extends js.Object {
    def clearPrepared(): scala.Unit = js.native
    def getAggregate(
      keyspaceName: java.lang.String,
      name: java.lang.String,
      signature: js.Array[cassandraDashDriverLib.Anon_CodeInfo | java.lang.String],
      callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback
    ): scala.Unit = js.native
    def getAggregates(
      keyspaceName: java.lang.String,
      name: java.lang.String,
      callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback
    ): scala.Unit = js.native
    def getFunction(
      keyspaceName: java.lang.String,
      name: java.lang.String,
      signature: js.Array[cassandraDashDriverLib.Anon_CodeInfo | java.lang.String],
      callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback
    ): scala.Unit = js.native
    def getFunctions(
      keyspaceName: java.lang.String,
      name: java.lang.String,
      callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback
    ): scala.Unit = js.native
    def getMaterializedView(
      keyspaceName: java.lang.String,
      name: java.lang.String,
      callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback
    ): scala.Unit = js.native
    def getReplicas(keyspaceName: java.lang.String, tokenBuffer: nodeLib.Buffer): js.Array[_] = js.native
    def getTable(
      keyspaceName: java.lang.String,
      name: java.lang.String,
      callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback
    ): scala.Unit = js.native
    def getTrace(
      traceId: cassandraDashDriverLib.cassandraDashDriverMod.typesNs.Uuid,
      callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback
    ): scala.Unit = js.native
    def getUdt(
      keyspaceName: java.lang.String,
      name: java.lang.String,
      callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback
    ): scala.Unit = js.native
    def refreshKeyspace(name: java.lang.String): scala.Unit = js.native
    def refreshKeyspace(name: java.lang.String, callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback): scala.Unit = js.native
    def refreshKeyspaces(): scala.Unit = js.native
    def refreshKeyspaces(callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback): scala.Unit = js.native
  }
  
  @js.native
  trait MetadataStatic
    extends ScalablyTyped.runtime.Instantiable2[
          /* options */ cassandraDashDriverLib.cassandraDashDriverMod.ClientOptions, 
          /* controlConnection */ js.Any, 
          Metadata
        ]
  
  
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
  
  @js.native
  trait SchemaFunctionStatic
    extends ScalablyTyped.runtime.Instantiable0[SchemaFunction]
  
  
  trait TableMetadata extends DataCollection {
    var indexInterval: js.UndefOr[scala.Double] = js.undefined
    var indexes: js.Array[Index]
    var isCompact: scala.Boolean
    var memtableFlushPeriod: scala.Double
    var replicateOnWrite: scala.Boolean
  }
  
  @js.native
  trait TableMetadataStatic
    extends ScalablyTyped.runtime.Instantiable1[/* name */ java.lang.String, TableMetadata]
  
  var Aggregate: AggregateStatic = js.native
  var Index: IndexStatic = js.native
  var MaterializedView: MaterializedViewStatic = js.native
  var Metadata: MetadataStatic = js.native
  var SchemaFunction: SchemaFunctionStatic = js.native
  var TableMetadata: TableMetadataStatic = js.native
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
    
    val composites: composites with scala.Double = js.native
    /* 0 */ val custom: custom with scala.Double = js.native
    val keys: keys with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        cassandraDashDriverLib.cassandraDashDriverMod.metadataNs.IndexType with scala.Double
      ] = js.native
  }
  
  type MaterializedView = DataCollection
  type caching = cassandraDashDriverLib.cassandraDashDriverLibStrings.all | cassandraDashDriverLib.cassandraDashDriverLibStrings.keys_only | cassandraDashDriverLib.cassandraDashDriverLibStrings.rows_only | cassandraDashDriverLib.cassandraDashDriverLibStrings.none
}

