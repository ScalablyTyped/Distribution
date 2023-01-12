package typings.cassandraDriver

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.anon.Fields
import typings.cassandraDriver.libTypesMod.types.Long
import typings.cassandraDriver.mod.Client
import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMappingMod {
  
  object mapping {
    
    @JSImport("cassandra-driver/lib/mapping", "mapping.DefaultTableMappings")
    @js.native
    open class DefaultTableMappings ()
      extends StObject
         with TableMappings {
      
      /* CompleteClass */
      override def getColumnName(propName: String): String = js.native
      
      /* CompleteClass */
      override def getPropertyName(columnName: String): String = js.native
      
      /* CompleteClass */
      override def newObjectInstance(): Any = js.native
    }
    
    @JSImport("cassandra-driver/lib/mapping", "mapping.Mapper")
    @js.native
    open class Mapper protected () extends StObject {
      def this(client: Client) = this()
      def this(client: Client, options: MappingOptions) = this()
      
      def batch(items: js.Array[ModelBatchItem]): js.Promise[Result[Any]] = js.native
      def batch(items: js.Array[ModelBatchItem], executionOptions: String): js.Promise[Result[Any]] = js.native
      def batch(items: js.Array[ModelBatchItem], executionOptions: MappingExecutionOptions): js.Promise[Result[Any]] = js.native
      
      def forModel[T](name: String): ModelMapper[T] = js.native
    }
    
    @JSImport("cassandra-driver/lib/mapping", "mapping.UnderscoreCqlToCamelCaseMappings")
    @js.native
    open class UnderscoreCqlToCamelCaseMappings ()
      extends StObject
         with TableMappings {
      
      /* CompleteClass */
      override def getColumnName(propName: String): String = js.native
      
      /* CompleteClass */
      override def getPropertyName(columnName: String): String = js.native
      
      /* CompleteClass */
      override def newObjectInstance(): Any = js.native
    }
    
    object q {
      
      @JSImport("cassandra-driver/lib/mapping", "mapping.q")
      @js.native
      val ^ : js.Any = js.native
      
      inline def and(condition1: Any, condition2: Any): QueryOperator = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(condition1.asInstanceOf[js.Any], condition2.asInstanceOf[js.Any])).asInstanceOf[QueryOperator]
      
      inline def append(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("append")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      inline def decr(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("decr")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      inline def gt(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("gt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      inline def gte(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("gte")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      inline def in(arr: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("in_")(arr.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      inline def incr(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("incr")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      inline def lt(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("lt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      inline def lte(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("lte")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      inline def notEq(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("notEq")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      inline def prepend(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("prepend")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      inline def remove(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
      
      trait QueryOperator extends StObject
    }
    
    trait FindDocInfo extends StObject {
      
      var fields: js.UndefOr[js.Array[String]] = js.undefined
      
      var limit: js.UndefOr[Double] = js.undefined
      
      var orderBy: js.UndefOr[StringDictionary[String]] = js.undefined
    }
    object FindDocInfo {
      
      inline def apply(): FindDocInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FindDocInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FindDocInfo] (val x: Self) extends AnyVal {
        
        inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
        
        inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        inline def setOrderBy(value: StringDictionary[String]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
        
        inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      }
    }
    
    trait InsertDocInfo extends StObject {
      
      var fields: js.UndefOr[js.Array[String]] = js.undefined
      
      var ifNotExists: js.UndefOr[Boolean] = js.undefined
      
      var ttl: js.UndefOr[Double] = js.undefined
    }
    object InsertDocInfo {
      
      inline def apply(): InsertDocInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertDocInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: InsertDocInfo] (val x: Self) extends AnyVal {
        
        inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
        
        inline def setIfNotExists(value: Boolean): Self = StObject.set(x, "ifNotExists", value.asInstanceOf[js.Any])
        
        inline def setIfNotExistsUndefined: Self = StObject.set(x, "ifNotExists", js.undefined)
        
        inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
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
      
      inline def apply(): MappingExecutionOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MappingExecutionOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: MappingExecutionOptions] (val x: Self) extends AnyVal {
        
        inline def setExecutionProfile(value: String): Self = StObject.set(x, "executionProfile", value.asInstanceOf[js.Any])
        
        inline def setExecutionProfileUndefined: Self = StObject.set(x, "executionProfile", js.undefined)
        
        inline def setFetchSize(value: Double): Self = StObject.set(x, "fetchSize", value.asInstanceOf[js.Any])
        
        inline def setFetchSizeUndefined: Self = StObject.set(x, "fetchSize", js.undefined)
        
        inline def setIsIdempotent(value: Boolean): Self = StObject.set(x, "isIdempotent", value.asInstanceOf[js.Any])
        
        inline def setIsIdempotentUndefined: Self = StObject.set(x, "isIdempotent", js.undefined)
        
        inline def setLogged(value: Boolean): Self = StObject.set(x, "logged", value.asInstanceOf[js.Any])
        
        inline def setLoggedUndefined: Self = StObject.set(x, "logged", js.undefined)
        
        inline def setPageState(value: Double): Self = StObject.set(x, "pageState", value.asInstanceOf[js.Any])
        
        inline def setPageStateUndefined: Self = StObject.set(x, "pageState", js.undefined)
        
        inline def setTimestamp(value: Double | Long): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      }
    }
    
    trait MappingOptions extends StObject {
      
      var models: StringDictionary[ModelOptions]
    }
    object MappingOptions {
      
      inline def apply(models: StringDictionary[ModelOptions]): MappingOptions = {
        val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
        __obj.asInstanceOf[MappingOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: MappingOptions] (val x: Self) extends AnyVal {
        
        inline def setModels(value: StringDictionary[ModelOptions]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
      }
    }
    
    trait ModelBatchItem extends StObject
    
    @js.native
    trait ModelBatchMapper extends StObject {
      
      def insert(doc: Any): ModelBatchItem = js.native
      def insert(doc: Any, docInfo: InsertDocInfo): ModelBatchItem = js.native
      
      def remove(doc: Any): ModelBatchItem = js.native
      def remove(doc: Any, docInfo: RemoveDocInfo): ModelBatchItem = js.native
      
      def update(doc: Any): ModelBatchItem = js.native
      def update(doc: Any, docInfo: UpdateDocInfo): ModelBatchItem = js.native
    }
    
    trait ModelColumnOptions extends StObject {
      
      var fromModel: js.UndefOr[js.Function1[/* modelValue */ Any, Any]] = js.undefined
      
      var name: String
      
      var toModel: js.UndefOr[js.Function1[/* columnValue */ Any, Any]] = js.undefined
    }
    object ModelColumnOptions {
      
      inline def apply(name: String): ModelColumnOptions = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[ModelColumnOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ModelColumnOptions] (val x: Self) extends AnyVal {
        
        inline def setFromModel(value: /* modelValue */ Any => Any): Self = StObject.set(x, "fromModel", js.Any.fromFunction1(value))
        
        inline def setFromModelUndefined: Self = StObject.set(x, "fromModel", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setToModel(value: /* columnValue */ Any => Any): Self = StObject.set(x, "toModel", js.Any.fromFunction1(value))
        
        inline def setToModelUndefined: Self = StObject.set(x, "toModel", js.undefined)
      }
    }
    
    @js.native
    trait ModelMapper[T] extends StObject {
      
      var batching: ModelBatchMapper = js.native
      
      def find(doc: StringDictionary[Any]): js.Promise[Result[T]] = js.native
      def find(doc: StringDictionary[Any], docInfo: Unit, executionOptions: String): js.Promise[Result[T]] = js.native
      def find(doc: StringDictionary[Any], docInfo: Unit, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      def find(doc: StringDictionary[Any], docInfo: FindDocInfo): js.Promise[Result[T]] = js.native
      def find(doc: StringDictionary[Any], docInfo: FindDocInfo, executionOptions: String): js.Promise[Result[T]] = js.native
      def find(doc: StringDictionary[Any], docInfo: FindDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      
      def findAll(): js.Promise[Result[T]] = js.native
      def findAll(docInfo: Unit, executionOptions: String): js.Promise[Result[T]] = js.native
      def findAll(docInfo: Unit, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      def findAll(docInfo: FindDocInfo): js.Promise[Result[T]] = js.native
      def findAll(docInfo: FindDocInfo, executionOptions: String): js.Promise[Result[T]] = js.native
      def findAll(docInfo: FindDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      
      def get(doc: StringDictionary[Any]): js.Promise[Null | T] = js.native
      def get(doc: StringDictionary[Any], docInfo: Unit, executionOptions: String): js.Promise[Null | T] = js.native
      def get(doc: StringDictionary[Any], docInfo: Unit, executionOptions: MappingExecutionOptions): js.Promise[Null | T] = js.native
      def get(doc: StringDictionary[Any], docInfo: Fields): js.Promise[Null | T] = js.native
      def get(doc: StringDictionary[Any], docInfo: Fields, executionOptions: String): js.Promise[Null | T] = js.native
      def get(doc: StringDictionary[Any], docInfo: Fields, executionOptions: MappingExecutionOptions): js.Promise[Null | T] = js.native
      
      def insert(doc: StringDictionary[Any]): js.Promise[Result[T]] = js.native
      def insert(doc: StringDictionary[Any], docInfo: Unit, executionOptions: String): js.Promise[Result[T]] = js.native
      def insert(doc: StringDictionary[Any], docInfo: Unit, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      def insert(doc: StringDictionary[Any], docInfo: InsertDocInfo): js.Promise[Result[T]] = js.native
      def insert(doc: StringDictionary[Any], docInfo: InsertDocInfo, executionOptions: String): js.Promise[Result[T]] = js.native
      def insert(doc: StringDictionary[Any], docInfo: InsertDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      
      def mapWithQuery(query: String, paramsHandler: js.Function1[/* doc */ Any, js.Array[Any]]): js.Function2[
            /* doc */ Any, 
            /* executionOptions */ js.UndefOr[String | MappingExecutionOptions], 
            js.Promise[Result[T]]
          ] = js.native
      def mapWithQuery(query: String, paramsHandler: js.Function1[/* doc */ Any, js.Array[Any]], executionOptions: String): js.Function2[
            /* doc */ Any, 
            /* executionOptions */ js.UndefOr[String | MappingExecutionOptions], 
            js.Promise[Result[T]]
          ] = js.native
      def mapWithQuery(
        query: String,
        paramsHandler: js.Function1[/* doc */ Any, js.Array[Any]],
        executionOptions: MappingExecutionOptions
      ): js.Function2[
            /* doc */ Any, 
            /* executionOptions */ js.UndefOr[String | MappingExecutionOptions], 
            js.Promise[Result[T]]
          ] = js.native
      
      var name: String = js.native
      
      def remove(doc: StringDictionary[Any]): js.Promise[Result[T]] = js.native
      def remove(doc: StringDictionary[Any], docInfo: Unit, executionOptions: String): js.Promise[Result[T]] = js.native
      def remove(doc: StringDictionary[Any], docInfo: Unit, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      def remove(doc: StringDictionary[Any], docInfo: RemoveDocInfo): js.Promise[Result[T]] = js.native
      def remove(doc: StringDictionary[Any], docInfo: RemoveDocInfo, executionOptions: String): js.Promise[Result[T]] = js.native
      def remove(doc: StringDictionary[Any], docInfo: RemoveDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      
      def update(doc: StringDictionary[Any]): js.Promise[Result[T]] = js.native
      def update(doc: StringDictionary[Any], docInfo: Unit, executionOptions: String): js.Promise[Result[T]] = js.native
      def update(doc: StringDictionary[Any], docInfo: Unit, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
      def update(doc: StringDictionary[Any], docInfo: UpdateDocInfo): js.Promise[Result[T]] = js.native
      def update(doc: StringDictionary[Any], docInfo: UpdateDocInfo, executionOptions: String): js.Promise[Result[T]] = js.native
      def update(doc: StringDictionary[Any], docInfo: UpdateDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
    }
    
    trait ModelOptions extends StObject {
      
      var columns: js.UndefOr[StringDictionary[String | ModelColumnOptions]] = js.undefined
      
      var keyspace: js.UndefOr[String] = js.undefined
      
      var mappings: js.UndefOr[TableMappings] = js.undefined
      
      var tables: js.UndefOr[js.Array[ModelTables | String]] = js.undefined
    }
    object ModelOptions {
      
      inline def apply(): ModelOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModelOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ModelOptions] (val x: Self) extends AnyVal {
        
        inline def setColumns(value: StringDictionary[String | ModelColumnOptions]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
        
        inline def setKeyspace(value: String): Self = StObject.set(x, "keyspace", value.asInstanceOf[js.Any])
        
        inline def setKeyspaceUndefined: Self = StObject.set(x, "keyspace", js.undefined)
        
        inline def setMappings(value: TableMappings): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
        
        inline def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
        
        inline def setTables(value: js.Array[ModelTables | String]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
        
        inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
        
        inline def setTablesVarargs(value: (ModelTables | String)*): Self = StObject.set(x, "tables", js.Array(value*))
      }
    }
    
    trait ModelTables extends StObject {
      
      var isView: Boolean
      
      var name: String
    }
    object ModelTables {
      
      inline def apply(isView: Boolean, name: String): ModelTables = {
        val __obj = js.Dynamic.literal(isView = isView.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[ModelTables]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ModelTables] (val x: Self) extends AnyVal {
        
        inline def setIsView(value: Boolean): Self = StObject.set(x, "isView", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    trait RemoveDocInfo extends StObject {
      
      var deleteOnlyColumns: js.UndefOr[Boolean] = js.undefined
      
      var fields: js.UndefOr[js.Array[String]] = js.undefined
      
      var ifExists: js.UndefOr[Boolean] = js.undefined
      
      var ttl: js.UndefOr[Double] = js.undefined
      
      var when: js.UndefOr[StringDictionary[Any]] = js.undefined
    }
    object RemoveDocInfo {
      
      inline def apply(): RemoveDocInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RemoveDocInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RemoveDocInfo] (val x: Self) extends AnyVal {
        
        inline def setDeleteOnlyColumns(value: Boolean): Self = StObject.set(x, "deleteOnlyColumns", value.asInstanceOf[js.Any])
        
        inline def setDeleteOnlyColumnsUndefined: Self = StObject.set(x, "deleteOnlyColumns", js.undefined)
        
        inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
        
        inline def setIfExists(value: Boolean): Self = StObject.set(x, "ifExists", value.asInstanceOf[js.Any])
        
        inline def setIfExistsUndefined: Self = StObject.set(x, "ifExists", js.undefined)
        
        inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
        
        inline def setWhen(value: StringDictionary[Any]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
        
        inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
      }
    }
    
    @js.native
    trait Result[T]
      extends StObject
         with Iterator[T, Any, Unit] {
      
      def first(): T | Null = js.native
      
      def forEach(callback: js.Function2[/* currentValue */ T, /* index */ Double, Unit]): Unit = js.native
      def forEach(callback: js.Function2[/* currentValue */ T, /* index */ Double, Unit], thisArg: Any): Unit = js.native
      
      def toArray(): js.Array[T] = js.native
      
      def wasApplied(): Boolean = js.native
    }
    
    trait TableMappings extends StObject {
      
      def getColumnName(propName: String): String
      
      def getPropertyName(columnName: String): String
      
      def newObjectInstance(): Any
    }
    object TableMappings {
      
      inline def apply(getColumnName: String => String, getPropertyName: String => String, newObjectInstance: () => Any): TableMappings = {
        val __obj = js.Dynamic.literal(getColumnName = js.Any.fromFunction1(getColumnName), getPropertyName = js.Any.fromFunction1(getPropertyName), newObjectInstance = js.Any.fromFunction0(newObjectInstance))
        __obj.asInstanceOf[TableMappings]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TableMappings] (val x: Self) extends AnyVal {
        
        inline def setGetColumnName(value: String => String): Self = StObject.set(x, "getColumnName", js.Any.fromFunction1(value))
        
        inline def setGetPropertyName(value: String => String): Self = StObject.set(x, "getPropertyName", js.Any.fromFunction1(value))
        
        inline def setNewObjectInstance(value: () => Any): Self = StObject.set(x, "newObjectInstance", js.Any.fromFunction0(value))
      }
    }
    
    trait UpdateDocInfo extends StObject {
      
      var deleteOnlyColumns: js.UndefOr[Boolean] = js.undefined
      
      var fields: js.UndefOr[js.Array[String]] = js.undefined
      
      var ifExists: js.UndefOr[Boolean] = js.undefined
      
      var limit: js.UndefOr[Double] = js.undefined
      
      var orderBy: js.UndefOr[StringDictionary[String]] = js.undefined
      
      var ttl: js.UndefOr[Double] = js.undefined
      
      var when: js.UndefOr[StringDictionary[Any]] = js.undefined
    }
    object UpdateDocInfo {
      
      inline def apply(): UpdateDocInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateDocInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: UpdateDocInfo] (val x: Self) extends AnyVal {
        
        inline def setDeleteOnlyColumns(value: Boolean): Self = StObject.set(x, "deleteOnlyColumns", value.asInstanceOf[js.Any])
        
        inline def setDeleteOnlyColumnsUndefined: Self = StObject.set(x, "deleteOnlyColumns", js.undefined)
        
        inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
        
        inline def setIfExists(value: Boolean): Self = StObject.set(x, "ifExists", value.asInstanceOf[js.Any])
        
        inline def setIfExistsUndefined: Self = StObject.set(x, "ifExists", js.undefined)
        
        inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        inline def setOrderBy(value: StringDictionary[String]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
        
        inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
        
        inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
        
        inline def setWhen(value: StringDictionary[Any]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
        
        inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
      }
    }
  }
}
