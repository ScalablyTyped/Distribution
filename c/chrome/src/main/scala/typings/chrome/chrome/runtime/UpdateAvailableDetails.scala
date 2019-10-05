package typings.chrome.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAvailableDetails extends js.Object {
  /** The version number of the available update. */
  var version: String
}

object UpdateAvailableDetails {
  @scala.inline
  def apply(version: String): UpdateAvailableDetails = {
    val __obj = js.Dynamic.literal(version = version)
  
    __obj.asInstanceOf[UpdateAvailableDetails]
  }
}

