package typings.chrome.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.requestUpdateCheck")
@js.native
object requestUpdateCheck extends js.Object {
  def apply(
    callback: js.Function2[
      /* status */ RequestUpdateCheckStatus, 
      /* details */ js.UndefOr[UpdateCheckDetails], 
      Unit
    ]
  ): Unit = js.native
}

