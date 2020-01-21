package typings.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthentication extends js.Object {
  var Authentication: String
}

object AnonAuthentication {
  @scala.inline
  def apply(Authentication: String): AnonAuthentication = {
    val __obj = js.Dynamic.literal(Authentication = Authentication.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAuthentication]
  }
}

