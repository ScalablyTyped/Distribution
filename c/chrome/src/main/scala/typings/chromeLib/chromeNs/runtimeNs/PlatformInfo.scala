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

