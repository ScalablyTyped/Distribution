package typings.cassandraDriver

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.anon.Activity
import typings.cassandraDriver.anon.Code
import typings.cassandraDriver.anon.Dictoption
import typings.cassandraDriver.anon.Frozen
import typings.cassandraDriver.anon.Info
import typings.cassandraDriver.anon.Name
import typings.cassandraDriver.mod.EmptyCallback
import typings.cassandraDriver.mod.Host
import typings.cassandraDriver.mod.ValueCallback
import typings.cassandraDriver.mod.token.Token
import typings.cassandraDriver.mod.token.TokenRange
import typings.cassandraDriver.typesMod.types.InetAddress
import typings.cassandraDriver.typesMod.types.Long
import typings.cassandraDriver.typesMod.types.Uuid
import typings.cassandraDriver.typesMod.types.consistencies
import typings.cassandraDriver.typesMod.types.dataTypes
import typings.node.Buffer
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  object metadata {
    
    @js.native
    sealed trait IndexKind extends StObject
    @JSImport("cassandra-driver/lib/metadata", "metadata.IndexKind")
    @js.native
    object IndexKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[IndexKind & Double] = js.native
      
      @js.native
      sealed trait composites
        extends StObject
           with IndexKind
      /* 1 */ val composites: typings.cassandraDriver.metadataMod.metadata.IndexKind.composites & Double = js.native
      
      @js.native
      sealed trait custom
        extends StObject
           with IndexKind
      /* 0 */ val custom: typings.cassandraDriver.metadataMod.metadata.IndexKind.custom & Double = js.native
      
      @js.native
      sealed trait keys
        extends StObject
           with IndexKind
      /* 0 */ val keys: typings.cassandraDriver.metadataMod.metadata.IndexKind.keys & Double = js.native
    }
    
    trait Aggregate extends StObject {
      
      var argumentTypes: js.Array[Code]
      
      var finalFunction: String
      
      var initCondition: String
      
      var keyspaceName: String
      
      var returnType: String
      
      var signature: js.Array[String]
      
      var stateFunction: String
      
      var stateType: String
    }
    object Aggregate {
      
      inline def apply(
        argumentTypes: js.Array[Code],
        finalFunction: String,
        initCondition: String,
        keyspaceName: String,
        returnType: String,
        signature: js.Array[String],
        stateFunction: String,
        stateType: String
      ): Aggregate = {
        val __obj = js.Dynamic.literal(argumentTypes = argumentTypes.asInstanceOf[js.Any], finalFunction = finalFunction.asInstanceOf[js.Any], initCondition = initCondition.asInstanceOf[js.Any], keyspaceName = keyspaceName.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], stateFunction = stateFunction.asInstanceOf[js.Any], stateType = stateType.asInstanceOf[js.Any])
        __obj.asInstanceOf[Aggregate]
      }
      
      extension [Self <: Aggregate](x: Self) {
        
        inline def setArgumentTypes(value: js.Array[Code]): Self = StObject.set(x, "argumentTypes", value.asInstanceOf[js.Any])
        
        inline def setArgumentTypesVarargs(value: Code*): Self = StObject.set(x, "argumentTypes", js.Array(value :_*))
        
        inline def setFinalFunction(value: String): Self = StObject.set(x, "finalFunction", value.asInstanceOf[js.Any])
        
        inline def setInitCondition(value: String): Self = StObject.set(x, "initCondition", value.asInstanceOf[js.Any])
        
        inline def setKeyspaceName(value: String): Self = StObject.set(x, "keyspaceName", value.asInstanceOf[js.Any])
        
        inline def setReturnType(value: String): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
        
        inline def setSignature(value: js.Array[String]): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
        
        inline def setSignatureVarargs(value: String*): Self = StObject.set(x, "signature", js.Array(value :_*))
        
        inline def setStateFunction(value: String): Self = StObject.set(x, "stateFunction", value.asInstanceOf[js.Any])
        
        inline def setStateType(value: String): Self = StObject.set(x, "stateType", value.asInstanceOf[js.Any])
      }
    }
    
    trait ClientState extends StObject {
      
      def getConnectedHosts(): js.Array[Host]
      
      def getInFlightQueries(host: Host): Double
      
      def getOpenConnections(host: Host): Double
    }
    object ClientState {
      
      inline def apply(
        getConnectedHosts: () => js.Array[Host],
        getInFlightQueries: Host => Double,
        getOpenConnections: Host => Double
      ): ClientState = {
        val __obj = js.Dynamic.literal(getConnectedHosts = js.Any.fromFunction0(getConnectedHosts), getInFlightQueries = js.Any.fromFunction1(getInFlightQueries), getOpenConnections = js.Any.fromFunction1(getOpenConnections))
        __obj.asInstanceOf[ClientState]
      }
      
      extension [Self <: ClientState](x: Self) {
        
        inline def setGetConnectedHosts(value: () => js.Array[Host]): Self = StObject.set(x, "getConnectedHosts", js.Any.fromFunction0(value))
        
        inline def setGetInFlightQueries(value: Host => Double): Self = StObject.set(x, "getInFlightQueries", js.Any.fromFunction1(value))
        
        inline def setGetOpenConnections(value: Host => Double): Self = StObject.set(x, "getOpenConnections", js.Any.fromFunction1(value))
      }
    }
    
    trait ColumnInfo extends StObject {
      
      var name: String
      
      var `type`: DataTypeInfo
    }
    object ColumnInfo {
      
      inline def apply(name: String, `type`: DataTypeInfo): ColumnInfo = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ColumnInfo]
      }
      
      extension [Self <: ColumnInfo](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setType(value: DataTypeInfo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait DataCollection extends StObject {
      
      var bloomFilterFalsePositiveChance: Double
      
      var caching: String
      
      var clusteringKeys: js.Array[ColumnInfo]
      
      var clusteringOrder: js.Array[String]
      
      var columns: js.Array[ColumnInfo]
      
      var columnsByName: StringDictionary[ColumnInfo]
      
      var comment: String
      
      var compactionClass: String
      
      var compactionOptions: StringDictionary[js.Any]
      
      var compression: Dictoption
      
      var crcCheckChange: js.UndefOr[Double] = js.undefined
      
      var defaultTtl: Double
      
      var extensions: StringDictionary[js.Any]
      
      var gcGraceSeconds: Double
      
      var localReadRepairChance: Double
      
      var maxIndexInterval: js.UndefOr[Double] = js.undefined
      
      var minIndexInterval: js.UndefOr[Double] = js.undefined
      
      var name: String
      
      var partitionKeys: js.Array[ColumnInfo]
      
      var populateCacheOnFlush: Boolean
      
      var readRepairChance: Double
      
      var speculativeRetry: String
    }
    object DataCollection {
      
      inline def apply(
        bloomFilterFalsePositiveChance: Double,
        caching: String,
        clusteringKeys: js.Array[ColumnInfo],
        clusteringOrder: js.Array[String],
        columns: js.Array[ColumnInfo],
        columnsByName: StringDictionary[ColumnInfo],
        comment: String,
        compactionClass: String,
        compactionOptions: StringDictionary[js.Any],
        compression: Dictoption,
        defaultTtl: Double,
        extensions: StringDictionary[js.Any],
        gcGraceSeconds: Double,
        localReadRepairChance: Double,
        name: String,
        partitionKeys: js.Array[ColumnInfo],
        populateCacheOnFlush: Boolean,
        readRepairChance: Double,
        speculativeRetry: String
      ): DataCollection = {
        val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance.asInstanceOf[js.Any], caching = caching.asInstanceOf[js.Any], clusteringKeys = clusteringKeys.asInstanceOf[js.Any], clusteringOrder = clusteringOrder.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], columnsByName = columnsByName.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], compactionClass = compactionClass.asInstanceOf[js.Any], compactionOptions = compactionOptions.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], defaultTtl = defaultTtl.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], gcGraceSeconds = gcGraceSeconds.asInstanceOf[js.Any], localReadRepairChance = localReadRepairChance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionKeys = partitionKeys.asInstanceOf[js.Any], populateCacheOnFlush = populateCacheOnFlush.asInstanceOf[js.Any], readRepairChance = readRepairChance.asInstanceOf[js.Any], speculativeRetry = speculativeRetry.asInstanceOf[js.Any])
        __obj.asInstanceOf[DataCollection]
      }
      
      extension [Self <: DataCollection](x: Self) {
        
        inline def setBloomFilterFalsePositiveChance(value: Double): Self = StObject.set(x, "bloomFilterFalsePositiveChance", value.asInstanceOf[js.Any])
        
        inline def setCaching(value: String): Self = StObject.set(x, "caching", value.asInstanceOf[js.Any])
        
        inline def setClusteringKeys(value: js.Array[ColumnInfo]): Self = StObject.set(x, "clusteringKeys", value.asInstanceOf[js.Any])
        
        inline def setClusteringKeysVarargs(value: ColumnInfo*): Self = StObject.set(x, "clusteringKeys", js.Array(value :_*))
        
        inline def setClusteringOrder(value: js.Array[String]): Self = StObject.set(x, "clusteringOrder", value.asInstanceOf[js.Any])
        
        inline def setClusteringOrderVarargs(value: String*): Self = StObject.set(x, "clusteringOrder", js.Array(value :_*))
        
        inline def setColumns(value: js.Array[ColumnInfo]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        inline def setColumnsByName(value: StringDictionary[ColumnInfo]): Self = StObject.set(x, "columnsByName", value.asInstanceOf[js.Any])
        
        inline def setColumnsVarargs(value: ColumnInfo*): Self = StObject.set(x, "columns", js.Array(value :_*))
        
        inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
        
        inline def setCompactionClass(value: String): Self = StObject.set(x, "compactionClass", value.asInstanceOf[js.Any])
        
        inline def setCompactionOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "compactionOptions", value.asInstanceOf[js.Any])
        
        inline def setCompression(value: Dictoption): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
        
        inline def setCrcCheckChange(value: Double): Self = StObject.set(x, "crcCheckChange", value.asInstanceOf[js.Any])
        
        inline def setCrcCheckChangeUndefined: Self = StObject.set(x, "crcCheckChange", js.undefined)
        
        inline def setDefaultTtl(value: Double): Self = StObject.set(x, "defaultTtl", value.asInstanceOf[js.Any])
        
        inline def setExtensions(value: StringDictionary[js.Any]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
        
        inline def setGcGraceSeconds(value: Double): Self = StObject.set(x, "gcGraceSeconds", value.asInstanceOf[js.Any])
        
        inline def setLocalReadRepairChance(value: Double): Self = StObject.set(x, "localReadRepairChance", value.asInstanceOf[js.Any])
        
        inline def setMaxIndexInterval(value: Double): Self = StObject.set(x, "maxIndexInterval", value.asInstanceOf[js.Any])
        
        inline def setMaxIndexIntervalUndefined: Self = StObject.set(x, "maxIndexInterval", js.undefined)
        
        inline def setMinIndexInterval(value: Double): Self = StObject.set(x, "minIndexInterval", value.asInstanceOf[js.Any])
        
        inline def setMinIndexIntervalUndefined: Self = StObject.set(x, "minIndexInterval", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPartitionKeys(value: js.Array[ColumnInfo]): Self = StObject.set(x, "partitionKeys", value.asInstanceOf[js.Any])
        
        inline def setPartitionKeysVarargs(value: ColumnInfo*): Self = StObject.set(x, "partitionKeys", js.Array(value :_*))
        
        inline def setPopulateCacheOnFlush(value: Boolean): Self = StObject.set(x, "populateCacheOnFlush", value.asInstanceOf[js.Any])
        
        inline def setReadRepairChance(value: Double): Self = StObject.set(x, "readRepairChance", value.asInstanceOf[js.Any])
        
        inline def setSpeculativeRetry(value: String): Self = StObject.set(x, "speculativeRetry", value.asInstanceOf[js.Any])
      }
    }
    
    trait DataTypeInfo extends StObject {
      
      var code: dataTypes
      
      var info: String | DataTypeInfo | js.Array[DataTypeInfo]
      
      var options: Frozen
    }
    object DataTypeInfo {
      
      inline def apply(code: dataTypes, info: String | DataTypeInfo | js.Array[DataTypeInfo], options: Frozen): DataTypeInfo = {
        val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
        __obj.asInstanceOf[DataTypeInfo]
      }
      
      extension [Self <: DataTypeInfo](x: Self) {
        
        inline def setCode(value: dataTypes): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setInfo(value: String | DataTypeInfo | js.Array[DataTypeInfo]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setInfoVarargs(value: DataTypeInfo*): Self = StObject.set(x, "info", js.Array(value :_*))
        
        inline def setOptions(value: Frozen): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      }
    }
    
    trait Index extends StObject {
      
      def isCompositesKind(): Boolean
      
      def isCustomKind(): Boolean
      
      def isKeysKind(): Boolean
      
      var kind: IndexKind
      
      var name: String
      
      var options: js.Object
      
      var target: String
    }
    object Index {
      
      inline def apply(
        isCompositesKind: () => Boolean,
        isCustomKind: () => Boolean,
        isKeysKind: () => Boolean,
        kind: IndexKind,
        name: String,
        options: js.Object,
        target: String
      ): Index = {
        val __obj = js.Dynamic.literal(isCompositesKind = js.Any.fromFunction0(isCompositesKind), isCustomKind = js.Any.fromFunction0(isCustomKind), isKeysKind = js.Any.fromFunction0(isKeysKind), kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[Index]
      }
      
      extension [Self <: Index](x: Self) {
        
        inline def setIsCompositesKind(value: () => Boolean): Self = StObject.set(x, "isCompositesKind", js.Any.fromFunction0(value))
        
        inline def setIsCustomKind(value: () => Boolean): Self = StObject.set(x, "isCustomKind", js.Any.fromFunction0(value))
        
        inline def setIsKeysKind(value: () => Boolean): Self = StObject.set(x, "isKeysKind", js.Any.fromFunction0(value))
        
        inline def setKind(value: IndexKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
    
    trait MaterializedView
      extends StObject
         with DataCollection {
      
      var includeAllColumns: Boolean
      
      var tableName: String
      
      var whereClause: String
    }
    object MaterializedView {
      
      inline def apply(
        bloomFilterFalsePositiveChance: Double,
        caching: String,
        clusteringKeys: js.Array[ColumnInfo],
        clusteringOrder: js.Array[String],
        columns: js.Array[ColumnInfo],
        columnsByName: StringDictionary[ColumnInfo],
        comment: String,
        compactionClass: String,
        compactionOptions: StringDictionary[js.Any],
        compression: Dictoption,
        defaultTtl: Double,
        extensions: StringDictionary[js.Any],
        gcGraceSeconds: Double,
        includeAllColumns: Boolean,
        localReadRepairChance: Double,
        name: String,
        partitionKeys: js.Array[ColumnInfo],
        populateCacheOnFlush: Boolean,
        readRepairChance: Double,
        speculativeRetry: String,
        tableName: String,
        whereClause: String
      ): MaterializedView = {
        val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance.asInstanceOf[js.Any], caching = caching.asInstanceOf[js.Any], clusteringKeys = clusteringKeys.asInstanceOf[js.Any], clusteringOrder = clusteringOrder.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], columnsByName = columnsByName.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], compactionClass = compactionClass.asInstanceOf[js.Any], compactionOptions = compactionOptions.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], defaultTtl = defaultTtl.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], gcGraceSeconds = gcGraceSeconds.asInstanceOf[js.Any], includeAllColumns = includeAllColumns.asInstanceOf[js.Any], localReadRepairChance = localReadRepairChance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionKeys = partitionKeys.asInstanceOf[js.Any], populateCacheOnFlush = populateCacheOnFlush.asInstanceOf[js.Any], readRepairChance = readRepairChance.asInstanceOf[js.Any], speculativeRetry = speculativeRetry.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any], whereClause = whereClause.asInstanceOf[js.Any])
        __obj.asInstanceOf[MaterializedView]
      }
      
      extension [Self <: MaterializedView](x: Self) {
        
        inline def setIncludeAllColumns(value: Boolean): Self = StObject.set(x, "includeAllColumns", value.asInstanceOf[js.Any])
        
        inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
        
        inline def setWhereClause(value: String): Self = StObject.set(x, "whereClause", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Metadata extends StObject {
      
      def clearPrepared(): Unit = js.native
      
      def getAggregate(keyspaceName: String, name: String, signature: js.Array[Info | String]): js.Promise[Aggregate] = js.native
      def getAggregate(
        keyspaceName: String,
        name: String,
        signature: js.Array[Info | String],
        callback: ValueCallback[Aggregate]
      ): Unit = js.native
      
      def getAggregates(keyspaceName: String, name: String): js.Promise[js.Array[Aggregate]] = js.native
      def getAggregates(keyspaceName: String, name: String, callback: ValueCallback[js.Array[Aggregate]]): Unit = js.native
      
      def getFunction(keyspaceName: String, name: String, signature: js.Array[Info | String]): js.Promise[SchemaFunction] = js.native
      def getFunction(
        keyspaceName: String,
        name: String,
        signature: js.Array[Info | String],
        callback: ValueCallback[SchemaFunction]
      ): Unit = js.native
      
      def getFunctions(keyspaceName: String, name: String): js.Promise[js.Array[SchemaFunction]] = js.native
      def getFunctions(keyspaceName: String, name: String, callback: ValueCallback[js.Array[SchemaFunction]]): Unit = js.native
      
      def getMaterializedView(keyspaceName: String, name: String, callback: EmptyCallback): js.Promise[MaterializedView] = js.native
      def getMaterializedView(keyspaceName: String, name: String, callback: ValueCallback[MaterializedView]): Unit = js.native
      
      def getReplicas(keyspaceName: String, token: Token): js.Array[Host] = js.native
      def getReplicas(keyspaceName: String, token: TokenRange): js.Array[Host] = js.native
      def getReplicas(keyspaceName: String, token: Buffer): js.Array[Host] = js.native
      
      def getTable(keyspaceName: String, name: String): js.Promise[TableMetadata] = js.native
      def getTable(keyspaceName: String, name: String, callback: ValueCallback[TableMetadata]): Unit = js.native
      
      def getTokenRanges(): Set[TokenRange] = js.native
      
      def getTokenRangesForHost(keyspaceName: String, host: Host): Set[TokenRange] | Null = js.native
      
      def getTrace(traceId: Uuid): js.Promise[QueryTrace] = js.native
      def getTrace(traceId: Uuid, callback: ValueCallback[QueryTrace]): Unit = js.native
      def getTrace(traceId: Uuid, consistency: consistencies): js.Promise[QueryTrace] = js.native
      def getTrace(traceId: Uuid, consistency: consistencies, callback: ValueCallback[QueryTrace]): Unit = js.native
      
      def getUdt(keyspaceName: String, name: String): js.Promise[Udt] = js.native
      def getUdt(keyspaceName: String, name: String, callback: ValueCallback[Udt]): Unit = js.native
      
      var keyspaces: StringDictionary[Name] = js.native
      
      def newToken(components: String): Token = js.native
      def newToken(components: js.Array[Buffer]): Token = js.native
      def newToken(components: Buffer): Token = js.native
      
      def newTokenRange(start: Token, end: Token): TokenRange = js.native
      
      def refreshKeyspace(name: String): js.Promise[Unit] = js.native
      def refreshKeyspace(name: String, callback: EmptyCallback): Unit = js.native
      
      def refreshKeyspaces(): js.Promise[Unit] = js.native
      def refreshKeyspaces(callback: EmptyCallback): Unit = js.native
      def refreshKeyspaces(waitReconnect: Boolean): js.Promise[Unit] = js.native
      def refreshKeyspaces(waitReconnect: Boolean, callback: EmptyCallback): Unit = js.native
    }
    
    trait QueryTrace extends StObject {
      
      var clientAddress: String
      
      var coordinator: InetAddress
      
      var duration: Double
      
      var events: js.Array[Activity]
      
      var parameters: StringDictionary[js.Any]
      
      var requestType: String
      
      var startedAt: Double | Long
    }
    object QueryTrace {
      
      inline def apply(
        clientAddress: String,
        coordinator: InetAddress,
        duration: Double,
        events: js.Array[Activity],
        parameters: StringDictionary[js.Any],
        requestType: String,
        startedAt: Double | Long
      ): QueryTrace = {
        val __obj = js.Dynamic.literal(clientAddress = clientAddress.asInstanceOf[js.Any], coordinator = coordinator.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any])
        __obj.asInstanceOf[QueryTrace]
      }
      
      extension [Self <: QueryTrace](x: Self) {
        
        inline def setClientAddress(value: String): Self = StObject.set(x, "clientAddress", value.asInstanceOf[js.Any])
        
        inline def setCoordinator(value: InetAddress): Self = StObject.set(x, "coordinator", value.asInstanceOf[js.Any])
        
        inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        inline def setEvents(value: js.Array[Activity]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
        
        inline def setEventsVarargs(value: Activity*): Self = StObject.set(x, "events", js.Array(value :_*))
        
        inline def setParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
        
        inline def setStartedAt(value: Double | Long): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
      }
    }
    
    trait SchemaFunction extends StObject {
      
      var argumentNames: js.Array[String]
      
      var argumentTypes: js.Array[Code]
      
      var body: String
      
      var calledOnNullInput: Boolean
      
      var keyspaceName: String
      
      var language: String
      
      var name: String
      
      var returnType: String
      
      var signature: js.Array[String]
    }
    object SchemaFunction {
      
      inline def apply(
        argumentNames: js.Array[String],
        argumentTypes: js.Array[Code],
        body: String,
        calledOnNullInput: Boolean,
        keyspaceName: String,
        language: String,
        name: String,
        returnType: String,
        signature: js.Array[String]
      ): SchemaFunction = {
        val __obj = js.Dynamic.literal(argumentNames = argumentNames.asInstanceOf[js.Any], argumentTypes = argumentTypes.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], calledOnNullInput = calledOnNullInput.asInstanceOf[js.Any], keyspaceName = keyspaceName.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
        __obj.asInstanceOf[SchemaFunction]
      }
      
      extension [Self <: SchemaFunction](x: Self) {
        
        inline def setArgumentNames(value: js.Array[String]): Self = StObject.set(x, "argumentNames", value.asInstanceOf[js.Any])
        
        inline def setArgumentNamesVarargs(value: String*): Self = StObject.set(x, "argumentNames", js.Array(value :_*))
        
        inline def setArgumentTypes(value: js.Array[Code]): Self = StObject.set(x, "argumentTypes", value.asInstanceOf[js.Any])
        
        inline def setArgumentTypesVarargs(value: Code*): Self = StObject.set(x, "argumentTypes", js.Array(value :_*))
        
        inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setCalledOnNullInput(value: Boolean): Self = StObject.set(x, "calledOnNullInput", value.asInstanceOf[js.Any])
        
        inline def setKeyspaceName(value: String): Self = StObject.set(x, "keyspaceName", value.asInstanceOf[js.Any])
        
        inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setReturnType(value: String): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
        
        inline def setSignature(value: js.Array[String]): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
        
        inline def setSignatureVarargs(value: String*): Self = StObject.set(x, "signature", js.Array(value :_*))
      }
    }
    
    trait TableMetadata
      extends StObject
         with DataCollection {
      
      var cdc: js.UndefOr[Boolean] = js.undefined
      
      var indexInterval: js.UndefOr[Double] = js.undefined
      
      var indexes: js.Array[Index]
      
      var isCompact: Boolean
      
      var memtableFlushPeriod: Double
      
      var replicateOnWrite: Boolean
      
      var virtual: Boolean
    }
    object TableMetadata {
      
      inline def apply(
        bloomFilterFalsePositiveChance: Double,
        caching: String,
        clusteringKeys: js.Array[ColumnInfo],
        clusteringOrder: js.Array[String],
        columns: js.Array[ColumnInfo],
        columnsByName: StringDictionary[ColumnInfo],
        comment: String,
        compactionClass: String,
        compactionOptions: StringDictionary[js.Any],
        compression: Dictoption,
        defaultTtl: Double,
        extensions: StringDictionary[js.Any],
        gcGraceSeconds: Double,
        indexes: js.Array[Index],
        isCompact: Boolean,
        localReadRepairChance: Double,
        memtableFlushPeriod: Double,
        name: String,
        partitionKeys: js.Array[ColumnInfo],
        populateCacheOnFlush: Boolean,
        readRepairChance: Double,
        replicateOnWrite: Boolean,
        speculativeRetry: String,
        virtual: Boolean
      ): TableMetadata = {
        val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance.asInstanceOf[js.Any], caching = caching.asInstanceOf[js.Any], clusteringKeys = clusteringKeys.asInstanceOf[js.Any], clusteringOrder = clusteringOrder.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], columnsByName = columnsByName.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], compactionClass = compactionClass.asInstanceOf[js.Any], compactionOptions = compactionOptions.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], defaultTtl = defaultTtl.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], gcGraceSeconds = gcGraceSeconds.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], isCompact = isCompact.asInstanceOf[js.Any], localReadRepairChance = localReadRepairChance.asInstanceOf[js.Any], memtableFlushPeriod = memtableFlushPeriod.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionKeys = partitionKeys.asInstanceOf[js.Any], populateCacheOnFlush = populateCacheOnFlush.asInstanceOf[js.Any], readRepairChance = readRepairChance.asInstanceOf[js.Any], replicateOnWrite = replicateOnWrite.asInstanceOf[js.Any], speculativeRetry = speculativeRetry.asInstanceOf[js.Any], virtual = virtual.asInstanceOf[js.Any])
        __obj.asInstanceOf[TableMetadata]
      }
      
      extension [Self <: TableMetadata](x: Self) {
        
        inline def setCdc(value: Boolean): Self = StObject.set(x, "cdc", value.asInstanceOf[js.Any])
        
        inline def setCdcUndefined: Self = StObject.set(x, "cdc", js.undefined)
        
        inline def setIndexInterval(value: Double): Self = StObject.set(x, "indexInterval", value.asInstanceOf[js.Any])
        
        inline def setIndexIntervalUndefined: Self = StObject.set(x, "indexInterval", js.undefined)
        
        inline def setIndexes(value: js.Array[Index]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
        
        inline def setIndexesVarargs(value: Index*): Self = StObject.set(x, "indexes", js.Array(value :_*))
        
        inline def setIsCompact(value: Boolean): Self = StObject.set(x, "isCompact", value.asInstanceOf[js.Any])
        
        inline def setMemtableFlushPeriod(value: Double): Self = StObject.set(x, "memtableFlushPeriod", value.asInstanceOf[js.Any])
        
        inline def setReplicateOnWrite(value: Boolean): Self = StObject.set(x, "replicateOnWrite", value.asInstanceOf[js.Any])
        
        inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      }
    }
    
    trait Udt extends StObject {
      
      var fields: js.Array[ColumnInfo]
      
      var name: String
    }
    object Udt {
      
      inline def apply(fields: js.Array[ColumnInfo], name: String): Udt = {
        val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Udt]
      }
      
      extension [Self <: Udt](x: Self) {
        
        inline def setFields(value: js.Array[ColumnInfo]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsVarargs(value: ColumnInfo*): Self = StObject.set(x, "fields", js.Array(value :_*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
}
