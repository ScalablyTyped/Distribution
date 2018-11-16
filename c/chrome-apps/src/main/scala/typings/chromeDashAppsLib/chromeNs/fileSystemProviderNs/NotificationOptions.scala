package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NotificationOptions extends js.Object {
  /**
               * The type of the change which happened to the observed entry.
               * If it is DELETED, then the observed entry will be automatically
               * removed from the list of observed entries.
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
  /** List of changes to entries within the observed directory (including the entry itself)  */
  var changes: js.UndefOr[js.Array[NotificationChange]] = js.undefined
  /** The identifier of the file system related to this change. */
  var fileSystemId: java.lang.String
  /** The path of the observed entry. */
  var observedPath: java.lang.String
  /** Mode of the observed entry. */
  var recursive: scala.Boolean
  /**
               * Tag for the notification.
               * Required if the file system was mounted with the supportsNotifyTag option.
               * Note, that this flag is necessary to provide notifications about changes
               * which changed even when the system was shutdown.
               */
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

