package typings.chrome.chrome.devtools.panels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.devtools.panels.create")
@js.native
object create extends js.Object {
  def apply(title: String, iconPath: String, pagePath: String): Unit = js.native
  def apply(
    title: String,
    iconPath: String,
    pagePath: String,
    callback: js.Function1[/* panel */ ExtensionPanel, Unit]
  ): Unit = js.native
}

