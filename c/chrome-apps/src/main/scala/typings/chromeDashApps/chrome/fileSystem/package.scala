package typings.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileSystem {
  /** @private */
  type FileEntryCallback[T /* <: ChooseEntryOptions */, E] = js.Function1[/* selectedEntries */ E, Unit]
}
