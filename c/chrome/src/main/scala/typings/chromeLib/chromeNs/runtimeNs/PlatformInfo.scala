package typings
package chromeLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformInfo extends js.Object {
  /**
    * The machine's processor architecture.
    * One of: "arm", "x86-32", or "x86-64"
    */
  var arch: java.lang.String
  /**
    * The native client architecture. This may be different from arch on some platforms.
    * One of: "arm", "x86-32", or "x86-64"
    */
  var nacl_arch: java.lang.String
  /**
    * The operating system chrome is running on.
    * One of: "mac", "win", "android", "cros", "linux", or "openbsd"
    */
  var os: java.lang.String
}

object PlatformInfo {
  @scala.inline
  def apply(arch: java.lang.String, nacl_arch: java.lang.String, os: java.lang.String): PlatformInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arch")(arch)
    __obj.updateDynamic("nacl_arch")(nacl_arch)
    __obj.updateDynamic("os")(os)
    __obj.asInstanceOf[PlatformInfo]
  }
}

