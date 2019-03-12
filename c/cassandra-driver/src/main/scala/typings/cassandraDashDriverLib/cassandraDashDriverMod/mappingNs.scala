package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "mapping")
@js.native
object mappingNs extends js.Object {
  @js.native
  trait DefaultTableMappingsStatic
    extends org.scalablytyped.runtime.Instantiable0[DefaultTableMappings]
  
  @js.native
  trait Mapper extends js.Object {
    def batch(items: js.Array[ModelBatchItem]): js.Promise[Result] = js.native
    def batch(items: js.Array[ModelBatchItem], executionOptions: MappingExecutionOptions): js.Promise[Result] = js.native
    def batch(items: js.Array[ModelBatchItem], executionOptions: java.lang.String): js.Promise[Result] = js.native
    def forModel(name: java.lang.String): ModelMapper = js.native
  }
  
  @js.native
  trait MapperStatic
    extends org.scalablytyped.runtime.Instantiable1[/* client */ cassandraDashDriverLib.cassandraDashDriverMod.Client, Mapper]
       with org.scalablytyped.runtime.Instantiable2[
          /* client */ cassandraDashDriverLib.cassandraDashDriverMod.Client, 
          /* options */ MappingOptions, 
          Mapper
        ]
  
  trait MappingDocInfo extends js.Object {
    var deleteOnlyColumns: js.UndefOr[scala.Boolean] = js.undefined
    var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var ifNotExists: js.UndefOr[scala.Boolean] = js.undefined
    var limit: js.UndefOr[scala.Double] = js.undefined
    var orderBy: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
    var ttl: js.UndefOr[scala.Double] = js.undefined
    var when: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  }
  
