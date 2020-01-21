package typings.chromeApps

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataUuid extends js.Object {
  var data: js.Array[integer]
  var uuid: String
}

object AnonDataUuid {
  @scala.inline
  def apply(data: js.Array[integer], uuid: String): AnonDataUuid = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataUuid]
  }
}

