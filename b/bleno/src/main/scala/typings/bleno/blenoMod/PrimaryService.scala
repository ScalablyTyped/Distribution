package typings.bleno.blenoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryService extends js.Object {
  var characteristics: js.Array[Characteristic]
  var uuid: String
}

object PrimaryService {
  @scala.inline
  def apply(characteristics: js.Array[Characteristic], uuid: String): PrimaryService = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PrimaryService]
  }
}

