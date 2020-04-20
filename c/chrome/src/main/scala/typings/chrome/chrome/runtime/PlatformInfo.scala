package typings.chrome.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformInfo extends js.Object {
  /**
    * The machine's processor architecture.
    * One of: "arm", "x86-32", or "x86-64"
    */
  var arch: String
  /**
    * The native client architecture. This may be different from arch on some platforms.
    * One of: "arm", "x86-32", or "x86-64"
    */
  var nacl_arch: String
  /**
    * The operating system chrome is running on.
    * One of: "mac", "win", "android", "cros", "linux", or "openbsd"
    */
  var os: String
}

object PlatformInfo {
  @scala.inline
  def apply(arch: String, nacl_arch: String, os: String): PlatformInfo = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], nacl_arch = nacl_arch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformInfo]
  }
}