  trait MappingExecutionOptions extends js.Object {
    var executionProfile: js.UndefOr[java.lang.String] = js.undefined
    var fetchSize: js.UndefOr[scala.Double] = js.undefined
    var isIdempotent: js.UndefOr[scala.Boolean] = js.undefined
    var logged: js.UndefOr[scala.Boolean] = js.undefined
    var pageState: js.UndefOr[scala.Double] = js.undefined
    var timestamp: js.UndefOr[
        scala.Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Long */ js.Any)
      ] = js.undefined
  }
  
  trait MappingHandler extends js.Object
  
  @js.native
  trait MappingHandlerStatic
    extends org.scalablytyped.runtime.Instantiable2[
          /* client */ cassandraDashDriverLib.cassandraDashDriverMod.Client, 
          /* mappingInfo */ ModelMappingInfo, 
          MappingHandler
        ]
  
  trait MappingOptions extends js.Object {
    var models: org.scalablytyped.runtime.StringDictionary[ModelOptions]
  }
  
  trait MappingQuery extends js.Object {
    var isCounter: scala.Boolean
    var isIdempotent: scala.Boolean
    var query: java.lang.String
  }
  
  trait ModelBatchItem extends js.Object
  
  @js.native
  trait ModelBatchItemStatic
    extends org.scalablytyped.runtime.Instantiable4[
          /* queries */ js.Promise[js.Array[MappingQuery]], 
          /* doc */ org.scalablytyped.runtime.StringDictionary[js.Any], 
          /* docInfo */ MappingDocInfo, 
          /* mappingInfo */ ModelMappingInfo, 
          ModelBatchItem
        ]
  
  @js.native
  trait ModelBatchMapper extends js.Object {
    def insert(doc: org.scalablytyped.runtime.StringDictionary[js.Any]): ModelBatchItem = js.native
    def insert(doc: org.scalablytyped.runtime.StringDictionary[js.Any], docInfo: MappingDocInfo): ModelBatchItem = js.native
    def remove(doc: org.scalablytyped.runtime.StringDictionary[js.Any]): ModelBatchItem = js.native
    def remove(doc: org.scalablytyped.runtime.StringDictionary[js.Any], docInfo: MappingDocInfo): ModelBatchItem = js.native
    def update(doc: org.scalablytyped.runtime.StringDictionary[js.Any]): ModelBatchItem = js.native
    def update(doc: org.scalablytyped.runtime.StringDictionary[js.Any], docInfo: MappingDocInfo): ModelBatchItem = js.native
  }
  
  @js.native
  trait ModelMapper extends js.Object {
    var batching: ModelBatchMapper = js.native
    var name: java.lang.String = js.native
    def find(doc: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Promise[Result] = js.native
    def find(doc: org.scalablytyped.runtime.StringDictionary[js.Any], docInfo: MappingDocInfo): js.Promise[Result] = js.native
    def find(
      doc: org.scalablytyped.runtime.StringDictionary[js.Any],
      docInfo: MappingDocInfo,
      executionOptions: MappingExecutionOptions
    ): js.Promise[Result] = js.native
    def find(
      doc: org.scalablytyped.runtime.StringDictionary[js.Any],
      docInfo: MappingDocInfo,
      executionOptions: java.lang.String
    ): js.Promise[Result] = js.native
    def findAll(): js.Promise[Result] = js.native
    def findAll(docInfo: MappingDocInfo): js.Promise[Result] = js.native
    def findAll(docInfo: MappingDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result] = js.native
    def findAll(docInfo: MappingDocInfo, executionOptions: java.lang.String): js.Promise[Result] = js.native
    def get(doc: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Promise[Result] = js.native
    def get(doc: org.scalablytyped.runtime.StringDictionary[js.Any], docInfo: MappingDocInfo): js.Promise[Result] = js.native
    def get(
      doc: org.scalablytyped.runtime.StringDictionary[js.Any],
      docInfo: MappingDocInfo,
      executionOptions: MappingExecutionOptions
    ): js.Promise[Result] = js.native
    def get(
      doc: org.scalablytyped.runtime.StringDictionary[js.Any],
      docInfo: MappingDocInfo,
      executionOptions: java.lang.String
    ): js.Promise[Result] = js.native
    def insert(doc: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Promise[Result] = js.native
    def insert(doc: org.scalablytyped.runtime.StringDictionary[js.Any], docInfo: MappingDocInfo): js.Promise[Result] = js.native
    def insert(
      doc: org.scalablytyped.runtime.StringDictionary[js.Any],
      docInfo: MappingDocInfo,
      executionOptions: MappingExecutionOptions
    ): js.Promise[Result] = js.native
    def insert(
      doc: org.scalablytyped.runtime.StringDictionary[js.Any],
      docInfo: MappingDocInfo,
      executionOptions: java.lang.String
    ): js.Promise[Result] = js.native
    def mapWithQuery(
      query: java.lang.String,
      paramsHandler: js.Function1[/* doc */ org.scalablytyped.runtime.StringDictionary[js.Any], _]
    ): js.Function2[
        /* doc */ org.scalablytyped.runtime.StringDictionary[js.Any], 
        /* executionOptions */ js.UndefOr[java.lang.String | MappingExecutionOptions], 
        js.Promise[Result]
      ] = js.native
    def mapWithQuery(
      query: java.lang.String,
      paramsHandler: js.Function1[/* doc */ org.scalablytyped.runtime.StringDictionary[js.Any], _],
      executionOptions: MappingExecutionOptions
    ): js.Function2[
        /* doc */ org.scalablytyped.runtime.StringDictionary[js.Any], 
        /* executionOptions */ js.UndefOr[java.lang.String | MappingExecutionOptions], 
        js.Promise[Result]
      ] = js.native
    def mapWithQuery(
      query: java.lang.String,
      paramsHandler: js.Function1[/* doc */ org.scalablytyped.runtime.StringDictionary[js.Any], _],
      executionOptions: java.lang.String
    ): js.Function2[
        /* doc */ org.scalablytyped.runtime.StringDictionary[js.Any], 
        /* executionOptions */ js.UndefOr[java.lang.String | MappingExecutionOptions], 
        js.Promise[Result]
      ] = js.native
    def remove(doc: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Promise[Result] = js.native
    def remove(doc: org.scalablytyped.runtime.StringDictionary[js.Any], docInfo: MappingDocInfo): js.Promise[Result] = js.native
    def remove(
      doc: org.scalablytyped.runtime.StringDictionary[js.Any],
      docInfo: MappingDocInfo,
      executionOptions: MappingExecutionOptions
    ): js.Promise[Result] = js.native
    def remove(
      doc: org.scalablytyped.runtime.StringDictionary[js.Any],
      docInfo: MappingDocInfo,
      executionOptions: java.lang.String
    ): js.Promise[Result] = js.native
    def update(doc: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Promise[Result] = js.native
    def update(doc: org.scalablytyped.runtime.StringDictionary[js.Any], docInfo: MappingDocInfo): js.Promise[Result] = js.native
    def update(
      doc: org.scalablytyped.runtime.StringDictionary[js.Any],
      docInfo: MappingDocInfo,
      executionOptions: MappingExecutionOptions
    ): js.Promise[Result] = js.native
    def update(
      doc: org.scalablytyped.runtime.StringDictionary[js.Any],
      docInfo: MappingDocInfo,
      executionOptions: java.lang.String
    ): js.Promise[Result] = js.native
  }
  
  @js.native
  trait ModelMapperStatic
    extends org.scalablytyped.runtime.Instantiable2[/* name */ java.lang.String, /* handler */ MappingHandler, ModelMapper]
  
  trait ModelMappingInfo extends js.Object {
    var keyspace: java.lang.String
    var tables: js.Array[ModelTables]
    def getColumnName(propName: java.lang.String): java.lang.String
    def getPropertyName(columnName: java.lang.String): java.lang.String
    def newInstance(): TableMappings
  }
  
  @js.native
  trait ModelMappingInfoStatic
    extends org.scalablytyped.runtime.Instantiable4[
          /* keyspace */ java.lang.String, 
          /* tables */ js.Array[ModelTables], 
          /* mappings */ TableMappings, 
          /* columns */ org.scalablytyped.runtime.StringDictionary[java.lang.String], 
          ModelMappingInfo
        ] {
    def createDefault(modelName: java.lang.String, currentKeyspace: java.lang.String): ModelMappingInfo = js.native
    def parse(options: MappingOptions, currentKeyspace: java.lang.String): org.scalablytyped.runtime.StringDictionary[ModelMappingInfo] = js.native
  }
  
  trait ModelOptions extends js.Object {
    var columns: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
    var keyspace: js.UndefOr[java.lang.String] = js.undefined
    var mappings: js.UndefOr[TableMappings] = js.undefined
    var tables: js.UndefOr[js.Array[java.lang.String] | js.Array[ModelTables]] = js.undefined
  }
  
  trait ModelTables extends js.Object {
    var isView: scala.Boolean
    var name: java.lang.String
  }
  
  @js.native
  trait Result extends js.Object {
    @JSName(org.scalablytyped.runtime.Symbol.iterator)
    var iterator: js.Function0[stdLib.Iterator[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
    def first(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def forEach(
      callback: js.Function2[
          /* currentValue */ org.scalablytyped.runtime.StringDictionary[js.Any], 
          /* index */ scala.Double, 
          scala.Unit
        ]
    ): scala.Unit = js.native
    def forEach(
      callback: js.Function2[
          /* currentValue */ org.scalablytyped.runtime.StringDictionary[js.Any], 
          /* index */ scala.Double, 
          scala.Unit
        ],
      thisArg: js.Any
    ): scala.Unit = js.native
    def toArray(): js.Array[org.scalablytyped.runtime.StringDictionary[_]] = js.native
    def wasApplied(): scala.Boolean = js.native
  }
  
  @js.native
  trait ResultStatic
    extends org.scalablytyped.runtime.Instantiable3[
          /* rs */ cassandraDashDriverLib.cassandraDashDriverMod.typesNs.ResultSet, 
          /* info */ ModelMappingInfo, 
          /* rowAdapter */ js.Function2[
            /* row */ cassandraDashDriverLib.cassandraDashDriverMod.typesNs.Row, 
            /* info */ ModelMappingInfo, 
            org.scalablytyped.runtime.StringDictionary[js.Any]
          ], 
          Result
        ]
  
  trait TableMappings extends js.Object {
    def getColumnName(propName: java.lang.String): java.lang.String
    def getPropertyName(columnName: java.lang.String): java.lang.String
    def newObjectInstance(): org.scalablytyped.runtime.StringDictionary[js.Any]
  }
  
  @js.native
  trait UnderscoreCqlToCamelCaseMappingsStatic
    extends org.scalablytyped.runtime.Instantiable0[UnderscoreCqlToCamelCaseMappings]
  
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

