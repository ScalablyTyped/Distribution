package typings
package coteLib.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var `type`: java.lang.String
}

object Event {
  @scala.inline
  def apply(`type`: java.lang.String): Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Event]
  }
}

