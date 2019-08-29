package typings.cassandraDashDriver.cassandraDashDriverMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.DefaultTableMappings
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.DefaultTableMappingsStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.Mapper
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.MapperStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.MappingDocInfo
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.MappingExecutionOptions
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.MappingHandler
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.MappingHandlerStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.MappingOptions
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.MappingQuery
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.ModelBatchItem
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.ModelBatchItemStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.ModelBatchMapper
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.ModelMapper
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.ModelMapperStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.ModelMappingInfo
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.ModelMappingInfoStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.ModelOptions
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.ModelTables
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.Result
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.ResultStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.TableMappings
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.UnderscoreCqlToCamelCaseMappings
import typings.cassandraDashDriver.cassandraDashDriverMod.mappingNs.UnderscoreCqlToCamelCaseMappingsStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.ResultSet
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.Row
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "mapping")
@js.native
object mappingNs extends js.Object {
  @js.native
  class DefaultTableMappingsCls () extends DefaultTableMappings {
    /* CompleteClass */
    override def getColumnName(propName: String): String = js.native
    /* CompleteClass */
    override def getPropertyName(columnName: String): String = js.native
    /* CompleteClass */
    override def newObjectInstance(): StringDictionary[js.Any] = js.native
  }
  
  @js.native
  trait DefaultTableMappingsStatic extends Instantiable0[DefaultTableMappings]
  
  @js.native
  trait Mapper extends js.Object {
    def batch(items: js.Array[ModelBatchItem]): js.Promise[Result] = js.native
    def batch(items: js.Array[ModelBatchItem], executionOptions: String): js.Promise[Result] = js.native
    def batch(items: js.Array[ModelBatchItem], executionOptions: MappingExecutionOptions): js.Promise[Result] = js.native
    def forModel(name: String): ModelMapper = js.native
  }
  
  @js.native
  class MapperCls protected () extends Mapper {
    def this(client: Client) = this()
    def this(client: Client, options: MappingOptions) = this()
  }
  
  @js.native
  trait MapperStatic
    extends Instantiable1[/* client */ Client, Mapper]
       with Instantiable2[/* client */ Client, /* options */ MappingOptions, Mapper]
  
  trait MappingDocInfo extends js.Object {
    var deleteOnlyColumns: js.UndefOr[Boolean] = js.undefined
    var fields: js.UndefOr[js.Array[String]] = js.undefined
    var ifNotExists: js.UndefOr[Boolean] = js.undefined
    var limit: js.UndefOr[Double] = js.undefined
    var orderBy: js.UndefOr[StringDictionary[String]] = js.undefined
    var ttl: js.UndefOr[Double] = js.undefined
    var when: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  
  trait MappingExecutionOptions extends js.Object {
    var executionProfile: js.UndefOr[String] = js.undefined
    var fetchSize: js.UndefOr[Double] = js.undefined
    var isIdempotent: js.UndefOr[Boolean] = js.undefined
    var logged: js.UndefOr[Boolean] = js.undefined
    var pageState: js.UndefOr[Double] = js.undefined
    var timestamp: js.UndefOr[
        Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Long */ js.Any)
      ] = js.undefined
  }
  
  trait MappingHandler extends js.Object
  
  @js.native
  class MappingHandlerCls protected () extends MappingHandler {
    def this(client: Client, mappingInfo: ModelMappingInfo) = this()
  }
  
  @js.native
  trait MappingHandlerStatic extends Instantiable2[/* client */ Client, /* mappingInfo */ ModelMappingInfo, MappingHandler]
  
  trait MappingOptions extends js.Object {
    var models: StringDictionary[ModelOptions]
  }
  
  trait MappingQuery extends js.Object {
    var isCounter: Boolean
    var isIdempotent: Boolean
    var query: String
  }
  
  trait ModelBatchItem extends js.Object
  
  @js.native
  class ModelBatchItemCls protected () extends ModelBatchItem {
    def this(
      queries: js.Promise[js.Array[MappingQuery]],
      doc: StringDictionary[js.Any],
      docInfo: MappingDocInfo,
      mappingInfo: ModelMappingInfo
    ) = this()
  }
  
  @js.native
  trait ModelBatchItemStatic
    extends Instantiable4[
          /* queries */ js.Promise[js.Array[MappingQuery]], 
          /* doc */ StringDictionary[js.Any], 
          /* docInfo */ MappingDocInfo, 
          /* mappingInfo */ ModelMappingInfo, 
          ModelBatchItem
        ]
  
