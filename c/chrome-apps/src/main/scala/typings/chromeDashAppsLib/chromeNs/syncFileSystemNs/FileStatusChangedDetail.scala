package typings
package chromeDashAppsLib.chromeNs.syncFileSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FileStatusChangedDetail extends js.Object {
  /**
               * Sync action taken to fire onFileStatusChanged event.
               * Only applies if status is 'synced'.
               * @see SyncAction
               */
  var action: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ADDED, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_ADDED))),List()),Left(TsIdentSimple(K))) */js.Any
      ]
    ]
  ] = js.undefined
  /**
               * Sync direction for the onFileStatusChanged event.
               * Only applies if status is 'synced'.
               * @see SyncDirection
               */
  var direction: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_LOCALTOREMOTE, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_LOCALTOREMOTE))),List()),Left(TsIdentSimple(K))) */js.Any
      ]
    ]
  ] = js.undefined
  /**
               * fileEntry for the target file whose status has changed.
               * Contains name and path information of synchronized file.
               * On file deletion, fileEntry information will still be
               * available but file will no longer exist.
               */
  var fileEntry: filesystemLib.FileEntry
  /**
               * Resulting file status after onFileStatusChanged event.
               * @see FileStatus
               */
  var status: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_SYNCED, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_SYNCED))),List()),Left(TsIdentSimple(K))) */js.Any
    ]
  ]
}

