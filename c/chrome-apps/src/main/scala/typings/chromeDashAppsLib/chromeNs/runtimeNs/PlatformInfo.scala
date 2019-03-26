package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing information about the current platform.
  * @since Chrome 36.
  */
trait PlatformInfo extends js.Object {
  /**
    * The machine's processor architecture.
    * @see enum PlatformArch
    */
  var arch: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_ARM, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.mips | chromeDashAppsLib.chromeDashAppsLibStrings.arm | chromeDashAppsLib.chromeDashAppsLibStrings.`x86-64` | chromeDashAppsLib.chromeDashAppsLibStrings.`x86-32` | chromeDashAppsLib.chromeDashAppsLibStrings.mips64
    ]
  ]
  /**
    * The native client architecture. This may be different from arch on some platforms.
    * @see enum PlatformNaclArch
    */
  var nacl_arch: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_ARM, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.mips | chromeDashAppsLib.chromeDashAppsLibStrings.arm | chromeDashAppsLib.chromeDashAppsLibStrings.`x86-64` | chromeDashAppsLib.chromeDashAppsLibStrings.`x86-32` | chromeDashAppsLib.chromeDashAppsLibStrings.mips64
    ]
  ]
  /**
    * The operating system chrome is running on.
    * @see enum PlatformOs
    */
  var os: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_ANDROID, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.mac | chromeDashAppsLib.chromeDashAppsLibStrings.android | chromeDashAppsLib.chromeDashAppsLibStrings.cros | chromeDashAppsLib.chromeDashAppsLibStrings.win | chromeDashAppsLib.chromeDashAppsLibStrings.linux | chromeDashAppsLib.chromeDashAppsLibStrings.openbsd
    ]
  ]
}

object PlatformInfo {
  @scala.inline
  def apply(
    arch: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ARM, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.mips | chromeDashAppsLib.chromeDashAppsLibStrings.arm | chromeDashAppsLib.chromeDashAppsLibStrings.`x86-64` | chromeDashAppsLib.chromeDashAppsLibStrings.`x86-32` | chromeDashAppsLib.chromeDashAppsLibStrings.mips64
      ]
    ],
    nacl_arch: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ARM, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.mips | chromeDashAppsLib.chromeDashAppsLibStrings.arm | chromeDashAppsLib.chromeDashAppsLibStrings.`x86-64` | chromeDashAppsLib.chromeDashAppsLibStrings.`x86-32` | chromeDashAppsLib.chromeDashAppsLibStrings.mips64
      ]
    ],
    os: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ANDROID, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.mac | chromeDashAppsLib.chromeDashAppsLibStrings.android | chromeDashAppsLib.chromeDashAppsLibStrings.cros | chromeDashAppsLib.chromeDashAppsLibStrings.win | chromeDashAppsLib.chromeDashAppsLibStrings.linux | chromeDashAppsLib.chromeDashAppsLibStrings.openbsd
      ]
    ]
  ): PlatformInfo = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], nacl_arch = nacl_arch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlatformInfo]
  }
}

