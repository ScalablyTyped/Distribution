package typings
package detectDashBrowserLib.detectDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-browser", "BrowserInfo")
@js.native
class BrowserInfo protected ()
  extends DetectedInfo[Browser, OperatingSystem | scala.Null, java.lang.String] {
  def this(name: Browser, version: java.lang.String) = this()
  def this(name: Browser, version: java.lang.String, os: OperatingSystem) = this()
  /* CompleteClass */
  override val name: Browser = js.native
  /* CompleteClass */
  override val os: OperatingSystem | scala.Null = js.native
  /* CompleteClass */
  override val version: java.lang.String = js.native
}

