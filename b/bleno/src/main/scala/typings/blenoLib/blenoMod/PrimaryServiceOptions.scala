package typings
package blenoLib.blenoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryServiceOptions extends js.Object {
  var characteristics: js.UndefOr[js.Array[Characteristic] | scala.Null] = js.undefined
  var uuid: java.lang.String
}

object PrimaryServiceOptions {
  @scala.inline
  def apply(uuid: java.lang.String, characteristics: js.Array[Characteristic] = null): PrimaryServiceOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid)
    if (characteristics != null) __obj.updateDynamic("characteristics")(characteristics)
    __obj.asInstanceOf[PrimaryServiceOptions]
  }
}

