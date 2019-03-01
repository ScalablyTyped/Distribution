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
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_ARM[keyof chrome-apps.Anon_ARM] */ js.Any
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
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_ARM[keyof chrome-apps.Anon_ARM] */ js.Any
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
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_ANDROID[keyof chrome-apps.Anon_ANDROID] */ js.Any
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
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_ARM[keyof chrome-apps.Anon_ARM] */ js.Any
      ]
    ],
    nacl_arch: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ARM, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_ARM[keyof chrome-apps.Anon_ARM] */ js.Any
      ]
    ],
    os: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ANDROID, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_ANDROID[keyof chrome-apps.Anon_ANDROID] */ js.Any
      ]
    ]
  ): PlatformInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arch")(arch.asInstanceOf[js.Any])
    __obj.updateDynamic("nacl_arch")(nacl_arch.asInstanceOf[js.Any])
    __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformInfo]
  }
}

