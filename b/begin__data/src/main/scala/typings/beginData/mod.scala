package typings.beginData

import org.scalablytyped.runtime.StringDictionary
import typings.beginData.anon.Dictothers
import typings.beginData.anon.Key
import typings.beginData.anon.Table
import typings.std.Array
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@begin/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def count(params: DataCountParams): js.Promise[DataCountResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DataCountResult]]
  inline def count(params: DataCountParams, callback: DataCountCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def decr(params: DataDecrementParams): js.Promise[DataDecrementResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("decr")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DataDecrementResult]]
  inline def decr(params: DataDecrementParams, callback: DataDecrementCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decr")(params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def destroy(params: DataDestroyMultipleParams): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def destroy(params: DataDestroyMultipleParams, callback: DataDestroyMultipleCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def destroy(params: DataDestroySingleParams): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def destroy(params: DataDestroySingleParams, callback: DataDestroySingleCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def get(params: DataGetEntireTableParams): js.Promise[DataGetEntireTableResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DataGetEntireTableResult]]
  inline def get(params: DataGetEntireTableParams, callback: DataGetEntireTableCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get(params: DataGetMultipleParams): js.Promise[DataGetMultipleResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DataGetMultipleResult]]
  inline def get(params: DataGetMultipleParams, callback: DataGetMultipleCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get(params: DataGetSingleParams): js.Promise[DataGetSingleResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DataGetSingleResult]]
  inline def get(params: DataGetSingleParams, callback: DataGetSingleCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def incr(params: DataIncrementParams): js.Promise[DataIncrementResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("incr")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DataIncrementResult]]
  inline def incr(params: DataIncrementParams, callback: DataIncrementCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("incr")(params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def page(params: DataPageParams): AsyncIterable[DataPageResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("page")(params.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[DataPageResult]]
  
  inline def set(params: DataSetMultipleParams): js.Promise[DataSetMultipleResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DataSetMultipleResult]]
  inline def set(params: DataSetMultipleParams, callback: DataSetMultipleCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set(params: DataSetSingleParams): js.Promise[DataSetSingleResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DataSetSingleResult]]
  inline def set(params: DataSetSingleParams, callback: DataSetSingleCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type BeginDataType = number | string | boolean | null | std.Array<@begin/data.@begin/data.BeginDataType> | {[key: string] : @begin/data.@begin/data.BeginDataType | undefined}
  }}}
  to avoid circular code involving: 
  - @begin/data.@begin/data.BeginDataType
  */
  type BeginDataType = Double | String | Boolean | Null | js.Array[Any] | StringDictionary[js.UndefOr[Any]]
  
  type DataCountCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ DataCountResult, Unit]
  
  trait DataCountParams extends StObject {
    
    val table: String
  }
  object DataCountParams {
    
    inline def apply(table: String): DataCountParams = {
      val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataCountParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataCountParams] (val x: Self) extends AnyVal {
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  type DataCountResult = Double
  
  type DataDecrementCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ DataDecrementResult, Unit]
  
  trait DataDecrementParams extends StObject {
    
    val key: String
    
    val prop: String
    
    val table: String
  }
  object DataDecrementParams {
    
    inline def apply(key: String, prop: String, table: String): DataDecrementParams = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataDecrementParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataDecrementParams] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataDecrementResult
    extends StObject
       with /* others */ StringDictionary[js.UndefOr[ReadonlyBeginDataType]] {
    
    var key: String
    
    var table: String
  }
  object DataDecrementResult {
    
    inline def apply(key: String, table: String): DataDecrementResult = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataDecrementResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataDecrementResult] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  type DataDestroyMultipleCallback = js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
  
  type DataDestroyMultipleParams = js.Array[DataDestroySingleParams]
  
  type DataDestroySingleCallback = js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
  
  trait DataDestroySingleParams extends StObject {
    
    val key: String
    
    val table: String
  }
  object DataDestroySingleParams {
    
    inline def apply(key: String, table: String): DataDestroySingleParams = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataDestroySingleParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataDestroySingleParams] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  type DataGetEntireTableCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ DataGetEntireTableResult, Unit]
  
  trait DataGetEntireTableParams extends StObject {
    
    /**
      * If your table contains many documents (or a greater number of documents than your limit), it will return a cursor
      */
    val cursor: js.UndefOr[String] = js.undefined
    
    val limit: js.UndefOr[Double] = js.undefined
    
    val table: String
  }
  object DataGetEntireTableParams {
    
    inline def apply(table: String): DataGetEntireTableParams = {
      val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataGetEntireTableParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataGetEntireTableParams] (val x: Self) extends AnyVal {
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DataGetEntireTableResult
    extends StObject
       with Array[Key] {
    
    var cursor: js.UndefOr[String] = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type DataGetMultipleCallback = (err : std.Error | null | undefined, result : @begin/data.@begin/data.DataGetMultipleResult): void
  }}}
  to avoid circular code involving: 
  - @begin/data.@begin/data.BeginDataType
  - @begin/data.@begin/data.DataGetMultipleCallback
  - @begin/data.@begin/data.DataGetMultipleResult
  */
  @js.native
  trait DataGetMultipleCallback extends StObject {
    
    def apply(err: js.Error, result: DataGetMultipleResult): Unit = js.native
    def apply(err: Null, result: DataGetMultipleResult): Unit = js.native
    def apply(err: Unit, result: DataGetMultipleResult): Unit = js.native
  }
  
  type DataGetMultipleParams = js.Array[DataGetSingleParams]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type DataGetMultipleResult = std.Array<{  table :string,   key :string, [others: string] : @begin/data.@begin/data.BeginDataType | undefined}>
  }}}
  to avoid circular code involving: 
  - @begin/data.@begin/data.BeginDataType
  - @begin/data.@begin/data.DataGetMultipleResult
  */
  @js.native
  trait DataGetMultipleResult
    extends StObject
       with Array[Key]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type DataGetSingleCallback = (err : std.Error | null | undefined, result : @begin/data.@begin/data.DataGetSingleResult): void
  }}}
  to avoid circular code involving: 
  - @begin/data.@begin/data.BeginDataType
  - @begin/data.@begin/data.DataGetSingleCallback
  - @begin/data.@begin/data.DataGetSingleResult
  */
  @js.native
  trait DataGetSingleCallback extends StObject {
    
    def apply(err: js.Error, result: DataGetSingleResult): Unit = js.native
    def apply(err: Null, result: DataGetSingleResult): Unit = js.native
    def apply(err: Unit, result: DataGetSingleResult): Unit = js.native
  }
  
  trait DataGetSingleParams extends StObject {
    
    val key: String
    
    val table: String
  }
  object DataGetSingleParams {
    
    inline def apply(key: String, table: String): DataGetSingleParams = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataGetSingleParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataGetSingleParams] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type DataGetSingleResult = {  table :string,   key :string, [others: string] : @begin/data.@begin/data.BeginDataType | undefined} | null | undefined
  }}}
  to avoid circular code involving: 
  - @begin/data.@begin/data.BeginDataType
  - @begin/data.@begin/data.DataGetSingleResult
  */
  type DataGetSingleResult = js.UndefOr[Dictothers | Null]
  
  type DataIncrementCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ DataIncrementResult, Unit]
  
  trait DataIncrementParams extends StObject {
    
    val key: String
    
    val prop: String
    
    val table: String
  }
  object DataIncrementParams {
    
    inline def apply(key: String, prop: String, table: String): DataIncrementParams = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataIncrementParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataIncrementParams] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataIncrementResult
    extends StObject
       with /* others */ StringDictionary[js.UndefOr[ReadonlyBeginDataType]] {
    
    var key: String
    
    var table: String
  }
  object DataIncrementResult {
    
    inline def apply(key: String, table: String): DataIncrementResult = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataIncrementResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataIncrementResult] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataPageParams extends StObject {
    
    val limit: js.UndefOr[Double] = js.undefined
    
    val table: String
  }
  object DataPageParams {
    
    inline def apply(table: String): DataPageParams = {
      val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataPageParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataPageParams] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  type DataPageResult = js.Array[Table]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type DataSetMultipleCallback = (err : std.Error | null | undefined, result : @begin/data.@begin/data.DataSetMultipleResult): void
  }}}
  to avoid circular code involving: 
  - @begin/data.@begin/data.BeginDataType
  - @begin/data.@begin/data.DataSetMultipleCallback
  - @begin/data.@begin/data.DataSetMultipleResult
  */
  @js.native
  trait DataSetMultipleCallback extends StObject {
    
    def apply(err: js.Error, result: DataSetMultipleResult): Unit = js.native
    def apply(err: Null, result: DataSetMultipleResult): Unit = js.native
    def apply(err: Unit, result: DataSetMultipleResult): Unit = js.native
  }
  
  type DataSetMultipleParams = js.Array[DataSetSingleParams]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type DataSetMultipleResult = std.Array<{  table :string,   key :string, [others: string] : @begin/data.@begin/data.BeginDataType | undefined}>
  }}}
  to avoid circular code involving: 
  - @begin/data.@begin/data.BeginDataType
  - @begin/data.@begin/data.DataSetMultipleResult
  */
  @js.native
  trait DataSetMultipleResult
    extends StObject
       with Array[Key]
  
  type DataSetSingleCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ DataSetSingleResult, Unit]
  
  trait DataSetSingleParams
    extends StObject
       with /* others */ StringDictionary[js.UndefOr[ReadonlyBeginDataType]] {
    
    /**
      * If no key is supplied, Begin Data will automatically supply a pseudo-random, unique, immutable key
      */
    val key: js.UndefOr[String] = js.undefined
    
    val table: String
    
    /**
      * Any document can be automatically expunged by setting a ttl value.
      *
      * ttl is a Number corresponding to a specific future Unix epoch (expressed in seconds).
      *
      * Documents will typically be automatically destroyed within 48 hours of the ttl expiring.
      *
      * Tip: during the intervening time between ttl expiry and actual expunging, the document will still be available; if its ttl is mutated or unset, the document's new ttl state will be respected.
      */
    val ttl: js.UndefOr[ReadonlyBeginDataType] = js.undefined
  }
  object DataSetSingleParams {
    
    inline def apply(table: String): DataSetSingleParams = {
      val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSetSingleParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataSetSingleParams] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: ReadonlyBeginDataType): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlNull: Self = StObject.set(x, "ttl", null)
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setTtlVarargs(value: Any*): Self = StObject.set(x, "ttl", js.Array(value*))
    }
  }
  
  trait DataSetSingleResult
    extends StObject
       with /* others */ StringDictionary[js.UndefOr[BeginDataType]] {
    
    var key: String
    
    var table: String
  }
  object DataSetSingleResult {
    
    inline def apply(key: String, table: String): DataSetSingleResult = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSetSingleResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataSetSingleResult] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ReadonlyBeginDataType = number | string | boolean | null | std.ReadonlyArray<@begin/data.@begin/data.ReadonlyBeginDataType> | {readonly [key: string] : @begin/data.@begin/data.ReadonlyBeginDataType | undefined}
  }}}
  to avoid circular code involving: 
  - @begin/data.@begin/data.DataPageResult
  - @begin/data.@begin/data.ReadonlyBeginDataType
  */
  type ReadonlyBeginDataType = Double | String | Boolean | Null | js.Array[Any] | StringDictionary[js.UndefOr[Any]]
}
