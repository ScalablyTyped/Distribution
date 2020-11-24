package typings.childProcessPromise.anon

import typings.childProcessPromise.childProcessPromiseStrings.stderr
import typings.childProcessPromise.childProcessPromiseStrings.stdout
import typings.node.childProcessMod.SerializationType
import typings.node.childProcessMod.StdioOptions
import typings.node.nodeStrings.ignore
import typings.node.nodeStrings.inherit
import typings.node.nodeStrings.ipc
import typings.node.nodeStrings.pipe
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<child-process-promise.child-process-promise.Options & node.child_process.ForkOptions> */
@js.native
trait ReadonlyOptionsForkOption extends js.Object {
  
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
  implicit class ReadonlyOptionsForkOptionOps[Self <: ReadonlyOptionsForkOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaptureVarargs(value: (stdout | stderr | js.Any)*): Self = this.set("capture", js.Array(value :_*))
    
    @scala.inline
    def setCapture(value: (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setDetached(value: Boolean): Self = this.set("detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    
    @scala.inline
    def setEnv(value: ProcessEnv): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setExecArgvVarargs(value: String*): Self = this.set("execArgv", js.Array(value :_*))
    
    @scala.inline
    def setExecArgv(value: js.Array[String]): Self = this.set("execArgv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecArgv: Self = this.set("execArgv", js.undefined)
    
    @scala.inline
    def setExecPath(value: String): Self = this.set("execPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecPath: Self = this.set("execPath", js.undefined)
    
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    
    @scala.inline
    def setSerialization(value: SerializationType): Self = this.set("serialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialization: Self = this.set("serialization", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = this.set("stdio", js.Array(value :_*))
    
    @scala.inline
    def setStdio(value: StdioOptions): Self = this.set("stdio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdio: Self = this.set("stdio", js.undefined)
    
    @scala.inline
    def setSuccessfulExitCodesVarargs(value: Double*): Self = this.set("successfulExitCodes", js.Array(value :_*))
    
    @scala.inline
    def setSuccessfulExitCodes(value: js.Array[Double]): Self = this.set("successfulExitCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessfulExitCodes: Self = this.set("successfulExitCodes", js.undefined)
    
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    
    @scala.inline
    def setWindowsVerbatimArguments(value: Boolean): Self = this.set("windowsVerbatimArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsVerbatimArguments: Self = this.set("windowsVerbatimArguments", js.undefined)
  }
}
