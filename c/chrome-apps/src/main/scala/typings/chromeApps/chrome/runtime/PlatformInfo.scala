package typings.chromeApps.chrome.runtime

import typings.chromeApps.anon.ANDROID
import typings.chromeApps.anon.ARM
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.CROS
import typings.chromeApps.chromeAppsStrings.LINUX
import typings.chromeApps.chromeAppsStrings.MAC
import typings.chromeApps.chromeAppsStrings.MIPS
import typings.chromeApps.chromeAppsStrings.MIPS64
import typings.chromeApps.chromeAppsStrings.OPENBSD
import typings.chromeApps.chromeAppsStrings.WIN
import typings.chromeApps.chromeAppsStrings.X86_32
import typings.chromeApps.chromeAppsStrings.X86_64
import typings.chromeApps.chromeAppsStrings.`x86-32`
import typings.chromeApps.chromeAppsStrings.`x86-64`
import typings.chromeApps.chromeAppsStrings.android_
import typings.chromeApps.chromeAppsStrings.arm_
import typings.chromeApps.chromeAppsStrings.cros_
import typings.chromeApps.chromeAppsStrings.linux_
import typings.chromeApps.chromeAppsStrings.mac_
import typings.chromeApps.chromeAppsStrings.mips64_
import typings.chromeApps.chromeAppsStrings.mips_
import typings.chromeApps.chromeAppsStrings.openbsd_
import typings.chromeApps.chromeAppsStrings.win_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing information about the current platform.
  * @since Chrome 36.
  */
trait PlatformInfo extends StObject {
  
  /**
    * The machine's processor architecture.
    * @see enum PlatformArch
    */
  var arch: ToStringLiteral[
    ARM, 
    /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
    Exclude[
      /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
      mips64_ | arm_ | `x86-64` | `x86-32` | mips_
    ]
  ]
  
  /**
    * The native client architecture. This may be different from arch on some platforms.
    * @see enum PlatformNaclArch
    */
  var nacl_arch: ToStringLiteral[
    ARM, 
    /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
    Exclude[
      /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
      mips64_ | arm_ | `x86-64` | `x86-32` | mips_
    ]
  ]
  
  /**
    * The operating system chrome is running on.
    * @see enum PlatformOs
    */
  var os: ToStringLiteral[
    ANDROID, 
    /* keyof chrome-apps.anon.ANDROID */ typings.chromeApps.chromeAppsStrings.ANDROID | CROS | LINUX | MAC | OPENBSD | WIN, 
    Exclude[
      /* keyof chrome-apps.anon.ANDROID */ typings.chromeApps.chromeAppsStrings.ANDROID | CROS | LINUX | MAC | OPENBSD | WIN, 
      linux_ | openbsd_ | android_ | win_ | cros_ | mac_
    ]
  ]
}
object PlatformInfo {
  
  inline def apply(
    arch: ToStringLiteral[
      ARM, 
      /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
      Exclude[
        /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
        mips64_ | arm_ | `x86-64` | `x86-32` | mips_
      ]
    ],
    nacl_arch: ToStringLiteral[
      ARM, 
      /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
      Exclude[
        /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
        mips64_ | arm_ | `x86-64` | `x86-32` | mips_
      ]
    ],
    os: ToStringLiteral[
      ANDROID, 
      /* keyof chrome-apps.anon.ANDROID */ typings.chromeApps.chromeAppsStrings.ANDROID | CROS | LINUX | MAC | OPENBSD | WIN, 
      Exclude[
        /* keyof chrome-apps.anon.ANDROID */ typings.chromeApps.chromeAppsStrings.ANDROID | CROS | LINUX | MAC | OPENBSD | WIN, 
        linux_ | openbsd_ | android_ | win_ | cros_ | mac_
      ]
    ]
  ): PlatformInfo = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], nacl_arch = nacl_arch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformInfo]
  }
  
  extension [Self <: PlatformInfo](x: Self) {
    
    inline def setArch(
      value: ToStringLiteral[
          ARM, 
          /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
          Exclude[
            /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
            mips64_ | arm_ | `x86-64` | `x86-32` | mips_
          ]
        ]
    ): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setNacl_arch(
      value: ToStringLiteral[
          ARM, 
          /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
          Exclude[
            /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
            mips64_ | arm_ | `x86-64` | `x86-32` | mips_
          ]
        ]
    ): Self = StObject.set(x, "nacl_arch", value.asInstanceOf[js.Any])
    
    inline def setOs(
      value: ToStringLiteral[
          ANDROID, 
          /* keyof chrome-apps.anon.ANDROID */ typings.chromeApps.chromeAppsStrings.ANDROID | CROS | LINUX | MAC | OPENBSD | WIN, 
          Exclude[
            /* keyof chrome-apps.anon.ANDROID */ typings.chromeApps.chromeAppsStrings.ANDROID | CROS | LINUX | MAC | OPENBSD | WIN, 
            linux_ | openbsd_ | android_ | win_ | cros_ | mac_
          ]
        ]
    ): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
  }
}
