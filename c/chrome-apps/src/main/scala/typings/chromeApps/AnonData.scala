package typings.chromeApps

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.Array[integer]
  var id: integer
}

object AnonData {
  @scala.inline
  def apply(data: js.Array[integer], id: integer): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

