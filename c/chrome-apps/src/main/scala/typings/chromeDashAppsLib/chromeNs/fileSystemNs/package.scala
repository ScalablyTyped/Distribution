package typings
package chromeDashAppsLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileSystemNs {
  type ChooseEntryOptions = ChooseFileEntryOptions | ChooseSaveFileEntryOptions | ChooseMultipleFilesEntryOptions | ChooseDirectoryEntryOptions | ChooseEntryOptionsBase
  /** @private */
  type FileEntryCallback[T /* <: ChooseEntryOptions */, E] = js.Function1[/* selectedEntries */ E, scala.Unit]
}
