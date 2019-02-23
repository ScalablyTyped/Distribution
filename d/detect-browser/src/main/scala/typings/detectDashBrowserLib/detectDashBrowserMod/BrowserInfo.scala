package typings
package detectDashBrowserLib.detectDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-browser", "BrowserInfo")
@js.native
class BrowserInfo protected ()
  extends DetectedInfo[
      detectDashBrowserLib.Browser, 
      detectDashBrowserLib.OperatingSystem | scala.Null, 
      java.lang.String
    ] {
  def this(name: detectDashBrowserLib.Browser, version: java.lang.String) = this()
  def this(name: detectDashBrowserLib.Browser, version: java.lang.String, os: detectDashBrowserLib.OperatingSystem) = this()
  /* CompleteClass */
  override val name: detectDashBrowserLib.Browser = js.native
  /* CompleteClass */
  override val os: detectDashBrowserLib.OperatingSystem | scala.Null = js.native
  /* CompleteClass */
  override val version: java.lang.String = js.native
}

