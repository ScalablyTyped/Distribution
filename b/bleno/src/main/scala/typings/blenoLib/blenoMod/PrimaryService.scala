package typings
package blenoLib.blenoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryService extends js.Object {
  var characteristics: js.Array[Characteristic]
  var uuid: java.lang.String
}

object PrimaryService {
  @scala.inline
  def apply(
    characteristics: js.Array[Characteristic],
    toString: js.Function0[java.lang.String],
    uuid: java.lang.String
  ): PrimaryService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("characteristics")(characteristics)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[PrimaryService]
  }
}

