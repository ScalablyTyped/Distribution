package typings.cpx.cpxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncOptions extends js.Object {
  /** remove files that copied on past before copy. */
  var clean: js.UndefOr[Boolean] = js.undefined
  /** Follow symbolic links when copying from them. */
  var dereference: js.UndefOr[Boolean] = js.undefined
  /** Copy empty directories which is matched with the glob. */
  var includeEmptyDirs: js.UndefOr[Boolean] = js.undefined
  /** Preserve UID, GID, ATIME, and MTIME of files. */
  var preserve: js.UndefOr[Boolean] = js.undefined
  /** Do not overwrite files on destination if the source file is older. */
  var update: js.UndefOr[Boolean] = js.undefined
}

object SyncOptions {
  @scala.inline
  def apply(
    clean: js.UndefOr[Boolean] = js.undefined,
    dereference: js.UndefOr[Boolean] = js.undefined,
    includeEmptyDirs: js.UndefOr[Boolean] = js.undefined,
    preserve: js.UndefOr[Boolean] = js.undefined,
    update: js.UndefOr[Boolean] = js.undefined
  ): SyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean)
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference)
    if (!js.isUndefined(includeEmptyDirs)) __obj.updateDynamic("includeEmptyDirs")(includeEmptyDirs)
    if (!js.isUndefined(preserve)) __obj.updateDynamic("preserve")(preserve)
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[SyncOptions]
  }
}

