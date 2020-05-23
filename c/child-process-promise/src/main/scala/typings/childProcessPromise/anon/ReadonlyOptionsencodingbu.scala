package typings.childProcessPromise.anon

import typings.childProcessPromise.childProcessPromiseStrings.buffer
import typings.childProcessPromise.childProcessPromiseStrings.stderr
import typings.childProcessPromise.childProcessPromiseStrings.stdout
import typings.node.NodeJS.ProcessEnv
import typings.node.NodeJS.Signals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<child-process-promise.child-process-promise.Options & {  encoding  :'buffer' | null} & node.child_process.ExecOptions> */
trait ReadonlyOptionsencodingbu extends js.Object {
  val capture: js.UndefOr[
    (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
  ] = js.undefined
  val cwd: js.UndefOr[String] = js.undefined
  val encoding: js.UndefOr[buffer] = js.undefined
  val env: js.UndefOr[ProcessEnv] = js.undefined
  val gid: js.UndefOr[Double] = js.undefined
  val killSignal: js.UndefOr[Signals | Double] = js.undefined
  val maxBuffer: js.UndefOr[Double] = js.undefined
  val shell: js.UndefOr[String] = js.undefined
  val successfulExitCodes: js.UndefOr[js.Array[Double]] = js.undefined
  val timeout: js.UndefOr[Double] = js.undefined
  val uid: js.UndefOr[Double] = js.undefined
  val windowsHide: js.UndefOr[Boolean] = js.undefined
}

object ReadonlyOptionsencodingbu {
  @scala.inline
  def apply(
    capture: (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout]) = null,
    cwd: String = null,
    encoding: buffer = null,
    env: ProcessEnv = null,
    gid: js.UndefOr[Double] = js.undefined,
    killSignal: Signals | Double = null,
    maxBuffer: js.UndefOr[Double] = js.undefined,
    shell: String = null,
    successfulExitCodes: js.Array[Double] = null,
    timeout: js.UndefOr[Double] = js.undefined,
    uid: js.UndefOr[Double] = js.undefined,
    windowsHide: js.UndefOr[Boolean] = js.undefined
  ): ReadonlyOptionsencodingbu = {
    val __obj = js.Dynamic.literal()
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid.get.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBuffer)) __obj.updateDynamic("maxBuffer")(maxBuffer.get.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (successfulExitCodes != null) __obj.updateDynamic("successfulExitCodes")(successfulExitCodes.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyOptionsencodingbu]
  }
}

