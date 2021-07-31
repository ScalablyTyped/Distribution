package typings.childProcessPromise

import typings.childProcessPromise.anon.ReadonlyOptionsExecFileOp
import typings.childProcessPromise.anon.ReadonlyOptionsExecFileOpCapture
import typings.childProcessPromise.anon.ReadonlyOptionsExecOption
import typings.childProcessPromise.anon.ReadonlyOptionsForkOption
import typings.childProcessPromise.anon.ReadonlyOptionsSpawnOptio
import typings.childProcessPromise.anon.ReadonlyOptionsencodingBu_
import typings.childProcessPromise.anon.ReadonlyOptionsencodingbu
import typings.childProcessPromise.anon.ReadonlyOptionsencodingst
import typings.childProcessPromise.childProcessPromiseStrings.stderr
import typings.childProcessPromise.childProcessPromiseStrings.stdout
import typings.node.Buffer
import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("child-process-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def exec(command: String): ChildProcessPromise[PromiseResult[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any]).asInstanceOf[ChildProcessPromise[PromiseResult[String]]]
  @scala.inline
  def exec(command: String, options: ReadonlyOptionsExecOption): ChildProcessPromise[PromiseResult[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[PromiseResult[String]]]
  @scala.inline
  def exec(command: String, options: ReadonlyOptionsencodingBu_): ChildProcessPromise[PromiseResult[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[PromiseResult[String]]]
  @scala.inline
  def exec(command: String, options: ReadonlyOptionsencodingbu): ChildProcessPromise[PromiseResult[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[PromiseResult[Buffer]]]
  @scala.inline
  def exec(command: String, options: ReadonlyOptionsencodingst): ChildProcessPromise[PromiseResult[String | Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[PromiseResult[String | Buffer]]]
  
  @scala.inline
  def execFile(file: String): ChildProcessPromise[PromiseResult[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any]).asInstanceOf[ChildProcessPromise[PromiseResult[String]]]
  @scala.inline
  def execFile(file: String, args: js.Array[String]): ChildProcessPromise[PromiseResult[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[PromiseResult[String]]]
  @scala.inline
  def execFile(file: String, args: js.Array[String], options: ReadonlyOptionsExecFileOp): ChildProcessPromise[PromiseResult[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[PromiseResult[Buffer]]]
  @scala.inline
  def execFile(file: String, args: js.Array[String], options: ReadonlyOptionsExecFileOpCapture): ChildProcessPromise[PromiseResult[String | Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[PromiseResult[String | Buffer]]]
  @scala.inline
  def execFile(file: String, args: Null, options: ReadonlyOptionsExecFileOp): ChildProcessPromise[PromiseResult[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[PromiseResult[Buffer]]]
  @scala.inline
  def execFile(file: String, args: Null, options: ReadonlyOptionsExecFileOpCapture): ChildProcessPromise[PromiseResult[String | Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[PromiseResult[String | Buffer]]]
  @scala.inline
  def execFile(file: String, args: Unit, options: ReadonlyOptionsExecFileOpCapture): ChildProcessPromise[PromiseResult[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[PromiseResult[String]]]
  @scala.inline
  def execFile(file: String, options: ReadonlyOptionsExecFileOp): ChildProcessPromise[PromiseResult[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[PromiseResult[Buffer]]]
  @scala.inline
  def execFile(file: String, options: ReadonlyOptionsExecFileOpCapture): ChildProcessPromise[PromiseResult[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[PromiseResult[String]]]
  
  @scala.inline
  def fork(modulePath: String): ChildProcessPromise[SpawnPromiseResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any]).asInstanceOf[ChildProcessPromise[SpawnPromiseResult]]
  @scala.inline
  def fork(modulePath: String, args: js.Array[String]): ChildProcessPromise[SpawnPromiseResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[SpawnPromiseResult]]
  @scala.inline
  def fork(modulePath: String, args: js.Array[String], options: ReadonlyOptionsForkOption): ChildProcessPromise[SpawnPromiseResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[SpawnPromiseResult]]
  @scala.inline
  def fork(modulePath: String, args: Unit, options: ReadonlyOptionsForkOption): ChildProcessPromise[SpawnPromiseResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[SpawnPromiseResult]]
  
  @scala.inline
  def spawn(command: String): ChildProcessPromise[SpawnPromiseResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any]).asInstanceOf[ChildProcessPromise[SpawnPromiseResult]]
  @scala.inline
  def spawn(command: String, args: js.Array[String]): ChildProcessPromise[SpawnPromiseResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[SpawnPromiseResult]]
  @scala.inline
  def spawn(command: String, args: js.Array[String], options: ReadonlyOptionsSpawnOptio): ChildProcessPromise[SpawnPromiseResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[SpawnPromiseResult]]
  @scala.inline
  def spawn(command: String, args: Null, options: ReadonlyOptionsSpawnOptio): ChildProcessPromise[SpawnPromiseResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[SpawnPromiseResult]]
  @scala.inline
  def spawn(command: String, args: Unit, options: ReadonlyOptionsSpawnOptio): ChildProcessPromise[SpawnPromiseResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessPromise[SpawnPromiseResult]]
  
  @js.native
  trait ChildProcessPromise[T]
    extends js.Promise[T] {
    
    var childProcess: ChildProcess = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Pass an additional capture option to buffer the result of stdout and/or stderr
      * Default: []
      */
    var capture: js.UndefOr[
        (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.undefined
    
    /**
      * Array of the numbers that should be interpreted as successful execution codes
      * Default: [0]
      */
    var successfulExitCodes: js.UndefOr[js.Array[Double]] = js.undefined
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
      def setCapture(value: (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setCaptureVarargs(value: (stdout | stderr | js.Any)*): Self = StObject.set(x, "capture", js.Array(value :_*))
      
      @scala.inline
      def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      @scala.inline
      def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value :_*))
    }
  }
  
  trait PromiseResult[Enc /* <: String | Buffer */] extends StObject {
    
    var childProcess: ChildProcess
    
    var stderr: Enc
    
    var stdout: Enc
  }
  object PromiseResult {
    
    @scala.inline
    def apply[Enc /* <: String | Buffer */](childProcess: ChildProcess, stderr: Enc, stdout: Enc): PromiseResult[Enc] = {
      val __obj = js.Dynamic.literal(childProcess = childProcess.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseResult[Enc]]
    }
    
    @scala.inline
    implicit class PromiseResultMutableBuilder[Self <: PromiseResult[?], Enc /* <: String | Buffer */] (val x: Self & PromiseResult[Enc]) extends AnyVal {
      
      @scala.inline
      def setChildProcess(value: ChildProcess): Self = StObject.set(x, "childProcess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderr(value: Enc): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdout(value: Enc): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpawnPromiseResult
    extends StObject
       with PromiseResult[String] {
    
    var code: Double
  }
  object SpawnPromiseResult {
    
    @scala.inline
    def apply(childProcess: ChildProcess, code: Double, stderr: String, stdout: String): SpawnPromiseResult = {
      val __obj = js.Dynamic.literal(childProcess = childProcess.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpawnPromiseResult]
    }
    
    @scala.inline
    implicit class SpawnPromiseResultMutableBuilder[Self <: SpawnPromiseResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
}
