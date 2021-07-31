package typings.cassandraDriver

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.anon.Fields
import typings.cassandraDriver.mod.Client
import typings.cassandraDriver.typesMod.types.Long
import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mappingMod {
  
  object mapping {
    
    @JSImport("cassandra-driver/lib/mapping", "mapping.DefaultTableMappings")
    @js.native
    class DefaultTableMappings ()
      extends StObject
         with TableMappings {
      
      /* CompleteClass */
      override def getColumnName(propName: String): String = js.native
      
      /* CompleteClass */
      override def getPropertyName(columnName: String): String = js.native
      
      /* CompleteClass */
      override def newObjectInstance(): js.Any = js.native
    }
    
    @JSImport("cassandra-driver/lib/mapping", "mapping.Mapper")
    @js.native
    class Mapper protected () extends StObject {
      def this(client: Client) = this()
      def this(client: Client, options: MappingOptions) = this()
      
      def batch(items: js.Array[ModelBatchItem]): js.Promise[Result[js.Any]] = js.native
      def batch(items: js.Array[ModelBatchItem], executionOptions: String): js.Promise[Result[js.Any]] = js.native
      def batch(items: js.Array[ModelBatchItem], executionOptions: MappingExecutionOptions): js.Promise[Result[js.Any]] = js.native
      
      def forModel[T](name: String): ModelMapper[T] = js.native
    }
    
    @JSImport("cassandra-driver/lib/mapping", "mapping.UnderscoreCqlToCamelCaseMappings")
    @js.native
    class UnderscoreCqlToCamelCaseMappings ()
      extends StObject
         with TableMappings {
      
      /* CompleteClass */
      override def getColumnName(propName: String): String = js.native
      
      /* CompleteClass */
      override def getPropertyName(columnName: String): String = js.native
      
      /* CompleteClass */
      override def newObjectInstance(): js.Any = js.native
    }
    
    object q {
      
      @JSImport("cassandra-driver/lib/mapping", "mapping.q")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def and(condition1: js.Any, condition2: js.Any): QueryOperator = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(condition1.asInstanceOf[js.Any], condition2.asInstanceOf[js.Any])).asInstanceOf[QueryOperator]
      
      @scala.inline
      def append(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("append")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      @scala.inline
      def decr(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("decr")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      @scala.inline
      def gt(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("gt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      @scala.inline
      def gte(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("gte")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      @scala.inline
      def in(arr: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("in_")(arr.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      @scala.inline
      def incr(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("incr")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      @scala.inline
      def lt(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("lt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      @scala.inline
      def lte(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("lte")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      @scala.inline
      def notEq(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("notEq")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      @scala.inline
      def prepend(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("prepend")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      @scala.inline
      def remove(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      trait QueryOperator extends StObject
    }
    
    trait FindDocInfo extends StObject {
      
      var fields: js.UndefOr[js.Array[String]] = js.undefined
      
      var limit: js.UndefOr[Double] = js.undefined
      
      var orderBy: js.UndefOr[StringDictionary[String]] = js.undefined
    }
    object FindDocInfo {
      
      @scala.inline
      def apply(): FindDocInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FindDocInfo]
      }
      
      @scala.inline
      implicit class FindDocInfoMutableBuilder[Self <: FindDocInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
        
        @scala.inline
        def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        @scala.inline
        def setOrderBy(value: StringDictionary[String]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      }
    }
    
    trait InsertDocInfo extends StObject {
      
      var fields: js.UndefOr[js.Array[String]] = js.undefined
      
      var ifNotExists: js.UndefOr[Boolean] = js.undefined
      
      var ttl: js.UndefOr[Double] = js.undefined
    }
    object InsertDocInfo {
      
      @scala.inline
      def apply(): InsertDocInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertDocInfo]
      }
      
      @scala.inline
      implicit class InsertDocInfoMutableBuilder[Self <: InsertDocInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
        
        @scala.inline
        def setIfNotExists(value: Boolean): Self = StObject.set(x, "ifNotExists", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIfNotExistsUndefined: Self = StObject.set(x, "ifNotExists", js.undefined)
        
        @scala.inline
        def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      }
    }
    
    trait MappingExecutionOptions extends StObject {
      
      var executionProfile: js.UndefOr[String] = js.undefined
      
      var fetchSize: js.UndefOr[Double] = js.undefined
      
      var isIdempotent: js.UndefOr[Boolean] = js.undefined
      
      var logged: js.UndefOr[Boolean] = js.undefined
      
      var pageState: js.UndefOr[Double] = js.undefined
      
      var timestamp: js.UndefOr[Double | Long] = js.undefined
    }
    object MappingExecutionOptions {
      
      @scala.inline
      def apply(): MappingExecutionOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MappingExecutionOptions]
      }
      
      @scala.inline
      implicit class MappingExecutionOptionsMutableBuilder[Self <: MappingExecutionOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExecutionProfile(value: String): Self = StObject.set(x, "executionProfile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExecutionProfileUndefined: Self = StObject.set(x, "executionProfile", js.undefined)
        
        @scala.inline
        def setFetchSize(value: Double): Self = StObject.set(x, "fetchSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFetchSizeUndefined: Self = StObject.set(x, "fetchSize", js.undefined)
        
        @scala.inline
        def setIsIdempotent(value: Boolean): Self = StObject.set(x, "isIdempotent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsIdempotentUndefined: Self = StObject.set(x, "isIdempotent", js.undefined)
        
        @scala.inline
        def setLogged(value: Boolean): Self = StObject.set(x, "logged", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoggedUndefined: Self = StObject.set(x, "logged", js.undefined)
        
        @scala.inline
        def setPageState(value: Double): Self = StObject.set(x, "pageState", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageStateUndefined: Self = StObject.set(x, "pageState", js.undefined)
        
        @scala.inline
        def setTimestamp(value: Double | Long): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      }
    }
    
    trait MappingOptions extends StObject {
      
      var models: StringDictionary[ModelOptions]
    }
    object MappingOptions {
      
      @scala.inline
      def apply(models: StringDictionary[ModelOptions]): MappingOptions = {
        val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
        __obj.asInstanceOf[MappingOptions]
      }
      
      @scala.inline
      implicit class MappingOptionsMutableBuilder[Self <: MappingOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setModels(value: StringDictionary[ModelOptions]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
      }
    }
    
    trait ModelBatchItem extends StObject
    
    @js.native
    trait ModelBatchMapper extends StObject {
      
      def insert(doc: js.Any): ModelBatchItem = js.native
      def insert(doc: js.Any, docInfo: InsertDocInfo): ModelBatchItem = js.native
      
      def remove(doc: js.Any): ModelBatchItem = js.native
      def remove(doc: js.Any, docInfo: RemoveDocInfo): ModelBatchItem = js.native
      
      def update(doc: js.Any): ModelBatchItem = js.native
      def update(doc: js.Any, docInfo: UpdateDocInfo): ModelBatchItem = js.native
    }
    
    trait ModelColumnOptions extends StObject {
      
      var fromModel: js.UndefOr[js.Function1[/* modelValue */ js.Any, js.Any]] = js.undefined
      
      var name: String
      
      var toModel: js.UndefOr[js.Function1[/* columnValue */ js.Any, js.Any]] = js.undefined
    }
    object ModelColumnOptions {
      
      @scala.inline
      def apply(name: String): ModelColumnOptions = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[ModelColumnOptions]
      }
      
      @scala.inline
      implicit class ModelColumnOptionsMutableBuilder[Self <: ModelColumnOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFromModel(value: /* modelValue */ js.Any => js.Any): Self = StObject.set(x, "fromModel", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFromModelUndefined: Self = StObject.set(x, "fromModel", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToModel(value: /* columnValue */ js.Any => js.Any): Self = StObject.set(x, "toModel", js.Any.fromFunction1(value))
        
        @scala.inline
        def setToModelUndefined: Self = StObject.set(x, "toModel", js.undefined)
      }
    }
    
    @js.native
    trait ModelMapper[T] extends StObject {
      
      var batching: ModelBatchMapper = js.native
      
      def find(doc: StringDictionary[js.Any]): js.Promise[Result[T]] = js.native
      def find(doc: StringDictionary[js.Any], docInfo: Unit, executionOptions: String): js.Promise[Result[T]] = js.native
      def find(doc: StringDictionary[js.Any], docInfo: Unit, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      def find(doc: StringDictionary[js.Any], docInfo: FindDocInfo): js.Promise[Result[T]] = js.native
      def find(doc: StringDictionary[js.Any], docInfo: FindDocInfo, executionOptions: String): js.Promise[Result[T]] = js.native
      def find(doc: StringDictionary[js.Any], docInfo: FindDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      
      def findAll(): js.Promise[Result[T]] = js.native
      def findAll(docInfo: Unit, executionOptions: String): js.Promise[Result[T]] = js.native
      def findAll(docInfo: Unit, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      def findAll(docInfo: FindDocInfo): js.Promise[Result[T]] = js.native
      def findAll(docInfo: FindDocInfo, executionOptions: String): js.Promise[Result[T]] = js.native
      def findAll(docInfo: FindDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      
      def get(doc: StringDictionary[js.Any]): js.Promise[Null | T] = js.native
      def get(doc: StringDictionary[js.Any], docInfo: Unit, executionOptions: String): js.Promise[Null | T] = js.native
      def get(doc: StringDictionary[js.Any], docInfo: Unit, executionOptions: MappingExecutionOptions): js.Promise[Null | T] = js.native
      def get(doc: StringDictionary[js.Any], docInfo: Fields): js.Promise[Null | T] = js.native
      def get(doc: StringDictionary[js.Any], docInfo: Fields, executionOptions: String): js.Promise[Null | T] = js.native
      def get(doc: StringDictionary[js.Any], docInfo: Fields, executionOptions: MappingExecutionOptions): js.Promise[Null | T] = js.native
      
      def insert(doc: StringDictionary[js.Any]): js.Promise[Result[T]] = js.native
      def insert(doc: StringDictionary[js.Any], docInfo: Unit, executionOptions: String): js.Promise[Result[T]] = js.native
      def insert(doc: StringDictionary[js.Any], docInfo: Unit, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      def insert(doc: StringDictionary[js.Any], docInfo: InsertDocInfo): js.Promise[Result[T]] = js.native
      def insert(doc: StringDictionary[js.Any], docInfo: InsertDocInfo, executionOptions: String): js.Promise[Result[T]] = js.native
      def insert(doc: StringDictionary[js.Any], docInfo: InsertDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      
      def mapWithQuery(query: String, paramsHandler: js.Function1[/* doc */ js.Any, js.Array[js.Any]]): js.Function2[
            /* doc */ js.Any, 
            /* executionOptions */ js.UndefOr[String | MappingExecutionOptions], 
            js.Promise[Result[T]]
          ] = js.native
      def mapWithQuery(
        query: String,
        paramsHandler: js.Function1[/* doc */ js.Any, js.Array[js.Any]],
        executionOptions: String
      ): js.Function2[
            /* doc */ js.Any, 
            /* executionOptions */ js.UndefOr[String | MappingExecutionOptions], 
            js.Promise[Result[T]]
          ] = js.native
      def mapWithQuery(
        query: String,
        paramsHandler: js.Function1[/* doc */ js.Any, js.Array[js.Any]],
        executionOptions: MappingExecutionOptions
      ): js.Function2[
            /* doc */ js.Any, 
            /* executionOptions */ js.UndefOr[String | MappingExecutionOptions], 
            js.Promise[Result[T]]
          ] = js.native
      
      var name: String = js.native
      
      def remove(doc: StringDictionary[js.Any]): js.Promise[Result[T]] = js.native
      def remove(doc: StringDictionary[js.Any], docInfo: Unit, executionOptions: String): js.Promise[Result[T]] = js.native
      def remove(doc: StringDictionary[js.Any], docInfo: Unit, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      def remove(doc: StringDictionary[js.Any], docInfo: RemoveDocInfo): js.Promise[Result[T]] = js.native
      def remove(doc: StringDictionary[js.Any], docInfo: RemoveDocInfo, executionOptions: String): js.Promise[Result[T]] = js.native
      def remove(doc: StringDictionary[js.Any], docInfo: RemoveDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      
      def update(doc: StringDictionary[js.Any]): js.Promise[Result[T]] = js.native
      def update(doc: StringDictionary[js.Any], docInfo: Unit, executionOptions: String): js.Promise[Result[T]] = js.native
      def update(doc: StringDictionary[js.Any], docInfo: Unit, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      def update(doc: StringDictionary[js.Any], docInfo: UpdateDocInfo): js.Promise[Result[T]] = js.native
      def update(doc: StringDictionary[js.Any], docInfo: UpdateDocInfo, executionOptions: String): js.Promise[Result[T]] = js.native
      def update(doc: StringDictionary[js.Any], docInfo: UpdateDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
    }
    
    trait ModelOptions extends StObject {
      
      var columns: js.UndefOr[StringDictionary[String | ModelColumnOptions]] = js.undefined
      
      var keyspace: js.UndefOr[String] = js.undefined
      
      var mappings: js.UndefOr[TableMappings] = js.undefined
      
      var tables: js.UndefOr[js.Array[ModelTables | String]] = js.undefined
    }
    object ModelOptions {
      
      @scala.inline
      def apply(): ModelOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModelOptions]
      }
      
      @scala.inline
      implicit class ModelOptionsMutableBuilder[Self <: ModelOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumns(value: StringDictionary[String | ModelColumnOptions]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
        
        @scala.inline
        def setKeyspace(value: String): Self = StObject.set(x, "keyspace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyspaceUndefined: Self = StObject.set(x, "keyspace", js.undefined)
        
        @scala.inline
        def setMappings(value: TableMappings): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
        
        @scala.inline
        def setTables(value: js.Array[ModelTables | String]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
        
        @scala.inline
        def setTablesVarargs(value: (ModelTables | String)*): Self = StObject.set(x, "tables", js.Array(value :_*))
      }
    }
    
    trait ModelTables extends StObject {
      
      var isView: Boolean
      
      var name: String
    }
    object ModelTables {
      
      @scala.inline
      def apply(isView: Boolean, name: String): ModelTables = {
        val __obj = js.Dynamic.literal(isView = isView.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[ModelTables]
      }
      
      @scala.inline
      implicit class ModelTablesMutableBuilder[Self <: ModelTables] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsView(value: Boolean): Self = StObject.set(x, "isView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    trait RemoveDocInfo extends StObject {
      
      var deleteOnlyColumns: js.UndefOr[Boolean] = js.undefined
      
      var fields: js.UndefOr[js.Array[String]] = js.undefined
      
      var ifExists: js.UndefOr[Boolean] = js.undefined
      
      var ttl: js.UndefOr[Double] = js.undefined
      
      var when: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    }
    object RemoveDocInfo {
      
      @scala.inline
      def apply(): RemoveDocInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RemoveDocInfo]
      }
      
      @scala.inline
      implicit class RemoveDocInfoMutableBuilder[Self <: RemoveDocInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeleteOnlyColumns(value: Boolean): Self = StObject.set(x, "deleteOnlyColumns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteOnlyColumnsUndefined: Self = StObject.set(x, "deleteOnlyColumns", js.undefined)
        
        @scala.inline
        def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
        
        @scala.inline
        def setIfExists(value: Boolean): Self = StObject.set(x, "ifExists", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIfExistsUndefined: Self = StObject.set(x, "ifExists", js.undefined)
        
        @scala.inline
        def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
        
        @scala.inline
        def setWhen(value: StringDictionary[js.Any]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
      }
    }
    
    @js.native
    trait Result[T]
      extends StObject
         with Iterator[T, js.Any, Unit] {
      
      def first(): T | Null = js.native
      
      def forEach(callback: js.Function2[/* currentValue */ T, /* index */ Double, Unit]): Unit = js.native
      def forEach(callback: js.Function2[/* currentValue */ T, /* index */ Double, Unit], thisArg: js.Any): Unit = js.native
      
      def toArray(): js.Array[T] = js.native
      
      def wasApplied(): Boolean = js.native
    }
    
    trait TableMappings extends StObject {
      
      def getColumnName(propName: String): String
      
      def getPropertyName(columnName: String): String
      
      def newObjectInstance(): js.Any
    }
    object TableMappings {
      
      @scala.inline
      def apply(
        getColumnName: String => String,
        getPropertyName: String => String,
        newObjectInstance: () => js.Any
      ): TableMappings = {
        val __obj = js.Dynamic.literal(getColumnName = js.Any.fromFunction1(getColumnName), getPropertyName = js.Any.fromFunction1(getPropertyName), newObjectInstance = js.Any.fromFunction0(newObjectInstance))
        __obj.asInstanceOf[TableMappings]
      }
      
      @scala.inline
      implicit class TableMappingsMutableBuilder[Self <: TableMappings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetColumnName(value: String => String): Self = StObject.set(x, "getColumnName", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetPropertyName(value: String => String): Self = StObject.set(x, "getPropertyName", js.Any.fromFunction1(value))
        
        @scala.inline
        def setNewObjectInstance(value: () => js.Any): Self = StObject.set(x, "newObjectInstance", js.Any.fromFunction0(value))
      }
    }
    
    trait UpdateDocInfo extends StObject {
      
      var deleteOnlyColumns: js.UndefOr[Boolean] = js.undefined
      
      var fields: js.UndefOr[js.Array[String]] = js.undefined
      
      var ifExists: js.UndefOr[Boolean] = js.undefined
      
      var limit: js.UndefOr[Double] = js.undefined
      
      var orderBy: js.UndefOr[StringDictionary[String]] = js.undefined
      
      var ttl: js.UndefOr[Double] = js.undefined
      
      var when: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    }
    object UpdateDocInfo {
      
      @scala.inline
      def apply(): UpdateDocInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateDocInfo]
      }
      
      @scala.inline
      implicit class UpdateDocInfoMutableBuilder[Self <: UpdateDocInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeleteOnlyColumns(value: Boolean): Self = StObject.set(x, "deleteOnlyColumns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteOnlyColumnsUndefined: Self = StObject.set(x, "deleteOnlyColumns", js.undefined)
        
        @scala.inline
        def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
        
        @scala.inline
        def setIfExists(value: Boolean): Self = StObject.set(x, "ifExists", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIfExistsUndefined: Self = StObject.set(x, "ifExists", js.undefined)
        
        @scala.inline
        def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        @scala.inline
        def setOrderBy(value: StringDictionary[String]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
        
        @scala.inline
        def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
        
        @scala.inline
        def setWhen(value: StringDictionary[js.Any]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
      }
    }
  }
}
