package typings.betterSqlite3.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.bufferMod.global.Buffer
import typings.std.Generator
import typings.std.IterableIterator
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BetterSqlite3 {
  
  trait ColumnDefinition extends StObject {
    
    var column: String | Null
    
    var database: String | Null
    
    var name: String
    
    var table: String | Null
    
    var `type`: String | Null
  }
  object ColumnDefinition {
    
    inline def apply(name: String): typings.betterSqlite3.mod.BetterSqlite3.ColumnDefinition = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], column = null, database = null, table = null)
      __obj.updateDynamic("type")(null)
      __obj.asInstanceOf[typings.betterSqlite3.mod.BetterSqlite3.ColumnDefinition]
    }
    
    extension [Self <: typings.betterSqlite3.mod.BetterSqlite3.ColumnDefinition](x: Self) {
      
      inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnNull: Self = StObject.set(x, "column", null)
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseNull: Self = StObject.set(x, "database", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableNull: Self = StObject.set(x, "table", null)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
    }
  }
  
  @js.native
  trait Database extends StObject {
    
    def aggregate(name: String, options: AggregateOptions): this.type = js.native
    
    def backup(destinationFile: String): js.Promise[BackupMetadata] = js.native
    def backup(destinationFile: String, options: BackupOptions): js.Promise[BackupMetadata] = js.native
    
    def close(): this.type = js.native
    
    def defaultSafeIntegers(): this.type = js.native
    def defaultSafeIntegers(toggleState: Boolean): this.type = js.native
    
    def exec(source: String): this.type = js.native
    
    def function(name: String, cb: js.Function1[/* repeated */ Any, Any]): this.type = js.native
    def function(name: String, options: RegistrationOptions, cb: js.Function1[/* repeated */ Any, Any]): this.type = js.native
    
    var inTransaction: Boolean = js.native
    
    def loadExtension(path: String): this.type = js.native
    
    var memory: Boolean = js.native
    
    var name: String = js.native
    
    var open: Boolean = js.native
    
    def pragma(source: String): Any = js.native
    def pragma(source: String, options: PragmaOptions): Any = js.native
    
    def prepare[BindParameters /* <: js.Array[Any] | js.Object */](source: String): /* import warning: importer.ImportType#apply Failed type conversion: BindParameters extends std.Array<any> ? better-sqlite3.better-sqlite3.BetterSqlite3.Statement<BindParameters> : better-sqlite3.better-sqlite3.BetterSqlite3.Statement<[BindParameters]> */ js.Any = js.native
    
    var readonly: Boolean = js.native
    
    def serialize(): Buffer = js.native
    def serialize(options: SerializeOptions): Buffer = js.native
    
    def table(name: String, options: VirtualTableOptions): this.type = js.native
    
    def transaction[F /* <: VariableArgFunction */](fn: F): typings.betterSqlite3.mod.BetterSqlite3.Transaction[F] = js.native
    
    def unsafeMode(): this.type = js.native
    def unsafeMode(unsafe: Boolean): this.type = js.native
  }
  
  @js.native
  trait DatabaseConstructor
    extends StObject
       with Instantiable1[
          (/* filename */ Buffer) | (/* filename */ String), 
          typings.betterSqlite3.mod.BetterSqlite3.Database
        ]
       with Instantiable2[
          (/* filename */ Buffer) | (/* filename */ String), 
          /* options */ Options, 
          typings.betterSqlite3.mod.BetterSqlite3.Database
        ] {
    
    def apply(filename: String): typings.betterSqlite3.mod.BetterSqlite3.Database = js.native
    def apply(filename: String, options: Options): typings.betterSqlite3.mod.BetterSqlite3.Database = js.native
    
    var SqliteError: Instantiable2[/* message */ String, /* code */ String, typings.betterSqlite3.mod.SqliteError] = js.native
  }
  
  @js.native
  trait Statement[BindParameters /* <: js.Array[Any] */] extends StObject {
    
    def all(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
    ): js.Array[Any] = js.native
    
    def bind(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
    ): this.type = js.native
    
    var busy: Boolean = js.native
    
    def columns(): js.Array[typings.betterSqlite3.mod.BetterSqlite3.ColumnDefinition] = js.native
    
    var database: typings.betterSqlite3.mod.BetterSqlite3.Database = js.native
    
    def expand(): this.type = js.native
    def expand(toggleState: Boolean): this.type = js.native
    
    def get(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
    ): Any = js.native
    
    def iterate(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
    ): IterableIterator[Any] = js.native
    
    def pluck(): this.type = js.native
    def pluck(toggleState: Boolean): this.type = js.native
    
    def raw(): this.type = js.native
    def raw(toggleState: Boolean): this.type = js.native
    
    var reader: Boolean = js.native
    
    def run(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
    ): RunResult = js.native
    
    def safeIntegers(): this.type = js.native
    def safeIntegers(toggleState: Boolean): this.type = js.native
    
    var source: String = js.native
  }
  
  @js.native
  trait Transaction[F /* <: VariableArgFunction */] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
    ): ReturnType[F] = js.native
    
    def default(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
    ): ReturnType[F] = js.native
    
    def deferred(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
    ): ReturnType[F] = js.native
    
    def exclusive(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
    ): ReturnType[F] = js.native
    
    def immediate(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
    ): ReturnType[F] = js.native
  }
  
  trait VirtualTableOptions extends StObject {
    
    var columns: js.Array[String]
    
    var directOnly: js.UndefOr[Boolean] = js.undefined
    
    var parameters: js.UndefOr[js.Array[String]] = js.undefined
    
    def rows(): Generator[Any, Any, Any]
    
    var safeIntegers: js.UndefOr[Boolean] = js.undefined
  }
  object VirtualTableOptions {
    
    inline def apply(columns: js.Array[String], rows: () => Generator[Any, Any, Any]): VirtualTableOptions = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = js.Any.fromFunction0(rows))
      __obj.asInstanceOf[VirtualTableOptions]
    }
    
    extension [Self <: VirtualTableOptions](x: Self) {
      
      inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setDirectOnly(value: Boolean): Self = StObject.set(x, "directOnly", value.asInstanceOf[js.Any])
      
      inline def setDirectOnlyUndefined: Self = StObject.set(x, "directOnly", js.undefined)
      
      inline def setParameters(value: js.Array[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: String*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setRows(value: () => Generator[Any, Any, Any]): Self = StObject.set(x, "rows", js.Any.fromFunction0(value))
      
      inline def setSafeIntegers(value: Boolean): Self = StObject.set(x, "safeIntegers", value.asInstanceOf[js.Any])
      
      inline def setSafeIntegersUndefined: Self = StObject.set(x, "safeIntegers", js.undefined)
    }
  }
}
