package typings.detectDashBrowser.detectDashBrowserMod

import typings.detectDashBrowser.detectDashBrowserStrings.node
import typings.node.NodeJS.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-browser", "NodeInfo")
@js.native
class NodeInfo protected () extends DetectedInfo[node, Platform, String] {
  def this(version: String) = this()
  /* CompleteClass */
  override val name: node = js.native
  /* CompleteClass */
  override val os: Platform = js.native
  /* CompleteClass */
  override val version: String = js.native
}

