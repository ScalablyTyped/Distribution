package typings
package cpxLib.cpxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncOptions extends js.Object {
  /** remove files that copied on past before copy. */
  var clean: js.UndefOr[scala.Boolean] = js.undefined
  /** Follow symbolic links when copying from them. */
  var dereference: js.UndefOr[scala.Boolean] = js.undefined
  /** Copy empty directories which is matched with the glob. */
  var includeEmptyDirs: js.UndefOr[scala.Boolean] = js.undefined
  /** Preserve UID, GID, ATIME, and MTIME of files. */
  var preserve: js.UndefOr[scala.Boolean] = js.undefined
  /** Do not overwrite files on destination if the source file is older. */
  var update: js.UndefOr[scala.Boolean] = js.undefined
}

