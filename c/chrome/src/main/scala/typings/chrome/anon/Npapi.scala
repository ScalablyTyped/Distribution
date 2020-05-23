package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Npapi extends js.Object {
  var npapi: js.UndefOr[Boolean] = js.undefined
}

object Npapi {
  @scala.inline
  def apply(npapi: js.UndefOr[Boolean] = js.undefined): Npapi = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(npapi)) __obj.updateDynamic("npapi")(npapi.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Npapi]
  }
}

