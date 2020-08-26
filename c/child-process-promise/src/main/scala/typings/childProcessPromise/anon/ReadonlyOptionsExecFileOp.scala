package typings.childProcessPromise.anon

import typings.childProcessPromise.childProcessPromiseStrings.buffer
import typings.childProcessPromise.childProcessPromiseStrings.stderr
import typings.childProcessPromise.childProcessPromiseStrings.stdout
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.Signals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<child-process-promise.child-process-promise.Options & node.child_process.ExecFileOptionsWithBufferEncoding> */
@js.native
trait ReadonlyOptionsExecFileOp extends js.Object {
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
  implicit class ReadonlyOptionsExecFileOpOps[Self <: ReadonlyOptionsExecFileOp] (val x: Self) extends AnyVal {
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
    def setEncoding(value: buffer): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    @scala.inline
    def setEnv(value: ProcessEnv): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    @scala.inline
    def setKillSignal(value: Signals | Double): Self = this.set("killSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKillSignal: Self = this.set("killSignal", js.undefined)
    @scala.inline
    def setMaxBuffer(value: Double): Self = this.set("maxBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBuffer: Self = this.set("maxBuffer", js.undefined)
    @scala.inline
    def setShell(value: Boolean | String): Self = this.set("shell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShell: Self = this.set("shell", js.undefined)
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

