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
  def apply(
    async: (/* filepath */ String, /* content */ String) => Config | Null | (js.Promise[js.Object | Null]) = null,
    sync: (/* filepath */ String, /* content */ String) => Config | Null = null
  ): LoaderEntry = {
    val __obj = js.Dynamic.literal()
    if (async != null) __obj.updateDynamic("async")(js.Any.fromFunction2(async))
    if (sync != null) __obj.updateDynamic("sync")(js.Any.fromFunction2(sync))
    __obj.asInstanceOf[LoaderEntry]
  }
}

