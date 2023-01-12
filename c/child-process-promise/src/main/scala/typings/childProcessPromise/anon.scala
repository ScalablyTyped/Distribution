package typings.childProcessPromise

import typings.childProcessPromise.childProcessPromiseStrings.buffer
import typings.childProcessPromise.childProcessPromiseStrings.stderr
import typings.childProcessPromise.childProcessPromiseStrings.stdout
import typings.node.AbortSignal
import typings.node.bufferMod.global.BufferEncoding
import typings.node.childProcessMod.IOType
import typings.node.childProcessMod.SerializationType
import typings.node.childProcessMod.StdioOptions
import typings.node.nodeColonstreamMod.Stream
import typings.node.nodeColonurlMod.URL
import typings.node.nodeStrings.ipc
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<child-process-promise.child-process-promise.Options & node.child_process.ExecFileOptionsWithBufferEncoding> */
  trait ReadonlyOptionsExecFileOp extends StObject {
    
    val capture: js.UndefOr[
        (js.Array[stdout | stderr | Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.undefined
    
    val cwd: js.UndefOr[String | URL] = js.undefined
    
    val encoding: js.UndefOr[buffer | Null] = js.undefined
    
    val env: js.UndefOr[ProcessEnv] = js.undefined
    
    val gid: js.UndefOr[Double] = js.undefined
    
    val killSignal: js.UndefOr[Signals | Double] = js.undefined
    
    val maxBuffer: js.UndefOr[Double] = js.undefined
    
    val shell: js.UndefOr[Boolean | String] = js.undefined
    
    val signal: js.UndefOr[AbortSignal] = js.undefined
    
    val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.undefined
    
    val timeout: js.UndefOr[Double] = js.undefined
    
    val uid: js.UndefOr[Double] = js.undefined
    
    val windowsHide: js.UndefOr[Boolean] = js.undefined
    
    val windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyOptionsExecFileOp {
    
    inline def apply(): ReadonlyOptionsExecFileOp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptionsExecFileOp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyOptionsExecFileOp] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: (js.Array[stdout | stderr | Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setCaptureVarargs(value: (stdout | stderr | Any)*): Self = StObject.set(x, "capture", js.Array(value*))
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      inline def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      inline def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      inline def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      inline def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
      
      inline def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
      
      inline def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<child-process-promise.child-process-promise.Options & node.child_process.ExecFileOptionsWithStringEncoding> */
  trait ReadonlyOptionsExecFileOpCapture extends StObject {
    
    val capture: js.UndefOr[
        (js.Array[stdout | stderr | Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.undefined
    
    val cwd: js.UndefOr[String | URL] = js.undefined
    
    val encoding: BufferEncoding
    
    val env: js.UndefOr[ProcessEnv] = js.undefined
    
    val gid: js.UndefOr[Double] = js.undefined
    
    val killSignal: js.UndefOr[Signals | Double] = js.undefined
    
    val maxBuffer: js.UndefOr[Double] = js.undefined
    
    val shell: js.UndefOr[Boolean | String] = js.undefined
    
    val signal: js.UndefOr[AbortSignal] = js.undefined
    
    val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.undefined
    
    val timeout: js.UndefOr[Double] = js.undefined
    
    val uid: js.UndefOr[Double] = js.undefined
    
    val windowsHide: js.UndefOr[Boolean] = js.undefined
    
    val windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyOptionsExecFileOpCapture {
    
    inline def apply(encoding: BufferEncoding): ReadonlyOptionsExecFileOpCapture = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyOptionsExecFileOpCapture]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyOptionsExecFileOpCapture] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: (js.Array[stdout | stderr | Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setCaptureVarargs(value: (stdout | stderr | Any)*): Self = StObject.set(x, "capture", js.Array(value*))
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      inline def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      inline def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      inline def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      inline def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
      
      inline def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
      
      inline def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<child-process-promise.child-process-promise.Options & node.child_process.ExecOptions> */
  trait ReadonlyOptionsExecOption extends StObject {
    
    val capture: js.UndefOr[
        (js.Array[stdout | stderr | Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.undefined
    
    val cwd: js.UndefOr[String | URL] = js.undefined
    
    val env: js.UndefOr[ProcessEnv] = js.undefined
    
    val gid: js.UndefOr[Double] = js.undefined
    
    val killSignal: js.UndefOr[Signals | Double] = js.undefined
    
    val maxBuffer: js.UndefOr[Double] = js.undefined
    
    val shell: js.UndefOr[String] = js.undefined
    
    val signal: js.UndefOr[AbortSignal] = js.undefined
    
    val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.undefined
    
    val timeout: js.UndefOr[Double] = js.undefined
    
    val uid: js.UndefOr[Double] = js.undefined
    
    val windowsHide: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyOptionsExecOption {
    
    inline def apply(): ReadonlyOptionsExecOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptionsExecOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyOptionsExecOption] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: (js.Array[stdout | stderr | Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setCaptureVarargs(value: (stdout | stderr | Any)*): Self = StObject.set(x, "capture", js.Array(value*))
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      inline def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      inline def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      inline def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<child-process-promise.child-process-promise.Options & node.child_process.ForkOptions> */
  trait ReadonlyOptionsForkOption extends StObject {
    
    val capture: js.UndefOr[
        (js.Array[stdout | stderr | Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.undefined
    
    val cwd: js.UndefOr[String | URL] = js.undefined
    
    val detached: js.UndefOr[Boolean] = js.undefined
    
    val env: js.UndefOr[ProcessEnv] = js.undefined
    
    val execArgv: js.UndefOr[js.Array[String]] = js.undefined
    
    val execPath: js.UndefOr[String] = js.undefined
    
    val gid: js.UndefOr[Double] = js.undefined
    
    val killSignal: js.UndefOr[Signals | Double] = js.undefined
    
    val serialization: js.UndefOr[SerializationType] = js.undefined
    
    val signal: js.UndefOr[AbortSignal] = js.undefined
    
    val silent: js.UndefOr[Boolean] = js.undefined
    
    val stdio: js.UndefOr[StdioOptions] = js.undefined
    
    val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.undefined
    
    val timeout: js.UndefOr[Double] = js.undefined
    
    val uid: js.UndefOr[Double] = js.undefined
    
    val windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyOptionsForkOption {
    
    inline def apply(): ReadonlyOptionsForkOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptionsForkOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyOptionsForkOption] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: (js.Array[stdout | stderr | Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setCaptureVarargs(value: (stdout | stderr | Any)*): Self = StObject.set(x, "capture", js.Array(value*))
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      inline def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
      
      inline def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value*))
      
      inline def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
      
      inline def setExecPathUndefined: Self = StObject.set(x, "execPath", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      inline def setSerialization(value: SerializationType): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
      
      inline def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
      
      inline def setStdioVarargs(value: (js.UndefOr[IOType | ipc | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value*))
      
      inline def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      inline def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
      
      inline def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<child-process-promise.child-process-promise.Options & node.child_process.SpawnOptions> */
  trait ReadonlyOptionsSpawnOptio extends StObject {
    
    val argv0: js.UndefOr[String] = js.undefined
    
    val capture: js.UndefOr[
        (js.Array[stdout | stderr | Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.undefined
    
    val cwd: js.UndefOr[String | URL] = js.undefined
    
    val detached: js.UndefOr[Boolean] = js.undefined
    
    val env: js.UndefOr[ProcessEnv] = js.undefined
    
    val gid: js.UndefOr[Double] = js.undefined
    
    val killSignal: js.UndefOr[Signals | Double] = js.undefined
    
    val serialization: js.UndefOr[SerializationType] = js.undefined
    
    val shell: js.UndefOr[Boolean | String] = js.undefined
    
    val signal: js.UndefOr[AbortSignal] = js.undefined
    
    val stdio: js.UndefOr[StdioOptions] = js.undefined
    
    val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.undefined
    
    val timeout: js.UndefOr[Double] = js.undefined
    
    val uid: js.UndefOr[Double] = js.undefined
    
    val windowsHide: js.UndefOr[Boolean] = js.undefined
    
    val windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyOptionsSpawnOptio {
    
    inline def apply(): ReadonlyOptionsSpawnOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptionsSpawnOptio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyOptionsSpawnOptio] (val x: Self) extends AnyVal {
      
      inline def setArgv0(value: String): Self = StObject.set(x, "argv0", value.asInstanceOf[js.Any])
      
      inline def setArgv0Undefined: Self = StObject.set(x, "argv0", js.undefined)
      
      inline def setCapture(value: (js.Array[stdout | stderr | Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setCaptureVarargs(value: (stdout | stderr | Any)*): Self = StObject.set(x, "capture", js.Array(value*))
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      inline def setSerialization(value: SerializationType): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
      
      inline def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
      
      inline def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
      
      inline def setStdioVarargs(value: (js.UndefOr[IOType | ipc | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value*))
      
      inline def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      inline def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      inline def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
      
      inline def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
      
      inline def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<child-process-promise.child-process-promise.Options & {  encoding :node.buffer.<global>.BufferEncoding | undefined} & node.child_process.ExecOptions> */
  trait ReadonlyOptionsencodingBu_ extends StObject {
    
    val capture: js.UndefOr[
        (js.Array[stdout | stderr | Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.undefined
    
    val cwd: js.UndefOr[String | URL] = js.undefined
    
    val encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    val env: js.UndefOr[ProcessEnv] = js.undefined
    
    val gid: js.UndefOr[Double] = js.undefined
    
    val killSignal: js.UndefOr[Signals | Double] = js.undefined
    
    val maxBuffer: js.UndefOr[Double] = js.undefined
    
    val shell: js.UndefOr[String] = js.undefined
    
    val signal: js.UndefOr[AbortSignal] = js.undefined
    
    val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.undefined
    
    val timeout: js.UndefOr[Double] = js.undefined
    
    val uid: js.UndefOr[Double] = js.undefined
    
    val windowsHide: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyOptionsencodingBu_ {
    
    inline def apply(): ReadonlyOptionsencodingBu_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptionsencodingBu_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyOptionsencodingBu_] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: (js.Array[stdout | stderr | Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setCaptureVarargs(value: (stdout | stderr | Any)*): Self = StObject.set(x, "capture", js.Array(value*))
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      inline def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      inline def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      inline def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<child-process-promise.child-process-promise.Options & {  encoding :'buffer' | null} & node.child_process.ExecOptions> */
  trait ReadonlyOptionsencodingbu extends StObject {
    
    val capture: js.UndefOr[
        (js.Array[stdout | stderr | Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.undefined
    
    val cwd: js.UndefOr[String | URL] = js.undefined
    
    val encoding: js.UndefOr[buffer | Null] = js.undefined
    
    val env: js.UndefOr[ProcessEnv] = js.undefined
    
    val gid: js.UndefOr[Double] = js.undefined
    
    val killSignal: js.UndefOr[Signals | Double] = js.undefined
    
    val maxBuffer: js.UndefOr[Double] = js.undefined
    
    val shell: js.UndefOr[String] = js.undefined
    
    val signal: js.UndefOr[AbortSignal] = js.undefined
    
    val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.undefined
    
    val timeout: js.UndefOr[Double] = js.undefined
    
    val uid: js.UndefOr[Double] = js.undefined
    
    val windowsHide: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyOptionsencodingbu {
    
    inline def apply(): ReadonlyOptionsencodingbu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptionsencodingbu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyOptionsencodingbu] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: (js.Array[stdout | stderr | Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setCaptureVarargs(value: (stdout | stderr | Any)*): Self = StObject.set(x, "capture", js.Array(value*))
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      inline def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      inline def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      inline def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<child-process-promise.child-process-promise.Options & {  encoding :string | undefined} & node.child_process.ExecOptions> */
  trait ReadonlyOptionsencodingst extends StObject {
    
    val capture: js.UndefOr[
        (js.Array[stdout | stderr | Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
      ] = js.undefined
    
    val cwd: js.UndefOr[String | URL] = js.undefined
    
    val encoding: js.UndefOr[String] = js.undefined
    
    val env: js.UndefOr[ProcessEnv] = js.undefined
    
    val gid: js.UndefOr[Double] = js.undefined
    
    val killSignal: js.UndefOr[Signals | Double] = js.undefined
    
    val maxBuffer: js.UndefOr[Double] = js.undefined
    
    val shell: js.UndefOr[String] = js.undefined
    
    val signal: js.UndefOr[AbortSignal] = js.undefined
    
    val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.undefined
    
    val timeout: js.UndefOr[Double] = js.undefined
    
    val uid: js.UndefOr[Double] = js.undefined
    
    val windowsHide: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyOptionsencodingst {
    
    inline def apply(): ReadonlyOptionsencodingst = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptionsencodingst]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyOptionsencodingst] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: (js.Array[stdout | stderr | Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setCaptureVarargs(value: (stdout | stderr | Any)*): Self = StObject.set(x, "capture", js.Array(value*))
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      inline def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSuccessfulExitCodes(value: js.Array[Double]): Self = StObject.set(x, "successfulExitCodes", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulExitCodesUndefined: Self = StObject.set(x, "successfulExitCodes", js.undefined)
      
      inline def setSuccessfulExitCodesVarargs(value: Double*): Self = StObject.set(x, "successfulExitCodes", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      inline def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
    }
  }
}
