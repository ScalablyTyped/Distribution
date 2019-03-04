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
    val __obj = js.Dynamic.literal(advertisement = advertisement)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Status]
  }
}