  @js.native
  trait ModelBatchMapper extends js.Object {
    def insert(doc: StringDictionary[js.Any]): ModelBatchItem = js.native
    def insert(doc: StringDictionary[js.Any], docInfo: MappingDocInfo): ModelBatchItem = js.native
    def remove(doc: StringDictionary[js.Any]): ModelBatchItem = js.native
    def remove(doc: StringDictionary[js.Any], docInfo: MappingDocInfo): ModelBatchItem = js.native
    def update(doc: StringDictionary[js.Any]): ModelBatchItem = js.native
    def update(doc: StringDictionary[js.Any], docInfo: MappingDocInfo): ModelBatchItem = js.native
  }
  
  @js.native
  trait ModelMapper extends js.Object {
    var batching: ModelBatchMapper = js.native
    var name: String = js.native
    def find(doc: StringDictionary[js.Any]): js.Promise[Result] = js.native
    def find(doc: StringDictionary[js.Any], docInfo: MappingDocInfo): js.Promise[Result] = js.native
    def find(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: String): js.Promise[Result] = js.native
    def find(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result] = js.native
    def findAll(): js.Promise[Result] = js.native
    def findAll(docInfo: MappingDocInfo): js.Promise[Result] = js.native
    def findAll(docInfo: MappingDocInfo, executionOptions: String): js.Promise[Result] = js.native
    def findAll(docInfo: MappingDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result] = js.native
    def get(doc: StringDictionary[js.Any]): js.Promise[Result] = js.native
    def get(doc: StringDictionary[js.Any], docInfo: MappingDocInfo): js.Promise[Result] = js.native
    def get(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: String): js.Promise[Result] = js.native
    def get(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result] = js.native
    def insert(doc: StringDictionary[js.Any]): js.Promise[Result] = js.native
    def insert(doc: StringDictionary[js.Any], docInfo: MappingDocInfo): js.Promise[Result] = js.native
    def insert(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: String): js.Promise[Result] = js.native
    def insert(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result] = js.native
    def mapWithQuery(query: String, paramsHandler: js.Function1[/* doc */ StringDictionary[js.Any], _]): js.Function2[
        /* doc */ StringDictionary[js.Any], 
        /* executionOptions */ js.UndefOr[String | MappingExecutionOptions], 
        js.Promise[Result]
      ] = js.native
    def mapWithQuery(
      query: String,
      paramsHandler: js.Function1[/* doc */ StringDictionary[js.Any], _],
      executionOptions: String
    ): js.Function2[
        /* doc */ StringDictionary[js.Any], 
        /* executionOptions */ js.UndefOr[String | MappingExecutionOptions], 
        js.Promise[Result]
      ] = js.native
    def mapWithQuery(
      query: String,
      paramsHandler: js.Function1[/* doc */ StringDictionary[js.Any], _],
      executionOptions: MappingExecutionOptions
    ): js.Function2[
        /* doc */ StringDictionary[js.Any], 
        /* executionOptions */ js.UndefOr[String | MappingExecutionOptions], 
        js.Promise[Result]
      ] = js.native
    def remove(doc: StringDictionary[js.Any]): js.Promise[Result] = js.native
    def remove(doc: StringDictionary[js.Any], docInfo: MappingDocInfo): js.Promise[Result] = js.native
    def remove(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: String): js.Promise[Result] = js.native
    def remove(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result] = js.native
    def update(doc: StringDictionary[js.Any]): js.Promise[Result] = js.native
    def update(doc: StringDictionary[js.Any], docInfo: MappingDocInfo): js.Promise[Result] = js.native
    def update(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: String): js.Promise[Result] = js.native
    def update(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result] = js.native
  }
  
  @js.native
  class ModelMapperCls protected () extends ModelMapper {
    def this(name: String, handler: MappingHandler) = this()
  }
  
  @js.native
  trait ModelMapperStatic extends Instantiable2[/* name */ String, /* handler */ MappingHandler, ModelMapper]
  
  trait ModelMappingInfo extends js.Object {
    var keyspace: String
    var tables: js.Array[ModelTables]
    def getColumnName(propName: String): String
    def getPropertyName(columnName: String): String
    def newInstance(): TableMappings
  }
  
