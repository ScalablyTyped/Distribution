package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Npapi extends js.Object {
  /** @default true */
  var npapi: scala.Boolean
}

object Anon_Npapi {
  @scala.inline
  def apply(npapi: scala.Boolean): Anon_Npapi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("npapi")(npapi)
    __obj.asInstanceOf[Anon_Npapi]
  }
}

