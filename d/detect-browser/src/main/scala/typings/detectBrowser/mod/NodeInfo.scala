package typings.detectBrowser.mod

import typings.detectBrowser.detectBrowserStrings.node
import typings.node.processMod.global.NodeJS.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("detect-browser", "NodeInfo")
@js.native
class NodeInfo protected () extends DetectedInfo[node, node, Platform, String] {
  def this(version: String) = this()
  
  @JSName("type")
  val type_NodeInfo: /* "node" */ String = js.native
}
