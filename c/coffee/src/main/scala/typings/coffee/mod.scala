package typings.coffee

import org.scalablytyped.runtime.Instantiable1
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ForkOptions
import typings.node.childProcessMod.SpawnOptions
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("coffee", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("coffee", "Coffee")
  @js.native
  open class Coffee[T] protected () extends EventEmitter {
    def this(opt: CoffeeOpt[T]) = this()
    
    var args: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * inject script file for mock purpose
      *
      * @param {String} scriptFile - script file full path
      * @return {Coffee} return self for chain
      */
    def beforeScript(scriptFile: String): this.type = js.native
    
    var cmd: String = js.native
    
    def debug(): this.type = js.native
    def debug(level: Boolean): this.type = js.native
    def debug(level: Double): this.type = js.native
    
    /**
      * get `end` hook
      *
      * @return {Promise} - end promise
      */
    def end(): js.Promise[Result] = js.native
    /**
      * get `end` hook
      *
      * @param {Function} [cb] - callback, recommended to left undefind and use promise
      */
    def end(cb: js.Function2[/* e */ js.UndefOr[js.Error], /* result */ Result, Any]): Unit = js.native
    
    /**
      * Assert type with expected value
      *
      * @param {String} type - assertion rule type, can be `code`,`stdout`,`stderr`,`error`.
      * @param {Array} args - spread args, the first item used to be a test value `{Number|String|RegExp|Array} expected`
      * @return {Coffee} return self for chain
      */
    def expect(`type`: String, args: (ExpectedType | js.Array[ExpectedType])*): this.type = js.native
    
    var method: String = js.native
    
    /**
      * Assert type with not expected value, opposite assertion of `expect`.
      *
      * @param {String} type - assertion rule type, can be `code`,`stdout`,`stderr`,`error`.
      * @param {Array} args - spread args, the first item used to be a test value `{Number|String|RegExp|Array} expected`
      * @return {Coffee} return self for chain
      */
    def notExpect(`type`: String, args: (ExpectedType | js.Array[ExpectedType])*): this.type = js.native
    
    var opt: js.UndefOr[T] = js.native
    
    def restore(): this.type = js.native
    
    /**
      * allow user to custom rule
      * @param {String} type - rule type
      * @param {Rule} RuleClz - custom rule class
      * @protected
      */
    def setRule(`type`: String, RuleClz: Instantiable1[/* opt */ RuleOpt, Rule]): Any = js.native
    
    /**
      * whether set as prompt mode
      *
      * mark as `prompt`, all stdin call by `write` will wait for `prompt` event then output
      * @param {Boolean} [enable] - default to true
      * @return {Coffee} return self for chain
      */
    def waitForPrompt(): this.type = js.native
    def waitForPrompt(enable: Boolean): this.type = js.native
    
    /**
      * Write data to stdin of the command
      * @param {String} input - input text
      * @return {Coffee} return self for chain
      */
    def write(input: String): this.type = js.native
    
    /**
      * Write special key sequence to stdin of the command, if key name not found then write origin key.
      * @example `.writeKey('2', 'ENTER', '3')`
      * @param {...String} args - input key names, will join as one key
      * @return {Coffee} return self for chain
      */
    def writeKey(args: String*): this.type = js.native
  }
  
  @JSImport("coffee", "Rule")
  @js.native
  open class Rule protected () extends StObject {
    def this(opt: RuleOpt) = this()
    
    def assert(actual: Any, expected: Any): Unit = js.native
    def assert(actual: Any, expected: Any, message: String): Unit = js.native
    def assert(actual: Any, expected: Any, message: js.Error): Unit = js.native
    
    def formatMessage(actual: Any, expected: Any): String = js.native
    def formatMessage(actual: Any, expected: Any, message: String): String = js.native
    def formatMessage(actual: Any, expected: Any, message: js.Error): String = js.native
    
    def inspectObj(obj: Any): String = js.native
    
    def validate(): Unit = js.native
    def validate(message: String): Unit = js.native
  }
  
  inline def fork(modulePath: String): Coffee[ForkOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any]).asInstanceOf[Coffee[ForkOptions]]
  inline def fork(modulePath: String, args: js.Array[String]): Coffee[ForkOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Coffee[ForkOptions]]
  inline def fork(modulePath: String, args: js.Array[String], opt: ForkOptions): Coffee[ForkOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Coffee[ForkOptions]]
  inline def fork(modulePath: String, args: Unit, opt: ForkOptions): Coffee[ForkOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Coffee[ForkOptions]]
  inline def fork(modulePath: String, opt: ForkOptions): Coffee[ForkOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Coffee[ForkOptions]]
  
  inline def spawn(modulePath: String): Coffee[SpawnOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(modulePath.asInstanceOf[js.Any]).asInstanceOf[Coffee[SpawnOptions]]
  inline def spawn(modulePath: String, args: js.Array[String]): Coffee[SpawnOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Coffee[SpawnOptions]]
  inline def spawn(modulePath: String, args: js.Array[String], opt: SpawnOptions): Coffee[SpawnOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Coffee[SpawnOptions]]
  inline def spawn(modulePath: String, args: Unit, opt: SpawnOptions): Coffee[SpawnOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Coffee[SpawnOptions]]
  inline def spawn(modulePath: String, opt: SpawnOptions): Coffee[SpawnOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(modulePath.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Coffee[SpawnOptions]]
  
  trait CoffeeOpt[T] extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var cmd: String
    
    var method: String
    
    var opt: js.UndefOr[T] = js.undefined
  }
  object CoffeeOpt {
    
    inline def apply[T](cmd: String, method: String): CoffeeOpt[T] = {
      val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoffeeOpt[T]]
    }
    
    extension [Self <: CoffeeOpt[?], T](x: Self & CoffeeOpt[T]) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOpt(value: T): Self = StObject.set(x, "opt", value.asInstanceOf[js.Any])
      
      inline def setOptUndefined: Self = StObject.set(x, "opt", js.undefined)
    }
  }
  
  type ExpectedType = Double | String | js.RegExp
  
  trait Result extends StObject {
    
    var code: Double
    
    var error: js.Error | Null
    
    var proc: ChildProcess | Null
    
    var stderr: String
    
    var stdout: String
  }
  object Result {
    
    inline def apply(code: Double, stderr: String, stdout: String): Result = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], error = null, proc = null)
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setProc(value: ChildProcess): Self = StObject.set(x, "proc", value.asInstanceOf[js.Any])
      
      inline def setProcNull: Self = StObject.set(x, "proc", null)
      
      inline def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuleOpt extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var ctx: Any
    
    var expected: ExpectedType | js.Array[ExpectedType]
    
    var isOpposite: js.UndefOr[Boolean] = js.undefined
    
    var `type`: String
  }
  object RuleOpt {
    
    inline def apply(ctx: Any, expected: ExpectedType | js.Array[ExpectedType], `type`: String): RuleOpt = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleOpt]
    }
    
    extension [Self <: RuleOpt](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCtx(value: Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setExpected(value: ExpectedType | js.Array[ExpectedType]): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedVarargs(value: ExpectedType*): Self = StObject.set(x, "expected", js.Array(value*))
      
      inline def setIsOpposite(value: Boolean): Self = StObject.set(x, "isOpposite", value.asInstanceOf[js.Any])
      
      inline def setIsOppositeUndefined: Self = StObject.set(x, "isOpposite", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
