package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Npapi extends js.Object {
  var npapi: js.UndefOr[Boolean] = js.undefined
}

object Anon_Npapi {
  @scala.inline
  def apply(npapi: js.UndefOr[Boolean] = js.undefined): Anon_Npapi = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(npapi)) __obj.updateDynamic("npapi")(npapi)
    __obj.asInstanceOf[Anon_Npapi]
  }
}

