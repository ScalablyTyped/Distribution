package typings.betterSqlite3

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.betterSqlite3.anon.Inverse
import typings.betterSqlite3.mod.BetterSqlite3.DatabaseConstructor
import typings.node.bufferMod.global.Buffer
import typings.std.Error
import typings.std.Generator
import typings.std.IterableIterator
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("better-sqlite3", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with typings.betterSqlite3.mod.BetterSqlite3.Database {
    def this(filename: String) = this()
    def this(filename: Buffer) = this()
    def this(filename: String, options: Options) = this()
    def this(filename: Buffer, options: Options) = this()
  }
  @JSImport("better-sqlite3", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DatabaseConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (message : string, code : string): any */ @JSImport("better-sqlite3", "SqliteError")
  @js.native
  open class SqliteErrorCls protected () extends StObject {
    def this(message: String, code: String) = this()
  }
  
  type AggregateOptions = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<<T>(name : string, options : better-sqlite3.better-sqlite3.RegistrationOptions & better-sqlite3.anon.Inverse<T>): this>[1] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    F extends (args : infer A): unknown ? A : never
    }}}
    */
  @js.native
  trait ArgumentTypes[F /* <: VariableArgFunction */] extends StObject
  
  trait BackupMetadata extends StObject {
    
    var remainingPages: Double
    
    var totalPages: Double
  }
  object BackupMetadata {
    
    inline def apply(remainingPages: Double, totalPages: Double): BackupMetadata = {
      val __obj = js.Dynamic.literal(remainingPages = remainingPages.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackupMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackupMetadata] (val x: Self) extends AnyVal {
      
      inline def setRemainingPages(value: Double): Self = StObject.set(x, "remainingPages", value.asInstanceOf[js.Any])
      
      inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    }
  }
  
  trait BackupOptions extends StObject {
    
    def progress(info: BackupMetadata): Double
  }
  object BackupOptions {
    
    inline def apply(progress: BackupMetadata => Double): BackupOptions = {
      val __obj = js.Dynamic.literal(progress = js.Any.fromFunction1(progress))
      __obj.asInstanceOf[BackupOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackupOptions] (val x: Self) extends AnyVal {
      
      inline def setProgress(value: BackupMetadata => Double): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
    }
  }
  
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.betterSqlite3.mod.BetterSqlite3.ColumnDefinition] (val x: Self) extends AnyVal {
        
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
      
      def aggregate[T](name: String, options: RegistrationOptions & Inverse[T]): this.type = js.native
      
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
      
      def prepare[BindParameters /* <: js.Array[Any] | js.Object */](source: String): /* import warning: importer.ImportType#apply Failed type conversion: BindParameters extends std.Array<unknown> ? better-sqlite3.better-sqlite3.BetterSqlite3.Statement<BindParameters> : better-sqlite3.better-sqlite3.BetterSqlite3.Statement<[BindParameters]> */ js.Any = js.native
      
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
      
      var readonly: Boolean = js.native
      
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: VirtualTableOptions] (val x: Self) extends AnyVal {
        
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
  
  type ColumnDefinition = typings.betterSqlite3.mod.BetterSqlite3.ColumnDefinition
  
  type Database = typings.betterSqlite3.mod.BetterSqlite3.Database
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Array<infer E> ? E : T
    }}}
    */
  type ElementOf[T] = T
  
  trait Options extends StObject {
    
    var fileMustExist: js.UndefOr[Boolean] = js.undefined
    
    var nativeBinding: js.UndefOr[String] = js.undefined
    
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var verbose: js.UndefOr[js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFileMustExist(value: Boolean): Self = StObject.set(x, "fileMustExist", value.asInstanceOf[js.Any])
      
      inline def setFileMustExistUndefined: Self = StObject.set(x, "fileMustExist", js.undefined)
      
      inline def setNativeBinding(value: String): Self = StObject.set(x, "nativeBinding", value.asInstanceOf[js.Any])
      
      inline def setNativeBindingUndefined: Self = StObject.set(x, "nativeBinding", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setVerbose(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit): Self = StObject.set(x, "verbose", js.Any.fromFunction2(value))
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait PragmaOptions extends StObject {
    
    var simple: js.UndefOr[Boolean] = js.undefined
  }
  object PragmaOptions {
    
    inline def apply(): PragmaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PragmaOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PragmaOptions] (val x: Self) extends AnyVal {
      
      inline def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
    }
  }
  
  trait RegistrationOptions extends StObject {
    
    var deterministic: js.UndefOr[Boolean] = js.undefined
    
    var directOnly: js.UndefOr[Boolean] = js.undefined
    
    var safeIntegers: js.UndefOr[Boolean] = js.undefined
    
    var varargs: js.UndefOr[Boolean] = js.undefined
  }
  object RegistrationOptions {
    
    inline def apply(): RegistrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegistrationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegistrationOptions] (val x: Self) extends AnyVal {
      
      inline def setDeterministic(value: Boolean): Self = StObject.set(x, "deterministic", value.asInstanceOf[js.Any])
      
      inline def setDeterministicUndefined: Self = StObject.set(x, "deterministic", js.undefined)
      
      inline def setDirectOnly(value: Boolean): Self = StObject.set(x, "directOnly", value.asInstanceOf[js.Any])
      
      inline def setDirectOnlyUndefined: Self = StObject.set(x, "directOnly", js.undefined)
      
      inline def setSafeIntegers(value: Boolean): Self = StObject.set(x, "safeIntegers", value.asInstanceOf[js.Any])
      
      inline def setSafeIntegersUndefined: Self = StObject.set(x, "safeIntegers", js.undefined)
      
      inline def setVarargs(value: Boolean): Self = StObject.set(x, "varargs", value.asInstanceOf[js.Any])
      
      inline def setVarargsUndefined: Self = StObject.set(x, "varargs", js.undefined)
    }
  }
  
  trait RunResult extends StObject {
    
    var changes: Double
    
    var lastInsertRowid: Double | js.BigInt
  }
  object RunResult {
    
    inline def apply(changes: Double, lastInsertRowid: Double | js.BigInt): RunResult = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], lastInsertRowid = lastInsertRowid.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunResult] (val x: Self) extends AnyVal {
      
      inline def setChanges(value: Double): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setLastInsertRowid(value: Double | js.BigInt): Self = StObject.set(x, "lastInsertRowid", value.asInstanceOf[js.Any])
    }
  }
  
  trait SerializeOptions extends StObject {
    
    var attached: js.UndefOr[String] = js.undefined
  }
  object SerializeOptions {
    
    inline def apply(): SerializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializeOptions] (val x: Self) extends AnyVal {
      
      inline def setAttached(value: String): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
    }
  }
  
  trait SqliteError
    extends StObject
       with Error {
    
    var code: String
  }
  object SqliteError {
    
    inline def apply(code: String, message: String, name: String): SqliteError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SqliteError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SqliteError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    BindParameters extends std.Array<unknown> ? better-sqlite3.better-sqlite3.BetterSqlite3.Statement<BindParameters> : better-sqlite3.better-sqlite3.BetterSqlite3.Statement<[BindParameters]>
    }}}
    */
  type Statement[BindParameters /* <: js.Array[Any] | js.Object */] = typings.betterSqlite3.mod.BetterSqlite3.Statement[BindParameters]
  
  type Transaction[T /* <: VariableArgFunction */] = typings.betterSqlite3.mod.BetterSqlite3.Transaction[T]
  
  // FIXME: Is this `any` really necessary?
  @js.native
  trait VariableArgFunction extends StObject {
    
    def apply(params: Any*): Any = js.native
  }
  
  type _To = js.Object & DatabaseConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & DatabaseConstructor = ^
}
