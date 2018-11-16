package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NotificationChange extends js.Object {
  /**
               * The type of the change which happened to the entry.
               * @see ChangeType
               */
  var changeType: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_CHANGED, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_CHANGED))),List()),Left(TsIdentSimple(K))) */js.Any
    ]
  ]
  /** The path of the changed entry. */
  var entryPath: java.lang.String
}

