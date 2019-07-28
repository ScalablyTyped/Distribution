package typings.cosmiconfig.cosmiconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderEntry extends js.Object {
  var async: js.UndefOr[AsyncLoader] = js.undefined
  var sync: js.UndefOr[SyncLoader] = js.undefined
}

object LoaderEntry {
  @scala.inline
  def apply(async: AsyncLoader = null, sync: SyncLoader = null): LoaderEntry = {
    val __obj = js.Dynamic.literal()
    if (async != null) __obj.updateDynamic("async")(async)
    if (sync != null) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[LoaderEntry]
  }
}

