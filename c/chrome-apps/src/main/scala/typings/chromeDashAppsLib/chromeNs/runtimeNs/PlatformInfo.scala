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
    chromeDashAppsLib.Anon_MIPS, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_MIPS))),List()),Left(TsIdentSimple(K))) */js.Any
    ]
  ]
  /**
               * The native client architecture. This may be different from arch on some platforms.
               * @see enum PlatformNaclArch
               */
  var nacl_arch: chromeDashAppsLib.chromeNs.ToStringLiteral[
    _, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(any))),List()),Left(TsIdentSimple(K))) */js.Any
    ]
  ]
  /**
               * The operating system chrome is running on.
               * @see enum PlatformOs
               */
  var os: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_MAC, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_MAC))),List()),Left(TsIdentSimple(K))) */js.Any
    ]
  ]
}

