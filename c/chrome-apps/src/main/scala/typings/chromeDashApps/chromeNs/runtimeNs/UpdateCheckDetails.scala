package typings.chromeDashApps.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCheckDetails extends js.Object {
  /** The version of the available update. */
  var version: String
}

object UpdateCheckDetails {
  @scala.inline
  def apply(version: String): UpdateCheckDetails = {
    val __obj = js.Dynamic.literal(version = version)
  
    __obj.asInstanceOf[UpdateCheckDetails]
  }
}

