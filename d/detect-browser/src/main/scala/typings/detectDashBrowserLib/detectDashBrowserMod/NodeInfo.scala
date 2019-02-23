package typings
package detectDashBrowserLib.detectDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-browser", "NodeInfo")
@js.native
class NodeInfo protected ()
  extends DetectedInfo[
      detectDashBrowserLib.detectDashBrowserLibStrings.node, 
      nodeLib.NodeJSNs.Platform, 
      java.lang.String
    ] {
  def this(version: java.lang.String) = this()
  /* CompleteClass */
  override val name: detectDashBrowserLib.detectDashBrowserLibStrings.node = js.native
  /* CompleteClass */
  override val os: nodeLib.NodeJSNs.Platform = js.native
  /* CompleteClass */
  override val version: java.lang.String = js.native
}

