package typings.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNpapi extends js.Object {
  /** @default true */
  var npapi: Boolean
}

object AnonNpapi {
  @scala.inline
  def apply(npapi: Boolean): AnonNpapi = {
    val __obj = js.Dynamic.literal(npapi = npapi.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNpapi]
  }
}

