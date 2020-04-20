package typings.childProcessPromise

import typings.childProcessPromise.childProcessPromiseStrings.stderr
import typings.childProcessPromise.childProcessPromiseStrings.stdout
import typings.node.BufferEncoding
import typings.node.NodeJS.Dict
import typings.node.NodeJS.Signals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<child-process-promise.child-process-promise.Options & node.child_process.ExecFileOptionsWithStringEncoding> */
trait ReadonlyOptionsExecFileOpCapture extends js.Object {
  val capture: js.UndefOr[
    (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
  ] = js.undefined
  val cwd: js.UndefOr[String] = js.undefined
  val encoding: BufferEncoding
  val env: js.UndefOr[Dict[String]] = js.undefined
  val gid: js.UndefOr[Double] = js.undefined
  val killSignal: js.UndefOr[Signals | Double] = js.undefined
  val maxBuffer: js.UndefOr[Double] = js.undefined
  val shell: js.UndefOr[Boolean | String] = js.undefined
  val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.undefined
  val timeout: js.UndefOr[Double] = js.undefined
  val uid: js.UndefOr[Double] = js.undefined
  val windowsHide: js.UndefOr[Boolean] = js.undefined
  val windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
}

object ReadonlyOptionsExecFileOpCapture {
  @scala.inline
  def apply(
    encoding: BufferEncoding,
    capture: (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout]) = null,
    cwd: String = null,
    env: Dict[String] = null,
    gid: Int | Double = null,
    killSignal: Signals | Double = null,
    maxBuffer: Int | Double = null,
    shell: Boolean | String = null,
    successfulExitCodes: js.Array[Double] = null,
    timeout: Int | Double = null,
    uid: Int | Double = null,
    windowsHide: js.UndefOr[Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): ReadonlyOptionsExecFileOpCapture = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal.asInstanceOf[js.Any])
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (successfulExitCodes != null) __obj.updateDynamic("successfulExitCodes")(successfulExitCodes.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyOptionsExecFileOpCapture]
  }
}

