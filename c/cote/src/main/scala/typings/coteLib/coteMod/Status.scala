package typings
package coteLib.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends Event {
  var advertisement: StatusAdvertisement
}

object Status {
  @scala.inline
  def apply(advertisement: StatusAdvertisement, `type`: java.lang.String): Status = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("advertisement")(advertisement)
    __obj.asInstanceOf[Status]
  }
}

