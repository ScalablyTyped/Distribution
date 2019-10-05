package typings.cypress.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventLike extends js.Object {
  var `type`: String
}

object EventLike {
  @scala.inline
  def apply(`type`: String): EventLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EventLike]
  }
}

