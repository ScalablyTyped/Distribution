package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OpenedFileInfo extends js.Object {
  /** The path of the opened file. */
  var filePath: java.lang.String
  /**
               * Whether the file was opened for reading or writing.
               * @see OpenFileMode
               */
  var mode: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_READ, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_READ))),List()),Left(TsIdentSimple(K))) */js.Any
    ]
  ]
  /** A request ID to be be used by consecutive read/write and close requests. */
  var openRequestId: chromeDashAppsLib.chromeNs.integer
}

