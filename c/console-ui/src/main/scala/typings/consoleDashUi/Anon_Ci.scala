package typings.consoleDashUi

import typings.consoleDashUi.consoleDashUiMod.WriteLevel
import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ci extends js.Object {
  var ci: js.UndefOr[Boolean] = js.undefined
  var errorStream: js.UndefOr[WritableStream] = js.undefined
  var inputStream: js.UndefOr[ReadableStream] = js.undefined
  var outputStream: js.UndefOr[WritableStream] = js.undefined
  var writeLevel: js.UndefOr[WriteLevel] = js.undefined
}

object Anon_Ci {
  @scala.inline
  def apply(
    ci: js.UndefOr[Boolean] = js.undefined,
    errorStream: WritableStream = null,
    inputStream: ReadableStream = null,
    outputStream: WritableStream = null,
    writeLevel: WriteLevel = null
  ): Anon_Ci = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ci)) __obj.updateDynamic("ci")(ci)
    if (errorStream != null) __obj.updateDynamic("errorStream")(errorStream)
    if (inputStream != null) __obj.updateDynamic("inputStream")(inputStream)
    if (outputStream != null) __obj.updateDynamic("outputStream")(outputStream)
    if (writeLevel != null) __obj.updateDynamic("writeLevel")(writeLevel)
    __obj.asInstanceOf[Anon_Ci]
  }
}