  @js.native
  class ModelMappingInfoCls protected () extends ModelMappingInfo {
    def this(
      keyspace: String,
      tables: js.Array[ModelTables],
      mappings: TableMappings,
      columns: StringDictionary[String]
    ) = this()
    /* CompleteClass */
    override var keyspace: String = js.native
    /* CompleteClass */
    override var tables: js.Array[ModelTables] = js.native
    /* CompleteClass */
    override def getColumnName(propName: String): String = js.native
    /* CompleteClass */
    override def getPropertyName(columnName: String): String = js.native
    /* CompleteClass */
    override def newInstance(): TableMappings = js.native
  }
  
  @js.native
  trait ModelMappingInfoStatic
    extends Instantiable4[
          /* keyspace */ String, 
          /* tables */ js.Array[ModelTables], 
          /* mappings */ TableMappings, 
          /* columns */ StringDictionary[String], 
          ModelMappingInfo
        ] {
    def createDefault(modelName: String, currentKeyspace: String): ModelMappingInfo = js.native
    def parse(options: MappingOptions, currentKeyspace: String): StringDictionary[ModelMappingInfo] = js.native
  }
  
  trait ModelOptions extends js.Object {
    var columns: js.UndefOr[StringDictionary[String]] = js.undefined
    var keyspace: js.UndefOr[String] = js.undefined
    var mappings: js.UndefOr[TableMappings] = js.undefined
    var tables: js.UndefOr[js.Array[ModelTables | String]] = js.undefined
  }
  
  trait ModelTables extends js.Object {
    var isView: Boolean
    var name: String
  }
  
  @js.native
  trait Result extends js.Object {
    @JSName(scala.scalajs.js.Symbol.iterator)
    var iterator: js.Function0[Iterator[StringDictionary[_], _, js.UndefOr[scala.Nothing]]] = js.native
    def first(): StringDictionary[js.Any] = js.native
    def forEach(callback: js.Function2[/* currentValue */ StringDictionary[js.Any], /* index */ Double, Unit]): Unit = js.native
    def forEach(
      callback: js.Function2[/* currentValue */ StringDictionary[js.Any], /* index */ Double, Unit],
      thisArg: js.Any
    ): Unit = js.native
    def toArray(): js.Array[StringDictionary[_]] = js.native
    def wasApplied(): Boolean = js.native
  }
  
  @js.native
  class ResultCls protected () extends Result {
    def this(
      rs: ResultSet,
      info: ModelMappingInfo,
      rowAdapter: js.Function2[/* row */ Row, /* info */ ModelMappingInfo, StringDictionary[_]]
    ) = this()
  }
  
  @js.native
  trait ResultStatic
    extends Instantiable3[
          /* rs */ ResultSet, 
          /* info */ ModelMappingInfo, 
          /* rowAdapter */ js.Function2[/* row */ Row, /* info */ ModelMappingInfo, StringDictionary[js.Any]], 
          Result
        ]
  
  trait TableMappings extends js.Object {
    def getColumnName(propName: String): String
    def getPropertyName(columnName: String): String
    def newObjectInstance(): StringDictionary[js.Any]
  }
  
  @js.native
  class UnderscoreCqlToCamelCaseMappingsCls () extends UnderscoreCqlToCamelCaseMappings {
    /* CompleteClass */
    override def getColumnName(propName: String): String = js.native
    /* CompleteClass */
    override def getPropertyName(columnName: String): String = js.native
    /* CompleteClass */
    override def newObjectInstance(): StringDictionary[js.Any] = js.native
  }
  
  @js.native
  trait UnderscoreCqlToCamelCaseMappingsStatic extends Instantiable0[UnderscoreCqlToCamelCaseMappings]
  
  var DefaultTableMappings: DefaultTableMappingsStatic = js.native
  var Mapper: MapperStatic = js.native
  var MappingHandler: MappingHandlerStatic = js.native
  var ModelBatchItem: ModelBatchItemStatic = js.native
  var ModelMapper: ModelMapperStatic = js.native
  var ModelMappingInfo: ModelMappingInfoStatic = js.native
  var Result: ResultStatic = js.native
  var UnderscoreCqlToCamelCaseMappings: UnderscoreCqlToCamelCaseMappingsStatic = js.native
  type DefaultTableMappings = TableMappings
  type UnderscoreCqlToCamelCaseMappings = TableMappings
}

