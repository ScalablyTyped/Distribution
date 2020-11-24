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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing information about the current platform.
  * @since Chrome 36.
  */
@js.native
trait PlatformInfo extends js.Object {
  
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
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
}
object PlatformInfo {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class PlatformInfoOps[Self <: PlatformInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArch(
      value: ToStringLiteral[
          ARM, 
          /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
          Exclude[
            /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
            mips64_ | arm_ | `x86-64` | `x86-32` | mips_
          ]
        ]
    ): Self = this.set("arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNacl_arch(
      value: ToStringLiteral[
          ARM, 
          /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
          Exclude[
            /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
            mips64_ | arm_ | `x86-64` | `x86-32` | mips_
          ]
        ]
    ): Self = this.set("nacl_arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(
      value: ToStringLiteral[
          ANDROID, 
          /* keyof chrome-apps.anon.ANDROID */ typings.chromeApps.chromeAppsStrings.ANDROID | CROS | LINUX | MAC | OPENBSD | WIN, 
          Exclude[
            /* keyof chrome-apps.anon.ANDROID */ typings.chromeApps.chromeAppsStrings.ANDROID | CROS | LINUX | MAC | OPENBSD | WIN, 
            linux_ | openbsd_ | android_ | win_ | cros_ | mac_
          ]
        ]
    ): Self = this.set("os", value.asInstanceOf[js.Any])
  }
}
