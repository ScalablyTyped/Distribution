package typings.chrome.chrome.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.webNavigation.getAllFrames")
@js.native
object getAllFrames extends js.Object {
  def apply(
    details: GetAllFrameDetails,
    callback: js.Function1[/* details */ js.Array[GetAllFrameResultDetails] | Null, Unit]
  ): Unit = js.native
}

