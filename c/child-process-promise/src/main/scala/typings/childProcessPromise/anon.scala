package typings.childProcessPromise

import typings.childProcessPromise.childProcessPromiseStrings.buffer
import typings.childProcessPromise.childProcessPromiseStrings.stderr
import typings.childProcessPromise.childProcessPromiseStrings.stdout
import typings.node.BufferEncoding
import typings.node.childProcessMod.SerializationType
import typings.node.childProcessMod.StdioOptions
import typings.node.nodeStrings.ignore
import typings.node.nodeStrings.inherit
import typings.node.nodeStrings.ipc
import typings.node.nodeStrings.pipe
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.Signals
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<child-process-promise.child-process-promise.Options & node.child_process.ExecFileOptionsWithBufferEncoding> */
  @js.native
  trait ReadonlyOptionsExecFileOp extends StObject {
    
    val capture: js.UndefOr[
        (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.native
    
    val cwd: js.UndefOr[String] = js.native
    
    val encoding: js.UndefOr[buffer | Null] = js.native
    
    val env: js.UndefOr[ProcessEnv] = js.native
    
    val gid: js.UndefOr[Double] = js.native
    
    val killSignal: js.UndefOr[Signals | Double] = js.native
    
    val maxBuffer: js.UndefOr[Double] = js.native
    
    val shell: js.UndefOr[Boolean | String] = js.native
    
    val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.native
    
    val timeout: js.UndefOr[Double] = js.native
    
    val uid: js.UndefOr[Double] = js.native
    
    val windowsHide: js.UndefOr[Boolean] = js.native
    
    val windowsVerbatimArguments: js.UndefOr[Boolean] = js.native
  }
  object ReadonlyOptionsExecFileOp {
    
    @scala.inline
    def apply(): ReadonlyOptionsExecFileOp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptionsExecFileOp]
    }
    
    @scala.inline
    implicit class ReadonlyOptionsExecFileOpMutableBuilder[Self <: ReadonlyOptionsExecFileOp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setCaptureVarargs(value: (stdout | stderr | js.Any)*): Self = StObject.set(x, "capture", js.Array(value :_*))
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      @scala.inline
      def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      @scala.inline
      def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      @scala.inline
      def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      @scala.inline
      def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
      
      @scala.inline
      def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<child-process-promise.child-process-promise.Options & node.child_process.ExecFileOptionsWithStringEncoding> */
  @js.native
  trait ReadonlyOptionsExecFileOpCapture extends StObject {
    
    val capture: js.UndefOr[
        (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.native
    
    val cwd: js.UndefOr[String] = js.native
    
    val encoding: BufferEncoding = js.native
    
    val env: js.UndefOr[ProcessEnv] = js.native
    
    val gid: js.UndefOr[Double] = js.native
    
    val killSignal: js.UndefOr[Signals | Double] = js.native
    
    val maxBuffer: js.UndefOr[Double] = js.native
    
    val shell: js.UndefOr[Boolean | String] = js.native
    
    val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.native
    
    val timeout: js.UndefOr[Double] = js.native
    
    val uid: js.UndefOr[Double] = js.native
    
    val windowsHide: js.UndefOr[Boolean] = js.native
    
    val windowsVerbatimArguments: js.UndefOr[Boolean] = js.native
  }
  object ReadonlyOptionsExecFileOpCapture {
    
    @scala.inline
    def apply(encoding: BufferEncoding): ReadonlyOptionsExecFileOpCapture = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyOptionsExecFileOpCapture]
    }
    
    @scala.inline
    implicit class ReadonlyOptionsExecFileOpCaptureMutableBuilder[Self <: ReadonlyOptionsExecFileOpCapture] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setCaptureVarargs(value: (stdout | stderr | js.Any)*): Self = StObject.set(x, "capture", js.Array(value :_*))
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      @scala.inline
      def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      @scala.inline
      def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      @scala.inline
      def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      @scala.inline
      def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
      
      @scala.inline
      def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<child-process-promise.child-process-promise.Options & node.child_process.ExecOptions> */
  @js.native
  trait ReadonlyOptionsExecOption extends StObject {
    
    val capture: js.UndefOr[
        (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.native
    
    val cwd: js.UndefOr[String] = js.native
    
    val env: js.UndefOr[ProcessEnv] = js.native
    
    val gid: js.UndefOr[Double] = js.native
    
    val killSignal: js.UndefOr[Signals | Double] = js.native
    
    val maxBuffer: js.UndefOr[Double] = js.native
    
    val shell: js.UndefOr[String] = js.native
    
    val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.native
    
    val timeout: js.UndefOr[Double] = js.native
    
    val uid: js.UndefOr[Double] = js.native
    
    val windowsHide: js.UndefOr[Boolean] = js.native
  }
  object ReadonlyOptionsExecOption {
    
    @scala.inline
    def apply(): ReadonlyOptionsExecOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptionsExecOption]
    }
    
    @scala.inline
    implicit class ReadonlyOptionsExecOptionMutableBuilder[Self <: ReadonlyOptionsExecOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setCaptureVarargs(value: (stdout | stderr | js.Any)*): Self = StObject.set(x, "capture", js.Array(value :_*))
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      @scala.inline
      def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      @scala.inline
      def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      @scala.inline
      def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      @scala.inline
      def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<child-process-promise.child-process-promise.Options & node.child_process.ForkOptions> */
  @js.native
  trait ReadonlyOptionsForkOption extends StObject {
    
    val capture: js.UndefOr[
        (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.native
    
    val cwd: js.UndefOr[String] = js.native
    
    val detached: js.UndefOr[Boolean] = js.native
    
    val env: js.UndefOr[ProcessEnv] = js.native
    
    val execArgv: js.UndefOr[js.Array[String]] = js.native
    
    val execPath: js.UndefOr[String] = js.native
    
    val gid: js.UndefOr[Double] = js.native
    
    val serialization: js.UndefOr[SerializationType] = js.native
    
    val silent: js.UndefOr[Boolean] = js.native
    
    val stdio: js.UndefOr[StdioOptions] = js.native
    
    val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.native
    
    val uid: js.UndefOr[Double] = js.native
    
    val windowsVerbatimArguments: js.UndefOr[Boolean] = js.native
  }
  object ReadonlyOptionsForkOption {
    
    @scala.inline
    def apply(): ReadonlyOptionsForkOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptionsForkOption]
    }
    
    @scala.inline
    implicit class ReadonlyOptionsForkOptionMutableBuilder[Self <: ReadonlyOptionsForkOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setCaptureVarargs(value: (stdout | stderr | js.Any)*): Self = StObject.set(x, "capture", js.Array(value :_*))
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
      
      @scala.inline
      def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value :_*))
      
      @scala.inline
      def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecPathUndefined: Self = StObject.set(x, "execPath", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setSerialization(value: SerializationType): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
      
      @scala.inline
      def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value :_*))
      
      @scala.inline
      def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      @scala.inline
      def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value :_*))
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<child-process-promise.child-process-promise.Options & node.child_process.SpawnOptions> */
  @js.native
  trait ReadonlyOptionsSpawnOptio extends StObject {
    
    val argv0: js.UndefOr[String] = js.native
    
    val capture: js.UndefOr[
        (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.native
    
    val cwd: js.UndefOr[String] = js.native
    
    val detached: js.UndefOr[Boolean] = js.native
    
    val env: js.UndefOr[ProcessEnv] = js.native
    
    val gid: js.UndefOr[Double] = js.native
    
    val serialization: js.UndefOr[SerializationType] = js.native
    
    val shell: js.UndefOr[Boolean | String] = js.native
    
    val stdio: js.UndefOr[StdioOptions] = js.native
    
    val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.native
    
    val timeout: js.UndefOr[Double] = js.native
    
    val uid: js.UndefOr[Double] = js.native
    
    val windowsHide: js.UndefOr[Boolean] = js.native
    
    val windowsVerbatimArguments: js.UndefOr[Boolean] = js.native
  }
  object ReadonlyOptionsSpawnOptio {
    
    @scala.inline
    def apply(): ReadonlyOptionsSpawnOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptionsSpawnOptio]
    }
    
    @scala.inline
    implicit class ReadonlyOptionsSpawnOptioMutableBuilder[Self <: ReadonlyOptionsSpawnOptio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgv0(value: String): Self = StObject.set(x, "argv0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgv0Undefined: Self = StObject.set(x, "argv0", js.undefined)
      
      @scala.inline
      def setCapture(value: (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setCaptureVarargs(value: (stdout | stderr | js.Any)*): Self = StObject.set(x, "capture", js.Array(value :_*))
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setSerialization(value: SerializationType): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
      
      @scala.inline
      def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      @scala.inline
      def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
      
      @scala.inline
      def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value :_*))
      
      @scala.inline
      def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      @scala.inline
      def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
      
      @scala.inline
      def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<child-process-promise.child-process-promise.Options & {  encoding :node.BufferEncoding | undefined} & node.child_process.ExecOptions> */
  @js.native
  trait ReadonlyOptionsencodingBu_ extends StObject {
    
    val capture: js.UndefOr[
        (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.native
    
    val cwd: js.UndefOr[String] = js.native
    
    val encoding: js.UndefOr[BufferEncoding] = js.native
    
    val env: js.UndefOr[ProcessEnv] = js.native
    
    val gid: js.UndefOr[Double] = js.native
    
    val killSignal: js.UndefOr[Signals | Double] = js.native
    
    val maxBuffer: js.UndefOr[Double] = js.native
    
    val shell: js.UndefOr[String] = js.native
    
    val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.native
    
    val timeout: js.UndefOr[Double] = js.native
    
    val uid: js.UndefOr[Double] = js.native
    
    val windowsHide: js.UndefOr[Boolean] = js.native
  }
  object ReadonlyOptionsencodingBu_ {
    
    @scala.inline
    def apply(): ReadonlyOptionsencodingBu_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptionsencodingBu_]
    }
    
    @scala.inline
    implicit class ReadonlyOptionsencodingBu_MutableBuilder[Self <: ReadonlyOptionsencodingBu_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setCaptureVarargs(value: (stdout | stderr | js.Any)*): Self = StObject.set(x, "capture", js.Array(value :_*))
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      @scala.inline
      def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      @scala.inline
      def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      @scala.inline
      def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      @scala.inline
      def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<child-process-promise.child-process-promise.Options & {  encoding :'buffer' | null} & node.child_process.ExecOptions> */
  @js.native
  trait ReadonlyOptionsencodingbu extends StObject {
    
    val capture: js.UndefOr[
        (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.native
    
    val cwd: js.UndefOr[String] = js.native
    
    val encoding: js.UndefOr[buffer | Null] = js.native
    
    val env: js.UndefOr[ProcessEnv] = js.native
    
    val gid: js.UndefOr[Double] = js.native
    
    val killSignal: js.UndefOr[Signals | Double] = js.native
    
    val maxBuffer: js.UndefOr[Double] = js.native
    
    val shell: js.UndefOr[String] = js.native
    
    val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.native
    
    val timeout: js.UndefOr[Double] = js.native
    
    val uid: js.UndefOr[Double] = js.native
    
    val windowsHide: js.UndefOr[Boolean] = js.native
  }
  object ReadonlyOptionsencodingbu {
    
    @scala.inline
    def apply(): ReadonlyOptionsencodingbu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptionsencodingbu]
    }
    
    @scala.inline
    implicit class ReadonlyOptionsencodingbuMutableBuilder[Self <: ReadonlyOptionsencodingbu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setCaptureVarargs(value: (stdout | stderr | js.Any)*): Self = StObject.set(x, "capture", js.Array(value :_*))
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      @scala.inline
      def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      @scala.inline
      def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      @scala.inline
      def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      @scala.inline
      def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<child-process-promise.child-process-promise.Options & {  encoding :string | undefined} & node.child_process.ExecOptions> */
  @js.native
  trait ReadonlyOptionsencodingst extends StObject {
    
    val capture: js.UndefOr[
        (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.native
    
    val cwd: js.UndefOr[String] = js.native
    
    val encoding: js.UndefOr[String] = js.native
    
    val env: js.UndefOr[ProcessEnv] = js.native
    
    val gid: js.UndefOr[Double] = js.native
    
    val killSignal: js.UndefOr[Signals | Double] = js.native
    
    val maxBuffer: js.UndefOr[Double] = js.native
    
    val shell: js.UndefOr[String] = js.native
    
    val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.native
    
    val timeout: js.UndefOr[Double] = js.native
    
    val uid: js.UndefOr[Double] = js.native
    
    val windowsHide: js.UndefOr[Boolean] = js.native
  }
  object ReadonlyOptionsencodingst {
    
    @scala.inline
    def apply(): ReadonlyOptionsencodingst = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptionsencodingst]
    }
    
    @scala.inline
    implicit class ReadonlyOptionsencodingstMutableBuilder[Self <: ReadonlyOptionsencodingst] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setCaptureVarargs(value: (stdout | stderr | js.Any)*): Self = StObject.set(x, "capture", js.Array(value :_*))
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      @scala.inline
      def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      @scala.inline
      def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      @scala.inline
      def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      @scala.inline
      def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
    }
  }
}
