package typings.chromecastCafSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationStatusEventData extends EventData {
  var status: String
}

object ApplicationStatusEventData {
  @scala.inline
  def apply(status: String, `type`: String): ApplicationStatusEventData = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationStatusEventData]
  }
}

