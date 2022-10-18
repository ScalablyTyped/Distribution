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
    /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} extends keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} ? std.Exclude<keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'}, 'mips64' | 'arm' | 'x86-64' | 'x86-32' | 'mips'> : never */ js.Any
  ]
  
  /**
    * The native client architecture. This may be different from arch on some platforms.
    * @see enum PlatformNaclArch
    */
  var nacl_arch: ToStringLiteral[
    ARM, 
    /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
    /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} extends keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} ? std.Exclude<keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'}, 'mips64' | 'arm' | 'x86-64' | 'x86-32' | 'mips'> : never */ js.Any
  ]
  
  /**
    * The operating system chrome is running on.
    * @see enum PlatformOs
    */
  var os: ToStringLiteral[
    ANDROID, 
    /* keyof chrome-apps.anon.ANDROID */ typings.chromeApps.chromeAppsStrings.ANDROID | CROS | LINUX | MAC | OPENBSD | WIN, 
    /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ANDROID :'android',   CROS :'cros',   LINUX :'linux',   MAC :'mac',   OPENBSD :'openbsd',   WIN :'win'} extends keyof {  ANDROID :'android',   CROS :'cros',   LINUX :'linux',   MAC :'mac',   OPENBSD :'openbsd',   WIN :'win'} ? std.Exclude<keyof {  ANDROID :'android',   CROS :'cros',   LINUX :'linux',   MAC :'mac',   OPENBSD :'openbsd',   WIN :'win'}, 'linux' | 'openbsd' | 'android' | 'win' | 'cros' | 'mac'> : never */ js.Any
  ]
}
object PlatformInfo {
  
  inline def apply(
    arch: ToStringLiteral[
      ARM, 
      /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} extends keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} ? std.Exclude<keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'}, 'mips64' | 'arm' | 'x86-64' | 'x86-32' | 'mips'> : never */ js.Any
    ],
    nacl_arch: ToStringLiteral[
      ARM, 
      /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} extends keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} ? std.Exclude<keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'}, 'mips64' | 'arm' | 'x86-64' | 'x86-32' | 'mips'> : never */ js.Any
    ],
    os: ToStringLiteral[
      ANDROID, 
      /* keyof chrome-apps.anon.ANDROID */ typings.chromeApps.chromeAppsStrings.ANDROID | CROS | LINUX | MAC | OPENBSD | WIN, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ANDROID :'android',   CROS :'cros',   LINUX :'linux',   MAC :'mac',   OPENBSD :'openbsd',   WIN :'win'} extends keyof {  ANDROID :'android',   CROS :'cros',   LINUX :'linux',   MAC :'mac',   OPENBSD :'openbsd',   WIN :'win'} ? std.Exclude<keyof {  ANDROID :'android',   CROS :'cros',   LINUX :'linux',   MAC :'mac',   OPENBSD :'openbsd',   WIN :'win'}, 'linux' | 'openbsd' | 'android' | 'win' | 'cros' | 'mac'> : never */ js.Any
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
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} extends keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} ? std.Exclude<keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'}, 'mips64' | 'arm' | 'x86-64' | 'x86-32' | 'mips'> : never */ js.Any
        ]
    ): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setNacl_arch(
      value: ToStringLiteral[
          ARM, 
          /* keyof chrome-apps.anon.ARM */ typings.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} extends keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'} ? std.Exclude<keyof {  ARM :'arm',   X86_32 :'x86-32',   X86_64 :'x86-64',   MIPS :'mips',   MIPS64 :'mips64'}, 'mips64' | 'arm' | 'x86-64' | 'x86-32' | 'mips'> : never */ js.Any
        ]
    ): Self = StObject.set(x, "nacl_arch", value.asInstanceOf[js.Any])
    
    inline def setOs(
      value: ToStringLiteral[
          ANDROID, 
          /* keyof chrome-apps.anon.ANDROID */ typings.chromeApps.chromeAppsStrings.ANDROID | CROS | LINUX | MAC | OPENBSD | WIN, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ANDROID :'android',   CROS :'cros',   LINUX :'linux',   MAC :'mac',   OPENBSD :'openbsd',   WIN :'win'} extends keyof {  ANDROID :'android',   CROS :'cros',   LINUX :'linux',   MAC :'mac',   OPENBSD :'openbsd',   WIN :'win'} ? std.Exclude<keyof {  ANDROID :'android',   CROS :'cros',   LINUX :'linux',   MAC :'mac',   OPENBSD :'openbsd',   WIN :'win'}, 'linux' | 'openbsd' | 'android' | 'win' | 'cros' | 'mac'> : never */ js.Any
        ]
    ): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
  }
}
