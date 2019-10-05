package typings.chrome.chrome.identity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.identity.launchWebAuthFlow")
@js.native
object launchWebAuthFlow extends js.Object {
  def apply(details: WebAuthFlowOptions, callback: js.Function1[/* responseUrl */ js.UndefOr[String], Unit]): Unit = js.native
}

