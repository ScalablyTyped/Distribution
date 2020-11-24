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

/* Inlined std.Readonly<child-process-promise.child-process-promise.Options & node.child_process.SpawnOptions> */
@js.native
trait ReadonlyOptionsSpawnOptio extends js.Object {
  
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
  implicit class ReadonlyOptionsSpawnOptioOps[Self <: ReadonlyOptionsSpawnOptio] (val x: Self) extends AnyVal {
    
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
    def setArgv0(value: String): Self = this.set("argv0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgv0: Self = this.set("argv0", js.undefined)
    
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
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    
    @scala.inline
    def setSerialization(value: SerializationType): Self = this.set("serialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialization: Self = this.set("serialization", js.undefined)
    
    @scala.inline
    def setShell(value: Boolean | String): Self = this.set("shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShell: Self = this.set("shell", js.undefined)
    
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
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    
    @scala.inline
    def setWindowsHide(value: Boolean): Self = this.set("windowsHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsHide: Self = this.set("windowsHide", js.undefined)
    
    @scala.inline
    def setWindowsVerbatimArguments(value: Boolean): Self = this.set("windowsVerbatimArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsVerbatimArguments: Self = this.set("windowsVerbatimArguments", js.undefined)
  }
}
