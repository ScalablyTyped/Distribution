package typings.betterSqlite3

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.betterSqlite3.mod.BetterSqlite3.DatabaseConstructor
import typings.integer.mod.IntClass
import typings.integer.mod.IntLike
import typings.std.Error
import typings.std.IterableIterator
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("better-sqlite3", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends typings.betterSqlite3.mod.BetterSqlite3.Database {
    def this(filename: String) = this()
    def this(filename: String, options: Options) = this()
  }
  @JSImport("better-sqlite3", JSImport.Namespace)
  @js.native
  val ^ : DatabaseConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (message : string, code : string): / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias better-sqlite3.better-sqlite3.SqliteError * / object */ @JSImport("better-sqlite3", "SqliteError")
  @js.native
  class SqliteErrorCls protected () extends StObject {
    def this(message: String, code: String) = this()
  }
  
  @js.native
  trait AggregateOptions extends RegistrationOptions {
    
    var inverse: js.UndefOr[js.Function2[/* total */ js.Any, /* dropped */ js.Any, _]] = js.native
    
    var result: js.UndefOr[js.Function1[/* total */ js.Any, _]] = js.native
    
    var start: js.UndefOr[js.Any] = js.native
    
    def step(total: js.Any, next: js.Any): js.Any = js.native
  }
  object AggregateOptions {
    
    @scala.inline
    def apply(step: (js.Any, js.Any) => js.Any): AggregateOptions = {
      val __obj = js.Dynamic.literal(step = js.Any.fromFunction2(step))
      __obj.asInstanceOf[AggregateOptions]
    }
    
    @scala.inline
    implicit class AggregateOptionsMutableBuilder[Self <: AggregateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInverse(value: (/* total */ js.Any, /* dropped */ js.Any) => _): Self = StObject.set(x, "inverse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      @scala.inline
      def setResult(value: /* total */ js.Any => _): Self = StObject.set(x, "result", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setStart(value: js.Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStep(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "step", js.Any.fromFunction2(value))
    }
  }
  
  type ArgumentTypes[F /* <: VariableArgFunction */] = js.Any
  
  @js.native
  trait BackupMetadata extends StObject {
    
    var remainingPages: Double = js.native
    
    var totalPages: Double = js.native
  }
  object BackupMetadata {
    
    @scala.inline
    def apply(remainingPages: Double, totalPages: Double): BackupMetadata = {
      val __obj = js.Dynamic.literal(remainingPages = remainingPages.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackupMetadata]
    }
    
    @scala.inline
    implicit class BackupMetadataMutableBuilder[Self <: BackupMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemainingPages(value: Double): Self = StObject.set(x, "remainingPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BackupOptions extends StObject {
    
    def progress(info: BackupMetadata): Double = js.native
  }
  object BackupOptions {
    
    @scala.inline
    def apply(progress: BackupMetadata => Double): BackupOptions = {
      val __obj = js.Dynamic.literal(progress = js.Any.fromFunction1(progress))
      __obj.asInstanceOf[BackupOptions]
    }
    
    @scala.inline
    implicit class BackupOptionsMutableBuilder[Self <: BackupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProgress(value: BackupMetadata => Double): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
    }
  }
  
  object BetterSqlite3 {
    
    @js.native
    trait ColumnDefinition extends StObject {
      
      var column: String | Null = js.native
      
      var database: String | Null = js.native
      
      var name: String = js.native
      
      var table: String | Null = js.native
      
      var `type`: String | Null = js.native
    }
    object ColumnDefinition {
      
      @scala.inline
      def apply(name: String): typings.betterSqlite3.mod.BetterSqlite3.ColumnDefinition = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.betterSqlite3.mod.BetterSqlite3.ColumnDefinition]
      }
      
      @scala.inline
      implicit class ColumnDefinitionMutableBuilder[Self <: typings.betterSqlite3.mod.BetterSqlite3.ColumnDefinition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnNull: Self = StObject.set(x, "column", null)
        
        @scala.inline
        def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatabaseNull: Self = StObject.set(x, "database", null)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableNull: Self = StObject.set(x, "table", null)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeNull: Self = StObject.set(x, "type", null)
      }
    }
    
    @js.native
    trait Database extends StObject {
      
      def aggregate(name: String, options: AggregateOptions): this.type = js.native
      
      def backup(destinationFile: String): js.Promise[BackupMetadata] = js.native
      def backup(destinationFile: String, options: BackupOptions): js.Promise[BackupMetadata] = js.native
      
      def checkpoint(): this.type = js.native
      def checkpoint(databaseName: String): this.type = js.native
      
      def close(): this.type = js.native
      
      def defaultSafeIntegers(): this.type = js.native
      def defaultSafeIntegers(toggleState: Boolean): this.type = js.native
      
      def exec(source: String): this.type = js.native
      
      def function(name: String, cb: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
      def function(name: String, options: RegistrationOptions, cb: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
      
      var inTransaction: Boolean = js.native
      
      def loadExtension(path: String): this.type = js.native
      
      var memory: Boolean = js.native
      
      var name: String = js.native
      
      var open: Boolean = js.native
      
      def pragma(source: String): js.Any = js.native
      def pragma(source: String, options: PragmaOptions): js.Any = js.native
      
      def prepare[BindParameters /* <: js.Array[_] | js.Object */](source: String): typings.betterSqlite3.mod.BetterSqlite3.Statement[js.Array[BindParameters] | BindParameters] = js.native
      
      var readonly: Boolean = js.native
      
      def transaction[F /* <: VariableArgFunction */](fn: F): typings.betterSqlite3.mod.BetterSqlite3.Transaction[F] = js.native
    }
    
    @js.native
    trait DatabaseConstructor
      extends Instantiable1[/* filename */ String, typings.betterSqlite3.mod.BetterSqlite3.Database]
         with Instantiable2[
              /* filename */ String, 
              /* options */ Options, 
              typings.betterSqlite3.mod.BetterSqlite3.Database
            ] {
      
      def apply(filename: String): typings.betterSqlite3.mod.BetterSqlite3.Database = js.native
      def apply(filename: String, options: Options): typings.betterSqlite3.mod.BetterSqlite3.Database = js.native
      
      def Integer(`val`: IntLike): IntClass = js.native
      @JSName("Integer")
      var Integer_Original: js.Function1[/* val */ IntLike, IntClass] = js.native
      
      var SqliteError: Instantiable2[/* message */ String, /* code */ String, typings.betterSqlite3.mod.SqliteError] = js.native
    }
    
    @js.native
    trait Statement[BindParameters /* <: js.Array[_] */] extends StObject {
      
      def all(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
      ): js.Array[_] = js.native
      
      def bind(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
      ): this.type = js.native
      
      def columns(): js.Array[typings.betterSqlite3.mod.BetterSqlite3.ColumnDefinition] = js.native
      
      var database: typings.betterSqlite3.mod.BetterSqlite3.Database = js.native
      
      def expand(): this.type = js.native
      def expand(toggleState: Boolean): this.type = js.native
      
      def get(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
      ): js.Any = js.native
      
      def iterate(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type BindParameters is not an array type */ params: BindParameters
      ): IterableIterator[_] = js.native
      
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
  }
  
  type ColumnDefinition = typings.betterSqlite3.mod.BetterSqlite3.ColumnDefinition
  
  type Database = typings.betterSqlite3.mod.BetterSqlite3.Database
  
  type Integer = js.Function1[/* val */ IntLike, IntClass]
  
  @js.native
  trait Options extends StObject {
    
    var fileMustExist: js.UndefOr[Boolean] = js.native
    
    var memory: js.UndefOr[Boolean] = js.native
    
    var readonly: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var verbose: js.UndefOr[js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileMustExist(value: Boolean): Self = StObject.set(x, "fileMustExist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileMustExistUndefined: Self = StObject.set(x, "fileMustExist", js.undefined)
      
      @scala.inline
      def setMemory(value: Boolean): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      @scala.inline
      def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setVerbose(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "verbose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait PragmaOptions extends StObject {
    
    var simple: js.UndefOr[Boolean] = js.native
  }
  object PragmaOptions {
    
    @scala.inline
    def apply(): PragmaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PragmaOptions]
    }
    
    @scala.inline
    implicit class PragmaOptionsMutableBuilder[Self <: PragmaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
    }
  }
  
  @js.native
  trait RegistrationOptions extends StObject {
    
    var deterministic: js.UndefOr[Boolean] = js.native
    
    var safeIntegers: js.UndefOr[Boolean] = js.native
    
    var varargs: js.UndefOr[Boolean] = js.native
  }
  object RegistrationOptions {
    
    @scala.inline
    def apply(): RegistrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegistrationOptions]
    }
    
    @scala.inline
    implicit class RegistrationOptionsMutableBuilder[Self <: RegistrationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeterministic(value: Boolean): Self = StObject.set(x, "deterministic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeterministicUndefined: Self = StObject.set(x, "deterministic", js.undefined)
      
      @scala.inline
      def setSafeIntegers(value: Boolean): Self = StObject.set(x, "safeIntegers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeIntegersUndefined: Self = StObject.set(x, "safeIntegers", js.undefined)
      
      @scala.inline
      def setVarargs(value: Boolean): Self = StObject.set(x, "varargs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVarargsUndefined: Self = StObject.set(x, "varargs", js.undefined)
    }
  }
  
  @js.native
  trait RunResult extends StObject {
    
    var changes: Double = js.native
    
    var lastInsertRowid: IntLike = js.native
  }
  object RunResult {
    
    @scala.inline
    def apply(changes: Double, lastInsertRowid: IntLike): RunResult = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], lastInsertRowid = lastInsertRowid.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunResult]
    }
    
    @scala.inline
    implicit class RunResultMutableBuilder[Self <: RunResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChanges(value: Double): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastInsertRowid(value: IntLike): Self = StObject.set(x, "lastInsertRowid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SqliteError extends Error {
    
    var code: String = js.native
  }
  object SqliteError {
    
    @scala.inline
    def apply(code: String, message: String, name: String): SqliteError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SqliteError]
    }
    
    @scala.inline
    implicit class SqliteErrorMutableBuilder[Self <: SqliteError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  type Statement[BindParameters /* <: js.Array[_] | js.Object */] = typings.betterSqlite3.mod.BetterSqlite3.Statement[js.Array[BindParameters] | BindParameters]
  
  type Transaction = typings.betterSqlite3.mod.BetterSqlite3.Transaction[VariableArgFunction]
  
  type VariableArgFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type _To = DatabaseConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: DatabaseConstructor = ^
}
